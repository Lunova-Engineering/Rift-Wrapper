package com.metorrite.riftwrapper;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.metorrite.riftwrapper.model.data.dto.league.match.Match;
import com.metorrite.riftwrapper.model.data.dto.summoner.Summoner;
import com.metorrite.riftwrapper.utilities.JsonSerializer;

public class RiftWrapperTest {

    public static void main(String[] args) {
        RiftWrapper.setRiotApiKey("RGAPI-f7e549fd-e789-4f9c-b38c-7e07363b36c8");
        //RiftWrapper.setRegion(Region.NORTH_AMERICA);
        Summoner summoner = RiftWrapper.getSummonerByName("Metorrite");
        System.out.println(JsonSerializer.serialize(summoner, Summoner.class));

        String matchResponse = RiftWrapper.getMatchData();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
/*        Object obj = gson.fromJson(matchResponse, Object.class);
        String prettyData = gson.toJson(obj);
        System.out.println(prettyData);*/
        Match match = gson.fromJson(matchResponse, Match.class);
        match.getInfo().getParticipants().forEach(participant -> {
            System.out.println(participant.getSummonerName() + "'s Stats!");
            System.out.println("Champion: " + participant.getChampionName());
            System.out.println("Role: " + participant.getRole());
            System.out.println("Level: " + participant.getChampLevel());
            System.out.println("Gold: " + participant.getGoldEarned());
            System.out.println("Kills: " + participant.getKills());
            System.out.println("Deaths: " + participant.getDeaths());
            System.out.println("Assists: " + participant.getAssists());
            System.out.println("Final KDA: " + ((participant.getKills() + participant.getAssists()) / participant.getDeaths()));
            System.out.println("--------------------------------\n");
        });
    }
}
