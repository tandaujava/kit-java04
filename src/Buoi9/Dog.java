package Buoi9;

import java.util.Scanner;

public class Dog extends animal {
    Scanner sc = new Scanner(System.in);
    public Dog(String name) {
        super(name);
    }

    @Override
    public void introduce() {
        System.out.println("Name : ");
        String name ;
        name = sc.nextLine();
    }

    @Override
    public void makeSound() {
        System.out.println("Con cho phat ra am thanh:");
        System.out.println("go go");
    }
}
