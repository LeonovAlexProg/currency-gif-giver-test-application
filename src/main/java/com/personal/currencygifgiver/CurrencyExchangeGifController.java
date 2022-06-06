package com.personal.currencygifgiver;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.net.URI;
import java.net.URISyntaxException;

//комбинация аннотаций @Controller и @ResponseBody
@RestController
// @RequestMapping используется для мапинга (связывания) с URL для всего класса или для конкретного метода обработчика.
@RequestMapping
// RequiredArgsConstructor генерирует конструктор, принимающий значения для каждого final  поля
// или поля с аннотацией @NonNull  Аргументы конструктора будут сгенерированы в том порядке, в котором поля перечислены в классе.
@RequiredArgsConstructor
@Data
public class CurrencyExchangeGifController {

    private final ApiClientCurrency apiClientCurrency;
    private final ApiClientGif apiClientGif;

    public double getTodayCurrencyRate() {
        double rate = apiClientCurrency.getCurrency().getRates().getRub();
        return rate;
    }

    public double getYesterdayCurrencyRate() {
        double rate = apiClientCurrency.getYesterdayCurrency().getRates().getRub();
        return rate;
    }

    public String getRichGifUrl() {
        String url = apiClientGif.getRichGifs().getData().getImages().getOriginal().getUrl();
        return url;
    }

    public String getBrokeGifUrl() {
        String url = apiClientGif.getBrokeGifs().getData().getImages().getOriginal().getUrl();
        return url;
    }

    @GetMapping("/")
    public ResponseEntity redirectToGif() throws URISyntaxException {
        if (getTodayCurrencyRate() < getYesterdayCurrencyRate()) {
            URI externalUri = new URI(getRichGifUrl());
            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.setLocation(externalUri);
            return new ResponseEntity(httpHeaders, HttpStatus.SEE_OTHER);
        } else {
            URI externalUri = new URI(getBrokeGifUrl());
            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.setLocation(externalUri);
            return new ResponseEntity(httpHeaders, HttpStatus.SEE_OTHER);
        }
    }
}
