package people;
import date .*;

public class Visitor extends Tenant {

	private int passportNo;
	private Date entryDate;
	private Date visaExpiryDate;
	
	public Visitor(int tenantId, String name, String phone, String address, String nationality, int passportNo,
			Date entryDate, Date visaExpiryDate) {
		super(tenantId, name, phone, address, nationality);
		this.passportNo = passportNo;
		this.entryDate = entryDate;
		this.visaExpiryDate = visaExpiryDate;
	}
	
	public int getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(int passportNo) {
		this.passportNo = passportNo;
	}
	public Date getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}
	public Date getVisaExpiryDate() {
		return visaExpiryDate;
	}
	public void setVisaExpiryDate(Date visaExpiryDate) {
		this.visaExpiryDate = visaExpiryDate;
	}
	
	
}
