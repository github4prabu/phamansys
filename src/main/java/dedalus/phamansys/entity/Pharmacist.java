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
@Table(name = "Pharmacist")
public class Pharmacist {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long UserId;
	
	@Column(nullable = false,unique = true)
	private String UserPwd;
	

	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "UserId", referencedColumnName = "Id")
	private Pharmacist DrugDetails;


	public Long getUserId() {
		return UserId;
	}


	public void setUserId(Long userId) {
		UserId = userId;
	}


	public String getUserPwd() {
		return UserPwd;
	}


	public void setUserPwd(String userPwd) {
		UserPwd = userPwd;
	}


	public Pharmacist getPharmacistDetails() {
		return DrugDetails;
	}


	public void setPharmacistDetails(Pharmacist pharmacistDetails) {
		DrugDetails = pharmacistDetails;
	}


	@Override
	public String toString() {
		return "Pharmacist [UserId=" + UserId + ", UserPwd=" + UserPwd + ", PharmacistDetails=" + DrugDetails
				+ "]";
	}


	public Pharmacist() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
