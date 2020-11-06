package Buoi9;

import java.util.Scanner;

public class Cat extends animal{
    Scanner sc = new Scanner(System.in);
    int population = 0;
    private String Name;

    public Cat(String name) {
        super(name);
        System.out.println("Cat`s Name: ");
        Name = sc.nextLine();
    }

    @Override
    public void introduce() {
        System.out.println("cat");
    }

    @Override
    public void makeSound() {
        System.out.println("caterwaul:");
        System.out.println("meo ");
    }

}
