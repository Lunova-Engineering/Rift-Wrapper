package com.lunova.riftwrapper.model.api.strategy.dto;

import com.lunova.riftwrapper.model.api.strategy.SingleDataStrategy;
import com.lunova.riftwrapper.model.dto.match.MatchDTO;
import com.lunova.riftwrapper.model.transformers.MatchTransformer;
import com.lunova.riftwrapper.model.user.match.Match;

public class MatchStrategy implements SingleDataStrategy<MatchDTO, Match> {

    private static MatchStrategy matchStrategy;

    public static MatchStrategy getInstance() {
        return matchStrategy == null ? new MatchStrategy() : matchStrategy;
    }

    @Override
    public Class<MatchDTO> getDTOClass() {
        return MatchDTO.class;
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
    public Match getDefaultInstance() {
        return null;
    }
}
