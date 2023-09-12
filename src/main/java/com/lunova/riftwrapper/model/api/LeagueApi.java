package com.lunova.riftwrapper.model.api;

import com.lunova.riftwrapper.network.HttpRequest;

public class LeagueApi extends RiotApi {
    private static final String BASE_URL = "https://na1.api.riotgames.com/lol/league/v4/entries/RANKED_SOLO_5x5/SILVER/II?";

    public static String getLeagueData(String appendUrl, String apiKey) {
        try {
            StringBuilder bldr = new StringBuilder();
            for (int i = 1; i <= 15; i++) {
                bldr.append(HttpRequest.sendRequest(BASE_URL + "?page=" + i, apiKey));
            }
            return bldr.toString();
        } catch (Exception e) {

        }
        return null;
    }
}
