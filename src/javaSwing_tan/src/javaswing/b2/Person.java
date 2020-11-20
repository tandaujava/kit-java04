/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi2.javaswing.b2;

/**
 *
 * @author Dell
 */
public class Person {
    private String HoTen;
    private String DiaChi;
    private String GioiTinh;
    private String NgaySinh;

    public Person(String HoTen, String DiaChi, String GioiTinh, String NgaySinh) {
        this.HoTen = HoTen;
        this.DiaChi = DiaChi;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
    }

    public Person() {
    }
    
    public void HienThi()
    {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Persoe{" + "HoTen=" + HoTen + ", DiaChi=" + DiaChi + ", GioiTinh=" + GioiTinh + ", NgaySinh=" + NgaySinh + '}';
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
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

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }
    
    
}
