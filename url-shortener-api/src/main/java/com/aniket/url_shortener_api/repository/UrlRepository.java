package com.aniket.url_shortener_api.repository;

import com.aniket.url_shortener_api.Url;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UrlRepository extends JpaRepository<Url,Long> {
}
