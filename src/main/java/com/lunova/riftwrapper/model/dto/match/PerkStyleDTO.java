package com.lunova.riftwrapper.model.dto.match;

import com.lunova.riftwrapper.model.dto.DataTransferObject;

import java.util.ArrayList;
import java.util.List;

public class PerkStyleDTO extends DataTransferObject {
    private String description;
    private List<PerkStyleSelectionDTO> perkStyleSelections = new ArrayList<>(2);

    public PerkStyleDTO(String description, List<PerkStyleSelectionDTO> perkStyleSelections) {
        this.description = description;
        this.perkStyleSelections.addAll(perkStyleSelections);
    }

    public PerkStyleDTO() {

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<PerkStyleSelectionDTO> getPerkStyleSelections() {
        return perkStyleSelections;
    }

    public void setPerkStyleSelections(List<PerkStyleSelectionDTO> perkStyleSelections) {
        this.perkStyleSelections = perkStyleSelections;
    }
}
