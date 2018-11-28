package com.ub.paritycollector.service.rest;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

/**
 * Singleton
 */
public class RestService {

    private final static RestService INSTANCE = new RestService();

    private final RestTemplate restTemplate;

    private RestService() {
        RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();

        restTemplateBuilder.additionalMessageConverters(new MappingJackson2HttpMessageConverter());

        this.restTemplate = new RestTemplateBuilder().build();
    }

    public static RestService getInstance() {
        return INSTANCE;
    }

    public RestTemplate getRestTemplate() {
        return restTemplate;
    }
}
