package projectphase1;

public class House {
	
	private int houseNo;
	private String address;
	private boolean isAvailabile;
	private HouseType house;
	
	public House(int houseNo, String address, HouseType house) {
		super();
		this.houseNo = houseNo;
		this.address = address;
		this.house = house;
	}
	

	public int getHouseNo() {
		return houseNo;
	}
	
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public boolean isAvailabile() {
		return isAvailabile;
	}
	
	public void setAvailabile(boolean isAvailabile) {
		this.isAvailabile = isAvailabile;
	}


	@Override
	public String toString() {
		return "House [houseNo=" + houseNo + ", address=" + address + ", isAvailabile=" + isAvailabile + ", house="
				+ house + "]";
	}
	
	

}//end of House class
