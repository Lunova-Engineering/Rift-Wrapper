package com.lunova.riftwrapper.model.api;

import java.util.ArrayList;
import java.util.List;

public class EndpointBuilder {

    private final String baseUrl;

    private final String routingValue;

    private final List<String> parameters = new ArrayList<>();

    public EndpointBuilder(String baseUrl, String routingValue) {
        this.baseUrl = baseUrl;
        this.routingValue = routingValue;
    }

    public EndpointBuilder withEndpoint(String endpoint) {
        return withParameter(endpoint);
    }

    public EndpointBuilder withParameter(String parameter) {
        parameters.add(parameter);
        return this;
    }

    public EndpointBuilder withParameter(List<String> parameterList) {
        parameters.addAll(parameterList);
        return this;
    }

    public String build() {
        StringBuilder builder = new StringBuilder();
        builder.append("https://");
        builder.append(routingValue).append("/");
        builder.append(baseUrl).append("/");
        String joinedParams = String.join("/", parameters);

        if (parameters.size() > 0 && parameters.get(parameters.size() - 1).startsWith("?"))
            joinedParams = joinedParams.replace("/?", "?");

        builder.append(joinedParams);
        parameters.clear();
        return builder.toString();
    }


}
