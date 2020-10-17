package Buoi8;

import java.util.Scanner;

public class BAo extends TaiLieu{
    private String NgayPhatHanh;

    public void NHapBAo(){
        Scanner sc = new Scanner(System.in);
        super.NhapTL();
        System.out.println("Ngay phat hanh:");
        NgayPhatHanh = sc.nextLine();
    }
    public void XuatBAo(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "BAo{" +
                super.toString()+
                "NgayPhatHanh='" + NgayPhatHanh + '\'' +
                '}';
    }
}
