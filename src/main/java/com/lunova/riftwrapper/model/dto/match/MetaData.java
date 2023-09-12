package com.lunova.riftwrapper.model.dto.match;

import java.util.ArrayList;
import java.util.List;

public class MetaData {
    private String dataVersion;
    private String matchId;
    private final List<String> participants = new ArrayList<>(10);

    public MetaData(String dataVersion, String matchId, List<String> participants) {
        this.dataVersion = dataVersion;
        this.matchId = matchId;
        this.participants.addAll(participants);
    }

    public String getDataVersion() {
        return dataVersion;
    }

    public void setDataVersion(String dataVersion) {
        this.dataVersion = dataVersion;
    }

    public String getMatchId() {
        return matchId;
    }

    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    public List<String> getParticipants() {
        return participants;
    }
}
