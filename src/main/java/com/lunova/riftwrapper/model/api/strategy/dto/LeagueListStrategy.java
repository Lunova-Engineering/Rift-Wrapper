package com.lunova.riftwrapper.model.api.strategy.dto;

import com.fasterxml.jackson.core.type.TypeReference;
import com.lunova.riftwrapper.model.api.strategy.DataStrategy;
import com.lunova.riftwrapper.model.dto.league.LeagueListDTO;
import com.lunova.riftwrapper.model.transformers.LeagueTransformer;
import com.lunova.riftwrapper.model.user.league.LeagueList;

public class LeagueListStrategy implements DataStrategy<LeagueListDTO, LeagueList> {

    private static LeagueListStrategy leagueListStrategy;

    public static LeagueListStrategy getInstance() {
        if(leagueListStrategy == null)
            leagueListStrategy = new LeagueListStrategy();
        return leagueListStrategy;
    }

    @Override
    public TypeReference<LeagueListDTO> getDeserializeType() {
        return new TypeReference<LeagueListDTO>() {};
    }

    @Override
    public LeagueListDTO transform(LeagueList userObject) {
        return LeagueTransformer.transform(userObject);
    }

    @Override
    public LeagueList transform(LeagueListDTO dataTransferObject) {
        return LeagueTransformer.transform(dataTransferObject);
    }

    @Override
    public LeagueListDTO getDefaultDataInstance() {
        return new LeagueListDTO();
    }

    @Override
    public LeagueList getDefaultUserInstance() {
        return new LeagueList.Builder().build();
    }
}
