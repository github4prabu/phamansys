package dedalus.phamansys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import dedalus.phamansys.repo.DrugRepository;

@Service
public class DrugServiceImpl {

	@Autowired
	private DrugRepository DrugRepository;
}
