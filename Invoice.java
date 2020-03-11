
package house_rental_system;

import java.util.List;

public class Invoice {

	private int invoiceNo;
	private Date invoiceDate;
	private List<Payment> payments;

	public Invoice(int invoiceNo, Date invoiceDate, List<Payment> payments) {
		super();
		this.invoiceNo = invoiceNo;
		this.invoiceDate = invoiceDate;
		this.payments = payments;
	}

	public int getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(int invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public Date getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public List<Payment> getPayments() {
		return payments;
	}
	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

}
