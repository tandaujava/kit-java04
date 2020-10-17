package Buoi7.VD1.VD1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLy menu = new QuanLy();
        menu.Menu();
        LuaChon luachon = new LuaChon();
        luachon.LuaChon();
    }
}
