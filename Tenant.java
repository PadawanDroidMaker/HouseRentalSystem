package people;

public class Tenant {
	
	private int tenantId;
	private String name;
	private String phone;
	private String address;
	private String nationality;
	
	public Tenant(int tenantId, String name, String phone, String address, String nationality) {
		super();
		this.tenantId = tenantId;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.nationality = nationality;
	}
	
	public int getTenantId() {
		return tenantId;
	}
	public void setTenantId(int tenantId) {
		this.tenantId = tenantId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	
}
