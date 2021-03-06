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

    public static int high(int day, String location){
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
        return Integer.parseInt(Condition.getString("high"));
    }
    public static int low(int day, String location){
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
        return Integer.parseInt(Condition.getString("low"));
    }
    public static int windspeed(String location){ //Current windspeed
        JsonNode jn = null;
        try {
            jn = Unirest
                    .get(" https://query.yahooapis.com/v1/public/yql")
                    .queryString("format", "json")
                    .queryString("q", "select wind from weather.forecast where woeid in (select woeid from geo.places(1) where text=\""+location+"\")")
                    .asJson()
                    .getBody();
        } catch (UnirestException e1) {
            noInternetError();
        }

        org.json.JSONObject Condition = jn.getObject()
                .getJSONObject("query")
                .getJSONObject("results")
                .getJSONObject("channel")
                .getJSONObject("wind");
        return Integer.parseInt(Condition.getString("speed"));
    }
    public static int windDirection(String location){ //Current wind direction
        JsonNode jn = null;
        try {
            jn = Unirest
                    .get(" https://query.yahooapis.com/v1/public/yql")
                    .queryString("format", "json")
                    .queryString("q", "select wind from weather.forecast where woeid in (select woeid from geo.places(1) where text=\""+location+"\")")
                    .asJson()
                    .getBody();
        } catch (UnirestException e1) {
            noInternetError();
        }

        org.json.JSONObject Condition = jn.getObject()
                .getJSONObject("query")
                .getJSONObject("results")
                .getJSONObject("channel")
                .getJSONObject("wind");
        return Integer.parseInt(Condition.getString("direction"));
    }
    public static int windchill(String location){ //Current windchill
        JsonNode jn = null;
        try {
            jn = Unirest
                    .get(" https://query.yahooapis.com/v1/public/yql")
                    .queryString("format", "json")
                    .queryString("q", "select wind from weather.forecast where woeid in (select woeid from geo.places(1) where text=\""+location+"\")")
                    .asJson()
                    .getBody();
        } catch (UnirestException e1) {
            noInternetError();
        }

        org.json.JSONObject Condition = jn.getObject()
                .getJSONObject("query")
                .getJSONObject("results")
                .getJSONObject("channel")
                .getJSONObject("wind");
        return Integer.parseInt(Condition.getString("chill"));
    }
    public static int humidity(String location){ //Current humidity
        JsonNode jn = null;
        try {
            jn = Unirest
                    .get(" https://query.yahooapis.com/v1/public/yql")
                    .queryString("format", "json")
                    .queryString("q", "select atmosphere from weather.forecast where woeid in (select woeid from geo.places(1) where text=\""+location+"\")")
                    .asJson()
                    .getBody();
        } catch (UnirestException e1) {
            noInternetError();
        }

        org.json.JSONObject Condition = jn.getObject()
                .getJSONObject("query")
                .getJSONObject("results")
                .getJSONObject("channel")
                .getJSONObject("atmosphere");
        return Integer.parseInt(Condition.getString("humidity"));
    }
    public static int pressure(String location){ //Current pressure
        JsonNode jn = null;
        try {
            jn = Unirest
                    .get(" https://query.yahooapis.com/v1/public/yql")
                    .queryString("format", "json")
                    .queryString("q", "select atmosphere from weather.forecast where woeid in (select woeid from geo.places(1) where text=\""+location+"\")")
                    .asJson()
                    .getBody();
        } catch (UnirestException e1) {
            noInternetError();
        }

        org.json.JSONObject Condition = jn.getObject()
                .getJSONObject("query")
                .getJSONObject("results")
                .getJSONObject("channel")
                .getJSONObject("atmosphere");
        return Integer.parseInt(Condition.getString("pressure"));
    }
    public static int visibility(String location){ //Current visibility in miles
        JsonNode jn = null;
        try {
            jn = Unirest
                    .get(" https://query.yahooapis.com/v1/public/yql")
                    .queryString("format", "json")
                    .queryString("q", "select atmosphere from weather.forecast where woeid in (select woeid from geo.places(1) where text=\""+location+"\")")
                    .asJson()
                    .getBody();
        } catch (UnirestException e1) {
            noInternetError();
        }

        org.json.JSONObject Condition = jn.getObject()
                .getJSONObject("query")
                .getJSONObject("results")
                .getJSONObject("channel")
                .getJSONObject("atmosphere");
        return Integer.parseInt(Condition.getString("visibility"));
    }
    public static String sunrise(String location){ //Time of todays sunrise
        JsonNode jn = null;
        try {
            jn = Unirest
                    .get(" https://query.yahooapis.com/v1/public/yql")
                    .queryString("format", "json")
                    .queryString("q", "select astronomy from weather.forecast where woeid in (select woeid from geo.places(1) where text=\""+location+"\")")
                    .asJson()
                    .getBody();
        } catch (UnirestException e1) {
            noInternetError();
        }

        org.json.JSONObject Condition = jn.getObject()
                .getJSONObject("query")
                .getJSONObject("results")
                .getJSONObject("channel")
                .getJSONObject("astronomy");
        return Condition.getString("sunrise");
    }
    public static String sunset(String location){ //Time of todays sunset
        JsonNode jn = null;
        try {
            jn = Unirest
                    .get(" https://query.yahooapis.com/v1/public/yql")
                    .queryString("format", "json")
                    .queryString("q", "select astronomy from weather.forecast where woeid in (select woeid from geo.places(1) where text=\""+location+"\")")
                    .asJson()
                    .getBody();
        } catch (UnirestException e1) {
            noInternetError();
        }

        org.json.JSONObject Condition = jn.getObject()
                .getJSONObject("query")
                .getJSONObject("results")
                .getJSONObject("channel")
                .getJSONObject("astronomy");
        return Condition.getString("sunset");
    }
    public static int currentTemp(String location){ //Current visibility in miles
        JsonNode jn = null;
        try {
            jn = Unirest
                    .get(" https://query.yahooapis.com/v1/public/yql")
                    .queryString("format", "json")
                    .queryString("q", "select item.condition from weather.forecast where woeid in (select woeid from geo.places(1) where text=\""+location+"\")")
                    .asJson()
                    .getBody();
        } catch (UnirestException e1) {
            noInternetError();
        }

        org.json.JSONObject Condition = jn.getObject()
                .getJSONObject("query")
                .getJSONObject("results")
                .getJSONObject("channel")
                .getJSONObject("item")
                .getJSONObject("condition");
        return Integer.parseInt(Condition.getString("temp"));
    }
    private static void noInternetError(){
        throw new java.lang.Error("No Internet Connection");
    }
}
