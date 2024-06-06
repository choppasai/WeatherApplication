package Weather.Application.sai.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CoordinatesDTO {

    private double lat;
    private double lon;
}
