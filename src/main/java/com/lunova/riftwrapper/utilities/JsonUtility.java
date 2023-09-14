package com.lunova.riftwrapper.utilities;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Type;

public class JsonUtility {

    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    // Serialize object into JSON
    public static <T> String serialize(T obj) {
        return GSON.toJson(obj);
    }

    // Unified Deserialize method
    public static <T> T deserialize(String jsonString, Type type) {
        if (jsonString == null || jsonString.isEmpty()) {
            return null;
        }

        return GSON.fromJson(jsonString, type);
    }
}
