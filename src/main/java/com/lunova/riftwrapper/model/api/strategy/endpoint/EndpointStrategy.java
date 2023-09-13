package com.lunova.riftwrapper.model.api.strategy.endpoint;

import com.lunova.riftwrapper.model.api.EndpointBuilder;

public interface EndpointStrategy {
    String buildEndpoint(EndpointBuilder builder);
}
