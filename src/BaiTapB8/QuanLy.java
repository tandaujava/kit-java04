package BaiTapB8;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    public QuanLy(){
    }
    Scanner sc = new Scanner(System.in);
    ArrayList<DaGiac> TamGiac = new ArrayList<>();

    public void NhapSoTamGiac(){
        int n;
        System.out.println("So Tam Giac: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            TamGiac tmp = new TamGiac();
            tmp.NhapTG();
            TamGiac.add(tmp);
        }
    }
    public void Xuattg(){
        int i = 0;
        for(DaGiac a : TamGiac){
            System.out.println("Tam giac:  " + ++i);
            a.Xuat();
        }
    }
    public void SMAX(){
        for (int i = 0; i < TamGiac.size() - 1; i++) {
            for (int j = 1; j < TamGiac.size(); j++) {
                if(TamGiac.get(i).DienTich()< TamGiac.get(j).DienTich()){
                    DaGiac tmp;
                    tmp = TamGiac.get(i);
                    TamGiac.set(i, TamGiac.get(j));
                    TamGiac.set(j, tmp);
                }
            }
        }
        }
        public void CanhSmax(){
        for(DaGiac tmp:TamGiac){
            TamGiac.get(0).Xuat();
        }
    }
}
