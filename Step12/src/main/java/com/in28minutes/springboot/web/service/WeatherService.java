package com.in28minutes.springboot.web.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.in28minutes.springboot.web.model.CityWeatherInfo;

import util.RestAPIUtils;

@Service
public class WeatherService {
	

	public String getData(String city) {
		String str = "";
		
		//call from here : 
		String url = "http://localhost:8091/weatherinfo/";
		
		RestAPIUtils a = new RestAPIUtils();
		String jsonStr = a.getResponseBodyString(a.getHttpGetResponse(url+"/"+city));
		
		try {
			ObjectMapper mapper = new ObjectMapper();

			CityWeatherInfo obj = null;
			
			if(jsonStr.contains("]"))
			{
				//jsonStr = "{ "+jsonStr+"}";
				CityWeatherInfo[] citylist = mapper.readValue(jsonStr, CityWeatherInfo[].class);
				
				//CityWeatherInfo[] citylist = list.getInfolist();
				
				str = "<table border = \"1\" class=\"myTable\">";
				str += "<tr>";
				str += "  <td><b>Date</b></td>";
				str += "  <td><b>Min</b></td>";
				str += "  <td><b>Max</b></td>";
				str += "</tr>";

 
				for(int i=0;i<citylist.length;i++)
				{
					str += "<tr>";
					str += "  <td>"+citylist[i].getDate()+"</td>";
					str += "  <td>"+citylist[i].getMin()+"</td>";
					str += "  <td>"+citylist[i].getMax()+"</td>";
					str += "</tr>";
					 //str += "\ncity="+citylist[i].getCity()+"\t max="+citylist[i].getMax() + "\t Min="+ citylist[i].getMin();
				}
				str += "</table>";

			}
			else
			{
				 obj = mapper.readValue(jsonStr, CityWeatherInfo.class);
				 str = "city="+obj.getCity()+"\t max="+obj.getMax() + "\t Min="+ obj.getMin();
			}
			
			
		} 
		catch (Exception e) {
		
			e.printStackTrace();
		}
		
		return str;
		
	}

}
