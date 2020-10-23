package BaiTapB8;

import java.util.Scanner;

public class oto extends PhuongTien {
    private String ChoNgoi;
    private String KieuDongCo;

    public void NhapOTO(){
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Cho ngoi");
        ChoNgoi = sc.nextLine();
        System.out.println("Kieu dong co:");
        KieuDongCo = sc.nextLine();
    }
    public void XuatOTO(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "oto{" +
                super.toString()+
                "ChoNgoi='" + ChoNgoi + '\'' +
                ", KieuDongCo='" + KieuDongCo + '\'' +
                '}';
    }
}
