/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi2.javaswing.bai5;

/**
 *
 * @author Dell
 */
public class GiangVien {
    private String HoTEn;
    private String MaGiangVien;
    private String DiaChi;
    private String GioiTinh;
    private String Khoa;

    public GiangVien() {
    }

    public GiangVien(String HoTEn, String MaGiangVien, String DiaChi, String GioiTinh, String Khoa) {
        this.HoTEn = HoTEn;
        this.MaGiangVien = MaGiangVien;
        this.DiaChi = DiaChi;
        this.GioiTinh = GioiTinh;
        this.Khoa = Khoa;
    }
    public void Nhap(){
        
    }
     public void Xuat()
     {
         System.out.println(toString());    
     }

    public String getHoTEn() {
        return HoTEn;
    }

    public void setHoTEn(String HoTEn) {
        this.HoTEn = HoTEn;
    }

    public String getMaGiangVien() {
        return MaGiangVien;
    }

    public void setMaGiangVien(String MaGiangVien) {
        this.MaGiangVien = MaGiangVien;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getKhoa() {
        return Khoa;
    }

    public void setKhoa(String Khoa) {
        this.Khoa = Khoa;
    }

    @Override
    public String toString() {
        return "GiangVien{" + "HoTEn=" + HoTEn + ", MaGiangVien=" + MaGiangVien + ", DiaChi=" + DiaChi + ", GioiTinh=" + GioiTinh + ", Khoa=" + Khoa + '}';
    }
     
    
    
}
