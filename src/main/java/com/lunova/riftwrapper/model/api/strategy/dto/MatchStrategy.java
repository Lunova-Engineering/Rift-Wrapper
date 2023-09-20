package com.lunova.riftwrapper.model.api.strategy.dto;

import com.fasterxml.jackson.core.type.TypeReference;
import com.lunova.riftwrapper.model.api.strategy.DataStrategy;
import com.lunova.riftwrapper.model.dto.match.MatchDTO;
import com.lunova.riftwrapper.model.transformers.MatchTransformer;
import com.lunova.riftwrapper.model.user.match.Match;

public class MatchStrategy implements DataStrategy<MatchDTO, Match> {

    private static MatchStrategy matchStrategy;

    public static MatchStrategy getInstance() {
        return matchStrategy == null ? new MatchStrategy() : matchStrategy;
    }

    @Override
    public TypeReference<MatchDTO> getDeserializeType() {
        return new TypeReference<MatchDTO>(){};
    }

    @Override
    public MatchDTO transform(Match userObject) {
        return MatchTransformer.transform(userObject);
    }

    @Override
    public Match transform(MatchDTO dataTransferObject) {
        return MatchTransformer.transform(dataTransferObject);
    }

    @Override
    public MatchDTO getDefaultDataInstance() {
        return new MatchDTO();
    }

    @Override
    public Match getDefaultUserInstance() {
        return new Match.Builder().build();
    }
}
