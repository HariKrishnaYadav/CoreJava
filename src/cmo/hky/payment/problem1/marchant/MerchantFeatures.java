package cmo.hky.payment.problem1.marchant;

import cmo.hky.payment.problem1.enums.Feature;

import java.util.HashSet;
import java.util.Set;

// 2. Define a class to represent a Merchant's feature configuration
public class MerchantFeatures {
    // A Set is ideal for storing enabled features as it prevents duplicates and offers fast lookups
    private final Set<Feature> enabledFeatures;

    public MerchantFeatures() {
        this.enabledFeatures = new HashSet<>();
    }

    public void enableFeature(Feature feature) {
        enabledFeatures.add(feature);
    }

    public void disableFeature(Feature feature) {
        enabledFeatures.remove(feature);
    }

    public boolean isFeatureEnabled(Feature feature) {
        return enabledFeatures.contains(feature);
    }

    public int getEnabledCount() {
        return enabledFeatures.size();
    }

    public int getDisabledCount() {
        // Total features are all values in the Enum
        return Feature.values().length - enabledFeatures.size();
    }
}
