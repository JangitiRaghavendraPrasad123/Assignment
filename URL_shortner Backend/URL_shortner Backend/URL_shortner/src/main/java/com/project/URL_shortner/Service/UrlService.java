package com.project.URL_shortner.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.URL_shortner.Model.Url;
import com.project.URL_shortner.Repository.UrlRepository;

import static com.project.URL_shortner.Logic.GenerateShortUrl.getShortUrl;
import static com.project.URL_shortner.Logic.GenerateShortUrl.isUrlValid;

@Service
public class UrlService {
    @Autowired
    private UrlRepository urlRepository;
    public String getOriginalUrl(String id) {
        return urlRepository.findByShortUrl(id);
    }

    public Url generateShortUrl(String url) {
    	if(isUrlValid(url)) {
    		System.out.println("URL is not valid");
    		return null;
    	}
    	Url urlObj = new Url();
    	urlObj.setOriginalUrl(url);
    	urlObj.setShortUrl(getShortUrl(url));
    	return urlRepository.save(urlObj);
    }
}

