package com.lunova.riftwrapper.model.user.match;

import com.lunova.riftwrapper.model.user.UserObject;

import java.util.ArrayList;
import java.util.List;

public class MetaData extends UserObject {
    private String dataVersion;
    private String matchId;
    private List<String> participants = new ArrayList<>(10);

    private MetaData(Builder builder) {
        this.dataVersion = builder.dataVersion;
        this.matchId = builder.matchId;
        this.participants = builder.participants;
    }

    public String getDataVersion() {
        return dataVersion;
    }

    public String getMatchId() {
        return matchId;
    }

    public List<String> getParticipants() {
        return participants;
    }

    public static class Builder {
        private String dataVersion;
        private String matchId;
        private List<String> participants = new ArrayList<>(10);

        public String getDataVersion() {
            return dataVersion;
        }

        public Builder setDataVersion(String dataVersion) {
            this.dataVersion = dataVersion;
            return this;
        }

        public String getMatchId() {
            return matchId;
        }

        public Builder setMatchId(String matchId) {
            this.matchId = matchId;
            return this;
        }

        public List<String> getParticipants() {
            return participants;
        }

        public MetaData build() {
            return new MetaData(this);
        }

        public Builder setParticipants(List<String> participants) {
            this.participants = participants;
            return this;
        }
    }
}
