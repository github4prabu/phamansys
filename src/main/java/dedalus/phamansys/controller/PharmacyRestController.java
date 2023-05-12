package dedalus.phamansys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dedalus.phamansys.entity.Bill;
import dedalus.phamansys.entity.Customer;
import dedalus.phamansys.entity.Drug;
import dedalus.phamansys.entity.Inventory;
import dedalus.phamansys.entity.Pharmacist;
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
		return "Welcome to Pha Man Sys!";
	}
	
	
	@PostMapping("/addDrug")
	public Drug addDrug(@RequestBody Drug drug) {
		System.out.println(drug.toString());
		return DrugService.drugRecord(drug);
	}
	//@PreAuthorize("hasAuthority()")
	@PostMapping("/Customer")
	public Customer drug(@RequestBody Customer Customer) {
		return DrugService.cus(Customer);
	}
	
	@PostMapping("/inventory")	
	public Inventory manageStock(@RequestBody Inventory stock) {
		return DrugService.manageStock(stock);
	}
	
	@PostMapping("/billing")
	public Bill billProcess(@RequestBody Bill updateBill) {
		return DrugService.billProcess(updateBill);
	}
	
	@PostMapping("/pharmacist")
	public Pharmacist updateUser(@RequestBody Pharmacist user) {
		return DrugService.updateuser(user);
	}
	
	@PutMapping("/pharmacist")
	public Pharmacist userUpdate(@RequestBody Pharmacist name) {
		return DrugService.userUpdate(name);
	}
	
	@DeleteMapping("/deleteCustomer/{customername}")
	public void deleteCustomer(@PathVariable("customername") String customername) {
		DrugService.deleteCustomerBycustomername(customername);
	}
	
//	  @DeleteMapping("/deleteTheater/{SlotId}")
//
//	    public void deleteEmployee(@PathVariable("SlotId") String SlotId) {
//
//	         apposervice.deleteEmployeeBySlotId(SlotId);
}
