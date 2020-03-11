package oomrealstate;

import java.util.ArrayList;
import projectphase1.Tenant;
import projectphase1.House;
import projectphase1.HouseRental;
import projectphase1.HouseType;


public class AppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Tenant> tenantList = new ArrayList<Tenant>();
		
		ArrayList<House> houseList = new ArrayList<House>();
		House h1 = new House (22,"AlSadd",new HouseType(246,"Villa",6000));
		
		System.out.println(h1);
		
		ArrayList<HouseRental> houseRentalList = new ArrayList<HouseRental>();
		
		
		
		
	}
	
	public void addHouse (House house) {
		
		
		
    }//end of addHouse method
	
    public void findHouse(int houseNo) {
		
	}//end of findHouse method

	public void deleteHouse(int houseNo) {
		
	}//end of deleteHouse method
	
	public static boolean getHouseByAvailability(ArrayList<House> houseList) {
		boolean availabile;
		for(int i=0;i<houseList.length;i++) {
			if(availabile)
				return true;
			else
				return false;
		}
	}//end of getHouseByAvailability method
	
	public void addHouseRental(HouseRental houseRental) {
		
	}//end of addHouseRental method
	
	
}
