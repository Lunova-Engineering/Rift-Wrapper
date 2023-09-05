package com.metorrite.riftwrapper.model.data.dto.league.match;

public class PerkStats {
    private int defense, flex, offense;

    public PerkStats(int defense, int flex, int offense) {
        this.defense = defense;
        this.flex = flex;
        this.offense = offense;
    }

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