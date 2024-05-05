package Weather.Application.sai.Services;
import Weather.Application.sai.DTO.WeatherDTO;
import Weather.Application.sai.Model.Weather;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
@org.springframework.stereotype.Service

public class Service {
    @Value("${secretKey}")
    private String token;
    @Value("${weather.api.url}")
    private String path;
    public WeatherDTO getWeatherAndForecasts(String cityName){
        String url = path+"q="+cityName+"&appId="+token;
        RestTemplate restTemplate = new RestTemplate();
        WeatherDTO weatherDTO =  restTemplate.getForObject(url, WeatherDTO.class);
        return weatherDTO;
    }



}
