package com.personal.currencygifgiver;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.apache.commons.io.IOUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletContext;
import java.io.IOException;
import java.io.InputStream;
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



    @GetMapping ("/")         //@GetMapping — Обрабатывает get-запросы
    public ResponseEntity readCurrencyExchangeData () throws URISyntaxException {
        if (apiClientCurrency.getCurrency().getRates().getRub() <
                apiClientCurrency.getYesterdayCurrency().getRates().getRub()) {
            URI externalUri = new URI(apiClientGif.getRichGifs()
                    .getData().getImages().getOriginal().getUrl());
            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.setLocation(externalUri);
            return new ResponseEntity(httpHeaders, HttpStatus.SEE_OTHER);
        } else {
            URI externalUri = new URI(apiClientGif.getBrokeGifs()
                    .getData().getImages().getOriginal().getUrl());
            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.setLocation(externalUri);
            return new ResponseEntity(httpHeaders, HttpStatus.SEE_OTHER);
        }
}
}
