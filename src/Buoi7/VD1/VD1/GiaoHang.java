package Buoi7.VD1.VD1;

import java.util.Scanner;

public class GiaoHang extends NhanVien{
    private float SoHangGiao;

    public void NhapGiaoHang(){
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("So hang giao: ");
        SoHangGiao = sc.nextFloat();
    }
    public void XuatGiaoHang(){
        System.out.println(toString());
    }

    public double LuongGH(){
        return (SoHangGiao*33500);
    }

    @Override
    public String toString() {
        return "GiaoHang{" +
                super.toString()+
                "SoHangGiao='" + SoHangGiao + '\'' +
                "LuongGiaoHang" + LuongGH()+
                '}';
    }
}

