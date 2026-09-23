package com.aniket.url_shortener_api.dto;

import jakarta.validation.constraints.NotBlank;

public class CreateUrlRequest {

    @NotBlank(message = "longurl cannot be empty")
    public String longurl;
    public String getLongUrl(){
        return longurl;
    }
    public void setLongUrl(String longurl){
        this.longurl =longurl;
    }
}
