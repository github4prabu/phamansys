package dedalus.phamansys.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



import dedalus.phamansys.entity.Customer;
import jakarta.transaction.Transactional;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

	@Transactional
	public void deleteByCustomername(String customername);
}
