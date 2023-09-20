package com.lunova.riftwrapper.model.api.strategy.dto;

import com.fasterxml.jackson.core.type.TypeReference;
import com.lunova.riftwrapper.model.api.strategy.DataStrategy;
import com.lunova.riftwrapper.model.dto.DataTransferObject;
import com.lunova.riftwrapper.model.transformers.MatchTransformer;
import com.lunova.riftwrapper.model.user.UserObject;

public class MatchListStrategy implements DataStrategy<DataTransferObject.ListProxy<String>, UserObject.ListProxy<String>> {

    private static MatchListStrategy matchListStrategy;

    public static MatchListStrategy getInstance() {
        return matchListStrategy == null ? new MatchListStrategy() : matchListStrategy;
    }


    @Override
    public TypeReference<DataTransferObject.ListProxy<String>> getDeserializeType() {
        return new TypeReference<DataTransferObject.ListProxy<String>>(){};
    }

    @Override
    public DataTransferObject.ListProxy<String> transform(UserObject.ListProxy<String> userObject) {
        return MatchTransformer.transform(userObject);
    }

    @Override
    public UserObject.ListProxy<String> transform(DataTransferObject.ListProxy<String> dataTransferObject) {
        return MatchTransformer.transform(dataTransferObject);
    }

    @Override
    public DataTransferObject.ListProxy<String> getDefaultDataInstance() {
        return new DataTransferObject.ListProxy<>();
    }

    @Override
    public UserObject.ListProxy<String> getDefaultUserInstance() {
        return new UserObject.ListProxy<>();
    }
}
