package com.hky.payment.problem.event;

import com.hky.payment.problem.enums.Feature;

public class FeatureEvent {
    public String merchantId;
    public Feature feature;

    public FeatureEvent(String merchantId, Feature feature) {
        this.merchantId = merchantId;
        this.feature = feature;
    }
}
