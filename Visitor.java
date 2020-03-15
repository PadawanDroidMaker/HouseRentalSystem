//Name: Nourhan Ibrahim
//QU ID: 201608687
package people;
import date .*;

public class Visitor extends Tenant {
	//Instance Variables
	private int passportNo;
	private Date entryDate;
	private Date visaExpiryDate;
	
	//Constructor
	public Visitor(int tenantId, String name, String phone, String address, String nationality, int passportNo,
			Date entryDate, Date visaExpiryDate) {
		super(tenantId, name, phone, address, nationality);
		this.passportNo = passportNo;
		this.entryDate = entryDate;
		this.visaExpiryDate = visaExpiryDate;
	}//end of constructor
	
	//Getters and Setters
	public int getPassportNo() {
		return passportNo;
	}//end of getPassportNo
	public void setPassportNo(int passportNo) {
		this.passportNo = passportNo;
	}//end of setPassportNo
	public Date getEntryDate() {
		return entryDate;
	}//end of getEntryDate
	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}//end of setEntryDate
	public Date getVisaExpiryDate() {
		return visaExpiryDate;
	}//end of getVisaExpiryDate
	public void setVisaExpiryDate(Date visaExpiryDate) {
		this.visaExpiryDate = visaExpiryDate;
	}//end of setVisaExpiryDate

	@Override
	public String toString() {
		return super.toString() + "Visitor [passportNo=" + passportNo + ", entryDate=" + entryDate + ", visaExpiryDate=" + visaExpiryDate
				+ "]";
	}//end of toString
}//end of Visitor Class
