package Buoi5;

import java.util.Scanner;

public class XeOm extends ThongTinChung {
    private int Sokm;
    public void NhapXeOm(){
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so km: ");
        Sokm = sc.nextInt();
    }
    public int LuongXeOm(){
        return (Sokm * 10000);
    }
    public void XuatXeOm(){
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "XeOm{" +
                super.toString()+
                "Sokm=" + Sokm +
                "Tien luong la: " + LuongXeOm()+
                '}';
    }
}
