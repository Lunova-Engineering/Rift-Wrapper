package com.lunova.riftwrapper.model.api;

import com.lunova.riftwrapper.RiftWrapper;

import java.util.ArrayList;
import java.util.List;

public class EndpointBuilder {

    private final String baseUrl;
    private final List<String> parameters = new ArrayList<>();

    public EndpointBuilder(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public EndpointBuilder withEndpoint(String endpoint) {
        return withParameter(endpoint);
    }

    public EndpointBuilder withParameter(String parameter) {
        parameters.add(parameter);
        return this;
    }

    public String build() {
        StringBuilder builder = new StringBuilder();
        builder.append("https://");
        builder.append(RiftWrapper.getRegion().getRoutingValue()).append("/");
        builder.append(baseUrl).append("/");
        parameters.forEach(parameter -> builder.append(parameter).append("/"));
        parameters.clear();
        System.out.println(builder.toString());
        return builder.toString();
    }


}
