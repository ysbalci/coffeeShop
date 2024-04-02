package concretes;

import abstracts.CustomerCehckService;

public class CustomerCheckManager implements CustomerCehckService {
    @Override
    public boolean verify(Customers customers) {
        return true;
    }
}
