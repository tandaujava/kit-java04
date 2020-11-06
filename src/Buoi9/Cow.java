package Buoi9;

import java.util.Scanner;

public class Cow extends animal {
    Scanner sc = new Scanner(System.in);

    public Cow(String name) {
        super(name);
    }

    @Override
    public void introduce() {
        System.out.println("name :");
        String name;
        name = sc.nextLine();
    }

    @Override
    public void makeSound() {
        System.out.println("Con bo phat ra am thanh:");

        System.out.println("bo");
    }
}
