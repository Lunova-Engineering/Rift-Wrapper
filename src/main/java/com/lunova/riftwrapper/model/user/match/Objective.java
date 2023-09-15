package com.lunova.riftwrapper.model.user.match;

import com.lunova.riftwrapper.model.user.UserObject;

public class Objective extends UserObject {
    private boolean first;
    private int kills;

    private Objective(Builder builder) {
        this.first = builder.first;
        this.kills = builder.kills;
    }

    public boolean isFirst() {
        return first;
    }

    public int getKills() {
        return kills;
    }

    public static class Builder {
        private boolean first;
        private int kills;

        public boolean isFirst() {
            return first;
        }

        public Builder setFirst(boolean first) {
            this.first = first;
            return this;
        }

        public int getKills() {
            return kills;
        }

        public Builder setKills(int kills) {
            this.kills = kills;
            return this;
        }

        public Objective build() {
            return new Objective(this);
        }
    }
}
