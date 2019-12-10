/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quanlyxe;

/**
 *
 * @author Administrator
 */
public class XeHoi {

    public XeHoi() {
        
    }
    
    public XeHoi(String Maxe, String TenXe, String LoaiXe, String NSX, String Mau, String HSX, double Gia) {
        this.Maxe = Maxe;
        this.TenXe = TenXe;
        this.LoaiXe = LoaiXe;
        this.NSX = NSX;
        this.Mau = Mau;
        this.HSX = HSX;
        this.Gia = Gia;
    }

    public String getMaxe() {
        return Maxe;
    }

    public void setMaxe(String Maxe) {
        this.Maxe = Maxe;
    }

    public String getTenXe() {
        return TenXe;
    }

    public void setTenXe(String TenXe) {
        this.TenXe = TenXe;
    }

    public String getLoaiXe() {
        return LoaiXe;
    }

    public void setLoaiXe(String LoaiXe) {
        this.LoaiXe = LoaiXe;
    }

    public String getNSX() {
        return NSX;
    }

    public void setNSX(String NSX) {
        this.NSX = NSX;
    }

    public String getMau() {
        return Mau;
    }

    public void setMau(String Mau) {
        this.Mau = Mau;
    }

    public String getHSX() {
        return HSX;
    }

    public void setHSX(String HSX) {
        this.HSX = HSX;
    }

    public double getGia() {
        return Gia;
    }

    public void setGia(double Gia) {
        this.Gia = Gia;
    }

    @Override
    public String toString() {
        return  Maxe + ";" + TenXe + ";" + LoaiXe + ";" + NSX + ";" + Mau + ";" + HSX + ";" + Gia + "\n";
    }
    private String Maxe, TenXe, LoaiXe, NSX, Mau, HSX;
    private double Gia;
    
}
