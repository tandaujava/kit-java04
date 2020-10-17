package lopb3.Bai1;

import java.util.Scanner;

public class Bai5 {
    String TenSanPham;
    int SoLuong;
    long GiaNhapVao;
    long GiaBanRa;
    long NgayNhap;
    long HanSuDung;

    void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ten san pham: ");
        TenSanPham = sc.nextLine();
        System.out.println("So luong:");
        SoLuong = sc.nextInt();
        System.out.println("Gia nhap vao: ");
        GiaNhapVao = sc.nextByte();
        System.out.println("Gia ban ra: ");
        GiaBanRa = sc.nextByte();
        System.out.println("Ngay thang nam nhap ( viết liền nhau): ");
        NgayNhap = sc.nextLong();
        System.out.println("Han su dung(ngay thang nam viết liền nhau): ");
        HanSuDung = sc.nextLong();
    }
    void HienThi(){
        System.out.println("Ten san pham: " + TenSanPham);
        System.out.println("So luong: "+SoLuong);
        System.out.println("Gia nhap vao: " + GiaNhapVao);
        System.out.println("Gia ban ra: " + GiaBanRa);
        //28072001
        long a = NgayNhap / 1000000;//ngay nhap
        long b = ( NgayNhap % 1000000) / 10000;//thang nhap
        long c = NgayNhap %  10000;//nam nhap
        long i = HanSuDung / 1000000;//ngay het han
        long j = (HanSuDung % 1000000) / 10000;//thang het han
        long k = HanSuDung % 10000;//nam het han
        System.out.printf("Ngay nhap: %d/%d/%d\n", a,b,c);
        System.out.printf("Han su dung: %d/%d/%d\n",i,j,k);

    }
    long TongTienHang(){
       long a;
       a = SoLuong * GiaNhapVao;
       return a;
    }
    long SoNgaySuDung(){
        long a = NgayNhap / 1000000;//ngay nhap
        long b = ( NgayNhap % 1000000) / 10000;//thang nhap
        long c = NgayNhap %  10000;//nam nhap
        long i = HanSuDung / 1000000;//ngay het han
        long j = (HanSuDung % 1000000) / 10000;//thang het han
        long k = HanSuDung % 10000;//nam het han
        long G;
        G = i - a + 30 + ( j - b - 1 )* 30 + ( k - c) * 365;
        return G;
        }
        void Xuat(){
            HienThi();
            System.out.println("Tong tien hang: "+TongTienHang()+"k");
            System.out.println("So ngay su dụng được kể từ ngày nhap: " +SoNgaySuDung());
        }
    }

