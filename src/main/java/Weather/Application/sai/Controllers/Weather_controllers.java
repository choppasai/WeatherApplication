package Weather.Application.sai.Controllers;

import Weather.Application.sai.DTO.WeatherDTO;
import Weather.Application.sai.Services.Service;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
public class Weather_controllers {
    private final Service service;
    public Weather_controllers(Service service){
        this.service = service;
    }
    @GetMapping("")
    public @ResponseBody String met(){
        return  "hello world";
    }
    @GetMapping("/city/{cityName}")
    public @ResponseBody WeatherDTO currentWeatherAndForecasts(@PathVariable String cityName){
        return service.getWeatherAndForecasts(cityName);
    }
    @GetMapping("/year/{city}/{year}")
    public void GetStatisticalYearData(@PathVariable String city,@PathVariable int year){
        service.getYearData(city,year);
    }
}
