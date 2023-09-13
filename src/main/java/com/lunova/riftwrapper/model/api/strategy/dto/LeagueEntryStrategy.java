package com.lunova.riftwrapper.model.api.strategy.dto;

import com.lunova.riftwrapper.model.dto.league.LeagueEntryDTO;
import com.lunova.riftwrapper.model.transformers.LeagueTransformer;
import com.lunova.riftwrapper.model.user.league.LeagueEntry;

public class LeagueEntryStrategy implements DataStrategy<LeagueEntryDTO, LeagueEntry> {
    @Override
    public Class<LeagueEntryDTO> getDTOClass() {
        return LeagueEntryDTO.class;
    }

    @Override
    public LeagueEntryDTO transform(LeagueEntry userObject) {
        return null;
    }

    @Override
    public LeagueEntry transform(LeagueEntryDTO dataTransferObject) {
        return LeagueTransformer.transform(dataTransferObject);
    }

    @Override
    public LeagueEntry getDefaultInstance() {
        return new LeagueEntry.Builder().build();
    }
}
