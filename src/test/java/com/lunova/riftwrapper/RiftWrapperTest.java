package com.lunova.riftwrapper;

import com.lunova.riftwrapper.model.data.QueueType;
import com.lunova.riftwrapper.model.data.Region;
import com.lunova.riftwrapper.model.user.league.LeagueEntry;
import com.lunova.riftwrapper.model.user.league.LeagueItem;
import com.lunova.riftwrapper.model.user.league.LeagueList;
import com.lunova.riftwrapper.model.user.match.Match;
import com.lunova.riftwrapper.model.user.summoner.Summoner;
import com.lunova.riftwrapper.utilities.Utilities;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class RiftWrapperTest {

    public static void main(String[] args) {
        RiftWrapper.setRiotApiKey("RGAPI-460426c3-971e-484e-9903-1256d36d87ee");
        RiftWrapper.setRegion(Region.NORTH_AMERICA);

        Summoner summoner = RiftWrapper.getSummonerWithName("Metorrite");
        Utilities.printValues(summoner);
        Set<LeagueEntry> entries = RiftWrapper.getLeagueEntryById(summoner.getId());
        entries.forEach(Utilities::printValues);
        List<String> ids = RiftWrapper.getMatchList(summoner.getPuuid());
        ids.forEach(System.out::println);
        List<Match> matchList = new ArrayList<>(ids.size());
       // ids.forEach(id -> matchList.add(RiftWrapper.getMatches(id)));
        Comparator<LeagueItem> c = new Comparator<LeagueItem>() {
            @Override
            public int compare(LeagueItem o1, LeagueItem o2) {
                return o2.getLeaguePoints() - o1.getLeaguePoints();
            }
        };
        LeagueList ch = RiftWrapper.getChallengerLeagueByQueue(QueueType.RANKED_SOLO_5x5);
        ch.getEntries().sort(c);
        ch.getEntries().forEach(p -> System.out.println("Name: " + p.getSummonerName() + "\nRank: " + (ch.getEntries().indexOf(p) + 1)+ "\nLP: " + p.getLeaguePoints() + "\n"));
        LeagueList gm = RiftWrapper.getGrandMasterLeagueByQueue(QueueType.RANKED_SOLO_5x5);
        gm.getEntries().sort(c);
        gm.getEntries().forEach(p -> System.out.println("Name: " + p.getSummonerName() + "\nRank: " + (gm.getEntries().indexOf(p)) + "\nLP: " + p.getLeaguePoints() + "\n"));
        LeagueList m = RiftWrapper.getMasterLeagueByQueue(QueueType.RANKED_SOLO_5x5);
        m.getEntries().sort(c);
        m.getEntries().forEach(p -> System.out.println("Name: " + p.getSummonerName() + "\nRank: " + (m.getEntries().indexOf(p)+1) + "\nLP: " + p.getLeaguePoints() + "\n"));

        System.out.println("Total players in Apex tiers - " + (NumberFormat.getInstance().format(ch.getEntries().size() + gm.getEntries().size() + m.getEntries().size())));
/*        matchList.forEach(match -> Utilities.printValues(match.getInfo().getParticipants().stream()
                .filter(player -> player.getSummonerName().equalsIgnoreCase("Metorrite")).findAny().get()));*/

    }

}
