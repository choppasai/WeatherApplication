package Weather.Application.sai.Model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
public class Weather {
    private String city;
    private String country;
    private Long zip_code;
    private String description;
    private long temp;
    private double temp_min;
    private double temp_max;
    private int id;
    private String name;
    private long humidity;
    private int timezone;
    private long sunrise;
    private long sunset;

}
