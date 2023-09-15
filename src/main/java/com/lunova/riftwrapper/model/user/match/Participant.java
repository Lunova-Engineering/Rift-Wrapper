package com.lunova.riftwrapper.model.user.match;


import com.lunova.riftwrapper.model.user.UserObject;

public class Participant extends UserObject {
    private int assists, baronKills, bountyLevel, champExperience, champLevel, championId;
    private String championName;
    private int championTransform, consumablesPurchased, damageDealtToBuildings, damageDealtToObjectives, damageDealtToTurrets, damageSelfMitigated;
    private int deaths, detectorWardsPlaced, doubleKills, dragonKills;
    private boolean firstBloodAssist, firstBloodKill, firstTowerAssist, firstTowerKill, gameEndedInEarlySurrender, gameEndedInSurrender;
    private int goldEarned, goldSpent;
    private String individualPosition;
    private int inhibitorKills, inhibitorTakedowns, inhibitorsLost, item0, item1, item2, item3, item4, item5, item6, itemsPurchased, killingSprees, kills;
    private String lane;
    private int largestCriticalStrike, largestKillingSpree, largestMultiKill, longestTimeSpendLiving, magicDamageDealt, magicDamageDealtToChampions, magicDamageTaken;
    private int neutralMonstersKilled, nexusKills, nexusTakedowns, nexusLost, objectivesStolen, objectivesStolenAssists, participantId, pentaKills;
    private Perks perks;
    private int physicalDamageDealt, physicalDamageDealtToChampions, physicalDamageTaken, profileIcon;
    private String puuid;
    private int quadraKills;
    private String riotIdName, riotTagLine, role;
    private int sightWardsBoughtInGame, spell1Casts, spell2Casts, spell3Casts, spell4Casts, summoner1Casts, summoner1Id, summoner2Casts, summoner2Id;
    private String summonerId;
    private int summonerLevel;
    private String summonerName;
    private boolean teamEarlySurrendered;
    private int teamId;
    private String teamPosition;
    private int timeCCingOthers, timePlayed, totalDamageDealt, totalDamageDealtToOtherChampions, totalDamageShieldedOnTeamates, totalDamageTaken, totalHeal;
    private int totalHealsOnTeammates, totalMinionsKilled, totalTimeCCDealt, totalTimeSpentDead, totalUnitsHealed, tripleKills, trueDamageDealt, trueDamageDealtToChampions;
    private int turretKills, turretTakedowns, turretsLost, unrealKills, visionScore, visionWardsBoughtInGame, wardsKilled, wardsPlaced;
    private boolean win;

