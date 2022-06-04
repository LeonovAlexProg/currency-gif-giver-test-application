package com.personal.currencygifgiver;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient (value = "gif-tools-api", url = "https://api.giphy.com/v1/gifs/")
public interface ApiClientGif {

    @RequestMapping(method = RequestMethod.GET,
            value = "random?api_key=Q03dXNphniwUjPLXRZ9ONvSTPyPPX4sL&tag=rich&rating=g")
    public Gifs getRichGifs();

    @RequestMapping(method = RequestMethod.GET,
            value = "random?api_key=Q03dXNphniwUjPLXRZ9ONvSTPyPPX4sL&tag=broke&rating=g")
    public Gifs getBrokeGifs();
}
