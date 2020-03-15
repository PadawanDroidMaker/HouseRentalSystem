//Name: Nourhan Ibrahim
//QU ID: 201608687

package people;

public class Resident extends Tenant {
	//Instance variables
	private int qatarId;
	private String bankName;
	private String bankAccountNo;
	
	//Constructor
	public Resident(int tenantId, String name, String phone, String address, String nationality, int qatarId,
			String bankName, String bankAccountNo) {
		super(tenantId, name, phone, address, nationality);
		this.qatarId = qatarId;
		this.bankName = bankName;
		this.bankAccountNo = bankAccountNo;
	}//end of constructor
	
	//Getters and setters
	public int getQatarId() {
		return qatarId;
	}//end of getQatarId
	public void setQatarId(int qatarId) {
		this.qatarId = qatarId;
	}//end of setQatarId
	public String getBankName() {
		return bankName;
	}//end of getBankName
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}//end of setBankName
	public String getBankAccountNo() {
		return bankAccountNo;
	}//end of getBankAccountNo
	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}//end of setBankAccountNo

	@Override
	public String toString() {
		return super.toString() + "Resident [qatarId=" + qatarId + ", bankName=" + bankName + ", bankAccountNo=" + bankAccountNo + "]";
	}//end of toString
	
}//end of Resident Class
