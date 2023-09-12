package com.lunova.riftwrapper;

import com.lunova.riftwrapper.model.dto.common.Region;
import com.lunova.riftwrapper.utilities.Utilities;

public class RiftWrapperTest {

    public static void main(String[] args) {
        RiftWrapper.setRiotApiKey("RGAPI-fe11f0f7-3ebd-4fdc-a34b-9c9ee3ff868d");
        RiftWrapper.setRegion(Region.NORTH_AMERICA);
/*        Summoner summoner = RiftWrapper.summonerWithName("Metorrite");
        Summoner summoner1 = RiftWrapper.summonerWithId("aY1J9tE8W946XdVlqvzjWIHfcitxJ2oi_jU8dkfHKAWAC_U");
        Summoner summoner2 = RiftWrapper.summonerWithAccountId("iu1CrVn86aF5eaU6MLFc4U69Cd_sOO8-GVtGAeHbMbTfH5U");
        Summoner summoner3 = RiftWrapper.summonerWithPuuid("Ozc34UxsQzEE-RmqbnrVnuWsCYHfmYMXNwBSyK0Nq6ls4Nd4-RcDCTeGbaKdviqOKZI3_jeQ80LeFg");
        Summoner summoner4 = RiftWrapper.summonerWithName("Metorrite");
        List<Summoner> summoners = List.of(summoner, summoner1, summoner2, summoner3, summoner4);

        summoners.forEach(summoner5 -> System.out.println(Utilities.printValues(summoner5)));*/

        RiftWrapper.summonersWithName("Metorrite", "Jhin V9", "Walle D Marno").forEach(player -> System.out.println(Utilities.printValues(player)));
    }
}
