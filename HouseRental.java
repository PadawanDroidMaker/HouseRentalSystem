package projectphase1;

public class HouseRental { // Created by Malak Nabeel

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
	}//end of HouseRental constructor

	public Date getRentalStartDate() {
		return rentalStartDate;
	}//end of getRentalStartDate method

	public void setRentalStartDate(Date rentalStartDate) {
		this.rentalStartDate = rentalStartDate;
	}//end of setRentalStartDate method

	public Date getRentalEndDate() {
		return rentalEndDate;
	}//end of getRentalEndDate method

	public void setRentalEndDate(Date rentalEndDate) {
		this.rentalEndDate = rentalEndDate;
	}//end of setRentalEndDate method

	public double getDeposit() {
		return deposit;
	}//end of getDeposit method

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}//end of setDeposit method

	@Override
	public String toString() {
		return "HouseRental [tenant=" + tenant + ", house=" + house + ", rentalStartDate=" + rentalStartDate
				+ ", rentalEndDate=" + rentalEndDate + ", deposit=" + deposit + ", invoice=" + invoice + "]";
	}//end of toString method

}//end of HouseRental class
