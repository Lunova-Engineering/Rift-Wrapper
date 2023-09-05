package com.metorrite.riftwrapper;


import com.metorrite.riftwrapper.model.api.LeagueApi;
import com.metorrite.riftwrapper.model.api.MatchAPI;
import com.metorrite.riftwrapper.network.Region;
import com.metorrite.riftwrapper.model.data.dto.summoner.Summoner;
import com.metorrite.riftwrapper.model.api.SummonerAPI;

public class RiftWrapper {

    private static String RIOT_API_KEY = "";

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

    public static String getLeagueData() {
        return LeagueApi.getLeagueData("", RIOT_API_KEY);
    }

    public static String getMatchData() {
        return MatchAPI.getMatchById("NA1_4764187015", RIOT_API_KEY);
    }
}
