package com.metorrite.riftwrapper.network;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;

import java.io.IOException;

public class HttpRequest {

    public static String sendDataRequest(String requestUrl, HttpMethodType methodType, String apiKey) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request.Builder requestBuilder = new Request.Builder().url(requestUrl).addHeader("X-Riot-Token", apiKey);

        if (methodType.equals(HttpMethodType.POST)) {
            // Add POST request handling here
        } else if (methodType.equals(HttpMethodType.PUT)) {
            // Add PUT request handling here
        } // Add other HTTP methods as needed

        Request request = requestBuilder.build();
        Response response = client.newCall(request).execute();

        if (!response.isSuccessful()) {
            if (response.body() != null) {
                response.body().close();
            }
            throw new IOException("Unexpected code " + response);
        }

        try (ResponseBody responseBody = response.body()) {
            if (responseBody == null) {
                throw new IOException("Empty response body");
            }
            return responseBody.string();
        }
    }

}
