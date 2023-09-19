package com.lunova.riftwrapper.model.api.strategy.dto;

import com.google.gson.reflect.TypeToken;
import com.lunova.riftwrapper.model.api.strategy.CollectionDataStrategy;
import com.lunova.riftwrapper.model.dto.league.LeagueEntryDTO;
import com.lunova.riftwrapper.model.transformers.LeagueTransformer;
import com.lunova.riftwrapper.model.user.league.LeagueEntry;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LeagueEntryStrategy implements CollectionDataStrategy<LeagueEntryDTO, LeagueEntry> {

    private static LeagueEntryStrategy leagueEntryStrategy;

    public static LeagueEntryStrategy getInstance() {
        return leagueEntryStrategy == null ? new LeagueEntryStrategy() : leagueEntryStrategy;
    }

    @Override
    public Type getDTOCollectionType() {
        return new TypeToken<LinkedHashSet<LeagueEntryDTO>>(){}.getType();
    }

    @Override
    public Collection<LeagueEntry> transform(Collection<LeagueEntryDTO> dataTransferObjectCollection) {
        return dataTransferObjectCollection.stream().map(this::transform).collect(Collectors.toCollection(LinkedHashSet::new));
    }

    @Override
    public Collection<LeagueEntry> getDefaultCollectionInstance() {
        return Set.of(new LeagueEntry.Builder().build());
    }

    @Override
    public Class<LeagueEntryDTO> getDTOClass() {
        return LeagueEntryDTO.class;
    }

    @Override
    public LeagueEntryDTO transform(LeagueEntry userObject) {
        return null;
        //return LeagueTransformer.transform(userObject);
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
