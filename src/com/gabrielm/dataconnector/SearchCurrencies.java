package com.gabrielm.dataconnector;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class SearchCurrencies {
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("")).build();


}
