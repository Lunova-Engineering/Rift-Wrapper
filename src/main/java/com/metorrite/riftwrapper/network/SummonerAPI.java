package com.metorrite.riftwrapper.network;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.metorrite.riftwrapper.RiftWrapper;
import com.metorrite.riftwrapper.data.exceptions.SummonerNotFoundException;
import com.metorrite.riftwrapper.data.types.Summoner;
import org.slf4j.Logger;

import java.io.IOException;

public class SummonerAPI {
    private static final String BASE_URL = "https://na1.api.riotgames.com/lol/summoner/v4/summoners/";

    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static Summoner getSummonerData(String appendUrl, String parameter, String apiKey) {
        String fullUrl = BASE_URL + appendUrl + parameter;
        try {
            String response = HttpRequest.sendDataRequest(fullUrl, apiKey);
            return gson.fromJson(response, Summoner.class);
        } catch (IOException e) {
            RiftWrapper.LOGGER.error(e.getMessage());
            return new Summoner();
        }
    }
}
