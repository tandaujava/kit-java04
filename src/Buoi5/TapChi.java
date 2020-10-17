package Buoi5;

import java.util.Scanner;

public class TapChi extends TaiLieu {
    private String NXB;
    private String SoTrang;
    private String DMXB;

    public void NhapTapChi(){
        super.NhapTaiLieu();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nam xuat ban: ");
        NXB = sc.nextLine();
        System.out.println("So trang: ");
        SoTrang = sc.nextLine();
        System.out.println("Danh muc xuat ban: ");
        DMXB = sc.nextLine();
    }

    public void XuatTapChi (){
        System.out.println(toString());
    }

    public String getNXB() {
        return NXB;
    }

    @Override
    public String toString() {
        return "TapChi{" +
                super.toString()+
                "NXB='" + NXB + '\'' +
                ", SoTrang='" + SoTrang + '\'' +
                ", DMXB='" + DMXB + '\'' +
                '}';
    }
    public void soSanh(Sach n2){
        if (this.getTenNhaXB().equalsIgnoreCase(n2.getTenNhaXB())){
            System.out.println("trung _ " + getTenNhaXB());
        }
        else{
            System.out.println("ko trung");
        }
    }
}
