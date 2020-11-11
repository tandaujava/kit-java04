package Buoi9;

public abstract class preson {
    private String name;
    private String address;

    public preson ( String name, String address){
        this.name= name ;
        this.address = address;
    }
    public abstract void display();

    public String getName(){
        return name;
    }
    public void setname(String name ){
        this.name = name ;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
