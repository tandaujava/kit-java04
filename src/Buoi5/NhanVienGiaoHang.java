package Buoi5;
import java.util.Scanner;
public class NhanVienGiaoHang extends ThongTinChung{
    private int SoHangGiao;
    public void NhapNVGH(){
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("So hang giao: ");
        SoHangGiao = sc.nextInt();
    }
    public int LuongNhanVienGiaoHang(){
        return (SoHangGiao * 33500);
    }
    public void XuatNVGH(){
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "NhanVienGiaoHang{" +
                super.toString() +
                "SoHangGiao=" + SoHangGiao +
                "Tien luong=" + LuongNhanVienGiaoHang() +
                '}';
    }
}
