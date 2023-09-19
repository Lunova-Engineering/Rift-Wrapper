package com.lunova.riftwrapper.model.api.impl;

import com.lunova.riftwrapper.model.api.EndpointBuilder;
import com.lunova.riftwrapper.model.api.RiotAPI;
import com.lunova.riftwrapper.model.data.Region;

public class SummonerAPI extends RiotAPI {
    private static final String BASE_URL = "lol/summoner/v4/summoners";
    private static final EndpointBuilder builder = new EndpointBuilder(BASE_URL, Region.NORTH_AMERICA.getRoutingValue());

    private static SummonerAPI summonerAPI;

    public static SummonerAPI getInstance() {
        return summonerAPI == null ? new SummonerAPI() : summonerAPI;
    }

    @Override
    protected String getBaseUrl() {
        return BASE_URL;
    }

    @Override
    protected EndpointBuilder getEndpointBuilder() {
        return builder;
    }

/*    public static Summoner withId(String id) {
        String endpoint = builder.withParameter(id).build();
        String response = HttpRequest.sendRequest(endpoint, RiftWrapper.RIOT_API_KEY);
        SummonerDTO summonerDto = JsonUtility.deserialize(response, SummonerDTO.class);
        return summonerDto != null ? SummonerTransformer.transform(summonerDto) : new Summoner.Builder().build();
    }
    public static Summoner withAccountId(String accountId) {
        String endpoint = builder.withEndpoint("by-account").withParameter(accountId).build();
        String response = HttpRequest.sendRequest(endpoint, RiftWrapper.RIOT_API_KEY);
        SummonerDTO summonerDto = JsonUtility.deserialize(response, SummonerDTO.class);
        return summonerDto != null ? SummonerTransformer.transform(summonerDto) : new Summoner.Builder().build();
    }

    public static Summoner withPuuid(String puuid) {
        String endpoint = builder.withEndpoint("by-puuid").withParameter(puuid).build();
        String response = HttpRequest.sendRequest(endpoint, RiftWrapper.RIOT_API_KEY);
        SummonerDTO summonerDto = JsonUtility.deserialize(response, SummonerDTO.class);
        return summonerDto != null ? SummonerTransformer.transform(summonerDto) : new Summoner.Builder().build();
    }
    public static Summoner withName(String name) {
        String endpoint = builder.withEndpoint("by-name").withParameter(name).build();
        String response = HttpRequest.sendRequest(endpoint, RiftWrapper.RIOT_API_KEY);
        SummonerDTO summonerDto = JsonUtility.deserialize(response, SummonerDTO.class);
        return summonerDto != null ? SummonerTransformer.transform(summonerDto) : new Summoner.Builder().build();
    }*/
}
