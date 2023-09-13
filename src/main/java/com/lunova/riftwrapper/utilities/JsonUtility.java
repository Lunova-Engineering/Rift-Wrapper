package com.lunova.riftwrapper.utilities;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class JsonUtility {

    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    // Serialize object into JSON
    public static <T> String serialize(T obj) {
        return GSON.toJson(obj);
    }

    // Unified Deserialize method
    public static <T> T deserialize(String jsonString, Class<T> clazz) {
        if (jsonString == null || jsonString.isEmpty()) {
            return null;
        }

        char firstChar = getFirstNonWhitespaceChar(jsonString);
        if (firstChar == '{') {
            return GSON.fromJson(jsonString, clazz);
        } else if (firstChar == '[') {
            Type type = TypeToken.getParameterized(List.class, clazz).getType();
            return GSON.fromJson(jsonString, type);
        } else {
            throw new JsonSyntaxException("Invalid JSON format");
        }
    }

    // Utility method to get the first non-whitespace character in a string
    private static char getFirstNonWhitespaceChar(String str) {
        for (char ch : str.toCharArray()) {
            if (!Character.isWhitespace(ch)) {
                return ch;
            }
        }
        return '\0';
    }
}
