package com.lunova.riftwrapper;

import com.lunova.riftwrapper.model.data.Region;
import com.lunova.riftwrapper.model.user.league.LeagueEntry;
import com.lunova.riftwrapper.model.user.summoner.Summoner;

import java.util.LinkedHashSet;

public class RiftWrapperTest {

    public static void main(String[] args) {
        RiftWrapper.setRiotApiKey("RGAPI-eac47fc5-1d17-4638-81ae-30e4a1db1a43");
        RiftWrapper.setRegion(Region.NORTH_AMERICA);
        Summoner summoner = RiftWrapper.getSummonerWithName("Walle D Marno");
        LinkedHashSet<LeagueEntry> entry = RiftWrapper.getLeagueEntryById(summoner.getId());

    }
}
