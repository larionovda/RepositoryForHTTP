package ru.larionov.service;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

import java.util.Map;

public class RequestHTTPImpl implements RequestHTTP{
    public HttpResponse<String> httpRequest(String url, Map<String, Object> parameter, Map<String, String> header, String method, String body) {
        return Unirest.request(method, url)
                .headers(header)
                .queryString(parameter)
                .body(body)
                .asString();
    }
}
