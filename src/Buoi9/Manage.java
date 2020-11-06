package Buoi9;

import java.util.ArrayList;
import java.util.Scanner;

public class Manage {
    Scanner sc = new Scanner(System.in);
    ArrayList<animal>  animalLits = new ArrayList<>();
    int population = 0;

     public void enterCat(){
         String choose = null;
         while (true){
             Cat tmp = new Cat("");
             animalLits.add(tmp);
             System.out.println("continue:");
             choose = sc.nextLine();
             if(choose.equalsIgnoreCase("no")){
                 tmp.introduce();
                 tmp.makeSound();
                 System.out.println("population: "+ tmp.population);
                 break;
             }
         }
    }
}
