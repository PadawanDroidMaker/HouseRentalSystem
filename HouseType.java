package projectphase1;

public class HouseType {

	private int typeId;
	private String description;
	private double housePrice;
	
	
	public HouseType(int typeId, String description, double housePrice) {
		super();
		this.typeId = typeId;
		this.description = description;
		this.housePrice = housePrice;
	}

	public int getTypeId() {
		return typeId;
	}
	
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public double getHousePrice() {
		return housePrice;
	}
	
	public void setHousePrice(double housePrice) {
		this.housePrice = housePrice;
	}

	@Override
	public String toString() {
		return "HouseType [typeId=" + typeId + ", description=" + description + ", housePrice=" + housePrice + "]";
	}
	
	
	
	
}//end of HouseType class
