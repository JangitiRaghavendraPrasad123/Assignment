package com.project.URL_shortner.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.URL_shortner.Model.Url;

public interface UrlRepository extends JpaRepository<Url,Integer> {
    @Query(value="select originalUrl from Url where shorturl = ?1", nativeQuery = true)
    String findByShortUrl(String id);
}

