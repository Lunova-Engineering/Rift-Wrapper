package com.lunova.riftwrapper.model.api;

import com.lunova.riftwrapper.RiftWrapper;
import com.lunova.riftwrapper.model.dto.summoner.SummonerDTO;
import com.lunova.riftwrapper.model.transformers.SummonerTransformer;
import com.lunova.riftwrapper.model.user.summoner.Summoner;
import com.lunova.riftwrapper.network.HttpRequest;
import com.lunova.riftwrapper.utilities.JsonUtility;

public class SummonerAPI {
    private static final String BASE_URL = "lol/summoner/v4/summoners";
    private static final EndpointBuilder builder = new EndpointBuilder(BASE_URL);

    public static Summoner withId(String id) {
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
    }
}
