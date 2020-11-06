package Buoi9;

import java.util.Scanner;

public class student extends Prerson{
    Scanner sc = new Scanner(System.in);

    private String clas;

    public student(String clas) {
        this.clas = clas;
    }

    public student(String name, String addres, String deparment, String clas) {
        super(name, addres, deparment);
        this.clas = clas;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    @Override
    public void input() {
        System.out.println("name: ");
        String name =sc.nextLine();

        System.out.println("addred: ");
        String addres = sc.nextLine();

        System.out.println("deparment: ");
        String deparment = sc.nextLine();

        System.out.println("lớp: ");
        clas = sc.nextLine();

    }

    @Override
    public void output() {
        System.out.println("name: " +getName());

        System.out.println("addres" +getAddres());

        System.out.println("deparment" +getDeparment());

        System.out.println("lớp: " +clas);
    }

}
