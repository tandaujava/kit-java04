package Buoi9;

import org.w3c.dom.ls.LSOutput;

public class executive extends Right{
    private double bonus = 0;

    public executive(String socialSecurityNember, double payRate, double bonus) {
        super(socialSecurityNember, payRate);
        this.bonus = bonus;
    }
    public double awaardBonus(){
        return 0;
    }
    public void showExecutive(){
        System.out.println(toString());
        System.out.println("award bonus " +awaardBonus()+ " d");
        System.out.println("pay " + pay() +"d");
    }

    @Override
    public double Pay() {
        return 50 ;
    }

    @Override
    public String toString() {
        return "executive{" +
                "bonus=" + bonus +
                '}';
    }
}

