package com.lunova.riftwrapper.model.transformers;

import com.lunova.riftwrapper.model.dto.summoner.SummonerDTO;
import com.lunova.riftwrapper.model.user.summoner.Summoner;

public class SummonerTransformer {
    public static Summoner transform(SummonerDTO dto) {
        Summoner.Builder summoner = new Summoner.Builder();
        summoner.setId(dto.getId());
        summoner.setAccountId(dto.getAccountId());
        summoner.setPuuid(dto.getPuuid());
        summoner.setName(dto.getName());
        summoner.setProfileIconId(dto.getProfileIconId());
        summoner.setRevisionDate(dto.getRevisionDate());
        summoner.setSummonerLevel(dto.getSummonerLevel());
        return summoner.build();
    }

    public static SummonerDTO transform(Summoner summoner) {
        SummonerDTO summonerDto = new SummonerDTO();
        summonerDto.setId(summoner.getId());
        summonerDto.setAccountId(summoner.getAccountId());
        summonerDto.setPuuid(summoner.getPuuid());
        summonerDto.setName(summoner.getName());
        summonerDto.setProfileIconId(summoner.getProfileIconId());
        summonerDto.setRevisionDate(summoner.getRevisionDate());
        summonerDto.setSummonerLevel(summoner.getSummonerLevel());
        return summonerDto;
    }
}
