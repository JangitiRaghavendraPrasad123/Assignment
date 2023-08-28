package com.project.URL_shortner.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.project.URL_shortner.Model.Url;
import com.project.URL_shortner.Service.UrlService;

@RestController
@RequestMapping("url/shortner")
@CrossOrigin(origins = "https://localhost:4200/")
public class UrlController {

    @Autowired
    private UrlService urlService;
    @GetMapping("/id")
    public String getOriginalUrl(@PathVariable String id){
        return urlService.getOriginalUrl(id);
    }

    @PostMapping
    public Url generateShortUrl(@RequestBody String url){
        return urlService.generateShortUrl(url);
    }
}
