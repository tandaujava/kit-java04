package buoi2;
/*Sử dụng mảng 1 chiều nhập vào dãy số nguyên gồm n phần tử.
 In ra màn hình mảng các phần tử là số nguyên tố.*/

import java.util.Scanner;

public class Bai3 {
    static void taoMang(int [] a, int n){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d]= ", i);
            a[i] = sc.nextInt();
        }
    }
    static int kiemTraNguyeTo( int n){
        if( n < 2){
            return 0;
        }else{
            for (int i = 2 ; i <=  Math.sqrt(n); i++) {
                if( n % i  == 0){
                    return 0;
                }
                }return 1;
            }
        }
    static void hienThi(int []a, int n){
        System.out.println("so nguyen to: ");
        for (int i = 0; i < n; i++) {
            if( kiemTraNguyeTo(a[i]) == 1){
                System.out.println(""+ a[i]);
            }
        }
    }

    public static void main(String[] args) {
        int n;
        System.out.println("nhap n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int []a = new int [n];
        taoMang(a, n);
        hienThi(a,n);
    }
}
