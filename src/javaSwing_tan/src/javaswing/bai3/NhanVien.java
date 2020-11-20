/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi2.javaswing.bai3;

/**
 *
 * @author Dell
 */
public class NhanVien extends Person{
     String PhongBan;
     float HeSoLuong;
     float ThamNien;
     float LuongcoBAn;

    public NhanVien() {
    }

    public NhanVien(String PhongBan, float HeSoLuong, float ThamNien, float LuongcoBAn) {
        this.PhongBan = PhongBan;
        this.HeSoLuong = HeSoLuong;
        this.ThamNien = ThamNien;
        this.LuongcoBAn = LuongcoBAn;
    }
    

   
   public float LuongTHuc(){
        float luong;
        luong = Float.valueOf(LuongcoBAn * HeSoLuong * ( 1 + ThamNien / 100));
        return  luong;
   }
   
   public void KHoiTao(){
       
   }
   
   public void HienThi()
   {
       System.out.println(toString());
   }

    public String getPhongBan() {
        return PhongBan;
    }

    public void setPhongBan(String PhongBan) {
        this.PhongBan = PhongBan;
    }

    public float getHeSoLuong() {
        return HeSoLuong;
    }

    public void setHeSoLuong(float HeSoLuong) {
        this.HeSoLuong = HeSoLuong;
    }

    public float getThamNien() {
        return ThamNien;
    }

    public void setThamNien(float ThamNien) {
        this.ThamNien = ThamNien;
    }

    public float getLuongcoBAn() {
        return LuongcoBAn;
    }

    public void setLuongcoBAn(float LuongcoBAn) {
        this.LuongcoBAn = LuongcoBAn;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "PhongBan=" + PhongBan + ", HeSoLuong=" + HeSoLuong
                + ", ThamNien=" + ThamNien + ", LuongcoBAn=" + LuongcoBAn + '}';
    }
   
   

    
}
