package com.metorrite.riftwrapper;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.metorrite.riftwrapper.data.Region;
import com.metorrite.riftwrapper.data.types.Summoner;
import com.metorrite.riftwrapper.network.HttpMethodType;
import com.metorrite.riftwrapper.network.HttpRequest;
import com.metorrite.riftwrapper.network.SummonerAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class RiftWrapper {

    public static final Logger LOGGER = LoggerFactory.getLogger(RiftWrapper.class);
    private static String RIOT_API_KEY;

    private static Region REGION = Region.NORTH_AMERICA;

    public static void setRiotApiKey(String riotApiKey) {
        RIOT_API_KEY = riotApiKey;
    }

    public static void setRegion(Region region) {
        REGION = region;
    }

    public static Summoner getSummonerByRsoPuuid(String encryptedPuuid) {
        return SummonerAPI.getSummonerData("by-puuid/", encryptedPuuid, RIOT_API_KEY);
    }

    public static Summoner getSummonerByAccountId(String id) {
        return SummonerAPI.getSummonerData("by-account/", id, RIOT_API_KEY);
    }

    public static Summoner getSummonerByName(String name) {
        return SummonerAPI.getSummonerData("by-name/", name, RIOT_API_KEY);
    }

    public static Summoner getSummonerByPuuid(String puuid) {
        return SummonerAPI.getSummonerData("by-puuid/", puuid, RIOT_API_KEY);
    }

    public static Summoner getSummonerByAccessToken(String accessToken) {
        return SummonerAPI.getSummonerData("me/", accessToken, RIOT_API_KEY);
    }

    public static Summoner getSummonerByEncryptedId(String encryptedId) {
        return SummonerAPI.getSummonerData("", encryptedId, RIOT_API_KEY);
    }

}
