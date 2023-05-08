package dedalus.phamansys.entity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class Inventory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long DrugCode;
	
	@Column(nullable = false,unique = true)
	private Long Quantity;
	
	@Column(nullable = false)
	private Long Date;
	
	@Column(nullable = false)
	private Long DealerId;

	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "DealerId", referencedColumnName = "DrugCode")
	private Inventory InventoryDetails;

	public Long getDrugCode() {
		return DrugCode;
	}

	public void setDrugCode(Long drugCode) {
		DrugCode = drugCode;
	}

	public Long getQuantity() {
		return Quantity;
	}

	public void setQuantity(Long quantity) {
		Quantity = quantity;
	}

	public Long getDate() {
		return Date;
	}

	public void setDate(Long date) {
		Date = date;
	}

	public Long getDealerId() {
		return DealerId;
	}

	public void setDealerId(Long dealerId) {
		DealerId = dealerId;
	}

	public Inventory getInventoryDetails() {
		return InventoryDetails;
	}

	public void setInventoryDetails(Inventory inventoryDetails) {
		InventoryDetails = inventoryDetails;
	}

	@Override
	public String toString() {
		return "Inventory [DrugCode=" + DrugCode + ", Quantity=" + Quantity + ", Date=" + Date + ", DealerId="
				+ DealerId + ", InventoryDetails=" + InventoryDetails + "]";
	}

	public Inventory() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
