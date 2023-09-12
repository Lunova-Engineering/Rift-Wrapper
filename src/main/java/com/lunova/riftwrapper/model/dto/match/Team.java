package com.lunova.riftwrapper.model.dto.match;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Ban> bans = new ArrayList<>(10);
    private Objectives objectives;
    private int teamId;
    private boolean win;

    public Team(List<Ban> bans, Objectives objectives, int teamId, boolean win) {
        this.bans = bans;
        this.objectives = objectives;
        this.teamId = teamId;
        this.win = win;
    }

    public List<Ban> getBans() {
        return bans;
    }

    public void setBans(List<Ban> bans) {
        this.bans = bans;
    }

    public Objectives getObjectives() {
        return objectives;
    }

    public void setObjectives(Objectives objectives) {
        this.objectives = objectives;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }
}
