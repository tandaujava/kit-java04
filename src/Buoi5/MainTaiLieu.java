package Buoi5;

public class MainTaiLieu {
    public static void main(String[] args) {
       Sach n2 = new Sach();
       TapChi n3 = new TapChi();
       n2.NhapSach();
       n2.XuatSach();
       n3.NhapTapChi();
       n3.XuatTapChi();
       n3.soSanh(n2);
       n2.soSanh(n3);
    }
}
