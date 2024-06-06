package Weather.Application.sai.Services;
import Weather.Application.sai.DTO.AirPollutionDTO;
import Weather.Application.sai.DTO.ForecastDTO;
import Weather.Application.sai.DTO.WeatherDTO;
import org.springframework.beans.factory.annotation.Value;
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

    public WeatherDTO getWeather(String cityName){
        String endPoint = "weather?";
        RestTemplate restTemplate = new RestTemplate();
        String url = path+endPoint+"q="+cityName+"&appId="+token;
        return restTemplate.getForObject(url, WeatherDTO.class);
    }
    public AirPollutionDTO getAirPollution(String cityName){
        RestTemplate restTemplate = new RestTemplate();
        WeatherDTO weatherDTO = getWeather(cityName);
        double longitude = weatherDTO.getCoord().getLon();
        double latitude = weatherDTO.getCoord().getLat();
        String endPoint = "?";
        String url = pollution+endPoint+"lat="+latitude+"&lon="+longitude+"&appId="+token;
        return restTemplate.getForObject(url, AirPollutionDTO.class);
    }
    public ForecastDTO getWeatherForecast(String city){
        RestTemplate restTemplate = new RestTemplate();
        WeatherDTO weatherDTO = getWeather(city);
        double longitude = weatherDTO.getCoord().getLon();
        double latitude = weatherDTO.getCoord().getLat();
        String endPoint = "forecast?";
        String url = path+endPoint+"lat="+latitude+"&lon="+longitude+"&appId="+token;
        return restTemplate.getForObject(url, ForecastDTO.class);
    }


}
