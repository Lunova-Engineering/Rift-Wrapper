package com.lunova.riftwrapper.model.data;

public enum Platform {
    AMERICAS("americas.api.riotgames.com");

    private final String routingValue;
    Platform(String routingValue) {
        this.routingValue = routingValue;
    }

    public String getRoutingValue() {
        return routingValue;
    }
}
