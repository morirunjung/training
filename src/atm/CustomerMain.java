package atm;

public class CustomerMain {
    public static void main(String[] args) {

        Customer peter = new Customer(1,"Peter","1234");
        Customer nancy = new Customer(2,"Nancy","2345");
        System.out.println(peter);
        System.out.println(nancy);
        System.out.println(peter.checkPin("1234"));

        Bank bank = new Bank("My Bank");
        bank.addCustomer(peter);
        bank.addCustomer(nancy);
        System.out.println("Bank = "+bank);

        Customer c1 = bank.findCustomer(1);
        Customer c80 = bank.findCustomer(80);

        System.out.println("C1 = "+c1);
        System.out.println("C80 = "+c80);

        System.out.println("ID 1 "+bank.findCustomer(1));
        System.out.println("ID 2 "+bank.findCustomer(2));
        System.out.println("ID 100 "+bank.findCustomer(100));
        System.out.println("ID 200 "+bank.findCustomer(200));

        ATM atm = new ATM(bank);
        atm.validateCustomer(1,"1234");
        atm.deposit(1000);
        atm.transfer(2,200);
        System.out.println(peter);
        System.out.println(nancy);
        System.out.println("Print Bank = "+bank);
    }
}
