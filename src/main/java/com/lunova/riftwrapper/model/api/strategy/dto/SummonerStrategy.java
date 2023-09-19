package com.lunova.riftwrapper.model.api.strategy.dto;

import com.lunova.riftwrapper.model.api.strategy.SingleDataStrategy;
import com.lunova.riftwrapper.model.dto.summoner.SummonerDTO;
import com.lunova.riftwrapper.model.transformers.SummonerTransformer;
import com.lunova.riftwrapper.model.user.summoner.Summoner;

public class SummonerStrategy implements SingleDataStrategy<SummonerDTO, Summoner> {

    private static SummonerStrategy summonerStrategy;

    public static SummonerStrategy getInstance() {
        return summonerStrategy == null ? new SummonerStrategy() : summonerStrategy;
    }

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
