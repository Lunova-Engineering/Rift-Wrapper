package com.metorrite.riftwrapper.model.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.metorrite.riftwrapper.network.HttpRequest;
import com.metorrite.riftwrapper.model.data.dto.summoner.Summoner;
import com.metorrite.riftwrapper.utilities.Utilities;

public class SummonerAPI extends RiotApi {
    private static final String BASE_URL = "https://na1.api.riotgames.com/lol/summoner/v4/summoners/";

    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static Summoner getSummonerData(String appendUrl, String parameter, String apiKey) {
        String fullUrl = BASE_URL + appendUrl + parameter;
        try {
            String response = HttpRequest.sendDataRequest(fullUrl, apiKey);
            return gson.fromJson(response, Summoner.class);
        } catch (Exception e) {
            Utilities.getLogger().error(e.getMessage());
            return new Summoner();
        }
    }
}
