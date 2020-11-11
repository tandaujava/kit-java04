package Buoi9;

public abstract class Right extends Staffmember{
    private String socialSecurityNember;
    private double payRate = 500;

    public Right(String socialSecurityNember, double payRate) {
        this.socialSecurityNember = socialSecurityNember;
        this.payRate = payRate;
    }

    public Right() {
        super();
        this.socialSecurityNember = socialSecurityNember;
        this.payRate = payRate;
    }
    public void showRight(){
        System.out.println(toString());
    }

    public abstract double Pay();

    public String getSocialSecurityNember() {
        return socialSecurityNember;
    }

    public void setSocialSecurityNember(String socialSecurityNember) {
        this.socialSecurityNember = socialSecurityNember;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    @Override
    public double pay() {
        return payRate;
    }

    @Override
    public String toString() {
        return "Right{" +
                "socialSecurityNember='" + socialSecurityNember + '\'' +
                ", payRate=" + payRate +
                '}';
    }
}
