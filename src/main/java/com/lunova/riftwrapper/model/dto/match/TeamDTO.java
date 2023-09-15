package com.lunova.riftwrapper.model.dto.match;

import com.lunova.riftwrapper.model.dto.DataTransferObject;

import java.util.ArrayList;
import java.util.List;

public class TeamDTO extends DataTransferObject {
    private List<BanDTO> bans = new ArrayList<>(10);
    private ObjectivesDTO objectives;
    private int teamId;
    private boolean win;

    public TeamDTO(List<BanDTO> bans, ObjectivesDTO objectives, int teamId, boolean win) {
        this.bans = bans;
        this.objectives = objectives;
        this.teamId = teamId;
        this.win = win;
    }

    public TeamDTO() {

    }

    public List<BanDTO> getBans() {
        return bans;
    }

    public void setBans(List<BanDTO> bans) {
        this.bans = bans;
    }

    public ObjectivesDTO getObjectives() {
        return objectives;
    }

    public void setObjectives(ObjectivesDTO objectives) {
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