    private Participant(Builder builder) {
        this.assists = builder.assists;
        this.baronKills = builder.baronKills;
        this.bountyLevel = builder.bountyLevel;
        this.champExperience = builder.champExperience;
        this.champLevel = builder.champLevel;
        this.championId = builder.championId;
        this.championName = builder.championName;
        this.championTransform = builder.championTransform;
        this.consumablesPurchased = builder.consumablesPurchased;
        this.damageDealtToBuildings = builder.damageDealtToBuildings;
        this.damageDealtToObjectives = builder.damageDealtToObjectives;
        this.damageDealtToTurrets = builder.damageDealtToTurrets;
        this.damageSelfMitigated = builder.damageSelfMitigated;
        this.deaths = builder.deaths;
        this.detectorWardsPlaced = builder.detectorWardsPlaced;
        this.doubleKills = builder.doubleKills;
        this.dragonKills = builder.dragonKills;
        this.firstBloodAssist = builder.firstBloodAssist;
        this.firstBloodKill = builder.firstBloodKill;
        this.firstTowerAssist = builder.firstTowerAssist;
        this.firstTowerKill = builder.firstTowerKill;
        this.gameEndedInEarlySurrender = builder.gameEndedInEarlySurrender;
        this.gameEndedInSurrender = builder.gameEndedInSurrender;
        this.goldEarned = builder.goldEarned;
        this.goldSpent = builder.goldSpent;
        this.individualPosition = builder.individualPosition;
        this.inhibitorKills = builder.inhibitorKills;
        this.inhibitorTakedowns = builder.inhibitorTakedowns;
        this.inhibitorsLost = builder.inhibitorsLost;
        this.item0 = builder.item0;
        this.item1 = builder.item1;
        this.item2 = builder.item2;
        this.item3 = builder.item3;
        this.item4 = builder.item4;
        this.item5 = builder.item5;
        this.item6 = builder.item6;
        this.itemsPurchased = builder.itemsPurchased;
        this.killingSprees = builder.killingSprees;
        this.kills = builder.kills;
        this.lane = builder.lane;
        this.largestCriticalStrike = builder.largestCriticalStrike;
        this.largestKillingSpree = builder.largestKillingSpree;
        this.largestMultiKill = builder.largestMultiKill;
        this.longestTimeSpendLiving = builder.longestTimeSpendLiving;
        this.magicDamageDealt = builder.magicDamageDealt;
        this.magicDamageDealtToChampions = builder.magicDamageDealtToChampions;
        this.magicDamageTaken = builder.magicDamageTaken;
        this.neutralMonstersKilled = builder.neutralMonstersKilled;
        this.nexusKills = builder.nexusKills;
        this.nexusTakedowns = builder.nexusTakedowns;
        this.nexusLost = builder.nexusLost;
        this.objectivesStolen = builder.objectivesStolen;
        this.objectivesStolenAssists = builder.objectivesStolenAssists;
        this.participantId = builder.participantId;
        this.pentaKills = builder.pentaKills;
        this.perks = builder.perks;
        this.physicalDamageDealt = builder.physicalDamageDealt;
        this.physicalDamageDealtToChampions = builder.physicalDamageDealtToChampions;
        this.physicalDamageTaken = builder.physicalDamageTaken;
        this.profileIcon = builder.profileIcon;
        this.puuid = builder.puuid;
        this.quadraKills = builder.quadraKills;
        this.riotIdName = builder.riotIdName;
        this.riotTagLine = builder.riotTagLine;
        this.role = builder.role;
        this.sightWardsBoughtInGame = builder.sightWardsBoughtInGame;
        this.spell1Casts = builder.spell1Casts;
        this.spell2Casts = builder.spell2Casts;
        this.spell3Casts = builder.spell3Casts;
        this.spell4Casts = builder.spell4Casts;
        this.summoner1Casts = builder.summoner1Casts;
        this.summoner1Id = builder.summoner1Id;
        this.summoner2Casts = builder.summoner2Casts;
        this.summoner2Id = builder.summoner2Id;
        this.summonerId = builder.summonerId;
        this.summonerLevel = builder.summonerLevel;
        this.summonerName = builder.summonerName;
        this.teamEarlySurrendered = builder.teamEarlySurrendered;
        this.teamId = builder.teamId;
        this.teamPosition = builder.teamPosition;
        this.timeCCingOthers = builder.timeCCingOthers;
        this.timePlayed = builder.timePlayed;
        this.totalDamageDealt = builder.totalDamageDealt;
        this.totalDamageDealtToOtherChampions = builder.totalDamageDealtToOtherChampions;
        this.totalDamageShieldedOnTeamates = builder.totalDamageShieldedOnTeamates;
        this.totalDamageTaken = builder.totalDamageTaken;
        this.totalHeal = builder.totalHeal;
        this.totalHealsOnTeammates = builder.totalHealsOnTeammates;
        this.totalMinionsKilled = builder.totalMinionsKilled;
        this.totalTimeCCDealt = builder.totalTimeCCDealt;
        this.totalTimeSpentDead = builder.totalTimeSpentDead;
        this.totalUnitsHealed = builder.totalUnitsHealed;
        this.tripleKills = builder.tripleKills;
        this.trueDamageDealt = builder.trueDamageDealt;
        this.trueDamageDealtToChampions = builder.trueDamageDealtToChampions;
        this.turretKills = builder.turretKills;
        this.turretTakedowns = builder.turretTakedowns;
        this.turretsLost = builder.turretsLost;
        this.unrealKills = builder.unrealKills;
        this.visionScore = builder.visionScore;
        this.visionWardsBoughtInGame = builder.visionWardsBoughtInGame;
        this.wardsKilled = builder.wardsKilled;
        this.wardsPlaced = builder.wardsPlaced;
        this.win = builder.win;
    }

    public int getAssists() {
        return assists;
    }

    public int getBaronKills() {
        return baronKills;
    }

    public int getBountyLevel() {
        return bountyLevel;
    }

    public int getChampExperience() {
        return champExperience;
    }

    public int getChampLevel() {
        return champLevel;
    }

    public int getChampionId() {
        return championId;
    }

    public String getChampionName() {
        return championName;
    }

    public int getChampionTransform() {
        return championTransform;
    }

    public int getConsumablesPurchased() {
        return consumablesPurchased;
    }

    public int getDamageDealtToBuildings() {
        return damageDealtToBuildings;
    }

    public int getDamageDealtToObjectives() {
        return damageDealtToObjectives;
    }

    public int getDamageDealtToTurrets() {
        return damageDealtToTurrets;
    }

    public int getDamageSelfMitigated() {
        return damageSelfMitigated;
    }

    public int getDeaths() {
        return deaths;
    }

    public int getDetectorWardsPlaced() {
        return detectorWardsPlaced;
    }

    public int getDoubleKills() {
        return doubleKills;
    }

    public int getDragonKills() {
        return dragonKills;
    }

    public boolean isFirstBloodAssist() {
        return firstBloodAssist;
    }

    public boolean isFirstBloodKill() {
        return firstBloodKill;
    }

    public boolean isFirstTowerAssist() {
        return firstTowerAssist;
    }

