package dedalus.phamansys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dedalus.phamansys.entity.Drug;
import dedalus.phamansys.repo.DrugRepository;

@Service
public class DrugServiceImpl implements DrugService {

	@Autowired
	private DrugRepository DrugRepository;

	@Override
	public Drug DrugDetail(Drug Drug) {
		// TODO Auto-generated method stub
		return DrugRepository.save(Drug);
	}
}
