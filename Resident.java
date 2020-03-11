package people;

public class Resident extends Tenant {
	
	private int qatarId;
	private String bankName;
	private String bankAccountNo;
	
	public Resident(int tenantId, String name, String phone, String address, String nationality, int qatarId,
			String bankName, String bankAccountNo) {
		super(tenantId, name, phone, address, nationality);
		this.qatarId = qatarId;
		this.bankName = bankName;
		this.bankAccountNo = bankAccountNo;
	}
	
	public int getQatarId() {
		return qatarId;
	}
	public void setQatarId(int qatarId) {
		this.qatarId = qatarId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankAccountNo() {
		return bankAccountNo;
	}
	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}
	
	
}
