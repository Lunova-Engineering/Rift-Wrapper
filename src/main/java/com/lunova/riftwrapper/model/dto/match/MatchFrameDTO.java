package com.lunova.riftwrapper.model.dto.match;

import java.util.List;
import java.util.Map;

public class MatchFrameDTO {

    private long timestamp;
    private Map<String, MatchParticipantFrameDTO> participantFrames;
    private List<MatchEventDTO> events;

    public MatchFrameDTO(long timestamp, Map<String, MatchParticipantFrameDTO> participantFrames, List<MatchEventDTO> events) {
        this.timestamp = timestamp;
        this.participantFrames = participantFrames;
        this.events = events;
    }

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
