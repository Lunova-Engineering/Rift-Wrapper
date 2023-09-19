package com.lunova.riftwrapper.utilities;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;

public class Utilities {

    private static final Logger LOGGER = LoggerFactory.getLogger(Utilities.class);

    public static Logger getLogger() {
        return LOGGER;
    }

    public static void printValues(Object obj) {
        if (obj == null)
            return;

        Class<?> clazz = obj.getClass();
        StringBuilder sb = new StringBuilder();

        for (Field field : clazz.getDeclaredFields()) {
            // Make sure to access private fields as well
            field.setAccessible(true);

            try {
                sb.append(field.getName())
                        .append(": ")
                        .append(field.get(obj))
                        .append("\n");
            } catch (IllegalAccessException e) {
                // Handle exception or add some default message for this field
                sb.append(field.getName()).append(": access error\n");
            }
        }
        System.out.println(sb.toString());
    }
}