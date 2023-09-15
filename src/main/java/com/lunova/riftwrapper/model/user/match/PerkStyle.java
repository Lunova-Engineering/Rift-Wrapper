package com.lunova.riftwrapper.model.user.match;

import com.lunova.riftwrapper.model.user.UserObject;

import java.util.ArrayList;
import java.util.List;

public class PerkStyle extends UserObject {
    private String description;
    private List<PerkStyleSelection> perkStyleSelections = new ArrayList<>(2);

    private PerkStyle(Builder builder) {
        this.description = builder.description;
        this.perkStyleSelections = builder.perkStyleSelections;
    }

    public String getDescription() {
        return description;
    }

    public List<PerkStyleSelection> getPerkStyleSelections() {
        return perkStyleSelections;
    }

    public static class Builder {
        private String description;
        private List<PerkStyleSelection> perkStyleSelections = new ArrayList<>(2);

        public String getDescription() {
            return description;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public List<PerkStyleSelection> getPerkStyleSelections() {
            return perkStyleSelections;
        }

        public Builder setPerkStyleSelections(List<PerkStyleSelection> perkStyleSelections) {
            this.perkStyleSelections = perkStyleSelections;
            return this;
        }

        public PerkStyle build() {
            return new PerkStyle(this);
        }
    }
}
