package cmo.hky.payment.problem.engine;

import cmo.hky.payment.problem.enums.Feature;
import cmo.hky.payment.problem.event.FeatureEvent;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class FeatureAnalyticsEngine {

    // Global usage
    private final Map<Feature, AtomicInteger> globalCount = new ConcurrentHashMap<>();

    // Per merchant usage
    private final Map<String, Map<Feature, AtomicInteger>> merchantCount = new ConcurrentHashMap<>();

    // Feature flags
    private final Map<Feature, Boolean> featureToggle = new ConcurrentHashMap<>();

    public FeatureAnalyticsEngine() {
        for (Feature f : Feature.values()) {
            globalCount.put(f, new AtomicInteger(0));
            featureToggle.put(f, true); // all enabled initially
        }
    }

    // Process event
    public void recordEvent(FeatureEvent event) {

        // If feature is disabled → ignore
        if (!featureToggle.get(event.feature))
            return;

        // Global count
        globalCount.get(event.feature).incrementAndGet();

        // Merchant count
        merchantCount
                .computeIfAbsent(event.merchantId, k -> new ConcurrentHashMap<>())
                .computeIfAbsent(event.feature, k -> new AtomicInteger(0))
                .incrementAndGet();
    }

    // 1️⃣ Most used feature globally
    public Feature getMostUsedFeature() {
        return globalCount.entrySet()
                .stream()
                .max(Comparator.comparingInt(e -> e.getValue().get()))
                .get()
                .getKey();
    }

    // 2️⃣ Merchant’s most used feature
    public Feature getMerchantTopFeature(String merchantId) {
        Map<Feature, AtomicInteger> map = merchantCount.get(merchantId);

        if (map == null) return null;

        return map.entrySet()
                .stream()
                .max(Comparator.comparingInt(e -> e.getValue().get()))
                .get()
                .getKey();
    }

    // 3️⃣ Top N features globally
    public List<Feature> getTopNFeatures(int n) {
        return globalCount.entrySet()
                .stream()
                .sorted((a, b) -> b.getValue().get() - a.getValue().get())
                .limit(n)
                .map(Map.Entry::getKey)
                .toList();
    }

    // 4️⃣ Enable/Disable feature
    public void setFeature(Feature feature, boolean enabled) {
        featureToggle.put(feature, enabled);
    }
}
