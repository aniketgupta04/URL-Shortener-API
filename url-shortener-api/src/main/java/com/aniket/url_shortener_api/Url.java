package com.aniket.url_shortener_api;
import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
public class Url {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String longurl;
    private String shortcode;
    private LocalDateTime createdAt;

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
