/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi2.javaswing.b4;

/**
 *
 * @author Dell
 */
public class ThiSinh {
    private String HoTen;
    private String NgaySinh;
    private String DiaChi;

    public ThiSinh() {
    }

    public ThiSinh(String HoTen, String NgaySinh, String DiaChi) {
        this.HoTen = HoTen;
        this.NgaySinh = NgaySinh;
        this.DiaChi = DiaChi;
    }
    public void NhapThonTin(){
        
    }
    public void InThonTin(){
        
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    @Override
    public String toString() {
        return "ThiSinh{" + "HoTen=" + HoTen + ", NgaySinh=" + NgaySinh + ", DiaChi=" + DiaChi + '}';
    }
     
    
}
