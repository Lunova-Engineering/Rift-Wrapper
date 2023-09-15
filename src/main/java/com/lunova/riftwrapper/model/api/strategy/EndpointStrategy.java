package com.lunova.riftwrapper.model.api.strategy;

import com.lunova.riftwrapper.model.api.EndpointBuilder;

public interface EndpointStrategy {
    String buildEndpoint(EndpointBuilder builder);
}
