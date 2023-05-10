package dedalus.phamansys.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dedalus.phamansys.entity.Drug;


@Repository
public interface DrugRepository extends CrudRepository<Drug, Long> {

}
