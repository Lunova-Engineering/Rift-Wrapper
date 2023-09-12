package com.lunova.riftwrapper.model.user.summoner;

import com.google.common.collect.ImmutableMap;
import com.lunova.riftwrapper.model.api.SummonerAPI;
import com.lunova.riftwrapper.model.dto.summoner.SummonerDTO;

public class Summoner {
    private String id;
    private String accountId;
    private String puuid;
    private String name;
    private long profileIconId;
    private long revisionDate;
    private long summonerLevel;

    public Summoner(String id, String accountId, String puuid, String name, long profileIconId, long revisionDate, long summonerLevel) {
        this.id = id;
        this.accountId = accountId;
        this.puuid = puuid;
        this.name = name;
        this.profileIconId = profileIconId;
        this.revisionDate = revisionDate;
        this.summonerLevel = summonerLevel;
    }

    public String getId() {
        return id;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getPuuid() {
        return puuid;
    }

    public String getName() {
        return name;
    }

    public long getProfileIconId() {
        return profileIconId;
    }

    public long getRevisionDate() {
        return revisionDate;
    }

    public long getSummonerLevel() {
        return summonerLevel;
    }

    /**
     * TODO
     * Add support for match history
     * Add support for rankings
     * Add support for champion masteries
     */

    public static class Builder {

        private SummonerDTO summonerDto;
        public enum KEY {
            ID,
            ACCOUNT_ID,
            PUUID,
            NAME;
        }

        public Builder(SummonerDTO summonerDto) {
            this.summonerDto = summonerDto;
        }
        private String id, accountId, puuid, name;
        private final ImmutableMap.Builder<KEY, String> VALUES = ImmutableMap.builder();


        public static Summoner.Builder withName(String name) {
            return new Builder(SummonerAPI.withName(name));
        }

        public Summoner get() {
            return new Summoner(summonerDto.getId(), summonerDto.getAccountId(), summonerDto.getPuuid(), summonerDto.getName(), summonerDto.getProfileIconId(), summonerDto.getRevisionDate(), summonerDto.getSummonerLevel());
        }
    }
}
