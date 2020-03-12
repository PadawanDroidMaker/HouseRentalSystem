package projectphase1;

public class House { // Created by Malak Nabeel

	private int houseNo;
	private String address;
	private boolean isAvailabile;
	private HouseType house;

	public House(int houseNo, String address, HouseType house) {
		super();
		this.houseNo = houseNo;
		this.address = address;
		this.house = house;
	}//end of House constructor

	public int getHouseNo() {
		return houseNo;
	}//end of getHouseNo method

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}//end of setHouseNo method

	public String getAddress() {
		return address;
	}//end of getAddress method

	public void setAddress(String address) {
		this.address = address;
	}//end of setAddress method

	public boolean isAvailabile() {
		return isAvailabile;
	}//end of isAvailabile method

	public void setAvailabile(boolean isAvailabile) {
		this.isAvailabile = isAvailabile;
	}//end of setAvailabile method

	@Override
	public String toString() {
		return "House [houseNo=" + houseNo + ", address=" + address + ", isAvailabile=" + isAvailabile + ", house="
				+ house + "]";
	}//end of toString method

}//end of House class
