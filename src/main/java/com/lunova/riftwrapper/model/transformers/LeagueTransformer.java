package com.lunova.riftwrapper.model.transformers;

import com.lunova.riftwrapper.model.dto.DataTransferObject;
import com.lunova.riftwrapper.model.dto.league.LeagueEntryDTO;
import com.lunova.riftwrapper.model.dto.league.LeagueItemDTO;
import com.lunova.riftwrapper.model.dto.league.LeagueListDTO;
import com.lunova.riftwrapper.model.dto.league.MiniSeriesDTO;
import com.lunova.riftwrapper.model.user.UserObject;
import com.lunova.riftwrapper.model.user.league.LeagueEntry;
import com.lunova.riftwrapper.model.user.league.LeagueItem;
import com.lunova.riftwrapper.model.user.league.LeagueList;
import com.lunova.riftwrapper.model.user.league.MiniSeries;

import java.util.stream.Collectors;

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
        builder.setMiniSeries(transform(dto.getMiniSeries()));
        return builder.build();
    }

    public static LeagueEntryDTO transform(LeagueEntry leagueEntry) {
        LeagueEntryDTO dto = new LeagueEntryDTO();
        dto.setLeagueId(leagueEntry.getLeagueId());
        dto.setSummonerId(leagueEntry.getSummonerId());
        dto.setSummonerName(leagueEntry.getSummonerName());
        dto.setQueueType(leagueEntry.getQueueType());
        dto.setTier(leagueEntry.getTier());
        dto.setRank(leagueEntry.getRank());
        dto.setLeaguePoints(leagueEntry.getLeaguePoints());
        dto.setWins(leagueEntry.getWins());
        dto.setLosses(leagueEntry.getLosses());
        dto.setHotStreak(leagueEntry.isHotStreak());
        dto.setVeteran(leagueEntry.isVeteran());
        dto.setFreshBlood(leagueEntry.isFreshBlood());
        dto.setInactive(leagueEntry.isInactive());
        dto.setMiniSeries(transform(leagueEntry.getMiniSeries()));
        return dto;
    }

    public static LeagueList transform(LeagueListDTO dto) {
        LeagueList.Builder builder = new LeagueList.Builder();
        builder.setLeagueId(dto.getLeagueId());
        builder.setEntries(dto.getEntries().stream().map(LeagueTransformer::transform).collect(Collectors.toList()));
        builder.setTier(dto.getTier());
        builder.setName(dto.getName());
        builder.setQueue(dto.getQueue());
        return  builder.build();
    }

    public static LeagueListDTO transform(LeagueList leagueList) {
        LeagueListDTO dto = new LeagueListDTO();
        dto.setLeagueId(leagueList.getLeagueId());
        dto.setEntries(leagueList.getEntries().stream().map(LeagueTransformer::transform).collect(Collectors.toList()));
        dto.setTier(leagueList.getTier());
        dto.setName(leagueList.getName());
        dto.setQueue(leagueList.getQueue());
        return  dto;
    }
    public static LeagueItem transform(LeagueItemDTO dto) {
        LeagueItem.Builder builder = new LeagueItem.Builder();
        builder.setFreshBlood(dto.isFreshBlood());
        builder.setWins(dto.getWins());
        builder.setSummonerName(dto.getSummonerName());
        builder.setMiniSeries(transform(dto.getMiniSeries()));
        builder.setInactive(dto.isInactive());
        builder.setVeteran(dto.isVeteran());
        builder.setHotStreak(dto.isHotStreak());
        builder.setRank(dto.getRank());
        builder.setLeaguePoints(dto.getLeaguePoints());
        builder.setLosses(dto.getLosses());
        builder.setSummonerId(dto.getSummonerId());
        return builder.build();
    }

    public static LeagueItemDTO transform(LeagueItem leagueItem) {
        LeagueItemDTO dto = new LeagueItemDTO();
        dto.setFreshBlood(leagueItem.isFreshBlood());
        dto.setWins(leagueItem.getWins());
        dto.setSummonerName(leagueItem.getSummonerName());
        dto.setMiniSeries(transform(leagueItem.getMiniSeries()));
        dto.setInactive(leagueItem.isInactive());
        dto.setVeteran(leagueItem.isVeteran());
        dto.setHotStreak(leagueItem.isHotStreak());
        dto.setRank(leagueItem.getRank());
        dto.setLosses(leagueItem.getLeaguePoints());
        dto.setSummonerId(leagueItem.getSummonerId());
        return dto;
    }

    public static MiniSeries transform(MiniSeriesDTO dto) {
        if(dto == null)
            return new MiniSeries.Builder().build();
        MiniSeries.Builder builder = new MiniSeries.Builder();
        builder.setLosses(dto.getLosses());
        builder.setProgress(dto.getProgress());
        builder.setTarget(dto.getTarget());
        builder.setWins(dto.getWins());
        return builder.build();
    }

    public static MiniSeriesDTO transform(MiniSeries miniSeries) {
        if(miniSeries == null)
            return new MiniSeriesDTO();
        MiniSeriesDTO dto = new MiniSeriesDTO();
        dto.setLosses(miniSeries.getLosses());
        dto.setProgress(miniSeries.getProgress());
        dto.setTarget(miniSeries.getTarget());
        dto.setWins(miniSeries.getWins());
        return dto;
    }

    public static DataTransferObject.SetProxy<LeagueEntryDTO> transform(UserObject.SetProxy<LeagueEntry> userObject) {
        DataTransferObject.SetProxy<LeagueEntryDTO> setProxy = new DataTransferObject.SetProxy<>();
        setProxy.addAll(userObject.stream().map(LeagueTransformer::transform).collect(Collectors.toSet()));
        return setProxy;
    }

    public static UserObject.SetProxy<LeagueEntry> transform(DataTransferObject.SetProxy<LeagueEntryDTO> dataTransferObject) {
        UserObject.SetProxy<LeagueEntry> setProxy = new UserObject.SetProxy<>();
        setProxy.addAll(dataTransferObject.stream().map(LeagueTransformer::transform).collect(Collectors.toSet()));
        return setProxy;
    }
}
