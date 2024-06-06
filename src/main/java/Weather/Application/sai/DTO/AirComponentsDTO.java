package Weather.Application.sai.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AirComponentsDTO {
    @JsonProperty("co")
    private double carbonMonoxide;

    @JsonProperty("no")
    private double nitrogenMonoxide;

    @JsonProperty("no2")
    private double nitrogenDioxide;

    @JsonProperty("o3")
    private double ozone;

    @JsonProperty("so2")
    private double sulfurDioxide;

    @JsonProperty("pm2_5")
    private double pm25;

    @JsonProperty("pm10")
    private double pm10;

    @JsonProperty("nh3")
    private double ammonia;
}
