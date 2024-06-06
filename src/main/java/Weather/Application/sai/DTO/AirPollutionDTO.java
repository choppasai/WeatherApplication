package Weather.Application.sai.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AirPollutionDTO {
    @JsonProperty("list")
    private List<AirPollutionData> list;
}

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
class AirPollutionData {
    @JsonProperty("components")
    private AirComponentsDTO components;
}

