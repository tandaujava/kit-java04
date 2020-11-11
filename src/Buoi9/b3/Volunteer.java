package Buoi9;

public class Volunteer extends Staffmember {
    @Override
    public double pay() {
        return 0;
    }
    public void showPayVolunteer(){
        System.out.println("pay = free = " + pay() + "d");
    }
}
