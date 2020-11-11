package Buoi9;

public abstract class Prerson {
    private String name;
    private String addres;
    private String deparment;

    public Prerson() {
    }

    public Prerson(String name, String addres, String deparment) {
        this.name = name;
        this.addres = addres;
        this.deparment = deparment;
    }

    public abstract void input();
    public abstract void output();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getDeparment() {
        return deparment;
    }

    public void setDeparment(String deparment) {
        this.deparment = deparment;
    }
}
