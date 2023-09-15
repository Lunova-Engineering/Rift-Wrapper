package com.lunova.riftwrapper.model.user.match;

import com.lunova.riftwrapper.model.user.UserObject;

public class Objectives extends UserObject {
    private Objective baron, champion, dragon, inhibitor, riftHerald, tower;

    private Objectives(Builder builder) {
        this.baron = builder.baron;
        this.champion = builder.champion;
        this.dragon = builder.dragon;
        this.inhibitor = builder.inhibitor;
        this.riftHerald = builder.riftHerald;
        this.tower = builder.tower;
    }

    public Objective getBaron() {
        return baron;
    }

    public Objective getChampion() {
        return champion;
    }

    public Objective getDragon() {
        return dragon;
    }

    public Objective getInhibitor() {
        return inhibitor;
    }

    public Objective getRiftHerald() {
        return riftHerald;
    }

    public Objective getTower() {
        return tower;
    }

    public static class Builder {
        private Objective baron, champion, dragon, inhibitor, riftHerald, tower;

        public Objective getBaron() {
            return baron;
        }

        public Builder setBaron(Objective baron) {
            this.baron = baron;
            return this;
        }

        public Objective getChampion() {
            return champion;
        }

        public Builder setChampion(Objective champion) {
            this.champion = champion;
            return this;
        }

        public Objective getDragon() {
            return dragon;
        }

        public Builder setDragon(Objective dragon) {
            this.dragon = dragon;
            return this;
        }

        public Objective getInhibitor() {
            return inhibitor;
        }

        public Builder setInhibitor(Objective inhibitor) {
            this.inhibitor = inhibitor;
            return this;
        }

        public Objective getRiftHerald() {
            return riftHerald;
        }

        public Builder setRiftHerald(Objective riftHerald) {
            this.riftHerald = riftHerald;
            return this;
        }

        public Objective getTower() {
            return tower;
        }

        public Builder setTower(Objective tower) {
            this.tower = tower;
            return this;
        }

        public Objectives build() {
            return new Objectives(this);
        }
    }

}
