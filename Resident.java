package people;

public class Resident extends Tenant { //Created by Nourhan Ibrahim 

	private int qatarId;
	private String bankName;
	private String bankAccountNo;

	public Resident(int qatarId,String bankName, String bankAccountNo) {
		super();
		this.qatarId = qatarId;
		this.bankName = bankName;
		this.bankAccountNo = bankAccountNo;
	}//end of Resident constructor with 3 parameters

	public Resident(int tenantId, String name, String phone, String address, String nationality, int qatarId,
			String bankName, String bankAccountNo) {
		super(tenantId, name, phone, address, nationality);
		this.qatarId = qatarId;
		this.bankName = bankName;
		this.bankAccountNo = bankAccountNo;
	}//end of Resident constructor with 8 parameters

	public int getQatarId() {
		return qatarId;
	}//end of getQatarId method

	public void setQatarId(int qatarId) {
		this.qatarId = qatarId;
	}//end of setQatarId method

	public String getBankName() {
		return bankName;
	}//end of getBankName method

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}//end of setBankName method

	public String getBankAccountNo() {
		return bankAccountNo;
	}//end of getBankAccountNo method

	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}//end of setBankAccountNo method

	@Override
	public String toString() {
		return super.toString()+"  " + qatarId + "  " + bankName + "  " + bankAccountNo;
	}//end of toString method

}//end of Resident class
