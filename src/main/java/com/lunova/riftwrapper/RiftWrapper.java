package com.lunova.riftwrapper;


import com.lunova.riftwrapper.model.dto.common.Region;
import com.lunova.riftwrapper.model.user.summoner.Summoner;

public class RiftWrapper {

    public static String RIOT_API_KEY = "";

    private static Region REGION = Region.NORTH_AMERICA;

    public static Region getRegion() {
        return REGION;
    }

    public static void setRiotApiKey(String riotApiKey) {
        RIOT_API_KEY = riotApiKey;
    }

    public static void setRegion(Region region) {
        REGION = region;
    }


    public static Summoner.Builder summonerByName(String name) {
        return Summoner.Builder.withName(name);
    }
}
