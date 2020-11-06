package Buoi9;

import java.util.ArrayList;
import java.util.Scanner;

public class Class {
    Scanner sc = new Scanner(System.in);
    ArrayList<Prerson> studentLits = new ArrayList<>();

    public Class() {
    }

    public void inputStudent(){
        System.out.println("so lớp: ");
        int clas = sc.nextInt();
        for (int i = 0; i < clas; i++) {
            System.out.println("Advisor: ");
            Prerson gv = new Teacher("","","","");
            gv.input();
            System.out.println(" số sv: ");
            int sv = sc.nextInt();
            studentLits.add(gv);
            for (int j = 0; j < sv; j++) {
                Prerson student = new student("","","","");
                        student.input();
                        studentLits.add(student);
            }
        }
    }
    public void outputStudent(){
        for(Prerson tmp: studentLits){
            tmp.output();
        }
    }
}
