package com.lunova.riftwrapper.model.api.strategy.dto;

import com.fasterxml.jackson.core.type.TypeReference;
import com.lunova.riftwrapper.model.api.strategy.DataStrategy;
import com.lunova.riftwrapper.model.dto.match.MatchTimelineDTO;
import com.lunova.riftwrapper.model.transformers.MatchTransformer;
import com.lunova.riftwrapper.model.user.match.MatchTimeline;

public class MatchTimelineStrategy implements DataStrategy<MatchTimelineDTO, MatchTimeline> {

    private static MatchTimelineStrategy matchTimelineStrategy;

    public static MatchTimelineStrategy getInstance() {
        if(matchTimelineStrategy == null)
            matchTimelineStrategy = new MatchTimelineStrategy();
        return matchTimelineStrategy;
    }

    @Override
    public TypeReference<MatchTimelineDTO> getDeserializeType() {
        return new TypeReference<MatchTimelineDTO>() {};
    }

    @Override
    public MatchTimelineDTO transform(MatchTimeline userObject) {
        return MatchTransformer.transform(userObject);
    }

    @Override
    public MatchTimeline transform(MatchTimelineDTO dataTransferObject) {
        return MatchTransformer.transform(dataTransferObject);
    }

    @Override
    public MatchTimelineDTO getDefaultDataInstance() {
        return new MatchTimelineDTO();
    }

    @Override
    public MatchTimeline getDefaultUserInstance() {
        return new MatchTimeline.Builder().build();
    }
}
