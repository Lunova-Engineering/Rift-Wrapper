package com.lunova.riftwrapper.model.user.match;

import com.lunova.riftwrapper.model.user.UserObject;

import java.util.List;

public class MatchEvent extends UserObject {

    private String eventType;
    private String towerType;
    private int teamId;
    private String ascendedType;
    private int killerId;
    private String levelUpType;
    private String pointCaptured;
    private List<Integer> assistingParticipantIds;
    private String wardType;
    private String monsterType;
    private String type;
    private int skillSlot;
    private int victimId;
    private long timestamp;
    private int afterId;
    private String monsterSubType;
    private String laneType;
    private int itemId;
    private int participantId;
    private String buildingType;
    private int creatorId;
    private MatchPosition position;
    private int beforeId;
    private MatchEvent(Builder builder) {
        this.eventType = builder.eventType;
        this.towerType = builder.towerType;
        this.teamId = builder.teamId;
        this.ascendedType = builder.ascendedType;
        this.killerId = builder.killerId;
        this.levelUpType = builder.levelUpType;
        this.pointCaptured = builder.pointCaptured;
        this.assistingParticipantIds = builder.assistingParticipantIds;
        this.wardType = builder.wardType;
        this.monsterType = builder.monsterType;
        this.type = builder.type;
        this.skillSlot = builder.skillSlot;
        this.victimId = builder.victimId;
        this.timestamp = builder.timestamp;
        this.afterId = builder.afterId;
        this.monsterSubType = builder.monsterSubType;
        this.laneType = builder.laneType;
        this.itemId = builder.itemId;
        this.participantId = builder.participantId;
        this.buildingType = builder.buildingType;
        this.creatorId = builder.creatorId;
        this.position = builder.position;
        this.beforeId = builder.beforeId;
    }

    public String getEventType() {
        return eventType;
    }

    public String getTowerType() {
        return towerType;
    }

    public int getTeamId() {
        return teamId;
    }

    public String getAscendedType() {
        return ascendedType;
    }

    public int getKillerId() {
        return killerId;
    }

    public String getLevelUpType() {
        return levelUpType;
    }

    public String getPointCaptured() {
        return pointCaptured;
    }

    public List<Integer> getAssistingParticipantIds() {
        return assistingParticipantIds;
    }

    public String getWardType() {
        return wardType;
    }

    public String getMonsterType() {
        return monsterType;
    }

    public String getType() {
        return type;
    }

    public int getSkillSlot() {
        return skillSlot;
    }

    public int getVictimId() {
        return victimId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public int getAfterId() {
        return afterId;
    }

    public String getMonsterSubType() {
        return monsterSubType;
    }

    public String getLaneType() {
        return laneType;
    }

    public int getItemId() {
        return itemId;
    }

    public int getParticipantId() {
        return participantId;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public int getCreatorId() {
        return creatorId;
    }

    public MatchPosition getPosition() {
        return position;
    }

    public int getBeforeId() {
        return beforeId;
    }

    public static class Builder {
        private String eventType;
        private String towerType;
        private int teamId;
        private String ascendedType;
        private int killerId;
        private String levelUpType;
        private String pointCaptured;
        private List<Integer> assistingParticipantIds;
        private String wardType;
        private String monsterType;
        private String type;
        private int skillSlot;
        private int victimId;
        private long timestamp;
        private int afterId;
        private String monsterSubType;
        private String laneType;
        private int itemId;
        private int participantId;
        private String buildingType;
        private int creatorId;
        private MatchPosition position;
        private int beforeId;

        public String getEventType() {
            return eventType;
        }

        public Builder setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }

        public String getTowerType() {
            return towerType;
        }

        public Builder setTowerType(String towerType) {
            this.towerType = towerType;
            return this;
        }

        public int getTeamId() {
            return teamId;
        }

        public Builder setTeamId(int teamId) {
            this.teamId = teamId;
            return this;
        }

        public String getAscendedType() {
            return ascendedType;
        }

        public Builder setAscendedType(String ascendedType) {
            this.ascendedType = ascendedType;
            return this;
        }

        public int getKillerId() {
            return killerId;
        }

        public Builder setKillerId(int killerId) {
            this.killerId = killerId;
            return this;
        }

        public String getLevelUpType() {
            return levelUpType;
        }

        public Builder setLevelUpType(String levelUpType) {
            this.levelUpType = levelUpType;
            return this;
        }

        public String getPointCaptured() {
            return pointCaptured;
        }

        public Builder setPointCaptured(String pointCaptured) {
            this.pointCaptured = pointCaptured;
            return this;
        }

        public List<Integer> getAssistingParticipantIds() {
            return assistingParticipantIds;
        }

        public Builder setAssistingParticipantIds(List<Integer> assistingParticipantIds) {
            this.assistingParticipantIds = assistingParticipantIds;
            return this;
        }

        public String getWardType() {
            return wardType;
        }

        public Builder setWardType(String wardType) {
            this.wardType = wardType;
            return this;
        }

        public String getMonsterType() {
            return monsterType;
        }

        public Builder setMonsterType(String monsterType) {
            this.monsterType = monsterType;
            return this;
        }

        public String getType() {
            return type;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public int getSkillSlot() {
            return skillSlot;
        }

        public Builder setSkillSlot(int skillSlot) {
            this.skillSlot = skillSlot;
            return this;
        }

        public int getVictimId() {
            return victimId;
        }

        public Builder setVictimId(int victimId) {
            this.victimId = victimId;
            return this;
        }

        public long getTimestamp() {
            return timestamp;
        }

        public Builder setTimestamp(long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public int getAfterId() {
            return afterId;
        }

        public Builder setAfterId(int afterId) {
            this.afterId = afterId;
            return this;
        }

        public String getMonsterSubType() {
            return monsterSubType;
        }

        public Builder setMonsterSubType(String monsterSubType) {
            this.monsterSubType = monsterSubType;
            return this;
        }

        public String getLaneType() {
            return laneType;
        }

        public Builder setLaneType(String laneType) {
            this.laneType = laneType;
            return this;
        }

        public int getItemId() {
            return itemId;
        }

        public Builder setItemId(int itemId) {
            this.itemId = itemId;
            return this;
        }

        public int getParticipantId() {
            return participantId;
        }

        public Builder setParticipantId(int participantId) {
            this.participantId = participantId;
            return this;
        }

        public String getBuildingType() {
            return buildingType;
        }

        public Builder setBuildingType(String buildingType) {
            this.buildingType = buildingType;
            return this;
        }

        public int getCreatorId() {
            return creatorId;
        }

        public Builder setCreatorId(int creatorId) {
            this.creatorId = creatorId;
            return this;
        }

        public MatchPosition getPosition() {
            return position;
        }

        public Builder setPosition(MatchPosition position) {
            this.position = position;
            return this;
        }

        public int getBeforeId() {
            return beforeId;
        }

        public Builder setBeforeId(int beforeId) {
            this.beforeId = beforeId;
            return this;
        }

        public MatchEvent build() {
            return new MatchEvent(this);
        }
    }
}
