package com.lunova.riftwrapper.model.dto.match;

import com.lunova.riftwrapper.model.dto.DataTransferObject;

import java.util.ArrayList;
import java.util.List;

public class MetaDataDTO extends DataTransferObject {
    private String dataVersion;
    private String matchId;
    private List<String> participants = new ArrayList<>(10);

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

    public MetaDataDTO setParticipants(List<String> participants) {
        this.participants = participants;
        return this;
    }
}