    public boolean isFirstTowerKill() {
        return firstTowerKill;
    }

    public boolean isGameEndedInEarlySurrender() {
        return gameEndedInEarlySurrender;
    }

    public boolean isGameEndedInSurrender() {
        return gameEndedInSurrender;
    }

    public int getGoldEarned() {
        return goldEarned;
    }

    public int getGoldSpent() {
        return goldSpent;
    }

    public String getIndividualPosition() {
        return individualPosition;
    }

    public int getInhibitorKills() {
        return inhibitorKills;
    }

    public int getInhibitorTakedowns() {
        return inhibitorTakedowns;
    }

    public int getInhibitorsLost() {
        return inhibitorsLost;
    }

    public int getItem0() {
        return item0;
    }

    public int getItem1() {
        return item1;
    }

    public int getItem2() {
        return item2;
    }

    public int getItem3() {
        return item3;
    }

    public int getItem4() {
        return item4;
    }

    public int getItem5() {
        return item5;
    }

    public int getItem6() {
        return item6;
    }

    public int getItemsPurchased() {
        return itemsPurchased;
    }

    public int getKillingSprees() {
        return killingSprees;
    }

    public int getKills() {
        return kills;
    }

    public String getLane() {
        return lane;
    }

    public int getLargestCriticalStrike() {
        return largestCriticalStrike;
    }

    public int getLargestKillingSpree() {
        return largestKillingSpree;
    }

    public int getLargestMultiKill() {
        return largestMultiKill;
    }

    public int getLongestTimeSpendLiving() {
        return longestTimeSpendLiving;
    }

    public int getMagicDamageDealt() {
        return magicDamageDealt;
    }

    public int getMagicDamageDealtToChampions() {
        return magicDamageDealtToChampions;
    }

    public int getMagicDamageTaken() {
        return magicDamageTaken;
    }

    public int getNeutralMonstersKilled() {
        return neutralMonstersKilled;
    }

    public int getNexusKills() {
        return nexusKills;
    }

    public int getNexusTakedowns() {
        return nexusTakedowns;
    }

    public int getNexusLost() {
        return nexusLost;
    }

    public int getObjectivesStolen() {
        return objectivesStolen;
    }

    public int getObjectivesStolenAssists() {
        return objectivesStolenAssists;
    }

    public int getParticipantId() {
        return participantId;
    }

    public int getPentaKills() {
        return pentaKills;
    }

    public Perks getPerks() {
        return perks;
    }

    public int getPhysicalDamageDealt() {
        return physicalDamageDealt;
    }

    public int getPhysicalDamageDealtToChampions() {
        return physicalDamageDealtToChampions;
    }

    public int getPhysicalDamageTaken() {
        return physicalDamageTaken;
    }

    public int getProfileIcon() {
        return profileIcon;
    }

    public String getPuuid() {
        return puuid;
    }

    public int getQuadraKills() {
        return quadraKills;
    }

    public String getRiotIdName() {
        return riotIdName;
    }

    public String getRiotTagLine() {
        return riotTagLine;
    }

    public String getRole() {
        return role;
    }

    public int getSightWardsBoughtInGame() {
        return sightWardsBoughtInGame;
    }

    public int getSpell1Casts() {
        return spell1Casts;
    }

    public int getSpell2Casts() {
        return spell2Casts;
    }

    public int getSpell3Casts() {
        return spell3Casts;
    }

    public int getSpell4Casts() {
        return spell4Casts;
    }

    public int getSummoner1Casts() {
        return summoner1Casts;
    }

    public int getSummoner1Id() {
        return summoner1Id;
    }

    public int getSummoner2Casts() {
        return summoner2Casts;
    }

    public int getSummoner2Id() {
        return summoner2Id;
    }

    public String getSummonerId() {
        return summonerId;
    }

    public int getSummonerLevel() {
        return summonerLevel;
    }

    public String getSummonerName() {
        return summonerName;
    }

    public boolean isTeamEarlySurrendered() {
        return teamEarlySurrendered;
    }

    public int getTeamId() {
        return teamId;
    }

    public String getTeamPosition() {
        return teamPosition;
    }

    public int getTimeCCingOthers() {
        return timeCCingOthers;
    }

    public int getTimePlayed() {
        return timePlayed;
    }

    public int getTotalDamageDealt() {
        return totalDamageDealt;
    }

    public int getTotalDamageDealtToOtherChampions() {
        return totalDamageDealtToOtherChampions;
    }

    public int getTotalDamageShieldedOnTeamates() {
        return totalDamageShieldedOnTeamates;
    }

    public int getTotalDamageTaken() {
        return totalDamageTaken;
    }

    public int getTotalHeal() {
        return totalHeal;
    }

    public int getTotalHealsOnTeammates() {
        return totalHealsOnTeammates;
    }

    public int getTotalMinionsKilled() {
        return totalMinionsKilled;
    }

