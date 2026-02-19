package cmo.hky.payment.problem1.analytics;


import cmo.hky.payment.problem1.enums.Feature;
import cmo.hky.payment.problem1.marchant.MerchantFeatures;

import java.util.HashMap;
import java.util.Map;

// 3. Create a Service class to manage all merchants and provide analytics
public class MerchantFeatureAnalytics {
        // A Map stores Merchant IDs (String or Integer) as keys and their features as values
        private final Map<String, MerchantFeatures> merchantConfig;

        public MerchantFeatureAnalytics() {
            this.merchantConfig = new HashMap<>();
        }

        /**
         * Adds a new merchant to the system.
         *
         * @param merchantId The unique ID of the merchant.
         */
        public void addMerchant(String merchantId) {
            merchantConfig.putIfAbsent(merchantId, new MerchantFeatures());
        }

        /**
         * Updates the status of a feature for a specific merchant.
         *
         * @param merchantId The merchant's ID.
         * @param feature    The feature to update.
         * @param isEnabled  The new status (true for enabled, false for disabled).
         */
        public void updateFeatureStatus(String merchantId, Feature feature, boolean isEnabled) {
            MerchantFeatures features = merchantConfig.get(merchantId);
            if (features != null) {
                if (isEnabled) {
                    features.enableFeature(feature);
                } else {
                    features.disableFeature(feature);
                }
            } else {
                System.out.println("Error: Merchant not found.");
            }
        }

        /**
         * Gets the analytics for a specific merchant.
         *
         * @param merchantId The merchant's ID.
         * @return A map containing enabled and disabled counts, or null if not found.
         */
        public Map<String, Integer> getMerchantAnalytics(String merchantId) {
            MerchantFeatures features = merchantConfig.get(merchantId);
            if (features != null) {
                Map<String, Integer> analytics = new HashMap<>();
                analytics.put("EnabledFeatures", features.getEnabledCount());
                analytics.put("DisabledFeatures", features.getDisabledCount());
                return analytics;
            }
            return null;
        }

        // Example of a summary analytic: Count how many merchants use a specific feature
        public long countMerchantsWithFeature(Feature feature) {
            return merchantConfig.values().stream()
                    .filter(mf -> mf.isFeatureEnabled(feature))
                    .count();
        }
    }
