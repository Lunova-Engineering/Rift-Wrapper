package com.lunova.riftwrapper.model.dto.league;

import com.lunova.riftwrapper.model.dto.DataTransferObject;

public class LeagueEntryDTO extends DataTransferObject {
    private String leagueId, summonerId, summonerName, queueType, tier, rank;
    private int leaguePoints, wins, losses;
    private boolean hotStreak, veteran, freshBlood, inactive;
    private MiniSeriesDTO miniSeries;

    public String getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(String leagueId) {
        this.leagueId = leagueId;
    }

    public String getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(String summonerId) {
        this.summonerId = summonerId;
    }

    public String getSummonerName() {
        return summonerName;
    }

    public void setSummonerName(String summonerName) {
        this.summonerName = summonerName;
    }

    public String getQueueType() {
        return queueType;
    }

    public void setQueueType(String queueType) {
        this.queueType = queueType;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getLeaguePoints() {
        return leaguePoints;
    }

    public void setLeaguePoints(int leaguePoints) {
        this.leaguePoints = leaguePoints;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public boolean isHotStreak() {
        return hotStreak;
    }

    public void setHotStreak(boolean hotStreak) {
        this.hotStreak = hotStreak;
    }

    public boolean isVeteran() {
        return veteran;
    }

    public void setVeteran(boolean veteran) {
        this.veteran = veteran;
    }

    public boolean isFreshBlood() {
        return freshBlood;
    }

    public void setFreshBlood(boolean freshBlood) {
        this.freshBlood = freshBlood;
    }

    public boolean isInactive() {
        return inactive;
    }

    public void setInactive(boolean inactive) {
        this.inactive = inactive;
    }

    public MiniSeriesDTO getMiniSeries() {
        return miniSeries;
    }

    public void setMiniSeries(MiniSeriesDTO miniSeries) {
        this.miniSeries = miniSeries;
    }
}
