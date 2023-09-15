package com.lunova.riftwrapper.model.api.strategy.endpoint;

import com.lunova.riftwrapper.model.api.EndpointBuilder;
import com.lunova.riftwrapper.model.api.strategy.EndpointStrategy;

import java.util.Arrays;
import java.util.List;

public class BaseEndpointStrategy implements EndpointStrategy {
    private final String endpoint;
    private final List<String> parameters;

    public BaseEndpointStrategy(String endpoint, String... parameters) {
        this.endpoint = endpoint;
        this.parameters = Arrays.asList(parameters);
    }

    @Override
    public String buildEndpoint(EndpointBuilder builder) {
        return builder.withEndpoint(endpoint).withParameter(parameters).build();

    }
}