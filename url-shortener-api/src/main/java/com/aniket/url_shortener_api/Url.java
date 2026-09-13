package com.aniket.url_shortener_api;
import java.time.LocalDateTime;

import jakarta.persistence.*;


@Entity
public class Url {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String longurl;
    @Column(unique = true)
    private String shortcode;
    private LocalDateTime createdAt;

    private int clickCount;

    public int getClickCount(){
        return clickCount;
    }

    public void setClickCount(int clickCount){
        this.clickCount = clickCount;
    }

    public void setLongUrl(String longurl){
        this.longurl=longurl;
    }
    public void setShortCode(String shortcode){
        this.shortcode=shortcode;
    }
    public Long getId(){
        return id;
    }
    public String getLongUrl(){
        return longurl;
    }
    public String getShortCode(){
        return shortcode;
    }
    public LocalDateTime getCreatedAt(){
        return createdAt;
    }

}
