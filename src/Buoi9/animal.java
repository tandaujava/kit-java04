package Buoi9;

import java.util.Scanner;

public abstract class animal {
    private String name;
    public animal(String name){
        this.name = name ;
    }
    public abstract void introduce();
    public abstract void makeSound();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
