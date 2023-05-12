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
@Table(name = "pms_Bill")
public class Bill {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long no;
	
	@Column(nullable = false)
	private Long customerid;
	
	@Column(nullable = false)
	private String doctorname;
	
	@Column(nullable = false)
	private Long drugitems;
	
	@Column(nullable = false)
	private Long totalamount;

	public Long getNo() {
		return no;
	}

	public void setNo(Long no) {
		this.no = no;
	}

	public Long getCustomerid() {
		return customerid;
	}

	public void setCustomerid(Long customerid) {
		this.customerid = customerid;
	}

	public String getDoctorname() {
		return doctorname;
	}

	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}

	public Long getDrugitems() {
		return drugitems;
	}

	public void setDrugitems(Long drugitems) {
		this.drugitems = drugitems;
	}

	public Long getTotalamount() {
		return totalamount;
	}

	public void setTotalamount(Long totalamount) {
		this.totalamount = totalamount;
	}

	@Override
	public String toString() {
		return "Bill [no=" + no + ", customerid=" + customerid + ", doctorname=" + doctorname + ", drugitems="
				+ drugitems + ", totalamount=" + totalamount + "]";
	}

	
}
