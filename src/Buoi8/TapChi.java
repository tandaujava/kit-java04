package Buoi8;

import java.util.Scanner;

public class TapChi extends TaiLieu{
    private String SoPhatHanh;
    private  String ThangPhatHanh;

    public void NHapTAPCHI(){
        Scanner sc = new Scanner(System.in);
        super.NhapTL();
        System.out.println("So phat hanh:");
        SoPhatHanh = sc.nextLine();
        System.out.println("Thang phat hanh: ");
        ThangPhatHanh = sc.nextLine();
    }
    public void XuatTapChi(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "TapChi{" +
                super.toString()+
                "SoPhatHanh='" + SoPhatHanh + '\'' +
                ", ThangPhatHanh='" + ThangPhatHanh + '\'' +
                '}';
    }
}
