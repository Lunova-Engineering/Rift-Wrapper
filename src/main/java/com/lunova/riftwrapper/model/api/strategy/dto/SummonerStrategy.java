package com.lunova.riftwrapper.model.api.strategy.dto;

import com.fasterxml.jackson.core.type.TypeReference;
import com.lunova.riftwrapper.model.api.strategy.DataStrategy;
import com.lunova.riftwrapper.model.dto.summoner.SummonerDTO;
import com.lunova.riftwrapper.model.transformers.SummonerTransformer;
import com.lunova.riftwrapper.model.user.summoner.Summoner;

public class SummonerStrategy implements DataStrategy<SummonerDTO, Summoner> {

    private static SummonerStrategy summonerStrategy;

    public static SummonerStrategy getInstance() {
        if(summonerStrategy == null)
            summonerStrategy = new SummonerStrategy();
        return summonerStrategy;
    }

    @Override
    public TypeReference<SummonerDTO> getDeserializeType() {
        return new TypeReference<SummonerDTO>() {};
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
    public SummonerDTO getDefaultDataInstance() {
        return new SummonerDTO();
    }

    @Override
    public Summoner getDefaultUserInstance() {
        return new Summoner.Builder().build();
    }
}
