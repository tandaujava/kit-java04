import java.util.Scanner;

public class Bai9 {
    static  int [] [] a = new  int [ 3 ] [ 4 ];
    static Scanner sc = new  Scanner (System. in);
    public  static  void  taoMang () {
        for ( int i = 0 ; i < 3 ; i ++ ) {
            for ( int j = 0 ; j < 4 ; j ++ ) {
                System.out.printf(" a [% d] [% d] = " , i, j);
                a [i] [j] = sc . nextInt ();
            }
        }
    }
    public  static  int  kiemTra ( int  n ) {
        if (n < 2 ) {
            return  0 ;
        }
        else {
            for ( int i = 2 ; i <= ( int ) Math . sqrt (n); i ++ ) {
                if (n % i == 0 ) {
                    return  0 ;
                }
            }
            return 1 ;
        }
    }
    public  static  void   ketQua() {
        for ( int i = 0 ; i < 3 ; i ++ ) {
            for ( int j = 0 ; j < 4 ; j ++ ) {
                if (kiemTra (a [i] [j]) == 1 ) {
                    System.out.println("  " + a [i] [j]);
                }
            }
        }
    }
    public  static  void  main ( String [] args ) {
        taoMang ();
        System.out.println(" \n số nguyên tố là: ");
         ketQua();

    }
}

