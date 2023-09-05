package com.metorrite.riftwrapper.network;


import com.metorrite.riftwrapper.network.exception.BadRiotApiKey;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

import java.io.IOException;

public class HttpRequest {

    public static String sendDataRequest(String requestUrl, String apiKey) throws IOException, BadRiotApiKey {
        if(apiKey.isEmpty())
            throw new BadRiotApiKey("No API key set.");
        OkHttpClient client = new OkHttpClient();
        Request.Builder requestBuilder = new Request.Builder().url(requestUrl).addHeader("X-Riot-Token", apiKey);


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
    }

}