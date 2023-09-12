package com.lunova.riftwrapper.model.api;

import com.lunova.riftwrapper.RiftWrapper;
import com.lunova.riftwrapper.model.dto.summoner.SummonerDTO;
import com.lunova.riftwrapper.network.HttpRequest;
import com.lunova.riftwrapper.utilities.JsonUtility;

public class SummonerAPI extends RiotApi {
    private static final String BASE_URL = "lol/summoner/v4/summoners";
    private static final EndpointBuilder builder = new EndpointBuilder(BASE_URL);

    public static SummonerDTO withName(String name) {
        return JsonUtility.deserialize(HttpRequest.sendRequest(builder.withEndpoint("by-name").withParameter(name).build(), RiftWrapper.RIOT_API_KEY), SummonerDTO.class);
    }

}