    public int getTotalTimeCCDealt() {
        return totalTimeCCDealt;
    }

    public int getTotalTimeSpentDead() {
        return totalTimeSpentDead;
    }

    public int getTotalUnitsHealed() {
        return totalUnitsHealed;
    }

    public int getTripleKills() {
        return tripleKills;
    }

    public int getTrueDamageDealt() {
        return trueDamageDealt;
    }

    public int getTrueDamageDealtToChampions() {
        return trueDamageDealtToChampions;
    }

    public int getTurretKills() {
        return turretKills;
    }

    public int getTurretTakedowns() {
        return turretTakedowns;
    }

    public int getTurretsLost() {
        return turretsLost;
    }

    public int getUnrealKills() {
        return unrealKills;
    }

    public int getVisionScore() {
        return visionScore;
    }

    public int getVisionWardsBoughtInGame() {
        return visionWardsBoughtInGame;
    }

    public int getWardsKilled() {
        return wardsKilled;
    }

    public int getWardsPlaced() {
        return wardsPlaced;
    }

    public boolean isWin() {
        return win;
    }

    public static class Builder {
        private int assists, baronKills, bountyLevel, champExperience, champLevel, championId;
        private String championName;
        private int championTransform, consumablesPurchased, damageDealtToBuildings, damageDealtToObjectives, damageDealtToTurrets, damageSelfMitigated;
        private int deaths, detectorWardsPlaced, doubleKills, dragonKills;
        private boolean firstBloodAssist, firstBloodKill, firstTowerAssist, firstTowerKill, gameEndedInEarlySurrender, gameEndedInSurrender;
        private int goldEarned, goldSpent;
        private String individualPosition;
        private int inhibitorKills, inhibitorTakedowns, inhibitorsLost, item0, item1, item2, item3, item4, item5, item6, itemsPurchased, killingSprees, kills;
        private String lane;
        private int largestCriticalStrike, largestKillingSpree, largestMultiKill, longestTimeSpendLiving, magicDamageDealt, magicDamageDealtToChampions, magicDamageTaken;
        private int neutralMonstersKilled, nexusKills, nexusTakedowns, nexusLost, objectivesStolen, objectivesStolenAssists, participantId, pentaKills;
        private Perks perks;
        private int physicalDamageDealt, physicalDamageDealtToChampions, physicalDamageTaken, profileIcon;
        private String puuid;
        private int quadraKills;
        private String riotIdName, riotTagLine, role;
        private int sightWardsBoughtInGame, spell1Casts, spell2Casts, spell3Casts, spell4Casts, summoner1Casts, summoner1Id, summoner2Casts, summoner2Id;
        private String summonerId;
        private int summonerLevel;
        private String summonerName;
        private boolean teamEarlySurrendered;
        private int teamId;
        private String teamPosition;
        private int timeCCingOthers, timePlayed, totalDamageDealt, totalDamageDealtToOtherChampions, totalDamageShieldedOnTeamates, totalDamageTaken, totalHeal;
        private int totalHealsOnTeammates, totalMinionsKilled, totalTimeCCDealt, totalTimeSpentDead, totalUnitsHealed, tripleKills, trueDamageDealt, trueDamageDealtToChampions;
        private int turretKills, turretTakedowns, turretsLost, unrealKills, visionScore, visionWardsBoughtInGame, wardsKilled, wardsPlaced;
        private boolean win;

        public int getAssists() {
            return assists;
        }

        public Builder setAssists(int assists) {
            this.assists = assists;
            return this;
        }

        public int getBaronKills() {
            return baronKills;
        }

        public Builder setBaronKills(int baronKills) {
            this.baronKills = baronKills;
            return this;
        }

        public int getBountyLevel() {
            return bountyLevel;
        }

        public Builder setBountyLevel(int bountyLevel) {
            this.bountyLevel = bountyLevel;
            return this;
        }

        public int getChampExperience() {
            return champExperience;
        }

        public Builder setChampExperience(int champExperience) {
            this.champExperience = champExperience;
            return this;
        }

        public int getChampLevel() {
            return champLevel;
        }

        public Builder setChampLevel(int champLevel) {
            this.champLevel = champLevel;
            return this;
        }

        public int getChampionId() {
            return championId;
        }

        public Builder setChampionId(int championId) {
            this.championId = championId;
            return this;
        }

        public String getChampionName() {
            return championName;
        }

        public Builder setChampionName(String championName) {
            this.championName = championName;
            return this;
        }

        public int getChampionTransform() {
            return championTransform;
        }

        public Builder setChampionTransform(int championTransform) {
            this.championTransform = championTransform;
            return this;
        }

        public int getConsumablesPurchased() {
            return consumablesPurchased;
        }

        public Builder setConsumablesPurchased(int consumablesPurchased) {
            this.consumablesPurchased = consumablesPurchased;
            return this;
        }

        public int getDamageDealtToBuildings() {
            return damageDealtToBuildings;
        }

