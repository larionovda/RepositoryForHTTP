package ru.larionov.service;

import kong.unirest.HttpResponse;

import java.util.HashMap;
import java.util.Map;

public class DemoService {
    public void run(){
        String URL = "http://httpbin.org";
        String method = "GET";
        String body = "This is the entire body";
        Map<String, Object> parameter = new HashMap<String, Object>();
        parameter.put("parameter", "value");
        Map<String, String> header = new HashMap<String, String>();
        header.put("accept", "application/json");
        RequestHTTP requestHTTP = new RequestHTTPImpl();
        HttpResponse<String> httpResponse = requestHTTP.httpRequest(URL, parameter, header, method, body);
        System.out.println(httpResponse.getStatus());
    }
}
