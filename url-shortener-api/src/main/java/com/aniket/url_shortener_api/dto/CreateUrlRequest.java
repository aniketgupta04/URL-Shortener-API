package com.aniket.url_shortener_api.dto;

public class CreateUrlRequest {
    public String longurl;
    public String getLongUrl(){
        return longurl;
    }
    public void setLongUrl(String longurl){
        this.longurl =longurl;
    }
}
