package com.personal.currencygifgiver;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping ("/money")         //@GetMapping — Обрабатывает get-запросы
    public ResponseEntity readCurrencyExchangeData () {
        return ResponseEntity.ok(apiClientCurrency.getCurrency().getRates());
}

    @GetMapping ("/gifs")
    public ResponseEntity getGifs() {
        return ResponseEntity.ok(apiClientGif.getRichGifs());
    }
}
