package BaiTapB8;

import Buoi7.VD1.VD1.NhanVien;

import java.util.Scanner;

public class PhuongTien {
    private String HSX;
    private String NSX;
    private String Gia;
    private String Mau;

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("HSX:");
        HSX = sc.nextLine();
        System.out.println("NSX");
        NSX = sc.nextLine();
        System.out.println("Gia : ");
        Gia = sc.nextLine();
        System.out.println("Mau: ");
        Mau= sc.nextLine();
    }
    public void Xuat(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "PhuongTien{" +
                "HSX='" + HSX + '\'' +
                ", NSX='" + NSX + '\'' +
                ", Gia='" + Gia + '\'' +
                ", Mau='" + Mau + '\'' +
                '}';
    }
    public void XuatOTO(){}
    public void NhapOTO(){}
    public void NhapXeMay(){}
    public void XuatXeMay(){}
    public void NHapXETAi(){}
    public void XuatXeTai(){}
}
