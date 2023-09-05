package com.metorrite.riftwrapper.model.data.dto.league;

import java.util.List;

public class LeagueList {
    private String leagueId;
    private List<LeagueItem> entries;
    private String tier;
    private String name;
    private String queue;

    public LeagueList(String leagueId, List<LeagueItem> entries, String tier, String name, String queue) {
        this.leagueId = leagueId;
        this.entries = entries;
        this.tier = tier;
        this.name = name;
        this.queue = queue;
    }

    public String getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(String leagueId) {
        this.leagueId = leagueId;
    }

    public List<LeagueItem> getEntries() {
        return entries;
    }

    public void setEntries(List<LeagueItem> entries) {
        this.entries = entries;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }
}
