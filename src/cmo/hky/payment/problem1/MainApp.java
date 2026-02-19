package cmo.hky.payment.problem1;

import cmo.hky.payment.problem1.analytics.MerchantFeatureAnalytics;
import cmo.hky.payment.problem1.enums.Feature;

import java.util.Map;

public class MainApp {
    public static void main(String[] args) {
        MerchantFeatureAnalytics analytics = new MerchantFeatureAnalytics();

        // Add merchants
        System.out.println("--------Add merchants----");
        analytics.addMerchant("M101");
        analytics.addMerchant("M102");

        // Configure features for M101
        System.out.println("--------Configure features for M101----");
        analytics.updateFeatureStatus("M101", Feature.INSTANT_PAYOUTS, true);
        analytics.updateFeatureStatus("M101", Feature.MULTI_CURRENCY, true);
        analytics.updateFeatureStatus("M101", Feature.FRAUD_PROTECTION, false); // Disabled

        // Configure features for M102
        System.out.println("--------Configure features for M102----");
        analytics.updateFeatureStatus("M102", Feature.INSTANT_PAYOUTS, true);
        analytics.updateFeatureStatus("M102", Feature.BETA_DASHBOARD, true);

        // Get analytics for a specific merchant
        System.out.println("--------Get analytics for a specific merchant----");
        Map<String, Integer> m101Analytics = analytics.getMerchantAnalytics("M101");
        System.out.println("Merchant M101 Analytics: " + m101Analytics); // Expected: Enabled=2, Disabled=3

        // Get overall analytics
        System.out.println("--------Get overall analytics----");
        long merchantsWithPayouts = analytics.countMerchantsWithFeature(Feature.INSTANT_PAYOUTS);
        System.out.println("Total merchants with INSTANT_PAYOUTS enabled: " + merchantsWithPayouts); // Expected: 2
    }
}
