/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi2.javaswing.b1;

/**
 *
 * @author Dell
 */
public class SinhVienMatMa extends SinhVIen{
    private String DonVi;
    private int Luong;

    public SinhVienMatMa(String DonVi, int Luong, String MaSinhVien, String HoTen, String NgaySInh, String DiemTrungBinh, String GioiTinh) {
        super(MaSinhVien, HoTen, NgaySInh, DiemTrungBinh, GioiTinh);
        this.DonVi = DonVi;
        this.Luong = Luong;
    }

    SinhVienMatMa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void SinhVienMatMa(){
        
    }

    public String getDonVi() {
        return DonVi;
    }

    public void setDonVi(String DonVi) {
        this.DonVi = DonVi;
    }

    public int getLuong() {
        return Luong;
    }

    public void setLuong(int Luong) {
        this.Luong = Luong;
    }

    @Override
    public String toString() {
        return "SinhVienMatMa{" + super.toString()+ "DonVi=" + DonVi + ", Luong=" + Luong + '}';
    }
    public void Xuat(){
        System.out.println(toString());
    }
    
}
