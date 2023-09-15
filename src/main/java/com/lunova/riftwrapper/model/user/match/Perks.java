package com.lunova.riftwrapper.model.user.match;

import com.lunova.riftwrapper.model.user.UserObject;

import java.util.ArrayList;
import java.util.List;

public class Perks extends UserObject {
    private PerkStats perkStats;
    private List<PerkStyle> styles = new ArrayList<>(2);

    private Perks(Builder builder) {
        this.perkStats = builder.perkStats;
        this.styles = builder.styles;
    }

    public PerkStats getPerkStats() {
        return perkStats;
    }

    public List<PerkStyle> getStyles() {
        return styles;
    }

    public static class Builder {
        private PerkStats perkStats;
        private List<PerkStyle> styles = new ArrayList<>(2);

        public PerkStats getPerkStats() {
            return perkStats;
        }

        public Builder setPerkStats(PerkStats perkStats) {
            this.perkStats = perkStats;
            return this;
        }

        public List<PerkStyle> getStyles() {
            return styles;
        }

        public Perks build() {
            return new Perks(this);
        }

        public Builder setStyles(List<PerkStyle> styles) {
            this.styles = styles;
            return this;
        }
    }
}
