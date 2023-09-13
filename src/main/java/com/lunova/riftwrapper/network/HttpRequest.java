package com.lunova.riftwrapper.network;


import com.lunova.riftwrapper.utilities.Utilities;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

import java.io.IOException;

public class HttpRequest {

    public static String sendRequest(String url, String key) {

        try {
            System.out.println(url);
            OkHttpClient client = new OkHttpClient();
            Request.Builder requestBuilder = new Request.Builder().url(url).addHeader("X-Riot-Token", key);


            Request request = requestBuilder.build();
            Response response = client.newCall(request).execute();

            if (!response.isSuccessful()) {
                if (response.body() != null)
                    response.body().close();
                throw new IOException("Received response code " + response.code() + " - " + response.message());
            }

            try (ResponseBody responseBody = response.body()) {
                if (responseBody == null) {
                    throw new IOException("Empty response body");
                }

                return responseBody.string();
            }
        } catch (IOException e) {
            Utilities.getLogger().error(e.getMessage());
            return "";
        }
    }

}