package Buoi5;

import java.util.Scanner;

public class SuaOngNuoc extends ThongTinChung {
    private int SoGioSua;
    public void NhapSON(){
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("So gio sua la: ");
        SoGioSua = sc.nextInt();
    }
    public int TienLuong(){
        return (SoGioSua * 50000);
    }
    public void XuatSON(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "SuaOngNuoc{" +
                super.toString() +
                "SoGioSua=" + SoGioSua +
                ", TienLuong=" + TienLuong() +
                '}';
    }
}
