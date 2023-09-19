package com.lunova.riftwrapper;

import com.lunova.riftwrapper.model.data.Region;
import com.lunova.riftwrapper.network.HttpRequest;

public class RiftWrapperTest {

    public static void main(String[] args) {
        RiftWrapper.setRiotApiKey("RGAPI-460426c3-971e-484e-9903-1256d36d87ee");
        RiftWrapper.setRegion(Region.NORTH_AMERICA);
        //String response = HttpRequest.sendRequest("https://americas.api.riotgames.com/lol/match/v5/matches/NA1_4772863715", RiftWrapper.RIOT_API_KEY);
        String response = HttpRequest.sendRequest("https://americas.api.riotgames.com/lol/match/v5/matches/NA1_4772863715/timeline", RiftWrapper.RIOT_API_KEY);
        
    }

}
