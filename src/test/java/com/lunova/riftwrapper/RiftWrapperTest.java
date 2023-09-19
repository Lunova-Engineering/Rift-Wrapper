package com.lunova.riftwrapper;

import com.lunova.riftwrapper.model.data.Region;

public class RiftWrapperTest {

    public static int place = 1;
    public static void main(String[] args) {
        RiftWrapper.setRiotApiKey("RGAPI-949344b7-d56a-40a8-8922-f7ac31655321");
        RiftWrapper.setRegion(Region.NORTH_AMERICA);

    }
}
