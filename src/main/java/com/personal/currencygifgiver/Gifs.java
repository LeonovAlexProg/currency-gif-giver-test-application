package com.personal.currencygifgiver;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "data"
})
@Generated("jsonschema2pojo")
public class Gifs {

    @JsonProperty("data")
    private Data data;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("data")
    public Data getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(Data data) {
        this.data = data;
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
            "images"
    })
    @Generated("jsonschema2pojo")
    public class Data {

        @JsonProperty("images")
        private Images images;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        @JsonProperty("images")
        public Images getImages() {
            return images;
        }

        @JsonProperty("images")
        public void setImages(Images images) {
            this.images = images;
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
                "original"
        })
        @Generated("jsonschema2pojo")
        public class Images {

            @JsonProperty("original")
            private Original original;
            @JsonIgnore
            private Map<String, Object> additionalProperties = new HashMap<String, Object>();

            @JsonProperty("original")
            public Original getOriginal() {
                return original;
            }

            @JsonProperty("original")
            public void setOriginal(Original original) {
                this.original = original;
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
                    "url"
            })
            @Generated("jsonschema2pojo")
            public class Original {

                @JsonProperty("url")
                private String url;
                @JsonIgnore
                private Map<String, Object> additionalProperties = new HashMap<String, Object>();

                @JsonProperty("url")
                public String getUrl() {
                    return url;
                }

                @JsonProperty("url")
                public void setUrl(String url) {
                    this.url = url;
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
    }
}