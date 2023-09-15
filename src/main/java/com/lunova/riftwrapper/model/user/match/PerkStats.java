package com.lunova.riftwrapper.model.user.match;

import com.lunova.riftwrapper.model.user.UserObject;

public class PerkStats extends UserObject {
    private int defense, flex, offense;

    private PerkStats(Builder builder) {
        this.defense = builder.defense;
        this.flex = builder.flex;
        this.offense = builder.offense;
    }

    public int getDefense() {
        return defense;
    }

    public int getFlex() {
        return flex;
    }

    public int getOffense() {
        return offense;
    }

    public static class Builder {
        private int defense, flex, offense;

        public int getDefense() {
            return defense;
        }

        public Builder setDefense(int defense) {
            this.defense = defense;
            return this;
        }

        public int getFlex() {
            return flex;
        }

        public Builder setFlex(int flex) {
            this.flex = flex;
            return this;
        }

        public int getOffense() {
            return offense;
        }

        public Builder setOffense(int offense) {
            this.offense = offense;
            return this;
        }

        public PerkStats build() {
            return new PerkStats(this);
        }
    }
}
