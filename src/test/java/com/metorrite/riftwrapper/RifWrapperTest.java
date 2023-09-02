package com.metorrite.riftwrapper;

import com.metorrite.riftwrapper.data.Region;
import com.metorrite.riftwrapper.data.types.Summoner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RifWrapperTest {

    public static void main(String[] args) {
        RiftWrapper.setRiotApiKey("RGAPI-87f35cce-374b-46de-8427-bcb993d58e94");
        RiftWrapper.setRegion(Region.NORTH_AMERICA);
        Summoner summoner = RiftWrapper.getSummonerByName("Metorrite");
        System.out.println(summoner.getSummonerLevel());
        Summoner summoner1 = RiftWrapper.getSummonerByName("wooga wooga wooga");
        System.out.println(summoner1.getSummonerLevel());
    }
}
