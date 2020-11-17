/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Cao Do
 */
public class TaiKhoan {
    private String MaTK;
    private String MaNV;
    private String MatKhau;
    private boolean VaiTro = false;

    public String getMaTK() {
        return MaTK;
    }

    public void setMaTK(String MaTK) {
        this.MaTK = MaTK;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public boolean isVaiTro() {
        return VaiTro;
    }

    public void setVaiTro(boolean VaiTro) {
        this.VaiTro = VaiTro;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" + "MaTK=" + MaTK + ", MaNV=" + MaNV + ", MatKhau=" + MatKhau + ", VaiTro=" + VaiTro + '}';
    }
    
}
