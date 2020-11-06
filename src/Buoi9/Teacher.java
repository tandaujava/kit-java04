package Buoi9;

import java.util.Scanner;

public class Teacher extends Prerson{
    Scanner sc = new Scanner(System.in);
    private String rank;

    public Teacher(String name, String addres, String deparment, String rank) {
        super(name, addres, deparment);
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public void input() {
        System.out.println("name:");
        String name = sc.nextLine();

        System.out.println("addres: ");
        String addres = sc.nextLine();

        System.out.println("deparment");
        String deparment = sc.nextLine();

        System.out.println("rank: ");
        rank = sc.nextLine();
    }

    @Override
    public void output() {
        System.out.println("name: " +getName());
        System.out.println("addres: " +getAddres());
        System.out.println("deparment: " +getDeparment());
        System.out.println("rank: " +rank);
    }
}
