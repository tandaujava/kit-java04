package buoi2;

import java.util.Scanner;

/* Nhập và mảng A, B là mảng 2 chiều. Các phân tử trong mảng là các số nguyên. Tính A x B.*/
public class bai11 {
    static void taoMangA(int [][]a, int n, int m){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("a[%d][%d]= ", i,j);
                a[i][j]= sc.nextInt();
            }
        }
    }
    static void taoMangB(int [][]b, int c, int d){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < d; j++) {
                System.out.printf("b[%d][%d]= ", i,j);
                b[i][j]= sc.nextInt();
            }
        }
    }
    static void hienThiMangA(int [][]a, int n,int m){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("\t%d\t", a[i][j]);
            }
            System.out.println("\n");
        }
    }
    static void hienThiMangB(int [][]b, int c,int d){
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < d; j++) {
                System.out.printf("\t%d\t", b[i][j]);
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        int n;
        int m;
        int c;
        int d;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n: ");
        n= sc.nextInt();
        System.out.println("nhap m: ");
        m = sc.nextInt();
        System.out.println("nhap c: ");
        c=sc.nextByte();
        System.out.println("nhap d: ");
        d = sc.nextInt();
        int [][]a = new int[n][m];
        int [][]b = new int[c][d];
        taoMangA(a, n, m);
        hienThiMangA(a,n,m);
        taoMangB(b,c,d);
        hienThiMangB(b,c,d);
    }
}
