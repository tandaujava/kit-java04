package BaiTapB8;

import java.util.Scanner;

public class XeTai extends  PhuongTien{
    private String TroTai;

    public void NHapXETAi(){
        Scanner sc = new Scanner(System.in);
        super.Nhap();
        System.out.println("Trong tai");
        TroTai = sc .nextLine();
    }
    public void XuatXeTai(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "XeTai{" +
                super.toString()+
                "TroTai='" + TroTai + '\'' +
                '}';
    }
}
