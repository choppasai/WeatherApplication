package Weather.Application.sai.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ForecastDTO {
    @JsonProperty("list")
    private List<Forecast> forecasts;

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Forecast {
        @JsonProperty("main")
        private Main main;

        @JsonProperty("components")
        private List<Weather> weather;

        @JsonProperty("dt")
        private long dateTime;
        @JsonProperty("wind")
        private Wind wind;
        @JsonProperty("clouds")
        private Clouds cloud;
        @JsonProperty("rain")
        private Rain rain;
        @JsonProperty("dt_txt")
        private String dateAndTime;
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Main {
        private double temp;
        private double feels_like;
        private int pressure;
        private int humidity;
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Weather {
        private String description;
        private String icon;
    }
    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Wind{
        private double speed;
        @JsonProperty("deg")
        private int degree;
        private float gust;
    }
    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Clouds{
        private int all;
    }
    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Rain{
        @JsonProperty("3h")
        private float rainVolumeForLastThreeHours;
    }
}
