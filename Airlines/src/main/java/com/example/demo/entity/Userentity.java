package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Userentity {
	@Id
	private int AirlineID;
	private String AirlineName;
	private String Departure;
	private String Arrival;
	private int Time;
	private int Amount;
	private String International;
	private String Domestic;
	public int getAirlineID() {
		return AirlineID;
	}
	public void setAirlineID(int airlineID) {
		AirlineID = airlineID;
	}
	public String getAirlineName() {
		return AirlineName;
	}
	public void setAirlineName(String airlineName) {
		AirlineName = airlineName;
	}
	public String getDeparture() {
		return Departure;
	}
	public void setDeparture(String departure) {
		Departure = departure;
	}
	public String getArrival() {
		return Arrival;
	}
	public void setArrival(String arrival) {
		Arrival = arrival;
	}
	public int getTime() {
		return Time;
	}
	public void setTime(int time) {
		Time = time;
	}
	public int getAmount() {
		return Amount;
	}
	public void setAmount(int amount) {
		Amount = amount;
	}
	public String getInternational() {
		return International;
	}
	public void setInternational(String international) {
		International = international;
	}
	public String getDomestic() {
		return Domestic;
	}
	public void setDomestic(String domestic) {
		Domestic = domestic;
	}
	public Userentity(int airlineID, String airlineName, String departure, String arrival, int time, int amount,
			String international, String domestic) {
		super();
		AirlineID = airlineID;
		AirlineName = airlineName;
		Departure = departure;
		Arrival = arrival;
		Time = time;
		Amount = amount;
		International = international;
		Domestic = domestic;
	}
	public Userentity() {
		super();
		// TODO Auto-generated constructor stub
	}

}
