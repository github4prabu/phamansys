package dedalus.phamansys.service;



import java.util.List;



import dedalus.phamansys.entity.Bill;
import dedalus.phamansys.entity.Customer;
import dedalus.phamansys.entity.Drug;
import dedalus.phamansys.entity.Inventory;
import dedalus.phamansys.entity.Pharmacist;

public interface DrugService {

	public Drug drugRecord(Drug drug);
	
	public Customer cus(Customer Customer);
	
	public Inventory  manageStock(Inventory stock);
	
	public Bill billProcess(Bill updateBill);
	
	public Pharmacist updateuser(Pharmacist user);
	
	public Pharmacist userUpdate(Pharmacist name);
	
	public void deleteCustomerBycustomername(String customername);
	
	public List<Drug> listAllDrugs();
}
