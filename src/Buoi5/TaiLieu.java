package Buoi5;

import java.util.Scanner;

public class TaiLieu {
    private String MaTaiLieu;
    private String TenTaiLieu;
    private String TenNhaXB;

   public void NhapTaiLieu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ma tai lieu la: ");
        MaTaiLieu = sc .nextLine();
        System.out.println("Ten tai lieu: ");
        TenTaiLieu = sc.nextLine();
        System.out.println("Ten nha xuat ban: ");
        TenNhaXB = sc.nextLine();
    }

    public String getTenNhaXB() {
        return TenNhaXB;
    }

    @Override
    public String toString() {
        return "TaiLieu{" +
                "MaTaiLieu='" + MaTaiLieu + '\'' +
                ", TenTaiLieu='" + TenTaiLieu + '\'' +
                ", TenNhaXB='" + TenNhaXB + '\'' +
                '}';
    }
}
