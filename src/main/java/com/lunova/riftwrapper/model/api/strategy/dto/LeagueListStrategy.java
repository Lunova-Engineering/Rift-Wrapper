package com.lunova.riftwrapper.model.api.strategy.dto;

import com.lunova.riftwrapper.model.api.strategy.SingleDataStrategy;
import com.lunova.riftwrapper.model.dto.league.LeagueListDTO;
import com.lunova.riftwrapper.model.transformers.LeagueTransformer;
import com.lunova.riftwrapper.model.user.league.LeagueList;

public class LeagueListStrategy implements SingleDataStrategy<LeagueListDTO, LeagueList> {

    private static LeagueListStrategy leagueListStrategy;

    public static LeagueListStrategy getInstance() {
        return leagueListStrategy == null ? new LeagueListStrategy() : leagueListStrategy;
    }

    @Override
    public Class<LeagueListDTO> getDTOClass() {
        return LeagueListDTO.class;
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
    public LeagueList getDefaultInstance() {
        return new LeagueList.Builder().build();
    }
}
