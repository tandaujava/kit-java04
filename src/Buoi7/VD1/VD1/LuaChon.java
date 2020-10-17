package Buoi7.VD1.VD1;

import java.util.Scanner;

public class LuaChon {
    public void LuaChon(){
        Scanner sc = new Scanner(System.in);
        int chon;
        QuanLy menu = new QuanLy();
        while(true){
            menu.Menu();
            chon = sc.nextInt();
            switch (chon){
                case 1: menu.NhapNVON(); break;
                case 2: menu.XuatNVON(); break;
                case 3: menu.NhapGiaoHang(); break;
                case 4: menu.XuatGiaoHang(); break;
                case 5: menu.NhapXeOm(); break;
                case 6: menu.XuatXeOM(); break;
                case 7: return;
                default:
                    System.out.println("Chon lại");

            }
        }
    }
}
