package adapters;

import abstracts.CustomerCehckService;
import concretes.Customers;
import mernisDemo.KPSDemo;

public class MernisAdapters implements CustomerCehckService {

    KPSDemo kpsDemo = new KPSDemo();

    @Override
    public boolean verify(Customers customers) {
        if (kpsDemo.checkPerson(customers.getFirstName(), customers.getNatioanlIdentity())){
            System.out.println("Kullanıcı doğrulandı..");
            return true;
        }else{
            System.out.println("Kullanıcı adı veya kimlik no hatalı..");
            return false;
        }
    }
}
