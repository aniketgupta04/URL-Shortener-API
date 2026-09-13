package com.aniket.url_shortener_api.service;

import com.aniket.url_shortener_api.exception.UrlNotFoundException;
import com.aniket.url_shortener_api.repository.UrlRepository;
import com.aniket.url_shortener_api.Url;
import org.springframework.stereotype.Service;

@Service
public class UrlService {

    private final UrlRepository urlrepository;
    private static final String Characters= "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public UrlService( UrlRepository urlrepository ){
        this.urlrepository=urlrepository;
    }

    public Url createUrl(String longurl){
        Url url= new Url();
        url.setLongUrl(longurl);
        String shortcode;
        do {
            shortcode = generateShortCode();
        }while(urlrepository.existsByShortcode(shortcode));

        url.setShortCode(shortcode);
        url.setClickCount(0);
        return urlrepository.save(url);
    }

    public Url getUrlByShortcode(String shortcode){
        Url url = urlrepository.findByShortcode(shortcode)
                .orElseThrow(() -> new UrlNotFoundException(" Short code not found "));

        url.setClickCount(url.getClickCount() + 1);
        return urlrepository.save(url);
    }


    private String generateShortCode(){
        StringBuilder code = new StringBuilder();

        for(int i=0;i<6;i++) {
            int index = (int) (Math.random() * Characters.length());
            code.append(Characters.charAt(index));
        }
        return code.toString();
        }
    }

