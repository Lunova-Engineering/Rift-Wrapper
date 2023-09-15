package com.lunova.riftwrapper;

import com.lunova.riftwrapper.model.data.Region;
import com.lunova.riftwrapper.model.user.match.Match;

public class RiftWrapperTest {

    public static int place = 1;
    public static void main(String[] args) {
        RiftWrapper.setRiotApiKey("RGAPI-be0e5ec3-92d8-4884-b23c-a932e1e1df43");
        RiftWrapper.setRegion(Region.NORTH_AMERICA);
        Match match = RiftWrapper.getMatches("NA1_4772863715");

        System.out.println(match.getInfo().getParticipants().get(0).getChampionName());
    }
}
