package com.lunova.riftwrapper.model.transformers;

import com.lunova.riftwrapper.model.dto.match.*;
import com.lunova.riftwrapper.model.user.match.*;

public class MatchTransformer {

    public static Ban transform(BanDTO dto) {
        if (dto == null)
            return new Ban.Builder().build();
        Ban.Builder builder = new Ban.Builder();
        builder.setChampionId(dto.getChampionId());
        builder.setPickTurn(dto.getPickTurn());
        return builder.build();
    }

    public static BanDTO transform(Ban ban) {
        BanDTO dto = new BanDTO();
        dto.setChampionId(ban.getChampionId());
        dto.setPickTurn(ban.getPickTurn());
        return dto;
    }

    public static Info transform(InfoDTO dto) {
        if (dto == null)
            return new Info.Builder().build();
        Info.Builder builder = new Info.Builder();
        builder.setGameCreation(dto.getGameCreation());
        builder.setGameDuration(dto.getGameDuration());
        builder.setGameEndTimestamp(dto.getGameEndTimestamp());
        builder.setGameId(dto.getGameId());
        builder.setGameMode(dto.getGameMode());
        builder.setGameName(dto.getGameName());
        builder.setGameStartTimestamp(dto.getGameStartTimestamp());
        builder.setGameType(dto.getGameType());
        builder.setGameVersion(dto.getGameVersion());
        builder.setMapId(dto.getMapId());
        builder.setParticipants(dto.getParticipants().stream().map(MatchTransformer::transform).toList());
        builder.setPlatformId(dto.getPlatformId());
        builder.setQueueId(dto.getQueueId());
        builder.setTeams(dto.getTeams().stream().map(MatchTransformer::transform).toList());
        builder.setTournamentCode(dto.getTournamentCode());
        return builder.build();
    }

    public static InfoDTO transform(Info info) {
        InfoDTO dto = new InfoDTO();
        dto.setGameCreation(info.getGameCreation());
        dto.setGameDuration(info.getGameDuration());
        dto.setGameEndTimestamp(info.getGameEndTimestamp());
        dto.setGameId(info.getGameId());
        dto.setGameMode(info.getGameMode());
        dto.setGameName(info.getGameName());
        dto.setGameStartTimestamp(info.getGameStartTimestamp());
        dto.setGameType(info.getGameType());
        dto.setGameVersion(info.getGameVersion());
        dto.setMapId(info.getMapId());
        dto.setParticipants(info.getParticipants().stream().map(MatchTransformer::transform).toList());
        dto.setPlatformId(info.getPlatformId());
        dto.setQueueId(info.getQueueId());
        dto.setTeams(info.getTeams().stream().map(MatchTransformer::transform).toList());
        dto.setTournamentCode(info.getTournamentCode());
        return dto;
    }

    public static Match transform(MatchDTO dto) {
        if (dto == null)
            return new Match.Builder().build();
        Match.Builder builder = new Match.Builder();
        builder.setMetaData(transform(dto.getMetaData()));
        builder.setInfo(transform(dto.getInfo()));
        return builder.build();
    }

    public static MatchDTO transform(Match match) {
        MatchDTO dto = new MatchDTO();
        dto.setMetaData(transform(match.getMetaData()));
        dto.setInfo(transform(match.getInfo()));
        return dto;
    }
    public static MetaData transform(MetaDataDTO dto) {
        if (dto == null)
            return new MetaData.Builder().build();
        MetaData.Builder builder = new MetaData.Builder();
        builder.setDataVersion(dto.getDataVersion());
        builder.setMatchId(dto.getMatchId());
        builder.setParticipants(dto.getParticipants());
        return builder.build();
    }

    public static MetaDataDTO transform(MetaData metaData) {
        MetaDataDTO dto = new MetaDataDTO();
        dto.setDataVersion(metaData.getDataVersion());
        dto.setMatchId(metaData.getMatchId());
        dto.setParticipants(metaData.getParticipants());
        return dto;
    }

