package io.weatherApp.CityWeather;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class CityWeatherService {

	List<CityWeatherInfo> weatherinfo = new ArrayList<CityWeatherInfo>();
	
	public List<CityWeatherInfo> getAlldata()
    {
        return weatherinfo;
    }
	
	
	 public CityWeatherInfo getCity(String city)
	    {
	        return weatherinfo.stream()
	                 .filter(f -> f.getCity().equals(city))
	                 .findFirst()
	                 .get();
	    }
	 
	 
	 public List<CityWeatherInfo> getCityData(String city)
	    {
		 	return	weatherinfo.stream()
		 		.filter(f -> f.getCity().equalsIgnoreCase(city))
		 		.collect(Collectors.toList());
		 	
	    }
	 
	
	    public void addData(CityWeatherInfo w)
	    {
	        weatherinfo.add(w);
	        System.out.println("city: "+w.getCity());
	        System.out.println("date"+w.getDate());

	    }
	 
}
