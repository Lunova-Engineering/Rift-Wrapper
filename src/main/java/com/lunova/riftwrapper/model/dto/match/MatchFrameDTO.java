package com.lunova.riftwrapper.model.dto.match;

import java.util.List;
import java.util.Map;

public class MatchFrameDTO {

    private long timestamp;
    private Map<String, MatchParticipantFrameDTO> participantFrames;
    private List<MatchEventDTO> events;

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public Map<String, MatchParticipantFrameDTO> getParticipantFrames() {
        return participantFrames;
    }

    public void setParticipantFrames(Map<String, MatchParticipantFrameDTO> participantFrames) {
        this.participantFrames = participantFrames;
    }

    public List<MatchEventDTO> getEvents() {
        return events;
    }

    public void setEvents(List<MatchEventDTO> events) {
        this.events = events;
    }
}
