package atm;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers; //ปรับขนาดข้อมูลตามที่เราใส่ข้อมูลไป
//    private DatabaseDataSource dataSource;
//    private WebServiceDatasource dataSource;
    private DataSource dataSource;
    // Constructor
    public Bank(String name,DataSource dataSource) {
        this.name = name;
        //this.customers = new ArrayList<>(); // เขียนเพิ่มเอง
//        this.dataSource = new DatabaseDataSource();
//        this.dataSource = new WebServiceDatasource();
        this.dataSource = dataSource;
        this.customers = dataSource.getCustomerData();
    }

    // Method
    public void addCustomer(Customer c) {
        customers.add(c);
    }
    public Customer findCustomer(int id){
        for (Customer element : customers){
            if(element.getId() == id)
                return element;
        }
        return null;
    }

    //Generate toString
    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

}
