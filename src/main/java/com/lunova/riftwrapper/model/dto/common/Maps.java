package com.lunova.riftwrapper.model.dto.common;

public enum Maps {
    SUMMONERS_RIFT_ORIGINAL_SUMMER(1, "Original Summer variant"),
    SUMMONERS_RIFT_ORIGINAL_AUTUMN(2, "Original Autumn variant"),
    THE_PROVING_GROUNDS(3, "Tutorial Map"),
    TWISTED_TREELINE_ORIGINAL(4, "Original Version"),
    THE_CRYSTAL_SCAR(8, "Dominion map"),
    TWISTED_TREELINE_LAST(10, "Last TT map"),
    SUMMONERS_RIFT_CURRENT(11, "Current Version"),
    HOWLING_ABYSS(12, "ARAM map"),
    BUTCHERS_BRIDGE(14, "Alternate ARAM map"),
    COSMIC_RUINS(16, "Dark Star: Singularity map"),
    VALORAN_CITY_PARK(18, "Star Guardian Invasion map"),
    SUBSTRUCTURE_43(19, "PROJECT: Hunters map"),
    CRASH_SITE(20, "Odyssey: Extraction map"),
    NEXUS_BLITZ(21, "Nexus Blitz map"),
    CONVERGENCE(22, "Teamfight Tactics map"),
    RINGS_OF_WRATH(30, "Arena map");

    private String notes;
    private int mapId;

    Maps(int mapId, String notes) {
        this.notes = notes;
        this.mapId = mapId;
    }

    public String getNotes() {
        return notes;
    }

    public int getMapId() {
        return mapId;
    }
}
