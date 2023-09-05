package com.metorrite.riftwrapper.model.data.dto.league.match;

import java.util.ArrayList;
import java.util.List;

public class PerkStyle {
    private String description;
    private List<PerkStyleSelection> perkStyleSelections = new ArrayList<>(2);

    public PerkStyle(String description, List<PerkStyleSelection> perkStyleSelections) {
        this.description = description;
        this.perkStyleSelections.addAll(perkStyleSelections);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<PerkStyleSelection> getPerkStyleSelections() {
        return perkStyleSelections;
    }

    public void setPerkStyleSelections(List<PerkStyleSelection> perkStyleSelections) {
        this.perkStyleSelections = perkStyleSelections;
    }
}
