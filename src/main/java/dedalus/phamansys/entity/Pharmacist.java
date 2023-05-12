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
@Table(name = "pms_pharmacist")
public class Pharmacist {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userid;
	
	@Column(nullable = false)
	private String userpwd;

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public String getUserpwd() {
		return userpwd;
	}

	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}

	@Override
	public String toString() {
		return "Pharmacist [userid=" + userid + ", userpwd=" + userpwd + "]";
	}
}
