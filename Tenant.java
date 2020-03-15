//Name: Nourhan Ibrahim
//QU ID: 201608687

package people;

public class Tenant {
	//Instance variables
	private int tenantId;
	private String name;
	private String phone;
	private String address;
	private String nationality;
	
	//Constructor
	public Tenant(int tenantId, String name, String phone, String address, String nationality) {
		super();
		this.tenantId = tenantId;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.nationality = nationality;
	} //end of constructor
	
	//Getters and setters
	
	public int getTenantId() {
		return tenantId;
	} //end of getTenantId
	public void setTenantId(int tenantId) {
		this.tenantId = tenantId;
	} //end of setTenantId
	public String getName() {
		return name;
	} //end of getName
	public void setName(String name) {
		this.name = name;
	} //end of setName
	public String getPhone() {
		return phone;
	} //end of getPhone
	public void setPhone(String phone) {
		this.phone = phone;
	} //end of setName 
	public String getAddress() {
		return address;
	} //end of getAddress
	public void setAddress(String address) {
		this.address = address;
	} //end of setAddress
	public String getNationality() {
		return nationality;
	} //end of getNationality
	public void setNationality(String nationality) {
		this.nationality = nationality;
	} //end of setNationality

	@Override
	public String toString() {
		return "Tenant [tenantId=" + tenantId + ", name=" + name + ", phone=" + phone + ", address=" + address
				+ ", nationality=" + nationality + "]";
	} //end of toString
	
} //end of Tenant Class
