package com.lunova.riftwrapper;

import com.lunova.riftwrapper.model.data.Region;
import com.lunova.riftwrapper.model.user.league.LeagueEntry;
import com.lunova.riftwrapper.model.user.league.LeagueList;
import com.lunova.riftwrapper.model.user.summoner.Summoner;
import com.lunova.riftwrapper.utilities.Utilities;

import java.util.LinkedHashSet;

public class RiftWrapperTest {

    public static int place = 1;
    public static void main(String[] args) {
        RiftWrapper.setRiotApiKey("RGAPI-be0e5ec3-92d8-4884-b23c-a932e1e1df43");
        RiftWrapper.setRegion(Region.NORTH_AMERICA);
        Summoner summoner = RiftWrapper.getSummonerWithName("Walle D Marno");
        LinkedHashSet<LeagueEntry> entry = RiftWrapper.getLeagueEntryById(summoner.getId());
       // LinkedHashSet<LeagueEntry> e2 = RiftWrapper.getLeagueEntryList(QueueType.RANKED_SOLO_5x5, Tier.DIAMOND, Division.I);
        //LeagueList leagueList = RiftWrapper.getMasterLeagueByQueue(QueueType.RANKED_SOLO_5x5);
       // e2.forEach(e -> System.out.println(Utilities.printValues(e)));
        //List<LeagueItem> sorted = (leagueList.getEntries().stream().sorted((o1, o2) -> o2.getLeaguePoints() - o1.getLeaguePoints()).toList());
       // sorted.forEach(item -> System.out.println("Name: " + item.getSummonerName() + "\n" + "Rank: " + place++ + "\n" + "LP: " + item.getLeaguePoints() + ""));

        String id = entry.iterator().next().getLeagueId();
        LeagueList list = RiftWrapper.getLeagueByLeagueId(id);

        list.getEntries().forEach(p -> System.out.println(Utilities.printValues(p)));
    }
}
