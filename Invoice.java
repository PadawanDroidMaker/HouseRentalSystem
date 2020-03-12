
package house_rental_system;

import java.util.List;

public class Invoice { // Created by Mahnoor Akhund

	private int invoiceNo;
	private Date invoiceDate;
	private List<Payment> payments;

	public Invoice(int invoiceNo, Date invoiceDate, List<Payment> payments) {
		super();
		this.invoiceNo = invoiceNo;
		this.invoiceDate = invoiceDate;
		this.payments = payments;
	} //end of Invoice constructor

	public int getInvoiceNo() {
		return invoiceNo;
	}//end of getInvoiceNo method

	public void setInvoiceNo(int invoiceNo) {
		this.invoiceNo = invoiceNo;
	}//end of setInvoiceNo method

	public Date getInvoiceDate() {
		return invoiceDate;
	}//end of getInvoiceDate method

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}//end of setInvoiceDate method

	public List<Payment> getPayments() {
		return payments;
	}//end of getPayments method

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}//end of setPayments method

	//Method #1: Update payment information
	public void modifyIPayment(Payment payment) {

		String choice;
		do {
			Scanner input = new Scanner(System.in);
			System.out.println("Choose your option:\n"
					+	"[a] Payment Type\n"
					+ 	"[b] Payment ID\n"
					+	"[c] Description\n"
					+	"[d] Price\n"
					+ 	"[e] Payment Date\n"
					+ 	"choice: ");

			choice = input.next();

			switch (choice){
			case "a":
				payments.set(1, payment);
			case "b":
				payments.set(2, payment);
			case "c":
				payments.set(3, payment);
			case "d":
				payments.set(4, payment);
			case "e":
				payments.set(5, payment);
			default:
			{
				System.out.println("You option is invalid please try again\n");
				choice = " ";
				input.close();
			}//end of default 
			}//end of switch statement
		}//end of do statement
		while (choice != null); //end of while statement  
	}//end of modifyIPayment method

	//Method #2: Delete Payment
	public String deletePayment(int payment) {
		String choice;
		Scanner input = new Scanner(System.in);
		System.out.print("Are you sure you want to delete this payment: ");

		choice = input.next();

		if (choice == "Y" | choice == "y")
			payments.remove(payment);
		input.close();
		return " ";
	}//end of deletePayment method

	//Method #3: Add a new payment to the system
	public void addPayment(Payment payment) {
		payments.add(payment);
	}//end of addPayment method

	//Method #4: Search for a specific tenant by their id
	public Payment getPayment(int paymentId) {
		return payments.get(paymentId);
	}//end of getPayment method

	//Method #5: Calculate total payment for the invoice
	public double calcualteTotalPayment() {
		return payments.get(3).getPrice();
	}//end of getPayment method

	@Override
	public String toString() {
		return "Invoice [invoiceNo=" + invoiceNo + ", invoiceDate=" + invoiceDate + ", payments=" + payments + "]";
	}//end of toString method

}//end of Invoice class
