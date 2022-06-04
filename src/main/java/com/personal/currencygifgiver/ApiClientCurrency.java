package com.personal.currencygifgiver;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//Интерфейс, выступающий в роли ПОЛЬЗОВАТЕЛЯ API
//@FeignClient - определение интерфейса пользователя API
@FeignClient (value = "currency-exchange-tools-api", url = "https://openexchangerates.org/api/")
public interface ApiClientCurrency {

    //@RequestMapping используется для мапинга (связывания) с URL для всего класса или для конкретного метода обработчика.
    @RequestMapping(method = RequestMethod.GET,
            value = "latest.json?app_id=f3f48132c09541b9b66b382c704b1412&symbols=RUB")
    public CurrencyExchange getCurrency();

    //@RequestMapping используется для мапинга (связывания) с URL для всего класса или для конкретного метода обработчика.
    @RequestMapping(method = RequestMethod.GET,
            value = "historical/2013-02-16.json?app_id=f3f48132c09541b9b66b382c704b1412&symbols=RUB")
    public CurrencyExchange getYesterdayCurrency();


}
