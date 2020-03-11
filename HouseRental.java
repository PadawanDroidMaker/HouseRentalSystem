package projectphase1;

public class HouseRental {

	private Tenant tenant;
	private House house;
	private Date rentalStartDate;
	private Date rentalEndDate;
	private double deposit;
	private Invoice invoice;
	
	public HouseRental(Tenant tenant, House house, Date rentalStartDate, Date rentalEndDate, double deposit,
			Invoice invoice) {
		super();
		this.tenant = tenant;
		this.house = house;
		this.rentalStartDate = rentalStartDate;
		this.rentalEndDate = rentalEndDate;
		this.deposit = deposit;
		this.invoice = invoice;
	}

	public Date getRentalStartDate() {
		return rentalStartDate;
	}
	
	public void setRentalStartDate(Date rentalStartDate) {
		this.rentalStartDate = rentalStartDate;
	}
	
	public Date getRentalEndDate() {
		return rentalEndDate;
	}
	
	public void setRentalEndDate(Date rentalEndDate) {
		this.rentalEndDate = rentalEndDate;
	}
	
	public double getDeposit() {
		return deposit;
	}
	
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	@Override
	public String toString() {
		return "HouseRental [tenant=" + tenant + ", house=" + house + ", rentalStartDate=" + rentalStartDate
				+ ", rentalEndDate=" + rentalEndDate + ", deposit=" + deposit + ", invoice=" + invoice + "]";
	}
	
	
	
}//end of HouseRental class
