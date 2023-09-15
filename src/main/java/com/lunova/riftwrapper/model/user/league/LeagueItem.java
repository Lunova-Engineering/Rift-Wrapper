package com.lunova.riftwrapper.model.user.league;

import com.lunova.riftwrapper.model.user.UserObject;

public class LeagueItem extends UserObject {
    private boolean freshBlood;
    private int wins;
    private String summonerName;
    private MiniSeries miniSeries;
    private boolean inactive;
    private boolean veteran;
    private boolean hotStreak;
    private String rank;
    private int leaguePoints;
    private int losses;
    private String summonerId;

    private LeagueItem(Builder builder) {
        this.freshBlood = builder.freshBlood;
        this.wins = builder.wins;
        this.summonerName = builder.summonerName;
        this.miniSeries = builder.miniSeries;
        this.inactive = builder.inactive;
        this.veteran = builder.veteran;
        this.hotStreak = builder.hotStreak;
        this.rank = builder.rank;
        this.leaguePoints = builder.leaguePoints;
        this.losses = builder.losses;
        this.summonerId = builder.summonerId;
    }
    public boolean isFreshBlood() {
        return freshBlood;
    }

    public int getWins() {
        return wins;
    }

    public String getSummonerName() {
        return summonerName;
    }

    public MiniSeries getMiniSeries() {
        return miniSeries;
    }

    public boolean isInactive() {
        return inactive;
    }

    public boolean isVeteran() {
        return veteran;
    }

    public boolean isHotStreak() {
        return hotStreak;
    }

    public String getRank() {
        return rank;
    }

    public int getLeaguePoints() {
        return leaguePoints;
    }

    public int getLosses() {
        return losses;
    }

    public String getSummonerId() {
        return summonerId;
    }

    public static class Builder {
        private boolean freshBlood;
        private int wins;
        private String summonerName;
        private MiniSeries miniSeries;
        private boolean inactive;
        private boolean veteran;
        private boolean hotStreak;
        private String rank;
        private int leaguePoints;
        private int losses;
        private String summonerId;

        public boolean isFreshBlood() {
            return freshBlood;
        }

        public Builder setFreshBlood(boolean freshBlood) {
            this.freshBlood = freshBlood;
            return this;
        }

        public int getWins() {
            return wins;
        }

        public Builder setWins(int wins) {
            this.wins = wins;
            return this;
        }

        public String getSummonerName() {
            return summonerName;
        }

        public Builder setSummonerName(String summonerName) {
            this.summonerName = summonerName;
            return this;
        }

        public MiniSeries getMiniSeries() {
            return miniSeries;
        }

        public Builder setMiniSeries(MiniSeries miniSeries) {
            this.miniSeries = miniSeries;
            return this;
        }

        public boolean isInactive() {
            return inactive;
        }

        public Builder setInactive(boolean inactive) {
            this.inactive = inactive;
            return this;
        }

        public boolean isVeteran() {
            return veteran;
        }

        public Builder setVeteran(boolean veteran) {
            this.veteran = veteran;
            return this;
        }

        public boolean isHotStreak() {
            return hotStreak;
        }

        public Builder setHotStreak(boolean hotStreak) {
            this.hotStreak = hotStreak;
            return this;
        }

        public String getRank() {
            return rank;
        }

        public Builder setRank(String rank) {
            this.rank = rank;
            return this;
        }

        public int getLeaguePoints() {
            return leaguePoints;
        }

        public Builder setLeaguePoints(int leaguePoints) {
            this.leaguePoints = leaguePoints;
            return this;
        }

        public int getLosses() {
            return losses;
        }

        public Builder setLosses(int losses) {
            this.losses = losses;
            return this;
        }

        public String getSummonerId() {
            return summonerId;
        }

        public Builder setSummonerId(String summonerId) {
            this.summonerId = summonerId;
            return this;
        }

        public LeagueItem build() {
            return new LeagueItem(this);
        }
    }
}
