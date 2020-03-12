package people;
import date .*;

public class Visitor extends Tenant { // Created by Nourhan Ibrahim

	private int passportNo;
	private Date entryDate;
	private Date visaExpiryDate;

	public Visitor(int passportNo, Date entryDate, Date visaExpiryDate) {
		super();
		this.passportNo = passportNo;
		this.entryDate = entryDate;
		this.visaExpiryDate = visaExpiryDate;
	}//end of Visitor constructor with 3 parameters

	public Visitor(int tenantId, String name, String phone, String address, String nationality,int passportNo, Date entryDate, Date visaExpiryDate) {
		super(tenantId, name, phone, address, nationality);
		this.passportNo = passportNo;
		this.entryDate = entryDate;
		this.visaExpiryDate = visaExpiryDate;
	}//end of Visitor method with 8 parameters

	public int getPassportNo() {
		return passportNo;
	}//end of getPassportNo method

	public void setPassportNo(int passportNo) {
		this.passportNo = passportNo;
	}//end of setPassportNo method

	public Date getEntryDate() {
		return entryDate;
	}//end of getEntryDate method

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}//end of setEntryDate method

	public Date getVisaExpiryDate() {
		return visaExpiryDate;
	}//end of getVisaExpiryDate method

	public void setVisaExpiryDate(Date visaExpiryDate) {
		this.visaExpiryDate = visaExpiryDate;
	}//end of setVisaExpiryDate method

	@Override
	public String toString() {
		return super.toString()+"  " + passportNo + "  " + entryDate + "  " + visaExpiryDate;
	}//end of toString method

}//end of Visitor class

