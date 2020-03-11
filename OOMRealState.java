package oomRealState;

import houses.*;
import people.*;
import java.util.ArrayList;

public class OOMRealState {

	ArrayList<Tenant> tenant = new ArrayList<Tenant>();
	ArrayList<House> house = new ArrayList<House>();
	ArrayList<HouseRental> houseRental = new ArrayList<HouseRental>();

	//Get all available houses. 
	public void addHouse(House h) {
		house.add(h);
	}//end of addHouse method

	//Search for a specific house by its number 
	public House findHouse(int houseId) {
		for(House h : house) {
			if(h.getHouseNo()== houseId) {
				return h;
			}
		}
		return null;
	}//end of findHouse method

	//Delete for a specific house by its number. 
	public void deleteHouse(int houseId) {
		for(House h : house) {
			if(h.getHouseNo()== houseId) {
				house.remove(h);
				break;
			}
		}
	}//end of deleteHouse method


	//Get all available houses. 
	public ArrayList <House> getHouseByAvailability() {
		ArrayList <House> availableHouses = new ArrayList <House>();
		for (House i : house) {
			if (i.isAvailabile()) {
				availableHouses.add(i);
			}
			else
				continue;
		}
		return availableHouses;
	}//end of getHouseByAvailability method

	//Adding houseRental
	public void addHouseRental(HouseRental hr) {
		houseRental.add(hr);

	}//end of addHouseRental method


}//end of OOMRealState class