    public static Objective transform(ObjectiveDTO dto) {
        if (dto == null) return new Objective.Builder().build();
        Objective.Builder builder = new Objective.Builder();
        builder.setFirst(dto.isFirst());
        builder.setKills(dto.getKills());
        return builder.build();
    }

    public static ObjectiveDTO transform(Objective objective) {
        ObjectiveDTO dto = new ObjectiveDTO();
        dto.setFirst(objective.isFirst());
        dto.setKills(objective.getKills());
        return dto;
    }

    public static Objectives transform(ObjectivesDTO dto) {
        if (dto == null)
            return new Objectives.Builder().build();
        Objectives.Builder builder = new Objectives.Builder();
        builder.setBaron(transform(dto.getBaron()));
        builder.setChampion(transform(dto.getChampion()));
        builder.setDragon(transform(dto.getDragon()));
        builder.setInhibitor(transform(dto.getInhibitor()));
        builder.setRiftHerald(transform(dto.getRiftHerald()));
        builder.setTower(transform(dto.getTower()));
        return builder.build();
    }

    public static ObjectivesDTO transform(Objectives objectives) {
        ObjectivesDTO dto = new ObjectivesDTO();
        dto.setBaron(transform(objectives.getBaron()));
        dto.setChampion(transform(objectives.getChampion()));
        dto.setDragon(transform(objectives.getDragon()));
        dto.setInhibitor(transform(objectives.getInhibitor()));
        dto.setRiftHerald(transform(objectives.getRiftHerald()));
        dto.setTower(transform(objectives.getTower()));
        return dto;
    }

