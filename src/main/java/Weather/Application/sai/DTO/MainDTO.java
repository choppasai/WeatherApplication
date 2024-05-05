package Weather.Application.sai.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MainDTO {
    private long temp;
    private long temp_min;
    private long temp_max;
    private int pressure;
    private int humidity;
}
