package dedalus.phamansys.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dedalus.phamansys.entity.Bill;


@Repository
public interface BillRepository extends JpaRepository<Bill, Long> {

}
