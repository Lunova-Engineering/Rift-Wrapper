package com.lunova.riftwrapper.model.user.summoner;

public class Summoner {
    private final String id;
    private final String accountId;
    private final String puuid;
    private final String name;
    private final long profileIconId;
    private final long revisionDate;
    private final long summonerLevel;

    // Private constructor: the only way to create a Summoner is via the Builder.
    private Summoner(Builder builder) {
        this.id = builder.id;
        this.accountId = builder.accountId;
        this.puuid = builder.puuid;
        this.name = builder.name;
        this.profileIconId = builder.profileIconId;
        this.revisionDate = builder.revisionDate;
        this.summonerLevel = builder.summonerLevel;
    }

    public String getId() {
        return id;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getPuuid() {
        return puuid;
    }

    public String getName() {
        return name;
    }

    public long getProfileIconId() {
        return profileIconId;
    }

    public long getRevisionDate() {
        return revisionDate;
    }

    public long getSummonerLevel() {
        return summonerLevel;
    }

    public static class Builder {
        private String id;
        private String accountId;
        private String puuid;
        private String name;
        private long profileIconId;
        private long revisionDate;
        private long summonerLevel;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        public Builder setPuuid(String puuid) {
            this.puuid = puuid;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setProfileIconId(long profileIconId) {
            this.profileIconId = profileIconId;
            return this;
        }

        public Builder setRevisionDate(long revisionDate) {
            this.revisionDate = revisionDate;
            return this;
        }

        public Builder setSummonerLevel(long summonerLevel) {
            this.summonerLevel = summonerLevel;
            return this;
        }

        // Other setters returning 'this' for method chaining...

        public Summoner build() {
            return new Summoner(this);
        }
    }
}
