package com.metorrite.riftwrapper.model.data.types;

public enum GameType {
    CUSTOM_GAME("Custom games"),
    TUTORIAL_GAME("Tutorial games"),
    MATCHED_GAME("all other games");

    private String description;

    GameType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
