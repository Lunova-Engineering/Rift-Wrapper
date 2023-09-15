package com.lunova.riftwrapper.model.user.match;

import com.lunova.riftwrapper.model.user.UserObject;

import java.util.ArrayList;
import java.util.List;

public class Team extends UserObject {
    private List<Ban> bans = new ArrayList<>(10);
    private Objectives objectives;
    private int teamId;
    private boolean win;

    private Team(Builder builder) {
        this.bans = builder.bans;
        this.objectives = builder.objectives;
        this.teamId = builder.teamId;
        this.win = builder.win;
    }

    public List<Ban> getBans() {
        return bans;
    }

    public Objectives getObjectives() {
        return objectives;
    }

    public int getTeamId() {
        return teamId;
    }

    public boolean isWin() {
        return win;
    }

    public static class Builder {
        private List<Ban> bans = new ArrayList<>(10);
        private Objectives objectives;
        private int teamId;
        private boolean win;

        public List<Ban> getBans() {
            return bans;
        }

        public Builder setBans(List<Ban> bans) {
            this.bans = bans;
            return this;
        }

        public Objectives getObjectives() {
            return objectives;
        }

        public Builder setObjectives(Objectives objectives) {
            this.objectives = objectives;
            return this;
        }

        public int getTeamId() {
            return teamId;
        }

        public Builder setTeamId(int teamId) {
            this.teamId = teamId;
            return this;
        }

        public boolean isWin() {
            return win;
        }

        public Builder setWin(boolean win) {
            this.win = win;
            return this;
        }

        public Team build() {
            return new Team(this);
        }
    }
}
