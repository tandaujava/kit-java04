package Buoi7.VD1.VD1;

import java.util.Scanner;

public class NhanVien {
    private  String HoTen;
    private  int Tuoi;
    private  String GioiTinh;
    private  String SDT;
    private  String DiaCHi;
    private  int ChieuCao;
    private  float CanNang;

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ho ten: ");
        HoTen = sc.nextLine();
        System.out.println("Tuoi: ");
        Tuoi = sc.nextInt();
        sc.nextLine();
        System.out.println("Gioi tinh:");
        GioiTinh = sc.nextLine();
        System.out.println("So dien thoai: ");
        SDT = sc.nextLine();
        System.out.println("Dia chi: ");
        DiaCHi = sc.nextLine();
        System.out.println("Chieu cao: ");
        ChieuCao = sc.nextInt();
        System.out.println("Can nang: ");
        CanNang = sc.nextFloat();
    }
        public void Xuat(){
        System.out.println(toString());
    }
    public void NhapSON(){
    }
    public void XuatSON(){
    }
    public void NhapGiaoHang(){
    }
    public void XuatGiaoHang(){
    }
    public void NhapXeOm(){
    }
    public void XuatXeOm(){
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "HoTen='" + HoTen + '\'' +
                ", Tuoi=" + Tuoi +
                ", GioiTinh='" + GioiTinh + '\'' +
                ", SDT='" + SDT + '\'' +
                ", DiaCHi='" + DiaCHi + '\'' +
                ", ChieuCao=" + ChieuCao +
                ", CanNang=" + CanNang +
                '}';
    }
}