        public Builder setDamageDealtToBuildings(int damageDealtToBuildings) {
            this.damageDealtToBuildings = damageDealtToBuildings;
            return this;
        }

        public int getDamageDealtToObjectives() {
            return damageDealtToObjectives;
        }

        public Builder setDamageDealtToObjectives(int damageDealtToObjectives) {
            this.damageDealtToObjectives = damageDealtToObjectives;
            return this;
        }

        public int getDamageDealtToTurrets() {
            return damageDealtToTurrets;
        }

        public Builder setDamageDealtToTurrets(int damageDealtToTurrets) {
            this.damageDealtToTurrets = damageDealtToTurrets;
            return this;
        }

        public int getDamageSelfMitigated() {
            return damageSelfMitigated;
        }

        public Builder setDamageSelfMitigated(int damageSelfMitigated) {
            this.damageSelfMitigated = damageSelfMitigated;
            return this;
        }

        public int getDeaths() {
            return deaths;
        }

        public Builder setDeaths(int deaths) {
            this.deaths = deaths;
            return this;
        }

        public int getDetectorWardsPlaced() {
            return detectorWardsPlaced;
        }

        public Builder setDetectorWardsPlaced(int detectorWardsPlaced) {
            this.detectorWardsPlaced = detectorWardsPlaced;
            return this;
        }

        public int getDoubleKills() {
            return doubleKills;
        }

        public Builder setDoubleKills(int doubleKills) {
            this.doubleKills = doubleKills;
            return this;
        }

        public int getDragonKills() {
            return dragonKills;
        }

        public Builder setDragonKills(int dragonKills) {
            this.dragonKills = dragonKills;
            return this;
        }

        public boolean isFirstBloodAssist() {
            return firstBloodAssist;
        }

        public Builder setFirstBloodAssist(boolean firstBloodAssist) {
            this.firstBloodAssist = firstBloodAssist;
            return this;
        }

        public boolean isFirstBloodKill() {
            return firstBloodKill;
        }

        public Builder setFirstBloodKill(boolean firstBloodKill) {
            this.firstBloodKill = firstBloodKill;
            return this;
        }

        public boolean isFirstTowerAssist() {
            return firstTowerAssist;
        }

        public Builder setFirstTowerAssist(boolean firstTowerAssist) {
            this.firstTowerAssist = firstTowerAssist;
            return this;
        }

        public boolean isFirstTowerKill() {
            return firstTowerKill;
        }

        public Builder setFirstTowerKill(boolean firstTowerKill) {
            this.firstTowerKill = firstTowerKill;
            return this;
        }

        public boolean isGameEndedInEarlySurrender() {
            return gameEndedInEarlySurrender;
        }

        public Builder setGameEndedInEarlySurrender(boolean gameEndedInEarlySurrender) {
            this.gameEndedInEarlySurrender = gameEndedInEarlySurrender;
            return this;
        }

        public boolean isGameEndedInSurrender() {
            return gameEndedInSurrender;
        }

        public Builder setGameEndedInSurrender(boolean gameEndedInSurrender) {
            this.gameEndedInSurrender = gameEndedInSurrender;
            return this;
        }

        public int getGoldEarned() {
            return goldEarned;
        }

        public Builder setGoldEarned(int goldEarned) {
            this.goldEarned = goldEarned;
            return this;
        }

        public int getGoldSpent() {
            return goldSpent;
        }

        public Builder setGoldSpent(int goldSpent) {
            this.goldSpent = goldSpent;
            return this;
        }

        public String getIndividualPosition() {
            return individualPosition;
        }

        public Builder setIndividualPosition(String individualPosition) {
            this.individualPosition = individualPosition;
            return this;
        }

        public int getInhibitorKills() {
            return inhibitorKills;
        }

        public Builder setInhibitorKills(int inhibitorKills) {
            this.inhibitorKills = inhibitorKills;
            return this;
        }

        public int getInhibitorTakedowns() {
            return inhibitorTakedowns;
        }

        public Builder setInhibitorTakedowns(int inhibitorTakedowns) {
            this.inhibitorTakedowns = inhibitorTakedowns;
            return this;
        }

        public int getInhibitorsLost() {
            return inhibitorsLost;
        }

        public Builder setInhibitorsLost(int inhibitorsLost) {
            this.inhibitorsLost = inhibitorsLost;
            return this;
        }

        public int getItem0() {
            return item0;
        }

        public Builder setItem0(int item0) {
            this.item0 = item0;
            return this;
        }

        public int getItem1() {
            return item1;
        }

        public Builder setItem1(int item1) {
            this.item1 = item1;
            return this;
        }

        public int getItem2() {
            return item2;
        }

        public Builder setItem2(int item2) {
            this.item2 = item2;
            return this;
        }

        public int getItem3() {
            return item3;
        }

