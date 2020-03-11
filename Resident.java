package people;

public class Resident extends Tenant {

  private int qatarId;
	private String bankName;
	private String bankAccountNo;
	
	
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
