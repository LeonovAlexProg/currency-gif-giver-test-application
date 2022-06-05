package com.personal.currencygifgiver;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.text.SimpleDateFormat;

//Одну аннотацию @SpringBootApplication можно использовать для включения этих трех функций, а именно:
//@EnableAutoConfiguration: включить механизм автоконфигурации Spring Boot
//@ComponentScan: включить сканирование @Component для пакета, в котором находится приложение
//@Configuration: позволяет регистрировать дополнительные компоненты (beans) в контексте или импортировать дополнительные классы конфигурации
@SpringBootApplication
@EnableFeignClients //включение Feign client в приложении
@RequiredArgsConstructor
public class CurrencyGifGiverApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyGifGiverApplication.class, args);
	}

}
