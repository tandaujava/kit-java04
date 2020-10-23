package BaiTapB8;

import java.util.Scanner;

public class TamGiac extends DaGiac {
    private float DienTich;
    Scanner sc = new Scanner(System.in);

    public void NhapTG(){
        super.Nhap();
    }
    public float DienTichTG (){
        float a1, a2, a3;
        a1 = arr[0];
        a2 = arr[1];
        a3 = arr[2];
        float p;
        p =( a1 + a2 + a3) / 2;
        float S;
        S = (float)Math.sqrt(p *(p-a1)*(p-a2)*(p-a3));
            return S;
        }
        public void XuatTG(){
        super.Xuat();
            System.out.println("Dien tich tam giac: " +DienTichTG());
        }

    public float getDienTich() {
        return DienTich;
    }

    public void setDienTich(float dienTich) {
        DienTich = dienTich;
    }
}