    public static Participant transform(ParticipantDTO dto) {
        if (dto == null) return new
                Participant.Builder().build();
        Participant.Builder builder = new Participant.Builder();
        builder.setAssists(dto.getAssists());
        builder.setBaronKills(dto.getBaronKills());
        builder.setBountyLevel(dto.getBountyLevel());
        builder.setChampExperience(dto.getChampExperience());
        builder.setChampLevel(dto.getChampLevel());
        builder.setChampionId(dto.getChampionId());
        builder.setChampionName(dto.getChampionName());
        builder.setChampionTransform(dto.getChampionTransform());
        builder.setConsumablesPurchased(dto.getConsumablesPurchased());
        builder.setDamageDealtToBuildings(dto.getDamageDealtToBuildings());
        builder.setDamageDealtToObjectives(dto.getDamageDealtToObjectives());
        builder.setDamageDealtToTurrets(dto.getDamageDealtToTurrets());
        builder.setDamageSelfMitigated(dto.getDamageSelfMitigated());
        builder.setDeaths(dto.getDeaths());
        builder.setDetectorWardsPlaced(dto.getDetectorWardsPlaced());
        builder.setDoubleKills(dto.getDoubleKills());
        builder.setDragonKills(dto.getDragonKills());
        builder.setFirstBloodAssist(dto.isFirstBloodAssist());
        builder.setFirstBloodKill(dto.isFirstBloodKill());
        builder.setFirstTowerAssist(dto.isFirstTowerAssist());
        builder.setFirstTowerKill(dto.isFirstTowerKill());
        builder.setGameEndedInEarlySurrender(dto.isGameEndedInEarlySurrender());
        builder.setGameEndedInSurrender(dto.isGameEndedInSurrender());
        builder.setGoldEarned(dto.getGoldEarned());
        builder.setGoldSpent(dto.getGoldSpent());
        builder.setIndividualPosition(dto.getIndividualPosition());
        builder.setInhibitorKills(dto.getInhibitorKills());
        builder.setInhibitorTakedowns(dto.getInhibitorTakedowns());
        builder.setInhibitorsLost(dto.getInhibitorsLost());
        builder.setItem0(dto.getItem0());
        builder.setItem1(dto.getItem1());
        builder.setItem2(dto.getItem2());
        builder.setItem3(dto.getItem3());
        builder.setItem4(dto.getItem4());
        builder.setItem5(dto.getItem5());
        builder.setItem6(dto.getItem6());
        builder.setItemsPurchased(dto.getItemsPurchased());
        builder.setKillingSprees(dto.getKillingSprees());
        builder.setKills(dto.getKills());
        builder.setLane(dto.getLane());
        builder.setLargestCriticalStrike(dto.getLargestCriticalStrike());
        builder.setLargestKillingSpree(dto.getLargestKillingSpree());
        builder.setLargestMultiKill(dto.getLargestMultiKill());
        builder.setLongestTimeSpendLiving(dto.getLongestTimeSpendLiving());
        builder.setMagicDamageDealt(dto.getMagicDamageDealt());
        builder.setMagicDamageDealtToChampions(dto.getMagicDamageDealtToChampions());
        builder.setMagicDamageTaken(dto.getMagicDamageTaken());
        builder.setNeutralMonstersKilled(dto.getNeutralMonstersKilled());
        builder.setNexusKills(dto.getNexusKills());
        builder.setNexusTakedowns(dto.getNexusTakedowns());
        builder.setNexusLost(dto.getNexusLost());
        builder.setObjectivesStolen(dto.getObjectivesStolen());
        builder.setObjectivesStolenAssists(dto.getObjectivesStolenAssists());
        builder.setParticipantId(dto.getParticipantId());
        builder.setPentaKills(dto.getPentaKills());
        builder.setPerks(transform(dto.getPerks()));
        builder.setPhysicalDamageDealt(dto.getPhysicalDamageDealt());
        builder.setPhysicalDamageDealtToChampions(dto.getPhysicalDamageDealtToChampions());
        builder.setPhysicalDamageTaken(dto.getPhysicalDamageTaken());
        builder.setProfileIcon(dto.getProfileIcon());
        builder.setPuuid(dto.getPuuid());
        builder.setQuadraKills(dto.getQuadraKills());
        builder.setRiotIdName(dto.getRiotIdName());
        builder.setRiotTagLine(dto.getRiotTagLine());
        builder.setRole(dto.getRole());
        builder.setSightWardsBoughtInGame(dto.getSightWardsBoughtInGame());
        builder.setSpell1Casts(dto.getSpell1Casts());
        builder.setSpell2Casts(dto.getSpell2Casts());
        builder.setSpell3Casts(dto.getSpell3Casts());
        builder.setSpell4Casts(dto.getSpell4Casts());
        builder.setSummoner1Casts(dto.getSummoner1Casts());
        builder.setSummoner1Id(dto.getSummoner1Id());
        builder.setSummoner2Casts(dto.getSummoner2Casts());
        builder.setSummoner2Id(dto.getSummoner2Id());
        builder.setSummonerId(dto.getSummonerId());
        builder.setSummonerLevel(dto.getSummonerLevel());
        builder.setSummonerName(dto.getSummonerName());
        builder.setTeamEarlySurrendered(dto.isTeamEarlySurrendered());
        builder.setTeamId(dto.getTeamId());
        builder.setTeamPosition(dto.getTeamPosition());
        builder.setTimeCCingOthers(dto.getTimeCCingOthers());
        builder.setTimePlayed(dto.getTimePlayed());
        builder.setTotalDamageDealt(dto.getTotalDamageDealt());
        builder.setTotalDamageDealtToOtherChampions(dto.getTotalDamageDealtToOtherChampions());
        builder.setTotalDamageShieldedOnTeamates(dto.getTotalDamageShieldedOnTeamates());
        builder.setTotalDamageTaken(dto.getTotalDamageTaken());
        builder.setTotalHeal(dto.getTotalHeal());
        builder.setTotalHealsOnTeammates(dto.getTotalHealsOnTeammates());
        builder.setTotalMinionsKilled(dto.getTotalMinionsKilled());
        builder.setTotalTimeCCDealt(dto.getTotalTimeCCDealt());
        builder.setTotalTimeSpentDead(dto.getTotalTimeSpentDead());
        builder.setTotalUnitsHealed(dto.getTotalUnitsHealed());
        builder.setTripleKills(dto.getTripleKills());
        builder.setTrueDamageDealt(dto.getTrueDamageDealt());
        builder.setTrueDamageDealtToChampions(dto.getTrueDamageDealtToChampions());
        builder.setTurretKills(dto.getTurretKills());
        builder.setTurretTakedowns(dto.getTurretTakedowns());
        builder.setTurretsLost(dto.getTurretsLost());
        builder.setUnrealKills(dto.getUnrealKills());
        builder.setVisionScore(dto.getVisionScore());
        builder.setVisionWardsBoughtInGame(dto.getVisionWardsBoughtInGame());
        builder.setWardsKilled(dto.getWardsKilled());
        builder.setWardsPlaced(dto.getWardsPlaced());
        builder.setWin(dto.isWin());
        return builder.build();
    }

