package Buoi7.VD1.VD1;

import java.util.Scanner;

public class XeOm extends NhanVien{
    private float SoKM;

    public void NhapXeOm(){
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("So km: ");
        SoKM = sc.nextFloat();
    }
    public void XuatXeOm(){
        System.out.println(toString());
    }
    public double LuongXO(){
        return (SoKM * 10000);
    }

    @Override
    public String toString() {
        return "XeOm{" +
                super.toString()+
                "SoKM='" + SoKM + '\'' +
                "LuongXO"+ LuongXO()+
                '}';
    }
}
