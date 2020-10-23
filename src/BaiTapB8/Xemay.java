package BaiTapB8;

import java.util.Scanner;

public class Xemay extends PhuongTien{
    private String CongSuat;

    public void NhapXeMay(){
        Scanner sc = new Scanner(System.in);
        super.Nhap();
        System.out.println("Cong suat");
        CongSuat = sc.nextLine();

    }
    public void XuatXeMay(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Xemay{" +
                super.toString()+
                "CongSuat='" + CongSuat + '\'' +
                '}';
    }
}
