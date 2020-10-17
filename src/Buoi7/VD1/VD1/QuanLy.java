package Buoi7.VD1.VD1;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    private ArrayList<NhanVien> arr = new ArrayList<>();
    public void Menu(){

        System.out.printf("-----------------MENU----------------\n");
        System.out.println("1.Nhap tho sua ong nuoc: ");
        System.out.println("2.Xuat tho sua ong nuoc:");
        System.out.println("3.Nhap nhan vien giao hang:");
        System.out.println("4.Xuat nhan vien giao hang: ");
        System.out.println("5.Nhap xe om: ");
        System.out.println("6.Xuat xe om: ");
        System.out.println(". exit");
        System.out.println(">>>>>>>>>>>Lua chon<<<<<<<<<<<<<");

    }
    public void NhapNVON(){
        Scanner sc = new Scanner(System.in);
        System.out.println("So tho sua ong nuoc: ");
        int n;
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Tho sua ong nuoc thu: " + (i+1));
            NhanVien tmp = new SuaOngNuoc();
            tmp.NhapSON();
            arr.add(tmp);
        }
    }
    public void XuatNVON(){
        System.out.println("Tho sua ong nuoc: ");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println((1 + i)+".");
            arr.get(i).XuatSON();
        }
    }
    public void NhapGiaoHang(){
        Scanner sc = new Scanner(System.in);
        System.out.println("So nhan vien giao hang: ");
        int n;
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("NV giao hang thu: " + (i+1));
            NhanVien tmp = new GiaoHang();
            tmp.NhapGiaoHang();
            arr.add(tmp);
        }
    }
    public void XuatGiaoHang(){
        System.out.println("NV Giao Hang: ");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println((1 + i)+".");
            arr.get(i).XuatGiaoHang();
        }
    }
    public void NhapXeOm(){
        Scanner sc = new Scanner(System.in);
        System.out.println("So km: ");
        int n;
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("NV xe om thu: " + (i+1));
            NhanVien tmp = new XeOm ();
            tmp.NhapXeOm();
            arr.add(tmp);
        }
    }
    public void XuatXeOM(){
        System.out.println("NV xe om:");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println((1 + i)+".");
            arr.get(i).XuatXeOm();
        }
    }

}
