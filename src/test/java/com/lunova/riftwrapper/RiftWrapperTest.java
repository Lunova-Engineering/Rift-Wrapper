package com.lunova.riftwrapper;

import com.lunova.riftwrapper.model.dto.common.Region;
import com.lunova.riftwrapper.model.user.summoner.Summoner;

public class RiftWrapperTest {

    public static void main(String[] args) {
        RiftWrapper.setRiotApiKey("RGAPI-fe11f0f7-3ebd-4fdc-a34b-9c9ee3ff868d");
        RiftWrapper.setRegion(Region.NORTH_AMERICA);
        Summoner summoner = RiftWrapper.summonerByName("Metorrite").get();
        System.out.println(summoner.getName() + "\n" + summoner.getSummonerLevel() + " \n" + summoner.getId());


    }
}
