package atm;

import java.util.ArrayList;

public class DatabaseDataSource implements DataSource {

    public ArrayList<Customer> getCustomerData() {
        //Database จำลอง
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(100,"Andy", "1234"));
        customers.add(new Customer(200,"Brian","2345"));
        return customers;
    }
}