    public static ParticipantDTO transform(Participant participant) {
        ParticipantDTO dto = new ParticipantDTO();
        dto.setAssists(participant.getAssists());
        dto.setBaronKills(participant.getBaronKills());
        dto.setBountyLevel(participant.getBountyLevel());
        dto.setChampExperience(participant.getChampExperience());
        dto.setChampLevel(participant.getChampLevel());
        dto.setChampionId(participant.getChampionId());
        dto.setChampionName(participant.getChampionName());
        dto.setChampionTransform(participant.getChampionTransform());
        dto.setConsumablesPurchased(participant.getConsumablesPurchased());
        dto.setDamageDealtToBuildings(participant.getDamageDealtToBuildings());
        dto.setDamageDealtToObjectives(participant.getDamageDealtToObjectives());
        dto.setDamageDealtToTurrets(participant.getDamageDealtToTurrets());
        dto.setDamageSelfMitigated(participant.getDamageSelfMitigated());
        dto.setDeaths(participant.getDeaths());
        dto.setDetectorWardsPlaced(participant.getDetectorWardsPlaced());
        dto.setDoubleKills(participant.getDoubleKills());
        dto.setDragonKills(participant.getDragonKills());
        dto.setFirstBloodAssist(participant.isFirstBloodAssist());
        dto.setFirstBloodKill(participant.isFirstBloodKill());
        dto.setFirstTowerAssist(participant.isFirstTowerAssist());
        dto.setFirstTowerKill(participant.isFirstTowerKill());
        dto.setGameEndedInEarlySurrender(participant.isGameEndedInEarlySurrender());
        dto.setGameEndedInSurrender(participant.isGameEndedInSurrender());
        dto.setGoldEarned(participant.getGoldEarned());
        dto.setGoldSpent(participant.getGoldSpent());
        dto.setIndividualPosition(participant.getIndividualPosition());
        dto.setInhibitorKills(participant.getInhibitorKills());
        dto.setInhibitorTakedowns(participant.getInhibitorTakedowns());
        dto.setInhibitorsLost(participant.getInhibitorsLost());
        dto.setItem0(participant.getItem0());
        dto.setItem1(participant.getItem1());
        dto.setItem2(participant.getItem2());
        dto.setItem3(participant.getItem3());
        dto.setItem4(participant.getItem4());
        dto.setItem5(participant.getItem5());
        dto.setItem6(participant.getItem6());
        dto.setItemsPurchased(participant.getItemsPurchased());
        dto.setKillingSprees(participant.getKillingSprees());
        dto.setKills(participant.getKills());
        dto.setLane(participant.getLane());
        dto.setLargestCriticalStrike(participant.getLargestCriticalStrike());
        dto.setLargestKillingSpree(participant.getLargestKillingSpree());
        dto.setLargestMultiKill(participant.getLargestMultiKill());
        dto.setLongestTimeSpendLiving(participant.getLongestTimeSpendLiving());
        dto.setMagicDamageDealt(participant.getMagicDamageDealt());
        dto.setMagicDamageDealtToChampions(participant.getMagicDamageDealtToChampions());
        dto.setMagicDamageTaken(participant.getMagicDamageTaken());
        dto.setNeutralMonstersKilled(participant.getNeutralMonstersKilled());
        dto.setNexusKills(participant.getNexusKills());
        dto.setNexusTakedowns(participant.getNexusTakedowns());
        dto.setNexusLost(participant.getNexusLost());
        dto.setObjectivesStolen(participant.getObjectivesStolen());
        dto.setObjectivesStolenAssists(participant.getObjectivesStolenAssists());
        dto.setParticipantId(participant.getParticipantId());
        dto.setPentaKills(participant.getPentaKills());
        dto.setPerks(transform(participant.getPerks()));
        dto.setPhysicalDamageDealt(participant.getPhysicalDamageDealt());
        dto.setPhysicalDamageDealtToChampions(participant.getPhysicalDamageDealtToChampions());
        dto.setPhysicalDamageTaken(participant.getPhysicalDamageTaken());
        dto.setProfileIcon(participant.getProfileIcon());
        dto.setPuuid(participant.getPuuid());
        dto.setQuadraKills(participant.getQuadraKills());
        dto.setRiotIdName(participant.getRiotIdName());
        dto.setRiotTagLine(participant.getRiotTagLine());
        dto.setRole(participant.getRole());
        dto.setSightWardsBoughtInGame(participant.getSightWardsBoughtInGame());
        dto.setSpell1Casts(participant.getSpell1Casts());
        dto.setSpell2Casts(participant.getSpell2Casts());
        dto.setSpell3Casts(participant.getSpell3Casts());
        dto.setSpell4Casts(participant.getSpell4Casts());
        dto.setSummoner1Casts(participant.getSummoner1Casts());
        dto.setSummoner1Id(participant.getSummoner1Id());
        dto.setSummoner2Casts(participant.getSummoner2Casts());
        dto.setSummoner2Id(participant.getSummoner2Id());
        dto.setSummonerId(participant.getSummonerId());
        dto.setSummonerLevel(participant.getSummonerLevel());
        dto.setSummonerName(participant.getSummonerName());
        dto.setTeamEarlySurrendered(participant.isTeamEarlySurrendered());
        dto.setTeamId(participant.getTeamId());
        dto.setTeamPosition(participant.getTeamPosition());
        dto.setTimeCCingOthers(participant.getTimeCCingOthers());
        dto.setTimePlayed(participant.getTimePlayed());
        dto.setTotalDamageDealt(participant.getTotalDamageDealt());
        dto.setTotalDamageDealtToOtherChampions(participant.getTotalDamageDealtToOtherChampions());
        dto.setTotalDamageShieldedOnTeamates(participant.getTotalDamageShieldedOnTeamates());
        dto.setTotalDamageTaken(participant.getTotalDamageTaken());
        dto.setTotalHeal(participant.getTotalHeal());
        dto.setTotalHealsOnTeammates(participant.getTotalHealsOnTeammates());
        dto.setTotalMinionsKilled(participant.getTotalMinionsKilled());
        dto.setTotalTimeCCDealt(participant.getTotalTimeCCDealt());
        dto.setTotalTimeSpentDead(participant.getTotalTimeSpentDead());
        dto.setTotalUnitsHealed(participant.getTotalUnitsHealed());
        dto.setTripleKills(participant.getTripleKills());
        dto.setTrueDamageDealt(participant.getTrueDamageDealt());
        dto.setTrueDamageDealtToChampions(participant.getTrueDamageDealtToChampions());
        dto.setTurretKills(participant.getTurretKills());
        dto.setTurretTakedowns(participant.getTurretTakedowns());
        dto.setTurretsLost(participant.getTurretsLost());
        dto.setUnrealKills(participant.getUnrealKills());
        dto.setVisionScore(participant.getVisionScore());
        dto.setVisionWardsBoughtInGame(participant.getVisionWardsBoughtInGame());
        dto.setWardsKilled(participant.getWardsKilled());
        dto.setWardsPlaced(participant.getWardsPlaced());
        dto.setWin(participant.isWin());
        return dto;
    }

