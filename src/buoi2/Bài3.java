package buoi2;

import java.util.Scanner;

public class Bài3 {
        static Scanner sc = new  Scanner (System.in);
        public  static  void  taoMang( int  a [], int  n ) {
            for (int i = 0; i < n; i++) {
                System.out.printf(" a [% d] = ", i);
                a[i] = sc.nextInt();
            }
        }

        public  static  int  kiemTraNguyeTo( int  n ) {
            if (n < 2 ) {
                return  0 ;
            }
            else {
                for ( int i = 2 ; i <= ( int ) Math . sqrt (n); i ++ )
                {
                    if (n % i == 0 ) {
                    return  0 ;
                }

                }  return 1 ;
            }
        }
        public  static  void  hienThi ( int  a [], int  n ) {
            System.out.println("so nguyen to la: ");
            for ( int i = 0 ; i < n; i ++ ) {
                if (kiemTraNguyeTo (a [i]) == 1 ) {
                    System.out.println("  " + a [i]);
                }

            }
        }


        public  static  void  main ( String [] args ) {
            int n;
            System.out.println("nhap n: ");
            n = sc . nextInt ();
            int [] a = new  int [n];
            taoMang (a, n);
            hienThi (a, n);

        }
    }

