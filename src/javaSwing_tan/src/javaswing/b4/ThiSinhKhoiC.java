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
public class ThiSinhKhoiC extends ThiSinh{
    private String DiemVan;
    private String DiemSu;
    private String DiemDia;

    public ThiSinhKhoiC() {
    }

    public ThiSinhKhoiC(String DiemVan, String DiemSu, String DiemDia) {
        this.DiemVan = DiemVan;
        this.DiemSu = DiemSu;
        this.DiemDia = DiemDia;
    }
    
    public void NhapThonTIn()
    {
        
    }
    
    public void XuatThongTInThiSinhKhoiC()
    {
        System.out.println(toString());
    }

    public String getDiemVan() {
        return DiemVan;
    }

    public void setDiemVan(String DiemVan) {
        this.DiemVan = DiemVan;
    }

    public String getDiemSu() {
        return DiemSu;
    }

    public void setDiemSu(String DiemSu) {
        this.DiemSu = DiemSu;
    }

    public String getDiemDia() {
        return DiemDia;
    }

    public void setDiemDia(String DiemDia) {
        this.DiemDia = DiemDia;
    }

    @Override
    public String toString() {
        return "ThiSinhKhoiC{" + super.toString()+"DiemVan=" + DiemVan + ", DiemSu=" + DiemSu + ", DiemDia=" + DiemDia + '}';
    }
    
}
