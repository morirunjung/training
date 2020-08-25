package atm;

import java.util.ArrayList;

public class WebServiceDatasource implements DataSource{

    public ArrayList<Customer> getCustomerData() {
        //จำลอง WebService API
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(100,"แอนดี้","1234"));
        customers.add(new Customer(200,"ไบรอัน","2345"));
        return customers;
    }
}
