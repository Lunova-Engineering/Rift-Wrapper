package com.lunova.riftwrapper;

import com.lunova.riftwrapper.model.data.Region;
import com.lunova.riftwrapper.model.user.match.MatchTimeline;
import com.lunova.riftwrapper.model.user.summoner.Summoner;
import com.lunova.riftwrapper.utilities.Utilities;

public class RiftWrapperTest {

    public static void main(String[] args) {
        RiftWrapper.setRiotApiKey("RGAPI-860b6621-00a2-4d3a-99b7-510579765983");
        RiftWrapper.setRegion(Region.NORTH_AMERICA);
        Summoner summoner = RiftWrapper.getSummonerWithName("Metorrite");
        MatchTimeline timeline = RiftWrapper.getMatchTimeline(RiftWrapper.getMatchList(summoner.getPuuid()).get(0));

/*        MatchTimelineDTO timeline = DataTransferObject.fromJson(HttpRequest.sendRequest("https://americas.api.riotgames.com/lol/match/v5/matches/NA1_4772863715/timeline", RiftWrapper.RIOT_API_KEY), new TypeReference<MatchTimelineDTO>(){});
    */    Utilities.printValues(timeline.getInfo().getFrames().get(24).getEvents().get(1));
        System.out.println(timeline.getInfo().getFrames().get(24).getEvents().get(1).getType());
    }

}
