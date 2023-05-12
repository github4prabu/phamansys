package dedalus.phamansys.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dedalus.phamansys.entity.Pharmacist;


@Repository
public interface PharmacistRepository extends JpaRepository<Pharmacist, Long> {

}
