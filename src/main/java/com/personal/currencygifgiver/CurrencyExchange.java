package com.personal.currencygifgiver;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

//@Data из Lombok на этапе компиляции генерирует геттеры\сеттеры, toString,
// переопределяет equals и hashCode по стандартам

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "rates"
})
@Data
public class CurrencyExchange {
    private Rates rates;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("rates")
    public Rates getRates() {
        return rates;
    }

    @JsonProperty("rates")
    public void setRates(Rates rates) {
        this.rates = rates;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "RUB"
    })
    @Data
    public class Rates {

        @JsonProperty("RUB")
        private Double rub;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        @JsonProperty("RUB")
        public Double getRub() {
            return rub;
        }

        @JsonProperty("RUB")
        public void setRub(Double rub) {
            this.rub = rub;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

    }
}



















//@Data
//public class CurrencyExchange {
//    private String disclaimer;
//    private String license;
//    private long timestamp;
//    private String base;
//    private Rates rates;
//
//
//    @Data
//    class Rates {
//        private double rUB;
//    }
//}

