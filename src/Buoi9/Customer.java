package Buoi9;

public class Customer extends preson {
    private int balance;

    public Customer(String name, String address) {
        super(name, address);
    }
    @Override
    public void display() {
        System.out.println("customer name"+ super.getName());
        System.out.println("customer address" +super.getAddress());
        System.out.println("customer balance" +balance);

    }
}
