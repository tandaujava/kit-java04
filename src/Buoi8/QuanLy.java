package Buoi8;

import java.util.Scanner;

public class QuanLy {
    TaiLieu s1 = new BAo();
    TaiLieu s2 = new Sach();
    TaiLieu s3 = new TapChi();

    public void menu(){
        System.out.println("---------------MENU---------------");
        System.out.println("1.NHap thong tin tat ca:");
        System.out.println("2.Xuat thong tin tat ca:");
        System.out.println("3.Xuat man hinh theo loai:");
        System.out.println(">>>>>>>>>>>>>>>LUA CHON<<<<<<<<<<<<<<<<<<");
    }
    public void Chon(){
        Scanner sc = new Scanner(System.in);
        int chon = sc.nextInt();
        while (true) {
            switch (chon) {
                case 1:
                    s1.NHapBAo();
                    s2.NhapSach();
                    s3.NHapTAPCHI();
                    break;
                case 2:
                    s1.XuatBAo();
                    s2.XuatSach();
                    s3.XuatTapChi();
                    break;
                case 3:
                    System.out.println(" Tap chi:");
                    s3.XuatTapChi();
                    System.out.println("Sach: ");
                    s2.XuatSach();
                    System.out.println("Bao: ");
                    s1.XuatBAo();
                    break;
            }
        }
    }
}
