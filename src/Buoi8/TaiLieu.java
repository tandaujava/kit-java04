package Buoi8;

import java.util.Scanner;

public class TaiLieu {
    private String MTL;
    private String TNXB;
    private String SPH;

    public void NhapTL(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma tai lieu:");
        MTL=sc.nextLine();
        System.out.println("Nhap ten nha xuat ban: ");
        TNXB = sc.nextLine();
        System.out.println("Nhap so phat hanh: ");
        SPH = sc.nextLine();
    }
    public void XuatTL(){
        System.out.println(toString());
    }
    public void NhapSach(){}
    public  void XuatSach(){}
    public  void NHapTAPCHI(){}
    public  void XuatTapChi(){}
    public  void NHapBAo(){}
    public  void XuatBAo(){}

    @Override
    public String toString() {
        return "TaiLieu{" +
                "MTL='" + MTL + '\'' +
                ", TNXB='" + TNXB + '\'' +
                ", SPH='" + SPH + '\'' +
                '}';
    }
}
