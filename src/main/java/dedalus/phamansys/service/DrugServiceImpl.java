package dedalus.phamansys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dedalus.phamansys.entity.Bill;
import dedalus.phamansys.entity.Customer;
import dedalus.phamansys.entity.Drug;
import dedalus.phamansys.entity.Inventory;
import dedalus.phamansys.entity.Pharmacist;
import dedalus.phamansys.repo.DrugRepository;
import dedalus.phamansys.repo.InventoryRepository;
import dedalus.phamansys.repo.PharmacistRepository;
import dedalus.phamansys.repo.BillRepository;
import dedalus.phamansys.repo.CustomerRepository;

@Service
public class DrugServiceImpl implements DrugService {

	@Autowired
	private DrugRepository DrugRepository;

	@Autowired
	private CustomerRepository CustomerRepository;
	
	@Autowired
	private InventoryRepository InventoryRepository;
	
	@Autowired
	private BillRepository BillRepository;
	
	@Autowired
	private PharmacistRepository PharmacistRepository;

	@Override
	public Drug drugRecord(Drug drug) {
		// TODO Auto-generated method stub
		return DrugRepository.save(drug);
	}

	@Override
	public Customer cus(Customer Customer) {
		// TODO Auto-generated method stub
		return CustomerRepository.save(Customer);
	}	

	@Override
	public Inventory manageStock(Inventory stock) {
		// TODO Auto-generated method stub
		return InventoryRepository.save(stock);
	}

	@Override
	public Bill billProcess(Bill updateBill) {
		// TODO Auto-generated method stub
		return BillRepository.save(updateBill) ;
	}

	@Override
	public Pharmacist updateuser(Pharmacist user) {
		// TODO Auto-generated method stub
		return PharmacistRepository.save(user);
	}

	@Override
	public Pharmacist userUpdate(Pharmacist name) {
		// TODO Auto-generated method stub
		return PharmacistRepository.save(name);
	}

	@Override
	public void deleteCustomerBycustomername(String customername) {
		// TODO Auto-generated method stub
		CustomerRepository.deleteByCustomername(customername);
		}

//	@Override
//	public Customer updateCustomer(Customer customerDetail) {
//		// TODO Auto-generated method stub
//		return CustomerRepository.save(customerDetail);
//	}
}
