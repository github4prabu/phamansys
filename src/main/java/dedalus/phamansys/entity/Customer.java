package dedalus.phamansys.entity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long CustomerId;
	
	@Column(nullable = false,unique = true)
	private String CustomerName;

	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "CustomerName", referencedColumnName = "CustomerId")
	private Customer CustomerDetails;

	public Long getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(Long customerId) {
		CustomerId = customerId;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public Customer getCustomerDetails() {
		return CustomerDetails;
	}

	public void setCustomerDetails(Customer customerDetails) {
		CustomerDetails = customerDetails;
	}

	@Override
	public String toString() {
		return "Customer [CustomerId=" + CustomerId + ", CustomerName=" + CustomerName + ", CustomerDetails="
				+ CustomerDetails + "]";
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
