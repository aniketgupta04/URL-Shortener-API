package com.aniket.url_shortener_api.controller;

import com.aniket.url_shortener_api.Url;
import com.aniket.url_shortener_api.dto.CreateUrlRequest;
import com.aniket.url_shortener_api.dto.UrlResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.aniket.url_shortener_api.service.UrlService;
import java.net.URI;



@RestController
@RequestMapping("api/urls")
public class UrlController {

    private final UrlService urlservice;

    public UrlController(UrlService urlservice){
        this.urlservice=urlservice;
    }

    @PostMapping
    public Url createurl(@RequestBody CreateUrlRequest request){
        return urlservice.createUrl(request.getLongUrl());
    }

    @GetMapping("/{shortcode}")
    public ResponseEntity<Void> redirect(@PathVariable String shortcode){

        Url url = urlservice.getUrlByShortcode(shortcode);

        return ResponseEntity
                .status(HttpStatus.FOUND)
                .location(URI.create(url.getLongUrl()))
                .build();
    }

    @GetMapping("/{shortcode}/stats")
    public ResponseEntity<UrlResponse> getUrlStats(@PathVariable String shortcode) {
        Url url = urlservice.getUrlStats(shortcode);
        UrlResponse response = urlservice.convertToResponse(url);

        return ResponseEntity.ok(response);
    }
}
