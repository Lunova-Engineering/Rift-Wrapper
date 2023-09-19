package com.lunova.riftwrapper.model.dto.match;

import com.lunova.riftwrapper.model.dto.DataTransferObject;

public class ObjectivesDTO extends DataTransferObject {
    private ObjectiveDTO baron, champion, dragon, inhibitor, riftHerald, tower;

    public ObjectiveDTO getBaron() {
        return baron;
    }

    public void setBaron(ObjectiveDTO baron) {
        this.baron = baron;
    }

    public ObjectiveDTO getChampion() {
        return champion;
    }

    public void setChampion(ObjectiveDTO champion) {
        this.champion = champion;
    }

    public ObjectiveDTO getDragon() {
        return dragon;
    }

    public void setDragon(ObjectiveDTO dragon) {
        this.dragon = dragon;
    }

    public ObjectiveDTO getInhibitor() {
        return inhibitor;
    }

    public void setInhibitor(ObjectiveDTO inhibitor) {
        this.inhibitor = inhibitor;
    }

    public ObjectiveDTO getRiftHerald() {
        return riftHerald;
    }

    public void setRiftHerald(ObjectiveDTO riftHerald) {
        this.riftHerald = riftHerald;
    }

    public ObjectiveDTO getTower() {
        return tower;
    }

    public void setTower(ObjectiveDTO tower) {
        this.tower = tower;
    }
}
