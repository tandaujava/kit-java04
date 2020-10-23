package BaiTapB8;

import java.util.ArrayList;
import java.util.Scanner;

public class QLPTGT {
    Scanner sc = new Scanner(System.in);
    ArrayList<PhuongTien> DanhSachPT = new ArrayList<>();
    public void Menu(){
        System.out.println("-----------------MENU-------------------");
        System.out.println("1, Dang ky oto:");
        System.out.println("2, Dang ky xe may:");
        System.out.println("3, Dang ky xe tai:");
        System.out.println("4, Mau pt can tim:");
        System.out.println("5, EXIT:");
        System.out.println("Chon de:");
    }
    public QLPTGT(){
    }
    public void NhapOTO(){
        System.out.println("Nhap so o to:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap o to thu " + ( i + 1));
            PhuongTien tmp = new oto();
            tmp.NhapOTO();
            DanhSachPT.add(tmp);
        }
    }
    public void XuatOto(){
        System.out.println("oto");
        for (int i = 0; i < DanhSachPT.size(); i++) {
            System.out.println("."+(i+1));
            DanhSachPT.get(i).XuatOTO();
        }
    }
    public void NhapXEMAY(){
        System.out.println("Nhap so xe may:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap xe may thu " + ( i + 1));
            PhuongTien tmp = new Xemay();
            tmp.NhapXeMay();
            DanhSachPT.add(tmp);
        }
    }
    public void XuatXeMAy(){
        System.out.println("xe may");
        for (int i = 0; i < DanhSachPT.size(); i++) {
            System.out.println("."+(i+1));
            DanhSachPT.get(i).XuatXeMay();
        }
    }public void NhapXETai(){
        System.out.println("Nhap so xe tai:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap xe tai thu " + ( i + 1));
            PhuongTien tmp = new XeTai();
            tmp.NHapXETAi();
            DanhSachPT.add(tmp);
        }
    }
    public void XuatXeTai(){
        System.out.println("xe tai");
        for (int i = 0; i < DanhSachPT.size(); i++) {
            System.out.println("."+(i+1));
            DanhSachPT.get(i).XuatXeTai();
        }
    }

    public void MAu(){

    }
}

