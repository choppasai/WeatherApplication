package Weather.Application.sai.Controllers;

import Weather.Application.sai.DTO.AirPollutionDTO;
import Weather.Application.sai.DTO.ForecastDTO;
import Weather.Application.sai.DTO.WeatherDTO;
import Weather.Application.sai.Services.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
public class Weather_controllers {
    private final Service service;
    public Weather_controllers(Service service){
        this.service = service;
    }

    @GetMapping("/city/{cityName}")
    public @ResponseBody WeatherDTO currentWeather(@PathVariable String cityName){

        return service.getWeather(cityName);
    }
    @GetMapping("/forecast/city/{cityName}")
    public @ResponseBody ForecastDTO getWeatherForecasts(@PathVariable String cityName){

         return service.getWeatherForecast(cityName);
    }
    @GetMapping("/air_pollution/{cityName}")
    public @ResponseBody AirPollutionDTO getAirPollution(@PathVariable String cityName) {
         return service.getAirPollution(cityName);
    }


}
