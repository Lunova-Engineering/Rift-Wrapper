package com.lunova.riftwrapper.model.dto.match;

import com.lunova.riftwrapper.model.dto.DataTransferObject;

public class PerkStatsDTO extends DataTransferObject {
    private int defense, flex, offense;

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getFlex() {
        return flex;
    }

    public void setFlex(int flex) {
        this.flex = flex;
    }

    public int getOffense() {
        return offense;
    }

    public void setOffense(int offense) {
        this.offense = offense;
    }
}
