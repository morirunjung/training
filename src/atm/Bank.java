package atm;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers; //ปรับขนาดข้อมูลตามที่เราใส่ข้อมูลไป

    // Constructor
    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>(); // เขียนเพิ่มเอง
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
