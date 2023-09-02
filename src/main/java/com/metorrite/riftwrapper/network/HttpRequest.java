package com.metorrite.riftwrapper.network;



import com.metorrite.riftwrapper.data.exceptions.SummonerNotFoundException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

import java.io.IOException;

public class HttpRequest {

    public static String sendDataRequest(String requestUrl, String apiKey) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request.Builder requestBuilder = new Request.Builder().url(requestUrl).addHeader("X-Riot-Token", apiKey);


        Request request = requestBuilder.build();
        Response response = client.newCall(request).execute();

        if (!response.isSuccessful()) {
            if (response.body() != null) {
                response.body().close();
            }
            throw new IOException("Unexpected response -[CODE: " + response.code() + " / MESSAGE: " + response.message() +"]");
        }

        try (ResponseBody responseBody = response.body()) {
            if (responseBody == null) {
                throw new IOException("Empty response body");
            }
            return responseBody.string();
        }
    }

}
