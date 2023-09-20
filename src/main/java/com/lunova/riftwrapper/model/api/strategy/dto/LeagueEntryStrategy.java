package com.lunova.riftwrapper.model.api.strategy.dto;

import com.fasterxml.jackson.core.type.TypeReference;
import com.lunova.riftwrapper.model.api.strategy.DataStrategy;
import com.lunova.riftwrapper.model.dto.DataTransferObject;
import com.lunova.riftwrapper.model.dto.league.LeagueEntryDTO;
import com.lunova.riftwrapper.model.transformers.LeagueTransformer;
import com.lunova.riftwrapper.model.user.UserObject;
import com.lunova.riftwrapper.model.user.league.LeagueEntry;

public class LeagueEntryStrategy implements DataStrategy<DataTransferObject.SetProxy<LeagueEntryDTO>, UserObject.SetProxy<LeagueEntry>> {

    private static LeagueEntryStrategy leagueEntryStrategy;

    public static LeagueEntryStrategy getInstance() {
        return leagueEntryStrategy == null ? new LeagueEntryStrategy() : leagueEntryStrategy;
    }

    @Override
    public TypeReference<DataTransferObject.SetProxy<LeagueEntryDTO>> getDeserializeType() {
        return new TypeReference<DataTransferObject.SetProxy<LeagueEntryDTO>>(){};
    }

    @Override
    public DataTransferObject.SetProxy<LeagueEntryDTO> transform(UserObject.SetProxy<LeagueEntry> userObject) {
        return LeagueTransformer.transform(userObject);
    }

    @Override
    public UserObject.SetProxy<LeagueEntry> transform(DataTransferObject.SetProxy<LeagueEntryDTO> dataTransferObject) {
        return LeagueTransformer.transform(dataTransferObject);
    }

    @Override
    public DataTransferObject.SetProxy<LeagueEntryDTO> getDefaultDataInstance() {
        return new DataTransferObject.SetProxy<LeagueEntryDTO>();
    }

    @Override
    public UserObject.SetProxy<LeagueEntry> getDefaultUserInstance() {
        return new UserObject.SetProxy<LeagueEntry>();
    }


}
