package ru.larionov.service;

import kong.unirest.HttpResponse;

import java.util.Map;

public interface RequestHTTP {
    HttpResponse<String> httpRequest(String url, Map<String, Object> parameter, Map<String, String> header, String method, String body);
}
