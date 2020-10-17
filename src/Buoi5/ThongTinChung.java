package Buoi5;

import java.util.Scanner;

public class ThongTinChung {
    private String HoTen;
    private int  Tuoi;
    private String GioiTinh;
    private String SDT;
    private String DiaChi;
    private int ChieuCao;
    private int CanNang;

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ho va ten: ");
        HoTen = sc.nextLine();
        System.out.println("Gioi tinh: ");
        GioiTinh = sc .nextLine();
        System.out.println("Tuoi: ");
        Tuoi = sc.nextInt();
        sc.nextLine();
        System.out.println("So dien thoai: ");
        SDT = sc.nextLine();
        System.out.println("Dia chi: ");
        DiaChi = sc.nextLine();
        System.out.println("Chieu cao: ");
        ChieuCao = sc.nextInt();
        System.out.println("Can nang: ");
        CanNang = sc.nextInt();
    }

    @Override
    public String toString() {
        return
                "HoTen='" + HoTen + '\'' +
                ", Tuoi=" + Tuoi +
                ", GioiTinh='" + GioiTinh + '\'' +
                ", SDT='" + SDT + '\'' +
                ", DiaChi='" + DiaChi + '\'' +
                ", ChieuCao=" + ChieuCao +
                ", CanNang=" + CanNang +
                '}';
    }
}
