package lopb3.Bai1;

import java.util.Scanner;

public class PhanSo{
    int tuSo;
    int mauSo;
    void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tu so: ");
        tuSo = sc.nextInt();
        System.out.println("Nhap mau so: ");
        mauSo = sc.nextInt();
    }
    void CongPhanSo(PhanSo ps){
        PhanSo cong = new PhanSo();
        cong. tuSo = this.tuSo* ps.mauSo + ps.tuSo * this.mauSo;
        cong.mauSo = this.mauSo * ps.mauSo;
        cong.uocCLN();
        System.out.println("tong:");
        cong.xuat();
    }
    void HieuPhanSo(PhanSo ps){
        PhanSo hieu = new PhanSo();
        hieu . tuSo = this. tuSo * ps.mauSo - ps.tuSo * this.mauSo;
        hieu.mauSo = this.mauSo * ps.mauSo;
        hieu.uocCLN();
        System.out.println("Hieu: ");
        hieu.xuat();
    }
    void ThuongPhanSo(PhanSo ps){
        PhanSo thuong = new PhanSo();
        thuong . tuSo = this.tuSo * ps.mauSo;
        thuong.mauSo = this.mauSo * ps.tuSo;
        thuong.uocCLN();
        System.out.println("Thuong: ");
        thuong.xuat();
    }
    void TịchPhanSo(PhanSo ps){
        PhanSo tich = new PhanSo();
        tich .tuSo = this.tuSo * ps.tuSo;
        tich .mauSo = this.mauSo * ps.mauSo;
        tich .uocCLN();
        System.out.println("Tich: ");
        tich.xuat();
    }
    int uocCLN(){
        int a = 1;
        for (int i = 1; i < tuSo * mauSo; i++) {
            if( tuSo % i ==0 && mauSo % i == 0){
                a = i;
            }
        }
        return a;
    }
    float ThapPhan(){
        float n;
        n = tuSo / mauSo;
        return n;
    }
    void xuat(){
        System.out.printf("%d/%d\n ", tuSo, mauSo);
        System.out.printf(" phan so rut gon: %d/%d\n ",tuSo/uocCLN(), mauSo/uocCLN() );
    }
    void xuat2(){
        System.out.printf("phan so: %d/%d\n", tuSo, mauSo);
        System.out.printf("phan so rut gon: %d/%d\n ", tuSo/uocCLN(), mauSo/uocCLN());
        System.out.printf("thap phan= %f", ThapPhan());
    }
}
