package com.example.SpringBootApp;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "myhotel")
public class Hotel {
	
	private String hotelName;
	
	private String city;
	
	
	private Manager manager;
	
	private List<Room> rooms;

	public Hotel() {
		super();
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", city=" + city + ", manager=" + manager + ", rooms=" + rooms + "]";
	}
	

}
