package com.lunova.riftwrapper.model.api.impl;

import com.lunova.riftwrapper.model.api.EndpointBuilder;
import com.lunova.riftwrapper.model.api.RiotAPI;
import com.lunova.riftwrapper.model.data.Region;

public class LeagueAPI extends RiotAPI {
    private static final String BASE_URL = "lol/league/v4";
    private static final EndpointBuilder builder = new EndpointBuilder(BASE_URL, Region.NORTH_AMERICA.getRoutingValue());

    private static LeagueAPI leagueAPI;

    public static LeagueAPI getInstance() {
        if(leagueAPI == null)
            leagueAPI = new LeagueAPI();
        return leagueAPI;
    }

    @Override
    protected String getBaseUrl() {
        return BASE_URL;
    }

    @Override
    protected EndpointBuilder getEndpointBuilder() {
        return builder;
    }
}
