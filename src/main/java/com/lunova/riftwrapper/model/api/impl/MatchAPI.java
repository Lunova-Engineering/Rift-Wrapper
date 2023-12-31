package com.lunova.riftwrapper.model.api.impl;

import com.lunova.riftwrapper.model.api.EndpointBuilder;
import com.lunova.riftwrapper.model.api.RiotAPI;
import com.lunova.riftwrapper.model.data.Platform;

public class MatchAPI extends RiotAPI {

    private static final String BASE_URL = "lol/match/v5/matches";

    private static final EndpointBuilder ENDPOINT_BUILDER = new EndpointBuilder(BASE_URL, Platform.AMERICAS.getRoutingValue());

    private static MatchAPI matchAPI;

    public static MatchAPI getInstance() {
        if(matchAPI == null)
            matchAPI = new MatchAPI();
        return matchAPI;
    }

    @Override
    protected String getBaseUrl() {
        return BASE_URL;
    }

    @Override
    protected EndpointBuilder getEndpointBuilder() {
        return ENDPOINT_BUILDER;
    }
}
