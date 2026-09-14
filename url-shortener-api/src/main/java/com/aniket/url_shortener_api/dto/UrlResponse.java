package com.aniket.url_shortener_api.dto;

import java.time.LocalDateTime;

public class UrlResponse {

    private String shortCode;
    private String longUrl;
    private int clickCount;
    private LocalDateTime createdAt;


    public UrlResponse(String shortCode, String longUrl, int clickCount,LocalDateTime createdAt){
        this.shortCode = shortCode;
        this.longUrl = longUrl;
        this.clickCount = clickCount;
        this.createdAt = createdAt;
    }

    public String getShortCode(){
        return shortCode;
    }

    public String getLongUrl(){
        return longUrl;
    }

    public int getClickCount(){
        return clickCount;
    }
    public LocalDateTime getCreatedAt(){
        return createdAt;
    }
}
