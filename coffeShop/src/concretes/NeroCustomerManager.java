package concretes;

import abstracts.CustomersService;

public class NeroCustomerManager implements CustomersService {
    @Override
    public void save(Customers customers) {
        System.out.println("Müşteri kaydedildi (Nero)..." +customers.getFirstName());
    }
}
