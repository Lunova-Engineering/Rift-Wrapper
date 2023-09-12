package com.lunova.riftwrapper.utilities;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;

public class JsonUtility {

    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    // Serialize object into JSON
    public static <T> String serialize(T obj) {
        return GSON.toJson(obj);
    }

    // Deserialize JSON string into object
    public static <T> T deserialize(String jsonString, Class<T> clazz) {
        return GSON.fromJson(jsonString, clazz);
    }

    // Deserialize JSON string into a list of objects
    public static <T> List<T> deserializeList(String jsonString) {
        Type type = new TypeToken<List<T>>() {}.getType();
        return GSON.fromJson(jsonString, type);
    }
}
