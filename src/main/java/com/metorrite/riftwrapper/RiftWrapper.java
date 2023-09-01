package com.metorrite.riftwrapper;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.metorrite.riftwrapper.data.Region;
import com.metorrite.riftwrapper.network.HttpMethodType;
import com.metorrite.riftwrapper.network.HttpRequest;

import java.io.IOException;

public class RiftWrapper {

    private static String RIOT_API_KEY;

    private static Region REGION = Region.NORTH_AMERICA;

    public static void setRiotApiKey(String riotApiKey) {
        RIOT_API_KEY = riotApiKey;
    }

    public static void setRegion(Region region) {
        REGION = region;
    }

    public static void getData(String name, String requestUrl) {
        try {
            String response = HttpRequest.sendDataRequest(requestUrl + name + "/ids", HttpMethodType.GET, RIOT_API_KEY);
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            System.out.println(gson.toJson(JsonParser.parseString(response)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
