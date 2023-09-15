package com.lunova.riftwrapper.model.user.league;

import com.lunova.riftwrapper.model.user.UserObject;

public class MiniSeries extends UserObject {
    private int losses;
    private String progress;
    private int target;
    private int wins;

    private MiniSeries(Builder builder) {
        this.losses = builder.losses;
        this.progress = builder.progress;
        this.target = builder.target;
        this.wins = builder.wins;
    }

    public int getLosses() {
        return losses;
    }

    public String getProgress() {
        return progress;
    }

    public int getTarget() {
        return target;
    }

    public int getWins() {
        return wins;
    }

    public static class Builder {
        private int losses;
        private String progress;
        private int target;
        private int wins;

        public int getLosses() {
            return losses;
        }

        public Builder setLosses(int losses) {
            this.losses = losses;
            return this;
        }

        public String getProgress() {
            return progress;
        }

        public Builder setProgress(String progress) {
            this.progress = progress;
            return this;
        }

        public int getTarget() {
            return target;
        }

        public Builder setTarget(int target) {
            this.target = target;
            return this;
        }

        public int getWins() {
            return wins;
        }

        public Builder setWins(int wins) {
            this.wins = wins;
            return this;
        }

        public MiniSeries build() {
            return new MiniSeries(this);
        }
    }

}
