package Buoi8;

import java.util.Scanner;

public class Sach extends TaiLieu{
    private String TenTacGia;
    private String SoTrang;

    public void NhapSach(){
        Scanner sc = new Scanner(System.in);
        super.NhapTL();
        System.out.println("Nhap ten tac gia:");
        TenTacGia= sc.nextLine();
        System.out.println("So trang: ");
        SoTrang = sc.nextLine();
    }
    public void XuatSach(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Sach{" +
                super.toString()+
                "TenTacGia='" + TenTacGia + '\'' +
                ", SoTrang='" + SoTrang + '\'' +
                '}';
    }
}
