package BaiTapB8;

import java.util.Scanner;

public class DaGiac {
    private int  Canh;
    private int  ChuVi = 0;
    private  float DienTich;

    Scanner sc = new Scanner(System.in);
    int [] arr;

    public void Nhap(){
        System.out.println("Nhap so canh cua da giac: ");
        Canh= sc.nextInt();
        arr = new int[Canh];
        for (int i = 0; i < Canh; i++) {
            System.out.println("Canh: " + (i +1));
            arr[i] = sc.nextInt();
        }
    }
    public int ChuVi(){

        for (int i = 0; i < Canh; i++) {
            ChuVi += arr[i];
        }
        return ChuVi;
    }

    public void Xuat(){
        System.out.println("Canh cua da giac: ");
        for (int i = 0; i < Canh; i++) {
            System.out.println("Canh: " + (i +1));
            System.out.println(+ arr[i]);
        }
        System.out.println("Chu vi da giac: " +ChuVi());
    }
    public float DienTich(){
        return DienTich;
    }
}

