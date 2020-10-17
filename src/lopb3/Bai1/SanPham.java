package lopb3.Bai1;

import java.util.Scanner;

public class SanPham {
    String MaSp;
    String TenSp;
    float GiaMuaVao;
    float GiaBanRa;
    int SoLuong;
    void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ma SP: ");
        MaSp = sc.nextLine();
        System.out.println("Ten SP: ");
        TenSp = sc.nextLine();
        System.out.println("Gia mua vao: ");
        GiaMuaVao = sc.nextByte();
        System.out.println("Gia ban ra: ");
        GiaBanRa = sc.nextByte();
        System.out.println("So luong: ");
        SoLuong = sc.nextInt();
    }
    float BanHet(){
        float tienLai;
        tienLai = ( GiaBanRa - GiaMuaVao) * SoLuong;
        return tienLai;
    }
    float BanKoHet(){
        float tienThuVe;
        tienThuVe = ( GiaBanRa * 2/3 - GiaMuaVao) * SoLuong;
        return tienThuVe;
    }
    void Xuat(){
        System.out.println("Neu ban het so tien lai la: " +BanHet());
        System.out.println("Neu ban đc 2/3");
        if( GiaMuaVao * SoLuong < GiaBanRa* 2/3 * SoLuong){
            System.out.println("lai: "  +BanKoHet());
        }
        if(GiaMuaVao * SoLuong > GiaBanRa* 2/3 * SoLuong){
            System.out.println("lo: " +BanKoHet());
        }
        if(GiaMuaVao * SoLuong == GiaBanRa* 2/3 * SoLuong){
            System.out.println(" ko lai ko lo:");
        }
    }
}
