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
public class SinhVienHTTT extends SinhVIen 
{
    private double HocPhi;

    public SinhVienHTTT(double HocPhi, String MaSinhVien, String HoTen, String NgaySInh, String DiemTrungBinh, String GioiTinh) {
        super(MaSinhVien, HoTen, NgaySInh, DiemTrungBinh, GioiTinh);
        this.HocPhi = HocPhi;
    }

    SinhVienHTTT() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void SinhVienHTTT(){
        
    }
    public double getHocPhi() {
        return HocPhi;
    }

    public void setHocPhi(double HocPhi) {
        this.HocPhi = HocPhi;
    }

    @Override
    public String toString() {
        return "SinhVienHTTT{" + super.toString() + "HocPhi=" + HocPhi + '}';
    }
   public void Xuat(){
       System.out.println(toString());
   }
    
}
