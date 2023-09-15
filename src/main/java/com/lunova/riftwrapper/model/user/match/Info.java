package com.lunova.riftwrapper.model.user.match;

import com.lunova.riftwrapper.model.user.UserObject;

import java.util.ArrayList;
import java.util.List;

public class Info extends UserObject {
    private long gameCreation, gameDuration, gameEndTimestamp, gameId;
    private String gameMode;
    private String gameName;
    private long gameStartTimestamp;
    private String gameType;
    private String gameVersion;
    private int mapId;
    private List<Participant> participants = new ArrayList<>(10);
    private String platformId;
    private int queueId;
    private List<Team> teams = new ArrayList<>(2);
    private String tournamentCode;

    private Info(Builder builder) {
        this.gameCreation = builder.gameCreation;
        this.gameDuration = builder.gameDuration;
        this.gameEndTimestamp = builder.gameEndTimestamp;
        this.gameId = builder.gameId;
        this.gameMode = builder.gameMode;
        this.gameName = builder.gameName;
        this.gameStartTimestamp = builder.gameStartTimestamp;
        this.gameType = builder.gameType;
        this.gameVersion = builder.gameVersion;
        this.mapId = builder.mapId;
        this.participants = builder.participants;
        this.platformId = builder.platformId;
        this.queueId = builder.queueId;
        this.teams = builder.teams;
        this.tournamentCode = builder.tournamentCode;
    }

    public long getGameCreation() {
        return gameCreation;
    }

    public long getGameDuration() {
        return gameDuration;
    }

    public long getGameEndTimestamp() {
        return gameEndTimestamp;
    }

    public long getGameId() {
        return gameId;
    }

    public String getGameMode() {
        return gameMode;
    }

    public String getGameName() {
        return gameName;
    }

    public long getGameStartTimestamp() {
        return gameStartTimestamp;
    }

    public String getGameType() {
        return gameType;
    }

    public String getGameVersion() {
        return gameVersion;
    }

    public int getMapId() {
        return mapId;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public String getPlatformId() {
        return platformId;
    }

    public int getQueueId() {
        return queueId;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public String getTournamentCode() {
        return tournamentCode;
    }

    public static class Builder {
        private long gameCreation, gameDuration, gameEndTimestamp, gameId;
        private String gameMode;
        private String gameName;
        private long gameStartTimestamp;
        private String gameType;
        private String gameVersion;
        private int mapId;
        private List<Participant> participants = new ArrayList<>(10);
        private String platformId;
        private int queueId;
        private List<Team> teams = new ArrayList<>(2);
        private String tournamentCode;

        public long getGameCreation() {
            return gameCreation;
        }

        public Builder setGameCreation(long gameCreation) {
            this.gameCreation = gameCreation;
            return this;
        }

        public long getGameDuration() {
            return gameDuration;
        }

        public Builder setGameDuration(long gameDuration) {
            this.gameDuration = gameDuration;
            return this;
        }

        public long getGameEndTimestamp() {
            return gameEndTimestamp;
        }

        public Builder setGameEndTimestamp(long gameEndTimestamp) {
            this.gameEndTimestamp = gameEndTimestamp;
            return this;
        }

        public long getGameId() {
            return gameId;
        }

        public Builder setGameId(long gameId) {
            this.gameId = gameId;
            return this;
        }

        public String getGameMode() {
            return gameMode;
        }

        public Builder setGameMode(String gameMode) {
            this.gameMode = gameMode;
            return this;
        }

        public String getGameName() {
            return gameName;
        }

        public Builder setGameName(String gameName) {
            this.gameName = gameName;
            return this;
        }

        public long getGameStartTimestamp() {
            return gameStartTimestamp;
        }

        public Builder setGameStartTimestamp(long gameStartTimestamp) {
            this.gameStartTimestamp = gameStartTimestamp;
            return this;
        }

        public String getGameType() {
            return gameType;
        }

        public Builder setGameType(String gameType) {
            this.gameType = gameType;
            return this;
        }

        public String getGameVersion() {
            return gameVersion;
        }

        public Builder setGameVersion(String gameVersion) {
            this.gameVersion = gameVersion;
            return this;
        }

        public int getMapId() {
            return mapId;
        }

        public Builder setMapId(int mapId) {
            this.mapId = mapId;
            return this;
        }

        public List<Participant> getParticipants() {
            return participants;
        }

        public Builder setParticipants(List<Participant> participants) {
            this.participants = participants;
            return this;
        }

        public String getPlatformId() {
            return platformId;
        }

        public Builder setPlatformId(String platformId) {
            this.platformId = platformId;
            return this;
        }

        public int getQueueId() {
            return queueId;
        }

        public Builder setQueueId(int queueId) {
            this.queueId = queueId;
            return this;
        }

        public List<Team> getTeams() {
            return teams;
        }

        public Builder setTeams(List<Team> teams) {
            this.teams = teams;
            return this;
        }

        public String getTournamentCode() {
            return tournamentCode;
        }

        public Builder setTournamentCode(String tournamentCode) {
            this.tournamentCode = tournamentCode;
            return this;
        }

        public Info build() {
            return new Info(this);
        }
    }
}
