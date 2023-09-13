package com.lunova.riftwrapper;

import com.lunova.riftwrapper.model.data.Region;
import com.lunova.riftwrapper.model.user.summoner.Summoner;
import com.lunova.riftwrapper.utilities.Utilities;

public class RiftWrapperTest {

    public static void main(String[] args) {
        RiftWrapper.setRiotApiKey("RGAPI-0985e912-96d5-4a2a-9f91-65d182ece939");
        RiftWrapper.setRegion(Region.NORTH_AMERICA);
        Summoner summoner = RiftWrapper.getSummonerWithName("Walle D Marno");
       // LeagueEntry entry = RiftWrapper.getLeagueEntryById(summoner.getId());

        System.out.println(Utilities.printValues(summoner) +"\n\n");
       // System.out.println(Utilities.printValues(entry));

    }
}
