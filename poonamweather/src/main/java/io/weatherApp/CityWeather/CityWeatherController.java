package io.weatherApp.CityWeather;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityWeatherController {
	
    @Autowired
    private CityWeatherService cityweatherservice;

    @RequestMapping("/weatherinfo")
    public List<CityWeatherInfo> getAlldata()
    {
        return cityweatherservice.getAlldata();
    }

    @RequestMapping("/weatherinfo/{city}")
    public List<CityWeatherInfo> getCity(@PathVariable String city)
    {
        return cityweatherservice.getCityData(city);
    }

    @RequestMapping(method=RequestMethod.POST,value = "/weatherinfo")
    public void addTopic(@RequestBody CityWeatherInfo cityweather)
    {

    	cityweatherservice.addData(cityweather);
    }

}
