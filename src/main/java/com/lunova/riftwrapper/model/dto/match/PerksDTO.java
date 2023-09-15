package com.lunova.riftwrapper.model.dto.match;

import com.lunova.riftwrapper.model.dto.DataTransferObject;

import java.util.ArrayList;
import java.util.List;

public class PerksDTO extends DataTransferObject {
    private PerkStatsDTO perkStats;
    private List<PerkStyleDTO> styles = new ArrayList<>(2);

    public PerksDTO(PerkStatsDTO perkStats, List<PerkStyleDTO> styles) {
        this.perkStats = perkStats;
        this.styles.addAll(styles);
    }

    public PerksDTO() {

    }

    public PerkStatsDTO getPerkStats() {
        return perkStats;
    }

    public void setPerkStats(PerkStatsDTO perkStats) {
        this.perkStats = perkStats;
    }

    public List<PerkStyleDTO> getStyles() {
        return styles;
    }

    public PerksDTO setStyles(List<PerkStyleDTO> styles) {
        this.styles = styles;
        return this;
    }
}
