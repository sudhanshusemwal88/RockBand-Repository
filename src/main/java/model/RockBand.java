package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RockBand {
	
	private String id;
	
	private String name;
	
	private String city;
	
	private String state;
	
	private String country;
	
	private Integer capacity;
	
	private Integer minimum_tour_duration_in_days;

	public RockBand(String id, String name, String city, String state, String country, Integer capacity,
			int minimum_tour_duration_in_days) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.state = state;
		this.country = country;
		this.capacity = capacity;
		this.minimum_tour_duration_in_days = minimum_tour_duration_in_days;
	}
	

	public RockBand() {
		
	
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	 @JsonProperty("city")
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	 @JsonProperty("country")
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@JsonProperty("capacity")
	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	@JsonProperty("minimum_tour_duration_in_days")
	public int getMinimum_tour_duration_in_days() {
		return minimum_tour_duration_in_days;
	}

	public void setMinimum_tour_duration_in_days(int minimum_tour_duration_in_days) {
		this.minimum_tour_duration_in_days = minimum_tour_duration_in_days;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}
	
	

}
