package cmo.hky.payment.problem.simulation;

import cmo.hky.payment.problem.engine.FeatureAnalyticsEngine;
import cmo.hky.payment.problem.enums.Feature;
import cmo.hky.payment.problem.event.FeatureEvent;

public class MainApp {
    public static void main(String[] args) {

        FeatureAnalyticsEngine engine = new FeatureAnalyticsEngine();

        engine.recordEvent(new FeatureEvent("M1", Feature.FAST_PAY));
        engine.recordEvent(new FeatureEvent("M1", Feature.EMI));
        engine.recordEvent(new FeatureEvent("M1", Feature.FAST_PAY));
        engine.recordEvent(new FeatureEvent("M2", Feature.EMI));
        engine.recordEvent(new FeatureEvent("M2", Feature.BNPL));
        engine.recordEvent(new FeatureEvent("M3", Feature.FAST_PAY));
        engine.recordEvent(new FeatureEvent("M3", Feature.FAST_PAY));

        System.out.println("Most Used Feature: " + engine.getMostUsedFeature());
        System.out.println("M1 Top Feature: " + engine.getMerchantTopFeature("M1"));
        System.out.println("Top 2 Features: " + engine.getTopNFeatures(2));

        // Disable BNPL
        engine.setFeature(Feature.BNPL, false);
        engine.recordEvent(new FeatureEvent("M2", Feature.BNPL)); // ignored

        System.out.println("After disabling BNPL, Top Feature: " + engine.getMostUsedFeature());
    }
}
