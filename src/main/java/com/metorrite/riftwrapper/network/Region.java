package com.metorrite.riftwrapper.network;

public enum Region {
    BRAZIL("br1.api.riotgames.com", "BR", "pt_BR"),
    EUROPE_NORTH_EAST("eun1.api.riotgames.com", "EUNE", "en_GB"),
    EUROPE_WEST("euw1.api.riotgames.com", "EUW", "en_GB"),
    JAPAN("jp1.api.riotgames.com", "JP", "ja_JP"),
    KOREA("kr.api.riotgames.com", "KR", "ko_KR"),
    LATIN_AMERICA_NORTH("la1.api.riotgames.com", "LAN", "es_MX"),
    LATIN_AMERICA_SOUTH("la2.api.riotgames.com", "LAS", "es_AR"),
    NORTH_AMERICA("na1.api.riotgames.com", "NA", "en_US"),
    OCEANIA("oc1.api.riotgames.com", "OCE", "en_AU"),
    TURKEY("tr1.api.riotgames.com", "TR", "tr_TR"),
    RUSSIA("ru.api.riotgames.com", "RU", "ru_RU"),
    PHILIPPINES("ph2.api.riotgames.com", "PH", "en_PH"),
    SINGAPORE("sg2.api.riotgames.com", "SG", "en_SG"),
    THAILAND("th2.api.riotgames.com", "TH", "th_TH"),
    TAIWAN("tw2.api.riotgames.com", "TW", "zh_TW"),
    VIETNAM("vn2.api.riotgames.com", "VN", "vn_VN");

    String routingValue, tag, defaultLocale;

    Region(String routingValue, String tag, String defaultLocale) {
        this.routingValue = routingValue;
        this.tag = tag;
        this.defaultLocale = defaultLocale;
    }
    public String getRoutingValue() {
        return routingValue;
    }
    public void setRoutingValue(String routingValue) {
        this.routingValue = routingValue;
    }
    public String getTag() {
        return tag;
    }
    public void setTag(String tag) {
        this.tag = tag;
    }
    public String getDefaultLocale() {
        return defaultLocale;
    }
    public void setDefaultLocale(String defaultLocale) {
        this.defaultLocale = defaultLocale;
    }
}
