package com.personal.currencygifgiver;

import lombok.Data;

//@Data из Lombok на этапе компиляции генерирует геттеры\сеттеры, toString,
// переопределяет equals и hashCode по стандартам
@Data
public class CurrencyExchange {
    private String disclaimer;
    private String license;
    private long timestamp;
    private String base;
    private Object rates;
}

