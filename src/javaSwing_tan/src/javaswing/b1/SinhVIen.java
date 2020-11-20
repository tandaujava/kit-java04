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
public class SinhVIen {
    private String MaSinhVien;
    private String HoTen;
    private String NgaySInh;
    private String DiemTrungBinh;
    private String GioiTinh;

    public SinhVIen(String MaSinhVien, String HoTen, String NgaySInh, String DiemTrungBinh, String GioiTinh) {
        this.MaSinhVien = MaSinhVien;
        this.HoTen = HoTen;
        this.NgaySInh = NgaySInh;
        this.DiemTrungBinh = DiemTrungBinh;
        this.GioiTinh = GioiTinh;
    }

    SinhVIen(double HocPhi, String MSV, String HoTen, String NgaySInh, String DTB, String GioiTinh) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getMaSinhVien() {
        return MaSinhVien;
    }

    public void setMaSinhVien(String MaSinhVien) {
        this.MaSinhVien = MaSinhVien;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getNgaySInh() {
        return NgaySInh;
    }

    public void setNgaySInh(String NgaySInh) {
        this.NgaySInh = NgaySInh;
    }

    public String getDiemTrungBinh() {
        return DiemTrungBinh;
    }

    public void setDiemTrungBinh(String DiemTrungBinh) {
        this.DiemTrungBinh = DiemTrungBinh;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    @Override
    public String toString() {
        return "SinhVIen{" + "MaSinhVien=" + MaSinhVien + ", HoTen=" + HoTen + ", NgaySInh=" + NgaySInh + ", DiemTrungBinh=" + DiemTrungBinh + ", GioiTinh=" + GioiTinh + '}';
    }
   
    public void nhap(){
        
    }

    void Xuat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
