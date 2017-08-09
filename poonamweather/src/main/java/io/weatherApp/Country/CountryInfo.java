package io.weatherApp.Country;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CountryInfo {
	
	@Id
	 //@Column(name="id")
	 private String id;
	 //@Column(name="country")
	 private String country;
	//@Column(name="state")
	 private String state;
	//@Column(name="city")
	 private String city;
	 
	 public CountryInfo(String id, String country, String state, String city)
	    {
	        this.id = id;
	        this.country = country;
	        this.state = state;
	        this.city=city;
	    }

	    public CountryInfo()
	    {

	    }

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}
	    
	    
	
}