        public Builder setItem3(int item3) {
            this.item3 = item3;
            return this;
        }

        public int getItem4() {
            return item4;
        }

        public Builder setItem4(int item4) {
            this.item4 = item4;
            return this;
        }

        public int getItem5() {
            return item5;
        }

        public Builder setItem5(int item5) {
            this.item5 = item5;
            return this;
        }

        public int getItem6() {
            return item6;
        }

        public Builder setItem6(int item6) {
            this.item6 = item6;
            return this;
        }

        public int getItemsPurchased() {
            return itemsPurchased;
        }

        public Builder setItemsPurchased(int itemsPurchased) {
            this.itemsPurchased = itemsPurchased;
            return this;
        }

        public int getKillingSprees() {
            return killingSprees;
        }

        public Builder setKillingSprees(int killingSprees) {
            this.killingSprees = killingSprees;
            return this;
        }

        public int getKills() {
            return kills;
        }

        public Builder setKills(int kills) {
            this.kills = kills;
            return this;
        }

        public String getLane() {
            return lane;
        }

        public Builder setLane(String lane) {
            this.lane = lane;
            return this;
        }

        public int getLargestCriticalStrike() {
            return largestCriticalStrike;
        }

        public Builder setLargestCriticalStrike(int largestCriticalStrike) {
            this.largestCriticalStrike = largestCriticalStrike;
            return this;
        }

        public int getLargestKillingSpree() {
            return largestKillingSpree;
        }

        public Builder setLargestKillingSpree(int largestKillingSpree) {
            this.largestKillingSpree = largestKillingSpree;
            return this;
        }

        public int getLargestMultiKill() {
            return largestMultiKill;
        }

        public Builder setLargestMultiKill(int largestMultiKill) {
            this.largestMultiKill = largestMultiKill;
            return this;
        }

        public int getLongestTimeSpendLiving() {
            return longestTimeSpendLiving;
        }

        public Builder setLongestTimeSpendLiving(int longestTimeSpendLiving) {
            this.longestTimeSpendLiving = longestTimeSpendLiving;
            return this;
        }

        public int getMagicDamageDealt() {
            return magicDamageDealt;
        }

        public Builder setMagicDamageDealt(int magicDamageDealt) {
            this.magicDamageDealt = magicDamageDealt;
            return this;
        }

        public int getMagicDamageDealtToChampions() {
            return magicDamageDealtToChampions;
        }

        public Builder setMagicDamageDealtToChampions(int magicDamageDealtToChampions) {
            this.magicDamageDealtToChampions = magicDamageDealtToChampions;
            return this;
        }

        public int getMagicDamageTaken() {
            return magicDamageTaken;
        }

        public Builder setMagicDamageTaken(int magicDamageTaken) {
            this.magicDamageTaken = magicDamageTaken;
            return this;
        }

        public int getNeutralMonstersKilled() {
            return neutralMonstersKilled;
        }

        public Builder setNeutralMonstersKilled(int neutralMonstersKilled) {
            this.neutralMonstersKilled = neutralMonstersKilled;
            return this;
        }

        public int getNexusKills() {
            return nexusKills;
        }

        public Builder setNexusKills(int nexusKills) {
            this.nexusKills = nexusKills;
            return this;
        }

        public int getNexusTakedowns() {
            return nexusTakedowns;
        }

        public Builder setNexusTakedowns(int nexusTakedowns) {
            this.nexusTakedowns = nexusTakedowns;
            return this;
        }

        public int getNexusLost() {
            return nexusLost;
        }

        public Builder setNexusLost(int nexusLost) {
            this.nexusLost = nexusLost;
            return this;
        }

        public int getObjectivesStolen() {
            return objectivesStolen;
        }

        public Builder setObjectivesStolen(int objectivesStolen) {
            this.objectivesStolen = objectivesStolen;
            return this;
        }

        public int getObjectivesStolenAssists() {
            return objectivesStolenAssists;
        }

        public Builder setObjectivesStolenAssists(int objectivesStolenAssists) {
            this.objectivesStolenAssists = objectivesStolenAssists;
            return this;
        }

        public int getParticipantId() {
            return participantId;
        }

        public Builder setParticipantId(int participantId) {
            this.participantId = participantId;
            return this;
        }

        public int getPentaKills() {
            return pentaKills;
        }

        public Builder setPentaKills(int pentaKills) {
            this.pentaKills = pentaKills;
            return this;
        }

        public Perks getPerks() {
            return perks;
        }

        public Builder setPerks(Perks perks) {
            this.perks = perks;
            return this;
        }

        public int getPhysicalDamageDealt() {
            return physicalDamageDealt;
        }

        public Builder setPhysicalDamageDealt(int physicalDamageDealt) {
            this.physicalDamageDealt = physicalDamageDealt;
            return this;
        }

        public int getPhysicalDamageDealtToChampions() {
            return physicalDamageDealtToChampions;
        }

