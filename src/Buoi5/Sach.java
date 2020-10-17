package Buoi5;

import java.util.Scanner;

public class Sach extends TaiLieu{
    private String SoTrang;
    private String NXB;
    private String LanTaiBan;
    private String TenTacGia;

    public void NhapSach(){
        super.NhapTaiLieu();
        Scanner sc = new Scanner(System.in);
        System.out.println("So trang: ");
        SoTrang = sc.nextLine();
        System.out.println("Nam xuat ban: ");
        NXB = sc.nextLine();
        System.out.println("Ten tac gia: ");
        TenTacGia = sc.nextLine();
    }
    public void XuatSach() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Sach{" +
                super.toString()+
                "SoTrang='" + SoTrang + '\'' +
                ", NXB='" + NXB + '\'' +
                ", LanTaiBan='" + LanTaiBan + '\'' +
                ", TenTacGia='" + TenTacGia + '\'' +
                '}';
    }

    public String getNXB() {
        return NXB;
    }

    public void soSanh(TapChi n3){
        if(this.NXB.equalsIgnoreCase(n3.getNXB())){
            System.out.println("cung mot nam " + NXB);
        }else{
            System.out.println("khòn trung nam xuat ban");
        }
    }
}
