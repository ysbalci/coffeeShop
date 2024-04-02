package concretes;

import abstracts.CustomerCehckService;
import abstracts.CustomersService;

public class StarbucksCustomerManager implements CustomersService {

    private CustomerCehckService customerCheck;

    public StarbucksCustomerManager(CustomerCehckService customerCheck) {
        this.customerCheck = customerCheck;
    }

    @Override
    public void save(Customers customers) {
        if (customerCheck.verify(customers)){
            System.out.println("Müşteri kaydedildi (Starbucks)... " +customers.getFirstName());
        }else{
            System.out.println("Müşteri kaydedilemedi.");
        }


    }
}
