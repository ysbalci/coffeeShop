import adapters.MernisAdapters;
import concretes.Customers;
import concretes.NeroCustomerManager;
import concretes.StarbucksCustomerManager;

public class Main {
    public static void main(String[] args) {

        Customers customer = new Customers(1,"Müşteri","Müşteri",1995,"12345678901");
        // NeroCustomerManager neroCustomerManager = new NeroCustomerManager();
        // neroCustomerManager.save(customer);
        StarbucksCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisAdapters());
        starbucksCustomerManager.save(customer);

    }
}