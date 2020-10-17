package lopb3.Bai1;

public class main {
    public static void main(String[] args) {
      PhanSo n1 = new PhanSo();
      PhanSo n2 = new PhanSo();
      n2.nhap();
      n1.nhap();
      n1.xuat();
      n1.CongPhanSo(n2);
      n1.HieuPhanSo(n2);
      n1.ThuongPhanSo(n2);
      n1.TịchPhanSo(n2);
      n1.nhap();
      n1.xuat2();

    }
}
