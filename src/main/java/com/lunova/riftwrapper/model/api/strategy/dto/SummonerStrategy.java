package com.lunova.riftwrapper.model.api.strategy.dto;

import com.lunova.riftwrapper.model.dto.summoner.SummonerDTO;
import com.lunova.riftwrapper.model.transformers.SummonerTransformer;
import com.lunova.riftwrapper.model.user.summoner.Summoner;

public class SummonerStrategy implements SingleDataStrategy<SummonerDTO, Summoner> {
    @Override
    public Class<SummonerDTO> getDTOClass() {
        return SummonerDTO.class;
    }

    @Override
    public SummonerDTO transform(Summoner userObject) {
        return SummonerTransformer.transform(userObject);
    }

    @Override
    public Summoner transform(SummonerDTO dataTransferObject) {
        return SummonerTransformer.transform(dataTransferObject);
    }

    @Override
    public Summoner getDefaultInstance() {
        return new Summoner.Builder().build();
    }
}
