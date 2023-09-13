package com.lunova.riftwrapper.model.transformers;

import com.lunova.riftwrapper.model.dto.league.LeagueEntryDTO;
import com.lunova.riftwrapper.model.user.league.LeagueEntry;

public class LeagueTransformer {

    public static LeagueEntry transform(LeagueEntryDTO dto) {
        LeagueEntry.Builder builder = new LeagueEntry.Builder();
        builder.setLeagueId(dto.getLeagueId());
        builder.setSummonerId(dto.getSummonerId());
        builder.setSummonerName(dto.getSummonerName());
        builder.setQueueType(dto.getQueueType());
        builder.setTier(dto.getTier());
        builder.setRank(dto.getRank());
        builder.setLeaguePoints(dto.getLeaguePoints());
        builder.setWins(dto.getWins());
        builder.setLosses(dto.getLosses());
        builder.setHotStreak(dto.isHotStreak());
        builder.setVeteran(dto.isVeteran());
        builder.setFreshBlood(dto.isFreshBlood());
        builder.setInactive(dto.isInactive());
        builder.setMiniSeries(dto.getMiniSeries()); //TODO CHANGE FROM DTO TO USEROBJECT
        return builder.build();
    }
}
