package lopb3.Bai1;

import java.util.Scanner;

public class Bai4 {
    String HoTen;
    String QueQuan;
    long NamSinh;
    String MaKhoa;

    void Nhap(){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Ho va ten: ");
        HoTen = sc.nextLine();
        System.out.println("Quen quan: ");
        QueQuan = sc.nextLine();
        System.out.println("Ma khao:");
        MaKhoa = sc.nextLine();
        System.out.println("Nam sinh:");
        NamSinh = sc.nextLong();

    }
    int  KiemTraTuoi(){
        if(NamSinh <= 1999){
            return 0;
        }else {
            return 1;
        }
    }
    void KiemTraGioiTinh(){
        if(HoTen.indexOf("Thi") < HoTen.length()&& HoTen.indexOf("Thi") > 0){
            System.out.println("Sinh Vien la nu: ");
        }else {
            System.out.println("Sinh vien la nam: ");
        }
    }
    void kiemTraKhoa(){
        if(MaKhoa.indexOf("A") == 0){
            System.out.println("Khoa an toan:");
        }if(MaKhoa.indexOf("D") == 0){
            System.out.println("Khoa dien tu vi thong:");
        }if(MaKhoa.indexOf("C") == 0){
            System.out.println("Khoa cong nghe thong tin: ");
        }
    }
    void Xuat(){
        if(KiemTraTuoi() == 0){
            System.out.println("Du 20+ : ");
        }else {
            System.out.println("Chua du 20+:");
        }
        KiemTraGioiTinh();
        kiemTraKhoa();
    }
}