    public static Perks transform(PerksDTO dto) {
        if (dto == null)
            return new Perks.Builder().build();
        Perks.Builder builder = new Perks.Builder();
        builder.setPerkStats(transform(dto.getPerkStats()));
        builder.setStyles(dto.getStyles().stream().map(MatchTransformer::transform).toList());
        return builder.build();
    }

    public static PerksDTO transform(Perks perks) {
        PerksDTO dto = new PerksDTO();
        dto.setPerkStats(transform(perks.getPerkStats()));
        dto.setStyles(perks.getStyles().stream().map(MatchTransformer::transform).toList());
        return dto;
    }

    public static PerkStats transform(PerkStatsDTO dto) {
        if (dto == null)
            return new PerkStats.Builder().build();
        PerkStats.Builder builder = new PerkStats.Builder();
        builder.setDefense(dto.getDefense());
        builder.setFlex(dto.getFlex());
        builder.setOffense(dto.getOffense());
        return builder.build();
    }

    public static PerkStatsDTO transform(PerkStats perkStats) {
        PerkStatsDTO dto = new PerkStatsDTO();
        dto.setDefense(perkStats.getDefense());
        dto.setFlex(perkStats.getFlex());
        dto.setOffense(perkStats.getOffense());
        return dto;
    }

    public static PerkStyle transform(PerkStyleDTO dto) {
        if (dto == null)
            return new PerkStyle.Builder().build();
        PerkStyle.Builder builder = new PerkStyle.Builder();
        builder.setDescription(dto.getDescription());
        builder.setPerkStyleSelections(dto.getPerkStyleSelections().stream().map(MatchTransformer::transform).toList());
        return builder.build();
    }

