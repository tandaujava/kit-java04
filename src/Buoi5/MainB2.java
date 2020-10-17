package Buoi5;

public class MainB2 {
    public static void main(String[] args) {
        SuaOngNuoc s2 = new SuaOngNuoc();
        NhanVienGiaoHang s3 = new NhanVienGiaoHang();
        XeOm s1 = new XeOm();
        System.out.println("Tho sua ong nuoc: ");
        s2.NhapSON();
        s2.XuatSON();
        System.out.println("Nhan vien giao hang: ");
        s3.NhapNVGH();
        s3.XuatNVGH();
        System.out.println("Nhan vien xe om: ");
        s1.NhapXeOm();
        s1.XuatXeOm();
    }
}
