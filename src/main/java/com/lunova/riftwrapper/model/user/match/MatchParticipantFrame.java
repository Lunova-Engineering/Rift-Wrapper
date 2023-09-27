package com.lunova.riftwrapper.model.user.match;

import com.lunova.riftwrapper.model.user.UserObject;

public class MatchParticipantFrame extends UserObject {

    private int totalGold;
    private int teamScore;
    private int participantId;
    private int level;
    private int currentGold;
    private int minionsKilled;
    private int dominionScore;
    private MatchPosition position;
    private int xp;
    private int jungleMinionsKilled;

    private MatchParticipantFrame(Builder builder) {
        this.totalGold = builder.totalGold;
        this.teamScore = builder.teamScore;
        this.participantId = builder.participantId;
        this.level = builder.level;
        this.currentGold = builder.currentGold;
        this.minionsKilled = builder.minionsKilled;
        this.dominionScore = builder.dominionScore;
        this.position = builder.position;
        this.xp = builder.xp;
        this.jungleMinionsKilled = builder.jungleMinionsKilled;
    }

    public int getTotalGold() {
        return totalGold;
    }

    public int getTeamScore() {
        return teamScore;
    }

    public int getParticipantId() {
        return participantId;
    }

    public int getLevel() {
        return level;
    }

    public int getCurrentGold() {
        return currentGold;
    }

    public int getMinionsKilled() {
        return minionsKilled;
    }

    public int getDominionScore() {
        return dominionScore;
    }

    public MatchPosition getPosition() {
        return position;
    }

    public int getXp() {
        return xp;
    }

    public int getJungleMinionsKilled() {
        return jungleMinionsKilled;
    }

    public static class Builder {
        private int totalGold;
        private int teamScore;
        private int participantId;
        private int level;
        private int currentGold;
        private int minionsKilled;
        private int dominionScore;
        private MatchPosition position;
        private int xp;
        private int jungleMinionsKilled;

        public int getTotalGold() {
            return totalGold;
        }

        public Builder setTotalGold(int totalGold) {
            this.totalGold = totalGold;
            return this;
        }

        public int getTeamScore() {
            return teamScore;
        }

        public Builder setTeamScore(int teamScore) {
            this.teamScore = teamScore;
            return this;
        }

        public int getParticipantId() {
            return participantId;
        }

        public Builder setParticipantId(int participantId) {
            this.participantId = participantId;
            return this;
        }

        public int getLevel() {
            return level;
        }

        public Builder setLevel(int level) {
            this.level = level;
            return this;
        }

        public int getCurrentGold() {
            return currentGold;
        }

        public Builder setCurrentGold(int currentGold) {
            this.currentGold = currentGold;
            return this;
        }

        public int getMinionsKilled() {
            return minionsKilled;
        }

        public Builder setMinionsKilled(int minionsKilled) {
            this.minionsKilled = minionsKilled;
            return this;
        }

        public int getDominionScore() {
            return dominionScore;
        }

        public Builder setDominionScore(int dominionScore) {
            this.dominionScore = dominionScore;
            return this;
        }

        public MatchPosition getPosition() {
            return position;
        }

        public Builder setPosition(MatchPosition position) {
            this.position = position;
            return this;
        }

        public int getXp() {
            return xp;
        }

        public Builder setXp(int xp) {
            this.xp = xp;
            return this;
        }

        public int getJungleMinionsKilled() {
            return jungleMinionsKilled;
        }

        public Builder setJungleMinionsKilled(int jungleMinionsKilled) {
            this.jungleMinionsKilled = jungleMinionsKilled;
            return this;
        }

        public MatchParticipantFrame build() {
            return new MatchParticipantFrame(this);
        }
    }
}
