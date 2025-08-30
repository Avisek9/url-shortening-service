package com.example.av.url_shortening.repo;

import com.example.av.url_shortening.model.Url;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrlRepo extends JpaRepository<Url, Long> {
    public Url findByShortLink(String shortLink);
}
