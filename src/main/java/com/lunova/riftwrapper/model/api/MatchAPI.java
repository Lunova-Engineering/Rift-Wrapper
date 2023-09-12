package com.lunova.riftwrapper.model.api;

import com.lunova.riftwrapper.network.HttpRequest;
import com.lunova.riftwrapper.utilities.Utilities;

public class MatchAPI {
    public static String getMatchById(String id, String apiKey) {

        try {
            return HttpRequest.sendRequest("https://americas.api.riotgames.com/lol/match/v5/matches/NA1_4764187015", apiKey);
        } catch (Exception e) {
            Utilities.getLogger().error("Error getting match details.");
        }
        return null;
    }
}
