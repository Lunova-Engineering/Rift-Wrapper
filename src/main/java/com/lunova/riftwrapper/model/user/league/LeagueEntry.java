package com.lunova.riftwrapper.model.user.league;

import com.lunova.riftwrapper.model.dto.league.MiniSeriesDTO;
import com.lunova.riftwrapper.model.user.UserObject;

public class LeagueEntry extends UserObject {
    private String leagueId, summonerId, summonerName, queueType, tier, rank;
    private int leaguePoints, wins, losses;
    private boolean hotStreak, veteran, freshBlood, inactive;
    private MiniSeriesDTO miniSeries;

    private LeagueEntry(Builder builder) {
        this.leagueId = builder.leagueId;
        this.summonerId = builder.summonerId;
        this.summonerName = builder.summonerName;
        this.queueType = builder.queueType;
        this.tier = builder.tier;
        this.rank = builder.rank;
        this.leaguePoints = builder.leaguePoints;
        this.wins = builder.wins;
        this.losses = builder.losses;
        this.hotStreak = builder.hotStreak;
        this.veteran = builder.veteran;
        this.freshBlood = builder.freshBlood;
        this.inactive = builder.inactive;
        this.miniSeries = builder.miniSeries; //TODO CHANGE TO USER OBJECT
    }

    public String getLeagueId() {
        return leagueId;
    }

    public String getSummonerId() {
        return summonerId;
    }

    public String getSummonerName() {
        return summonerName;
    }

    public String getQueueType() {
        return queueType;
    }

    public String getTier() {
        return tier;
    }

    public String getRank() {
        return rank;
    }

    public int getLeaguePoints() {
        return leaguePoints;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public boolean isHotStreak() {
        return hotStreak;
    }

    public boolean isVeteran() {
        return veteran;
    }

    public boolean isFreshBlood() {
        return freshBlood;
    }

    public boolean isInactive() {
        return inactive;
    }

    public MiniSeriesDTO getMiniSeries() {
        return miniSeries;
    }

    public static class Builder {
        private String leagueId, summonerId, summonerName, queueType, tier, rank;
        private int leaguePoints, wins, losses;
        private boolean hotStreak, veteran, freshBlood, inactive;
        private MiniSeriesDTO miniSeries;

        public Builder setLeagueId(String leagueId) {
            this.leagueId = leagueId;
            return this;
        }

        public Builder setSummonerId(String summonerId) {
            this.summonerId = summonerId;
            return this;
        }

        public Builder setSummonerName(String summonerName) {
            this.summonerName = summonerName;
            return this;
        }

        public Builder setQueueType(String queueType) {
            this.queueType = queueType;
            return this;
        }

        public Builder setTier(String tier) {
            this.tier = tier;
            return this;
        }

        public Builder setRank(String rank) {
            this.rank = rank;
            return this;
        }

        public Builder setLeaguePoints(int leaguePoints) {
            this.leaguePoints = leaguePoints;
            return this;
        }

        public Builder setWins(int wins) {
            this.wins = wins;
            return this;
        }

        public Builder setLosses(int losses) {
            this.losses = losses;
            return this;
        }

        public Builder setHotStreak(boolean hotStreak) {
            this.hotStreak = hotStreak;
            return this;
        }

        public Builder setVeteran(boolean veteran) {
            this.veteran = veteran;
            return this;
        }

        public Builder setFreshBlood(boolean freshBlood) {
            this.freshBlood = freshBlood;
            return this;
        }

        public Builder setInactive(boolean inactive) {
            this.inactive = inactive;
            return this;
        }

        public Builder setMiniSeries(MiniSeriesDTO miniSeries) {
            this.miniSeries = miniSeries;
            return this;
        }

        public LeagueEntry build() {
            return new LeagueEntry(this);
        }
    }
}
