package com.metorrite.riftwrapper;

import com.metorrite.riftwrapper.data.Region;

import java.io.IOException;

public class RifWrapperTest {

    public static void main(String[] args) {
        RiftWrapper.setRiotApiKey("RGAPI-c00927b6-4ebb-48ae-92b8-8b75366d132b");
        RiftWrapper.setRegion(Region.NORTH_AMERICA);
        RiftWrapper.getData("Ozc34UxsQzEE-RmqbnrVnuWsCYHfmYMXNwBSyK0Nq6ls4Nd4-RcDCTeGbaKdviqOKZI3_jeQ80LeFg", "https://americas.api.riotgames.com/lol/match/v5/matches/by-puuid/");
    }
}
