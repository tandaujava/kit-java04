package Buoi9;

public class hourly extends Right {
    private int hourlysWorked = 8;

    public hourly(String socialSecurityNember, double payRate, int hourlysWorked) {
        super(socialSecurityNember, payRate);
        this.hourlysWorked = hourlysWorked;
    }
    public double addHourlys(){
        return 3;
    }
    public double PayRate(){
    double pay = hourlysWorked * pay() + addHourlys() * pay();
    return pay;
    }
    public void showHourly(){
        System.out.println(toString());
        System.out.println("pay = " +PayRate());
    }

    @Override
    public double Pay() {
        return 30;
    }

    @Override
    public String toString() {
        return "hourly{" +
                "hourlysWorked=" + hourlysWorked +
                '}';
    }
}
