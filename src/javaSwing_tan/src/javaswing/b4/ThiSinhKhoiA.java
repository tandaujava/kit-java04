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
public class ThiSinhKhoiA extends ThiSinh{
    private String DiemToan;
    private String DiemLy;
    private String DiemHoa;

    public ThiSinhKhoiA() {
    }

    public ThiSinhKhoiA(String DiemToan, String DiemLy, String DiemHoa) {
        this.DiemToan = DiemToan;
        this.DiemLy = DiemLy;
        this.DiemHoa = DiemHoa;
    }
    public void NhapThonTin(){
        
    }
    public void HienThiThongTinKhoiA()
    {
        System.out.println(toString());    
    }

    public String getDiemToan() {
        return DiemToan;
    }

    public void setDiemToan(String DiemToan) {
        this.DiemToan = DiemToan;
    }

    public String getDiemLy() {
        return DiemLy;
    }

    public void setDiemLy(String DiemLy) {
        this.DiemLy = DiemLy;
    }

    public String getDiemHoa() {
        return DiemHoa;
    }

    public void setDiemHoa(String DiemHoa) {
        this.DiemHoa = DiemHoa;
    }

    @Override
    public String toString() {
        return "ThiSinhKhoiA{" + super.toString()+"DiemToan=" + DiemToan + ", DiemLy=" + DiemLy + ", DiemHoa=" + DiemHoa + '}';
    }
    
}
