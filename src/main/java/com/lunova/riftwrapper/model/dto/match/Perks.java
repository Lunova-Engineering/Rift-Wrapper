package com.lunova.riftwrapper.model.dto.match;

import java.util.ArrayList;
import java.util.List;

public class Perks {
    private PerkStats perkStats;
    private final List<PerkStyle> styles = new ArrayList<>(2);

    public Perks(PerkStats perkStats, List<PerkStyle> styles) {
        this.perkStats = perkStats;
        this.styles.addAll(styles);
    }

    public PerkStats getPerkStats() {
        return perkStats;
    }

    public void setPerkStats(PerkStats perkStats) {
        this.perkStats = perkStats;
    }

    public List<PerkStyle> getStyles() {
        return styles;
    }
}
