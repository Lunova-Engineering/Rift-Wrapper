package com.lunova.riftwrapper.model.user.match;

import com.lunova.riftwrapper.model.user.UserObject;

public class Ban extends UserObject {
    private int championId;
    private int pickTurn;

    private Ban(Builder builder) {
        this.championId = builder.championId;
        this.pickTurn = builder.pickTurn;
    }

    public int getChampionId() {
        return championId;
    }

    public int getPickTurn() {
        return pickTurn;
    }

    public static class Builder {
        private int championId;
        private int pickTurn;

        public int getChampionId() {
            return championId;
        }

        public Builder setChampionId(int championId) {
            this.championId = championId;
            return this;
        }

        public int getPickTurn() {
            return pickTurn;
        }

        public Builder setPickTurn(int pickTurn) {
            this.pickTurn = pickTurn;
            return this;
        }

        public Ban build() {
            return new Ban(this);
        }
    }
}
