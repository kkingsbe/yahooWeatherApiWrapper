package com.kkingsbe.yahooweatherapi;

import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class yahooWeather {
    public static String condition(int day,String location){ //day = days from today (0-9)
        JsonNode jn = null;
        try {
            jn = Unirest
                    .get(" https://query.yahooapis.com/v1/public/yql")
                    .queryString("format", "json")
                    .queryString("q", "select item.forecast from weather.forecast where woeid in (select woeid from geo.places(1) where text=\""+location+"\")")
                    .asJson()
                    .getBody();
        } catch (UnirestException e1) {
            noInternetError();
        }

        org.json.JSONObject Condition = jn.getObject()
                .getJSONObject("query")
                .getJSONObject("results")
                .getJSONArray("channel")
                .getJSONObject(day)
                .getJSONObject("item")
                .getJSONObject("forecast");
        return Condition.getString("text");
    }

    private static void noInternetError(){
        System.out.println("ERROR: No Internet Connection");
    }
}
