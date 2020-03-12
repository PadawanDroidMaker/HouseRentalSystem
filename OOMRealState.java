package oomRealState;

import houses.*;
import people.*;
import java.util.ArrayList;

public class OOMRealState { //created through collaborative team effort: Mahnoor Akhund, Malak Nabeel and Nourhan Ibrahim 

	private List<Tenant> tenants;
	private List<House> houses;
	private List<HouseRental> houseRentals;

	//Method #6: Add a new tenant to the system (resident or visitor)
	public void addTenant(Tenant tenant) {
		tenants.add(tenant);
	}//end of addTenant method
		
	//Method #7: Search for a specific tenant by their id
	public Tenant findTenant(Tenant tenantId) {
		for(Tenant tenant : tenants) {
			if(tenants.get(0) == tenantId) {
				return tenant;
			}
		}
		return null;
	}//end of findTenant method
	
	//Method #8: Delete for a specific house by its member
	public void deleteTenant(Tenant tenantId) {
		if(tenants.get(0) == tenantId) 
			for(int i = 0; i < tenants.size(); i++)
				houses.remove(i);
	}//end of deleteTenant method
	
	//Method #9: Add a new House to the System (1, 2 or 3 bedrooms) 
	public void addHouse(House house) {
		houses.add(house);
	}//end of addHouse method

	//Method #10: Search for a specific house by its number 
	public House findHouse(House houseNo) {
		for(House house : houses) {
			if(houses.get(0) == houseNo) {
				return house;
			}
		}
		return null;
	}//end of findHouse method	

	//Method #11: Delete for a specific house by its number. 
	public void deleteHouse(House houseNo) {
		if(houses.get(0) == houseNo) 
			for(int i = 0; i < houses.size(); i++)
				houses.remove(i);
	}//end of deleteHouse method

	//Method #12: Get all available houses. 
	public List<House> getHouseByAvailability (boolean available) {
		List<House> availableHouses = null;
		for (House house : houses) {
			if (house.isAvailabile()) {
				availableHouses.add(house);
			}
			else
				continue;
		}
		return availableHouses;
	}//end of getHouseByAvailability method

	//Method #13: When tenant leaves the house, the house status is updated to available. The invoice of the house is returned
	
	//Method #14: Returns all the houses rented by a specific tenant

	//Method #15: Deletes specific houseRental by specific tenantId

	//Method #16: Returns all houses available after a specific date

	//Method #17: Save data to file (Phase II)

	//Method #18: Load data from file (Phase II)


	
}//end of OOMRealState class
