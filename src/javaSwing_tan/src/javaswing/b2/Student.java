/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi2.javaswing.b2;

import javax.crypto.interfaces.PBEKey;

/**
 *
 * @author Dell
 */
public class Student extends Person{
    private String MaSinhVien;
    private String Email;
    private float DiemTongKet;

    public Student(String MaSinhVien, String Email, float DiemTongKet) {
        this.MaSinhVien = MaSinhVien;
        this.Email = Email;
        this.DiemTongKet = DiemTongKet;
    }

    public Student() {
    }
    
    public void HienThi()
    {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Student{" + super.toString()+"MaSinhVien=" + MaSinhVien + ", Email=" + Email + ", DiemTongKet=" + DiemTongKet + '}';
    }

    public String getMaSinhVien() {
        return MaSinhVien;
    }

    public void setMaSinhVien(String MaSinhVien) {
        this.MaSinhVien = MaSinhVien;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public float getDiemTongKet() {
        return DiemTongKet;
    }

    public void setDiemTongKet(float DiemTongKet) {
        this.DiemTongKet = DiemTongKet;
    }

    void setHoTen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
