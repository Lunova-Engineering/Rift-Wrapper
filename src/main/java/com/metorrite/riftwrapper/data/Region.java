package com.metorrite.riftwrapper.data;

public enum Region {
    BRAZIL("BR", "pt_BR"),
    EUROPE_NORTH_EAST("EUNE", "en_GB"),
    EUROPE_WEST("EUW", "en_GB"),
    JAPAN("JP", "ja_JP"),
    KOREA("KR", "ko_KR"),
    LATIN_AMERICA_NORTH("LAN", "es_MX"),
    LATIN_AMERICA_SOUTH("LAS", "es_AR"),
    NORTH_AMERICA("NA", "en_US"),
    OCEANIA("OCE", "en_AU"),
    RUSSIA("RU", "ru_RU"),
    TURKEY("TR", "tr_TR"),
    PHILIPPINES("PH", "en_PH"),
    SINGAPORE("SG", "en_SG"),
    THAILAND("TH", "th_TH"),
    TAIWAN("TW", "zh_TW"),
    VIETNAM("VN", "vn_VN");

    Region(String tag, String defaultLocale) {
    }
}