        public Builder setPhysicalDamageDealtToChampions(int physicalDamageDealtToChampions) {
            this.physicalDamageDealtToChampions = physicalDamageDealtToChampions;
            return this;
        }

        public int getPhysicalDamageTaken() {
            return physicalDamageTaken;
        }

        public Builder setPhysicalDamageTaken(int physicalDamageTaken) {
            this.physicalDamageTaken = physicalDamageTaken;
            return this;
        }

        public int getProfileIcon() {
            return profileIcon;
        }

        public Builder setProfileIcon(int profileIcon) {
            this.profileIcon = profileIcon;
            return this;
        }

        public String getPuuid() {
            return puuid;
        }

        public Builder setPuuid(String puuid) {
            this.puuid = puuid;
            return this;
        }

        public int getQuadraKills() {
            return quadraKills;
        }

        public Builder setQuadraKills(int quadraKills) {
            this.quadraKills = quadraKills;
            return this;
        }

        public String getRiotIdName() {
            return riotIdName;
        }

        public Builder setRiotIdName(String riotIdName) {
            this.riotIdName = riotIdName;
            return this;
        }

        public String getRiotTagLine() {
            return riotTagLine;
        }

        public Builder setRiotTagLine(String riotTagLine) {
            this.riotTagLine = riotTagLine;
            return this;
        }

        public String getRole() {
            return role;
        }

        public Builder setRole(String role) {
            this.role = role;
            return this;
        }

        public int getSightWardsBoughtInGame() {
            return sightWardsBoughtInGame;
        }

        public Builder setSightWardsBoughtInGame(int sightWardsBoughtInGame) {
            this.sightWardsBoughtInGame = sightWardsBoughtInGame;
            return this;
        }

        public int getSpell1Casts() {
            return spell1Casts;
        }

        public Builder setSpell1Casts(int spell1Casts) {
            this.spell1Casts = spell1Casts;
            return this;
        }

        public int getSpell2Casts() {
            return spell2Casts;
        }

        public Builder setSpell2Casts(int spell2Casts) {
            this.spell2Casts = spell2Casts;
            return this;
        }

        public int getSpell3Casts() {
            return spell3Casts;
        }

        public Builder setSpell3Casts(int spell3Casts) {
            this.spell3Casts = spell3Casts;
            return this;
        }

        public int getSpell4Casts() {
            return spell4Casts;
        }

        public Builder setSpell4Casts(int spell4Casts) {
            this.spell4Casts = spell4Casts;
            return this;
        }

        public int getSummoner1Casts() {
            return summoner1Casts;
        }

        public Builder setSummoner1Casts(int summoner1Casts) {
            this.summoner1Casts = summoner1Casts;
            return this;
        }

        public int getSummoner1Id() {
            return summoner1Id;
        }

        public Builder setSummoner1Id(int summoner1Id) {
            this.summoner1Id = summoner1Id;
            return this;
        }

        public int getSummoner2Casts() {
            return summoner2Casts;
        }

        public Builder setSummoner2Casts(int summoner2Casts) {
            this.summoner2Casts = summoner2Casts;
            return this;
        }

        public int getSummoner2Id() {
            return summoner2Id;
        }

        public Builder setSummoner2Id(int summoner2Id) {
            this.summoner2Id = summoner2Id;
            return this;
        }

        public String getSummonerId() {
            return summonerId;
        }

        public Builder setSummonerId(String summonerId) {
            this.summonerId = summonerId;
            return this;
        }

        public int getSummonerLevel() {
            return summonerLevel;
        }

        public Builder setSummonerLevel(int summonerLevel) {
            this.summonerLevel = summonerLevel;
            return this;
        }

        public String getSummonerName() {
            return summonerName;
        }

        public Builder setSummonerName(String summonerName) {
            this.summonerName = summonerName;
            return this;
        }

        public boolean isTeamEarlySurrendered() {
            return teamEarlySurrendered;
        }

        public Builder setTeamEarlySurrendered(boolean teamEarlySurrendered) {
            this.teamEarlySurrendered = teamEarlySurrendered;
            return this;
        }

        public int getTeamId() {
            return teamId;
        }

        public Builder setTeamId(int teamId) {
            this.teamId = teamId;
            return this;
        }

        public String getTeamPosition() {
            return teamPosition;
        }

        public Builder setTeamPosition(String teamPosition) {
            this.teamPosition = teamPosition;
            return this;
        }

        public int getTimeCCingOthers() {
            return timeCCingOthers;
        }

        public Builder setTimeCCingOthers(int timeCCingOthers) {
            this.timeCCingOthers = timeCCingOthers;
            return this;
        }

        public int getTimePlayed() {
            return timePlayed;
        }

        public Builder setTimePlayed(int timePlayed) {
            this.timePlayed = timePlayed;
            return this;
        }

        public int getTotalDamageDealt() {
            return totalDamageDealt;
        }

