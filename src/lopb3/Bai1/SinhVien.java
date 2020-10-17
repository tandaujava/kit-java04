package lopb3.Bai1;

import java.util.Scanner;

public class SinhVien {
    String MSV;
    String TenSV;
    String QueQuan;
    float DiemToanA1;
    float DiemToanA3;
    float DiemNguyeLy1;
    void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ten sv: ");
        TenSV = sc.nextLine();
        System.out.println("Ma SV: ");
        MSV= sc.nextLine();
        System.out.println("Que Quan: ");
        QueQuan = sc.nextLine();
        System.out.println(" Diem a1: ");
        DiemToanA1 =sc.nextByte();
        System.out.println("Diem a3: ");
        DiemToanA3= sc.nextByte();
        System.out.println("Diem nguyen ly 1: ");
        DiemNguyeLy1 = sc.nextByte();
    }
    float TrungBinh(){
        float tb ;
        tb = (DiemNguyeLy1 + DiemToanA3 + DiemToanA1) / 3;
        return tb;
    }
    int KiemTra(){
        int a = 0;
        if( DiemToanA1 < 4){
            a++;
        }
            if(DiemToanA3<4){
                a++;
            }
                if(DiemNguyeLy1 < 4){
                    a++;
                }
        return a;
    }
    int SoTien(){
        int st ;
        st = 90 * KiemTra();
        return st;
    }


    void Xuat(){
        System.out.println("Diem trung binh: " + TrungBinh());
        System.out.println("So tien thi lai la: " + SoTien()+"k");
    }

}