    public static PerkStyleDTO transform(PerkStyle perkStyle) {
        PerkStyleDTO dto = new PerkStyleDTO();
        dto.setDescription(perkStyle.getDescription());
        dto.setPerkStyleSelections(perkStyle.getPerkStyleSelections().stream().map(MatchTransformer::transform).toList());
        return dto;
    }

    public static PerkStyleSelection transform(PerkStyleSelectionDTO dto) {
        if (dto == null)
            return new PerkStyleSelection.Builder().build();
        PerkStyleSelection.Builder builder = new PerkStyleSelection.Builder();
        builder.setPerk(dto.getPerk());
        builder.setVar1(dto.getVar1());
        builder.setVar2(dto.getVar2());
        builder.setVar3(dto.getVar3());
        return builder.build();
    }

    public static PerkStyleSelectionDTO transform(PerkStyleSelection perkStyleSelection) {
        PerkStyleSelectionDTO dto = new PerkStyleSelectionDTO();
        dto.setPerk(perkStyleSelection.getPerk());
        dto.setVar1(perkStyleSelection.getVar1());
        dto.setVar2(perkStyleSelection.getVar2());
        dto.setVar3(perkStyleSelection.getVar3());
        return dto;
    }

    public static Team transform(TeamDTO dto) {
        if (dto == null) return
                new Team.Builder().build();
        Team.Builder builder = new Team.Builder();
        builder.setBans(dto.getBans().stream().map(MatchTransformer::transform).toList());
        builder.setObjectives(transform(dto.getObjectives()));
        builder.setTeamId(dto.getTeamId());
        builder.setWin(dto.isWin());
        return builder.build();
    }

    public static TeamDTO transform(Team team) {
        TeamDTO dto = new TeamDTO();
        dto.setBans(team.getBans().stream().map(MatchTransformer::transform).toList());
        dto.setObjectives(transform(team.getObjectives()));
        dto.setTeamId(team.getTeamId());
        dto.setWin(team.isWin());
        return dto;
    }




}
