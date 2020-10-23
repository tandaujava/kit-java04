package BaiTapB8;

import java.util.Scanner;

public class chon {
    Scanner sc = new Scanner(System.in);
    QLPTGT n = new QLPTGT();
    public void chon(){
        int chon = sc.nextInt();
        switch (chon){
            case 1: n.NhapOTO();n.XuatOto(); break;
            case 2: n.NhapXEMAY();n.XuatXeMAy();break;
            case 3: n.NhapXETai();n.XuatXeTai();break;
            case 4: break;
            case 5: return;


            default: System.out.println("chon lai");
        }
    }
}
