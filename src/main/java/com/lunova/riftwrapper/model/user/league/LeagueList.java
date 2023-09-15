package com.lunova.riftwrapper.model.user.league;

import com.lunova.riftwrapper.model.user.UserObject;

import java.util.List;

public class LeagueList extends UserObject {
    private String leagueId;
    private List<LeagueItem> entries;
    private String tier;
    private String name;
    private String queue;

    private LeagueList(Builder builder) {
        this.leagueId = builder.leagueId;
        this.entries = builder.entries;
        this.tier = builder.tier;
        this.name = builder.name;
        this.queue = builder.queue;
    }

    public String getLeagueId() {
        return leagueId;
    }

    public List<LeagueItem> getEntries() {
        return entries;
    }

    public String getTier() {
        return tier;
    }

    public String getName() {
        return name;
    }

    public String getQueue() {
        return queue;
    }

    public static class Builder {
        private String leagueId;
        private List<LeagueItem> entries;
        private String tier;
        private String name;
        private String queue;

        public String getLeagueId() {
            return leagueId;
        }

        public Builder setLeagueId(String leagueId) {
            this.leagueId = leagueId;
            return this;
        }

        public List<LeagueItem> getEntries() {
            return entries;
        }

        public Builder setEntries(List<LeagueItem> entries) {
            this.entries = entries;
            return this;
        }

        public String getTier() {
            return tier;
        }

        public Builder setTier(String tier) {
            this.tier = tier;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getQueue() {
            return queue;
        }

        public Builder setQueue(String queue) {
            this.queue = queue;
            return this;
        }

        public LeagueList build() {
            return new LeagueList(this);
        }
    }
}
