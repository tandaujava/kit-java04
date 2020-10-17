package Buoi7.VD1.VD1;

import java.util.Scanner;

public class SuaOngNuoc  extends NhanVien{
    private float SoGioSua;
    public void NhapSON(){
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("So gio sua: ");
        SoGioSua = sc.nextFloat();
    }
    public void XuatSON(){
        System.out.println(toString());
    }

    public double LuongSON(){
        return (SoGioSua*50000);
    }

    @Override
    public String toString() {
        return "SuaOngNuoc{" +
                super.toString()+
                "SoGioSua='" + SoGioSua + '\'' +
                "LuongSON= "+ LuongSON() +
                '}';
    }

}