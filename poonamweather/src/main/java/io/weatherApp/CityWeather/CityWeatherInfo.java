package io.weatherApp.CityWeather;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class CityWeatherInfo {
	
	@Id
	  //  @Column(name="id")
	    private String id;
		 // @Column(name="city")
    	private String city;
	   // @Column(name="date")
	    private Date date;
	   // @Column(name="min")
	    private int min;
	   // @Column(name="max")
	   private int max;
	   

		public CityWeatherInfo(String string, String string2, Date date, int i, int j) {
			
			this.id = string;
			this.city = string2;
			this.date = date;
			this.min = i;
			this.max = j;
		}
		
		public CityWeatherInfo()
		{
			
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public int getMin() {
			return min;
		}

		public void setMin(int min) {
			this.min = min;
		}

		public int getMax() {
			return max;
		}

		public void setMax(int max) {
			this.max = max;
		}


	    
}