        public Builder setTotalDamageDealt(int totalDamageDealt) {
            this.totalDamageDealt = totalDamageDealt;
            return this;
        }

        public int getTotalDamageDealtToOtherChampions() {
            return totalDamageDealtToOtherChampions;
        }

        public Builder setTotalDamageDealtToOtherChampions(int totalDamageDealtToOtherChampions) {
            this.totalDamageDealtToOtherChampions = totalDamageDealtToOtherChampions;
            return this;
        }

        public int getTotalDamageShieldedOnTeamates() {
            return totalDamageShieldedOnTeamates;
        }

        public Builder setTotalDamageShieldedOnTeamates(int totalDamageShieldedOnTeamates) {
            this.totalDamageShieldedOnTeamates = totalDamageShieldedOnTeamates;
            return this;
        }

        public int getTotalDamageTaken() {
            return totalDamageTaken;
        }

        public Builder setTotalDamageTaken(int totalDamageTaken) {
            this.totalDamageTaken = totalDamageTaken;
            return this;
        }

        public int getTotalHeal() {
            return totalHeal;
        }

        public Builder setTotalHeal(int totalHeal) {
            this.totalHeal = totalHeal;
            return this;
        }

        public int getTotalHealsOnTeammates() {
            return totalHealsOnTeammates;
        }

        public Builder setTotalHealsOnTeammates(int totalHealsOnTeammates) {
            this.totalHealsOnTeammates = totalHealsOnTeammates;
            return this;
        }

        public int getTotalMinionsKilled() {
            return totalMinionsKilled;
        }

        public Builder setTotalMinionsKilled(int totalMinionsKilled) {
            this.totalMinionsKilled = totalMinionsKilled;
            return this;
        }

        public int getTotalTimeCCDealt() {
            return totalTimeCCDealt;
        }

        public Builder setTotalTimeCCDealt(int totalTimeCCDealt) {
            this.totalTimeCCDealt = totalTimeCCDealt;
            return this;
        }

        public int getTotalTimeSpentDead() {
            return totalTimeSpentDead;
        }

        public Builder setTotalTimeSpentDead(int totalTimeSpentDead) {
            this.totalTimeSpentDead = totalTimeSpentDead;
            return this;
        }

        public int getTotalUnitsHealed() {
            return totalUnitsHealed;
        }

        public Builder setTotalUnitsHealed(int totalUnitsHealed) {
            this.totalUnitsHealed = totalUnitsHealed;
            return this;
        }

        public int getTripleKills() {
            return tripleKills;
        }

        public Builder setTripleKills(int tripleKills) {
            this.tripleKills = tripleKills;
            return this;
        }

        public int getTrueDamageDealt() {
            return trueDamageDealt;
        }

        public Builder setTrueDamageDealt(int trueDamageDealt) {
            this.trueDamageDealt = trueDamageDealt;
            return this;
        }

        public int getTrueDamageDealtToChampions() {
            return trueDamageDealtToChampions;
        }

        public Builder setTrueDamageDealtToChampions(int trueDamageDealtToChampions) {
            this.trueDamageDealtToChampions = trueDamageDealtToChampions;
            return this;
        }

        public int getTurretKills() {
            return turretKills;
        }

        public Builder setTurretKills(int turretKills) {
            this.turretKills = turretKills;
            return this;
        }

        public int getTurretTakedowns() {
            return turretTakedowns;
        }

        public Builder setTurretTakedowns(int turretTakedowns) {
            this.turretTakedowns = turretTakedowns;
            return this;
        }

        public int getTurretsLost() {
            return turretsLost;
        }

        public Builder setTurretsLost(int turretsLost) {
            this.turretsLost = turretsLost;
            return this;
        }

        public int getUnrealKills() {
            return unrealKills;
        }

        public Builder setUnrealKills(int unrealKills) {
            this.unrealKills = unrealKills;
            return this;
        }

        public int getVisionScore() {
            return visionScore;
        }

        public Builder setVisionScore(int visionScore) {
            this.visionScore = visionScore;
            return this;
        }

        public int getVisionWardsBoughtInGame() {
            return visionWardsBoughtInGame;
        }

        public Builder setVisionWardsBoughtInGame(int visionWardsBoughtInGame) {
            this.visionWardsBoughtInGame = visionWardsBoughtInGame;
            return this;
        }

        public int getWardsKilled() {
            return wardsKilled;
        }

        public Builder setWardsKilled(int wardsKilled) {
            this.wardsKilled = wardsKilled;
            return this;
        }

        public int getWardsPlaced() {
            return wardsPlaced;
        }

        public Builder setWardsPlaced(int wardsPlaced) {
            this.wardsPlaced = wardsPlaced;
            return this;
        }

        public boolean isWin() {
            return win;
        }

        public Builder setWin(boolean win) {
            this.win = win;
            return this;
        }

        public Participant build() {
            return new Participant(this);
        }
    }
}
