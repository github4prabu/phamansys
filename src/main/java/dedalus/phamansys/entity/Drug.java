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
@Table(name = "drug")
public class Drug {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	
	@Column(nullable = false,unique = true)
	private String Name;
	
	@Column(nullable = false)
	private String Category;
	
	@Column(nullable = false)
	private Long price;
	
	@Override
	public String toString() {
		return "Drug [Id=" + Id + ", Name=" + Name + ", Category=" + Category + ", price=" + price + ", ExpiryDate="
				+ ExpiryDate + ", ManufactureDate=" + ManufactureDate + ", DrugItems=" + DrugDetails + "]";
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Long getExpiryDate() {
		return ExpiryDate;
	}

	public void setExpiryDate(Long expiryDate) {
		ExpiryDate = expiryDate;
	}

	public Long getManufactureDate() {
		return ManufactureDate;
	}

	public void setManufactureDate(Long manufactureDate) {
		ManufactureDate = manufactureDate;
	}

	public Drug getDrugItems() {
		return DrugDetails;
	}

	public void setDrugItems(Drug drugItems) {
		DrugDetails = drugItems;
	}

	@Column(nullable = false)
	private Long ExpiryDate;
	
	@Column(nullable = false)
	private Long ManufactureDate;

	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "Drugcode", referencedColumnName = "Id")
	private Drug DrugDetails;

	public Drug() {
		super();
		// TODO Auto-generated constructor stub
	}

}
