package com.lunova.riftwrapper.model.dto.match;

import com.lunova.riftwrapper.model.dto.DataTransferObject;

public class BanDTO extends DataTransferObject {
    private int championId;
    private int pickTurn;

    public BanDTO(int championId, int pickTurn) {
        this.championId = championId;
        this.pickTurn = pickTurn;
    }

    public BanDTO() {

    }

    public int getChampionId() {
        return championId;
    }

    public void setChampionId(int championId) {
        this.championId = championId;
    }

    public int getPickTurn() {
        return pickTurn;
    }

    public void setPickTurn(int pickTurn) {
        this.pickTurn = pickTurn;
    }
}
