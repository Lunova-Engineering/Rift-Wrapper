package com.metorrite.riftwrapper.utilities;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonSerializer {

    public static String serialize(Object obj, Class clazz) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(obj, clazz);
    }
}
