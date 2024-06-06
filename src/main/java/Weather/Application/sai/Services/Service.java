package Weather.Application.sai.Services;
import Weather.Application.sai.DTO.AirPollutionDTO;
import Weather.Application.sai.DTO.CoordinatesDTO;
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
    @Value("${CoordinatesConversion}")
    private String coordinatesPath;
    @Value("${AirPollution}")
    private String pollution;

    public WeatherDTO getWeatherAndForecasts(String cityName){
        RestTemplate restTemplate = new RestTemplate();
        String url = path+"q="+cityName+"&appId="+token;
        return restTemplate.getForObject(url, WeatherDTO.class);
    }
    public AirPollutionDTO getAirPollution(String cityName){
        RestTemplate restTemplate = new RestTemplate();
        WeatherDTO weatherDTO = getWeatherAndForecasts(cityName);
        double longitude = weatherDTO.getCoord().getLon();
        double latitude = weatherDTO.getCoord().getLat();
        String url = pollution+"?lat="+latitude+"&lon="+longitude+"&appId="+token;
        return restTemplate.getForObject(url, AirPollutionDTO.class);
    }


}
