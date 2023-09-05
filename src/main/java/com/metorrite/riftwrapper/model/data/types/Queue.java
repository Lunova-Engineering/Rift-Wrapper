package com.metorrite.riftwrapper.model.data.types;

public enum Queue {
    ARAM(450),
    BLIND_PICK(430, "NORMAL_5V5_BLIND_PICK"),
    NORMAL(400, "TEAM_BUILDER_DRAFT_UNRANKED_5X5"),
    RANKED_SOLO(420, "RANKED_SOLO_5x5"),
    RANKED_FLEX(440, "RANKED_FLEX_SR"),
    RANKED_TFT(1100);

    private final int id;
    private final String notes;

    private Queue(final int id) {
        this(id, null);
    }

    private Queue(final int id, final String notes) {
        this.id = id;
        this.notes = notes;
    }

    public int getId() {
        return id;
    }

    public String getNotes() {
        return notes;
    }
}