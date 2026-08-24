package com.aniket.url_shortener_api.repository;

import com.aniket.url_shortener_api.Url;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UrlRepository extends JpaRepository<Url,Long> {

    boolean existsByShortcode(String shortcode);
    Optional<Url> findByShortcode(String shortcode);
}
