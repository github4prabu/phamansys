package dedalus.phamansys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



import dedalus.phamansys.entity.Drug;
import dedalus.phamansys.repo.DrugRepository;
import dedalus.phamansys.service.DrugService;

@RestController
public class PharmacyRestController {

	
	@Autowired	
	DrugService DrugService;
	
	@Autowired
	DrugRepository DrugRepository;
	
	@GetMapping("/welcome")
	public String helloAppln() {
		return "Hello santhiya";
	}
	
	
	@PostMapping("/DrugDetail")	
	public Drug addTraveller(@RequestBody Drug Drug) {
		return DrugService.DrugDetail(Drug);
	}
}
