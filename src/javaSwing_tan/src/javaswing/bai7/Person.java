/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi2.javaswing.bai7;

/**
 *
 * @author Dell
 */
public class Person {
    private String HoTen;
    private String NgaySinh;
    private String DiaChi;
    private String GioiTinh;

    public Person() {
    }

    public Person(String HoTen, String NgaySinh, String DiaChi, String GioiTinh) {
        this.HoTen = HoTen;
        this.NgaySinh = NgaySinh;
        this.DiaChi = DiaChi;
        this.GioiTinh = GioiTinh;
    }
    
    public void KhoiTao(){
        
    }
    public void HieThi(){
        System.out.println(toString()); 
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

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    @Override
    public String toString() {
        return "Persoe{" + "HoTen=" + HoTen + ", NgaySinh=" + NgaySinh + ", DiaChi=" + DiaChi + ", GioiTinh=" + GioiTinh + '}';
    }
    
    
}
