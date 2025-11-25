package com.example.SpringBootApp;

import org.springframework.stereotype.Component;

@Component
public class Room {
	
	

	private int roomNo;
	
	private String type;
	
	private int pricePerNight;
	
	public Room() {
		super();
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPricePerNight() {
		return pricePerNight;
	}

	public void setPricePerNight(int pricePerNight) {
		this.pricePerNight = pricePerNight;
	}

	@Override
	public String toString() {
		return "Room [roomNo=" + roomNo + ", type=" + type + ", pricePerNight=" + pricePerNight + "]";
	}

	
}
