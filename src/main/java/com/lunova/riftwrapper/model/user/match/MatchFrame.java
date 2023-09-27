package com.lunova.riftwrapper.model.user.match;

import com.lunova.riftwrapper.model.user.UserObject;

import java.util.List;
import java.util.Map;

public class MatchFrame extends UserObject {

    private long timestamp;
    private Map<String, MatchParticipantFrame> participantFrames;
    private List<MatchEvent> events;

    private MatchFrame(Builder builder) {
        this.timestamp = builder.timestamp;
        this.participantFrames = builder.participantFrames;
        this.events = builder.events;
    }
    public long getTimestamp() {
        return timestamp;
    }

    public Map<String, MatchParticipantFrame> getParticipantFrames() {
        return participantFrames;
    }

    public List<MatchEvent> getEvents() {
        return events;
    }

    public static class Builder {
        private long timestamp;
        private Map<String, MatchParticipantFrame> participantFrames;
        private List<MatchEvent> events;

        public long getTimestamp() {
            return timestamp;
        }

        public Builder setTimestamp(long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Map<String, MatchParticipantFrame> getParticipantFrames() {
            return participantFrames;
        }

        public Builder setParticipantFrames(Map<String, MatchParticipantFrame> participantFrames) {
            this.participantFrames = participantFrames;
            return this;
        }

        public List<MatchEvent> getEvents() {
            return events;
        }

        public Builder setEvents(List<MatchEvent> events) {
            this.events = events;
            return this;
        }

        public MatchFrame build() {
            return new MatchFrame(this);
        }
    }
}
