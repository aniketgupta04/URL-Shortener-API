package com.aniket.url_shortener_api.service;

import com.aniket.url_shortener_api.repository.UrlRepository;
import com.aniket.url_shortener_api.Url;
import org.springframework.stereotype.Service;

@Service
public class UrlService {

    private final UrlRepository urlrepository;

    public UrlService( UrlRepository urlrepository ){
        this.urlrepository=urlrepository;
    }

    public Url createUrl(String longurl){
        Url url= new Url();
        url.setLongUrl(longurl);
        url.setShortCode("abc123");
        return urlrepository.save(url);

    }
}
