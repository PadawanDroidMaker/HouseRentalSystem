//Name: Nourhan Ibrahim
//QU ID: 201608687

package people;

public class Tenant { // Created by Nourhan Ibrahim

	private int tenantId;
	private String name;
	private String phone;
	private String address;
	private String nationality;

	public Tenant() {

	}//end of default constructor

	public Tenant(int tenantId, String name, String phone, String address, String nationality) {
		super();
		this.tenantId = tenantId;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.nationality = nationality;
	} //end of Payment constructor

	public int getTenantId() {
		return tenantId;
	}//end of getTenantId method

	public void setTenantId(int tenantId) {
		this.tenantId = tenantId;
	}//end of setTenantId method

	public String getName() {
		return name;
	}//end of getName method

	public void setName(String name) {
		this.name = name;
	}//end of setName method

	public String getPhone() {
		return phone;
	}//end of getPhone method

	public void setPhone(String phone) {
		this.phone = phone;
	}//end of setPhone method

	public String getAddress() {
		return address;
	}//end of getAddress method

	public void setAddress(String address) {
		this.address = address;
	}//end of setAddress method

	public String getNationality() {
		return nationality;
	}//end of getNationality method

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}//end of setNationality method

	@Override
	public String toString() {
		return "Tenant [tenantId=" + tenantId + ", name=" + name + ", phone=" + phone + ", address=" + address
				+ ", nationality=" + nationality + "]";
	}//end of toString method

}//end of Tenant class
