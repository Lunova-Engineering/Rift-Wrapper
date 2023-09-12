package com.lunova.riftwrapper;


import com.lunova.riftwrapper.model.api.SummonerAPI;
import com.lunova.riftwrapper.model.dto.common.Region;
import com.lunova.riftwrapper.model.user.summoner.Summoner;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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


    public static Summoner summonerWithId(String id) {
        return SummonerAPI.withId(id);
    }
    public static Summoner summonerWithAccountId(String accountId) {
        return SummonerAPI.withAccountId(accountId);
    }
    public static Summoner summonerWithPuuid(String puuid) {
        return SummonerAPI.withPuuid(puuid);
    }
    public static Summoner summonerWithName(String name) {
        return SummonerAPI.withName(name);
    }

    public static List<Summoner> summonersWithId(String... summonerIds) {
        return Stream.of(summonerIds)
                .map(SummonerAPI::withId)
                .collect(Collectors.toList());
    }
    public static List<Summoner> summonersWithAccountId(String... summonerAccountIds) {
        return Stream.of(summonerAccountIds)
                .map(SummonerAPI::withAccountId)
                .collect(Collectors.toList());
    }
    public static List<Summoner> summonersWithPuuid(String... summonerPuuids) {
        return Stream.of(summonerPuuids)
                .map(SummonerAPI::withPuuid)
                .collect(Collectors.toList());
    }
    public static List<Summoner> summonersWithName(String... summonerNames) {
        return Stream.of(summonerNames)
                .map(SummonerAPI::withName)
                .collect(Collectors.toList());
    }

}
