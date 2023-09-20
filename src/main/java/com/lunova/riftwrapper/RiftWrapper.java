package com.lunova.riftwrapper;


import com.lunova.riftwrapper.model.api.RiotAPI;
import com.lunova.riftwrapper.model.api.impl.LeagueAPI;
import com.lunova.riftwrapper.model.api.impl.MatchAPI;
import com.lunova.riftwrapper.model.api.impl.SummonerAPI;
import com.lunova.riftwrapper.model.api.strategy.DataStrategy;
import com.lunova.riftwrapper.model.api.strategy.EndpointStrategy;
import com.lunova.riftwrapper.model.api.strategy.dto.*;
import com.lunova.riftwrapper.model.api.strategy.endpoint.BaseEndpointStrategy;
import com.lunova.riftwrapper.model.data.Division;
import com.lunova.riftwrapper.model.data.QueueType;
import com.lunova.riftwrapper.model.data.Region;
import com.lunova.riftwrapper.model.data.Tier;
import com.lunova.riftwrapper.model.dto.DataTransferObject;
import com.lunova.riftwrapper.model.user.UserObject;
import com.lunova.riftwrapper.model.user.league.LeagueEntry;
import com.lunova.riftwrapper.model.user.league.LeagueList;
import com.lunova.riftwrapper.model.user.match.Match;
import com.lunova.riftwrapper.model.user.summoner.Summoner;

import java.util.List;
import java.util.Set;
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
        return getDataObject(SummonerAPI.getInstance(), new BaseEndpointStrategy(id), SummonerStrategy.getInstance());
    }
    public static Summoner summonerWithAccountId(String accountId) {
        return getDataObject(SummonerAPI.getInstance(), new BaseEndpointStrategy("by-account", accountId), SummonerStrategy.getInstance());
    }
    public static Summoner summonerWithPuuid(String puuid) {
        return getDataObject(SummonerAPI.getInstance(), new BaseEndpointStrategy("by-puuid", puuid), SummonerStrategy.getInstance());
    }
    public static Summoner getSummonerWithName(String name) {
        return getDataObject(SummonerAPI.getInstance(), new BaseEndpointStrategy("by-name", name), SummonerStrategy.getInstance());
    }
    public static List<Summoner> summonersWithId(String... summonerIds) {
       return Stream.of(summonerIds)
               .map(id -> getDataObject(SummonerAPI.getInstance(), new BaseEndpointStrategy(id), SummonerStrategy.getInstance()))
               .collect(Collectors.toList());
    }
    public static List<Summoner> summonersWithAccountId(String... summonerAccountIds) {
        return Stream.of(summonerAccountIds)
                .map(accountId -> getDataObject(SummonerAPI.getInstance(), new BaseEndpointStrategy(accountId), SummonerStrategy.getInstance()))
                .collect(Collectors.toList());
    }
    public static List<Summoner> summonersWithPuuid(String... summonerPuuids) {
        return Stream.of(summonerPuuids)
                .map(puuid -> getDataObject(SummonerAPI.getInstance(), new BaseEndpointStrategy(puuid), SummonerStrategy.getInstance()))
                .collect(Collectors.toList());
    }
    public static List<Summoner> summonersWithName(String... names) {
        return Stream.of(names)
                .map(name -> getDataObject(SummonerAPI.getInstance(), new BaseEndpointStrategy(name), SummonerStrategy.getInstance()))
                .collect(Collectors.toList());
    }
    public static Set<LeagueEntry> getLeagueEntryById(String id) {
        return  getDataObject(LeagueAPI.getInstance(), new BaseEndpointStrategy("entries/by-summoner", id), LeagueEntryStrategy.getInstance());
    }

    public static Set<LeagueEntry> getLeagueEntryList(QueueType queueType, Tier tier, Division division) {
        return getDataObject(LeagueAPI.getInstance(), new BaseEndpointStrategy("entries", queueType.name(), tier.name(), division.name(), "?page=" + 1), LeagueEntryStrategy.getInstance());
    }

    public static Set<LeagueEntry> getLeagueEntryList(QueueType queueType, Tier tier, Division division, int page) {
        if(page <= 0)
            page = 0;
        return getDataObject(LeagueAPI.getInstance(), new BaseEndpointStrategy("entries", queueType.name(), tier.name(), division.name(), "?page=" + page), LeagueEntryStrategy.getInstance());
    }

    public static LeagueList getChallengerLeagueByQueue(QueueType queueType) {
        return getDataObject(LeagueAPI.getInstance(), new BaseEndpointStrategy("challengerleagues/by-queue", queueType.name()), LeagueListStrategy.getInstance());
    }

    public static LeagueList getGrandMasterLeagueByQueue(QueueType queueType) {
        return getDataObject(LeagueAPI.getInstance(), new BaseEndpointStrategy("grandmasterleagues/by-queue", queueType.name()), LeagueListStrategy.getInstance());
    }

    public static LeagueList getMasterLeagueByQueue(QueueType queueType) {
        return getDataObject(LeagueAPI.getInstance(), new BaseEndpointStrategy("masterleagues/by-queue", queueType.name()), LeagueListStrategy.getInstance());
    }

    public static LeagueList getLeagueByLeagueId(String leagueId) {
        return getDataObject(LeagueAPI.getInstance(), new BaseEndpointStrategy("leagues", leagueId), LeagueListStrategy.getInstance());
    }

    public static Match getMatches(String matchId) {
        return getDataObject(MatchAPI.getInstance(), new BaseEndpointStrategy(matchId), MatchStrategy.getInstance());
    }

    public static List<String> getMatchList(String puuid) {
        return getDataObject(MatchAPI.getInstance(), new BaseEndpointStrategy("by-puuid", puuid, "ids?"), MatchListStrategy.getInstance());
    }

    private static <DTO extends DataTransferObject, USER extends UserObject> USER getDataObject(RiotAPI api, EndpointStrategy endpointStrategy,
                                                                                                DataStrategy<DTO, USER> dataStrategy) {
        return api.fetchData(endpointStrategy, dataStrategy);
    }
}
