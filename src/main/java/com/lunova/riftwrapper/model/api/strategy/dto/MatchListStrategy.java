package com.lunova.riftwrapper.model.api.strategy.dto;

import com.google.common.reflect.TypeToken;
import com.lunova.riftwrapper.model.api.strategy.SimpleCollectionDataStrategy;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MatchListStrategy implements SimpleCollectionDataStrategy<List<String>> {

    private static MatchListStrategy matchListStrategy;

    public static MatchListStrategy getInstance() {
        return matchListStrategy == null ? new MatchListStrategy() : matchListStrategy;
    }
    @Override
    public Type getDeserializeType() {
        return new TypeToken<List<String>>(){}.getType();
    }

    @Override
    public List<String> getDefaultCollection() {
        return new ArrayList<>();
    }
}
