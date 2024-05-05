package Weather.Application.sai.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WeatherDTO  {
    private int id;
    private String name;
    private int timezone;
    private MainDTO main;
    private CoordinatesDTO coord;
    private SysDTO sys;
}
