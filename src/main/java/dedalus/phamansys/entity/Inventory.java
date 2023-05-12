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
@Table(name = "pms_inventory")
public class Inventory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long drugcode;
	
	@Column(nullable = false,unique = true)
	private Long quantity;
	
	@Column(nullable = false)
	private String inventorydate;
	
	@Column(nullable = false)
	private Long dealerid;

	public Long getDrugcode() {
		return drugcode;
	}

	public void setDrugcode(Long drugcode) {
		this.drugcode = drugcode;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getInventorydate() {
		return inventorydate;
	}

	public void setInventorydate(String inventorydate) {
		this.inventorydate = inventorydate;
	}

	public Long getDealerid() {
		return dealerid;
	}

	public void setDealerid(Long dealerid) {
		this.dealerid = dealerid;
	}

	@Override
	public String toString() {
		return "Inventory [drugcode=" + drugcode + ", quantity=" + quantity + ", inventorydate=" + inventorydate
				+ ", dealerid=" + dealerid + "]";
	}

	
}
