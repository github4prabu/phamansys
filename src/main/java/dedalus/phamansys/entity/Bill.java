package dedalus.phamansys.entity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Bill")
public class Bill {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long No;
	
	@Column(nullable = false,unique = true)
	private String CustomerId;
	
	@Column(nullable = false)
	private String DoctorName;
	
	@Column(nullable = false)
	private String DrugItems;
	
	@Column(nullable = false)
	private Long TotalAmount;

	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "BillNo", referencedColumnName = "Id")
	private Bill DrugDetails;

	public Long getNo() {
		return No;
	}

	public void setNo(Long no) {
		No = no;
	}

	public String getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(String customerId) {
		CustomerId = customerId;
	}

	public String getDoctorName() {
		return DoctorName;
	}

	public void setDoctorName(String doctorName) {
		DoctorName = doctorName;
	}

	public String getDrugItems() {
		return DrugItems;
	}

	public void setDrugItems(String drugItems) {
		DrugItems = drugItems;
	}

	public Long getTotalAmount() {
		return TotalAmount;
	}

	public void setTotalAmount(Long totalAmount) {
		TotalAmount = totalAmount;
	}

	public Bill getBillingProcess() {
		return DrugDetails;
	}

	public void setBillingProcess(Bill billingProcess) {
		DrugDetails = billingProcess;
	}

	@Override
	public String toString() {
		return "Bill [No=" + No + ", CustomerId=" + CustomerId + ", DoctorName=" + DoctorName + ", DrugItems="
				+ DrugItems + ", TotalAmount=" + TotalAmount + ", BillingProcess=" + DrugDetails + "]";
	}

	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
