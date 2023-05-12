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
@Table(name = "pms_drug")
public class Drug {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String category;
	
	@Column(nullable = false)
	private Long price;
	
	@Column(nullable = true)
	private String expirydate;
	
	@Column(nullable = false)
	private String manufacturedate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public String getExpirydate() {
		return expirydate;
	}

	public void setExpirydate(String expiryDate) {
		this.expirydate = expiryDate;
	}

	public String getManufacturedate() {
		return manufacturedate;
	}

	public void setManufacturedate(String manufacturedate) {
		this.manufacturedate = manufacturedate;
	}

	@Override
	public String toString() {
		return "Drug [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + ", expirydate="
				+ expirydate + ", manufacturedate=" + manufacturedate + "]";
	}

	public Drug(Long id, String name, String category, Long price, String expiryDate, String manufacturedate) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.expirydate = expiryDate;
		this.manufacturedate = manufacturedate;
	}

	public Drug() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	
}
