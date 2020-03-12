package projectphase1;

public class HouseType { // Created by Malak Nabeel

	private int typeId;
	private String description;
	private double housePrice;

	public HouseType(int typeId, String description, double housePrice) {
		super();
		this.typeId = typeId;
		this.description = description;
		this.housePrice = housePrice;
	}//end of HouseType constructor

	public int getTypeId() {
		return typeId;
	}//end of getTypeId method

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}//end of setTypeId method

	public String getDescription() {
		return description;
	}//end of getDescription method

	public void setDescription(String description) {
		this.description = description;
	}//end of setDescription method

	public double getHousePrice() {
		return housePrice;
	}//end of getHousePrice method

	public void setHousePrice(double housePrice) {
		this.housePrice = housePrice;
	}//end of setHousePrice method

	@Override
	public String toString() {
		return "HouseType [typeId=" + typeId + ", description=" + description + ", housePrice=" + housePrice + "]";
	}//end of toString method

}//end of HouseType class
