package com.lunova.riftwrapper;


import com.lunova.riftwrapper.model.api.RiotAPI;
import com.lunova.riftwrapper.model.api.impl.LeagueAPI;
import com.lunova.riftwrapper.model.api.impl.MatchAPI;
import com.lunova.riftwrapper.model.api.impl.SummonerAPI;
import com.lunova.riftwrapper.model.api.strategy.CollectionDataStrategy;
import com.lunova.riftwrapper.model.api.strategy.EndpointStrategy;
import com.lunova.riftwrapper.model.api.strategy.SimpleCollectionDataStrategy;
import com.lunova.riftwrapper.model.api.strategy.SingleDataStrategy;
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

import java.util.Collection;
import java.util.LinkedHashSet;
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
        return getUserObject(SummonerAPI.getInstance(), new BaseEndpointStrategy(id), SummonerStrategy.getInstance());
    }
    public static Summoner summonerWithAccountId(String accountId) {
        return getUserObject(SummonerAPI.getInstance(), new BaseEndpointStrategy("by-account", accountId), SummonerStrategy.getInstance());
    }
    public static Summoner summonerWithPuuid(String puuid) {
        return getUserObject(SummonerAPI.getInstance(), new BaseEndpointStrategy("by-puuid", puuid), SummonerStrategy.getInstance());
    }
    public static Summoner getSummonerWithName(String name) {
        return getUserObject(SummonerAPI.getInstance(), new BaseEndpointStrategy("by-name", name), SummonerStrategy.getInstance());
    }
    public static List<Summoner> summonersWithId(String... summonerIds) {
       return Stream.of(summonerIds)
               .map(id -> getUserObject(SummonerAPI.getInstance(), new BaseEndpointStrategy(id), SummonerStrategy.getInstance()))
               .collect(Collectors.toList());
    }
    public static List<Summoner> summonersWithAccountId(String... summonerAccountIds) {
        return Stream.of(summonerAccountIds)
                .map(accountId -> getUserObject(SummonerAPI.getInstance(), new BaseEndpointStrategy(accountId), SummonerStrategy.getInstance()))
                .collect(Collectors.toList());
    }
    public static List<Summoner> summonersWithPuuid(String... summonerPuuids) {
        return Stream.of(summonerPuuids)
                .map(puuid -> getUserObject(SummonerAPI.getInstance(), new BaseEndpointStrategy(puuid), SummonerStrategy.getInstance()))
                .collect(Collectors.toList());
    }
    public static List<Summoner> summonersWithName(String... names) {
        return Stream.of(names)
                .map(name -> getUserObject(SummonerAPI.getInstance(), new BaseEndpointStrategy(name), SummonerStrategy.getInstance()))
                .collect(Collectors.toList());
    }
    public static LinkedHashSet<LeagueEntry> getLeagueEntryById(String id) {
        return (LinkedHashSet<LeagueEntry>) getUserCollectionObject(LeagueAPI.getInstance(), new BaseEndpointStrategy("entries/by-summoner", id), LeagueEntryStrategy.getInstance());
    }

    public static LinkedHashSet<LeagueEntry> getLeagueEntryList(QueueType queueType, Tier tier, Division division) {
        return (LinkedHashSet<LeagueEntry>) getUserCollectionObject(LeagueAPI.getInstance(), new BaseEndpointStrategy("entries", queueType.name(), tier.name(), division.name(), "?page=" + 1), LeagueEntryStrategy.getInstance());
    }

    public static LinkedHashSet<LeagueEntry> getLeagueEntryList(QueueType queueType, Tier tier, Division division, int page) {
        if(page <= 0)
            page = 0;
        return (LinkedHashSet<LeagueEntry>) getUserCollectionObject(LeagueAPI.getInstance(), new BaseEndpointStrategy("entries", queueType.name(), tier.name(), division.name(), "?page=" + page), LeagueEntryStrategy.getInstance());
    }

    public static LeagueList getChallengerLeagueByQueue(QueueType queueType) {
        return getUserObject(LeagueAPI.getInstance(), new BaseEndpointStrategy("challengerleagues/by-queue", queueType.name()), LeagueListStrategy.getInstance());
    }

    public static LeagueList getGrandMasterLeagueByQueue(QueueType queueType) {
        return getUserObject(LeagueAPI.getInstance(), new BaseEndpointStrategy("grandmaster/by-queue", queueType.name()), LeagueListStrategy.getInstance());
    }

    public static LeagueList getMasterLeagueByQueue(QueueType queueType) {
        return getUserObject(LeagueAPI.getInstance(), new BaseEndpointStrategy("masterleagues/by-queue", queueType.name()), LeagueListStrategy.getInstance());
    }

    public static LeagueList getLeagueByLeagueId(String leagueId) {
        return getUserObject(LeagueAPI.getInstance(), new BaseEndpointStrategy("leagues", leagueId), LeagueListStrategy.getInstance());
    }

    public static Match getMatches(String matchId) {
        return getUserObject(MatchAPI.getInstance(), new BaseEndpointStrategy(matchId), MatchStrategy.getInstance());
    }

    public static List<String> getMatchList(String puuid) {
        return getSimpleCollectionObject(MatchAPI.getInstance(), new BaseEndpointStrategy("by-puuid", puuid, "ids?"), MatchListStrategy.getInstance());
    }

    private static <DTO extends DataTransferObject, USER extends UserObject> USER getUserObject(RiotAPI api, EndpointStrategy endpointStrategy,
                                                                                                SingleDataStrategy<DTO, USER> dataStrategy) {
        return api.fetchSingleData(endpointStrategy, dataStrategy);
    }

    private static <DTO extends DataTransferObject, USER extends UserObject> Collection<USER> getUserCollectionObject(RiotAPI api, EndpointStrategy endpointStrategy,
                                                                                                                      CollectionDataStrategy<DTO, USER> dataStrategy) {
        return api.fetchCollectionData(endpointStrategy, dataStrategy);
    }

    public static <T, C extends Collection<T>> C getSimpleCollectionObject(RiotAPI api, EndpointStrategy endpointStrategy,
                                                              SimpleCollectionDataStrategy<C> dataStrategy) {
        return api.fetchSimpleCollectionData(endpointStrategy, dataStrategy);
    }
}
