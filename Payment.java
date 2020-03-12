package house_rental_system;

public class Payment { // Created by Mahnoor Akhund

	private String paymentType;
	private int paymentId;
	private String description;
	private double price;
	private Date paymentDate;
	
	public Payment(String paymentType, int paymentId, String description, double price, Date paymentDate) {
		super();
		this.paymentType = paymentType;
		this.paymentId = paymentId;
		this.description = description;
		this.price = price;
		this.paymentDate = paymentDate;
	}//end of Payment constructor
	
	public String getPaymentType() {
		return paymentType;
	}//end of getPaymentType method
	
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}//end of setPaymentType method
	
	public int getPaymentId() {
		return paymentId;
	}//end of getPaymentId method
	
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}//end of setPaymentId method
	
	public String getDescription() {
		return description;
	}//end of getDescription method
	
	public void setDescription(String description) {
		this.description = description;
	}//end of setDescription method
	
	public double getPrice() {
		return price;
	}//end of getPrice method
	
	public void setPrice(double price) {
		this.price = price;
	}//end of setPrice method
	
	public Date getPaymentDate() {
		return paymentDate;
	}//end of getPaymentDate method
	
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}//end of setPaymentDate method

	@Override
	public String toString() {
		return "Payment [paymentType=" + paymentType + ", paymentId=" + paymentId + ", description=" + description
				+ ", price=" + price + ", paymentDate=" + paymentDate + "]";
	}//end of toString method
	
} //end of Payment class
