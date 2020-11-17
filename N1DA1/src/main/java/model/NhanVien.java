/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Cao Do
 */
public class NhanVien {
    private String MaNV;
    private String TenNV;
    private String DiaChi;
    private String sdt;
    private Date NgaySinh;
    private String NoiSinh;
    private String CMND;
    private boolean GioiTinh;
    private String email;
    private boolean TinhTrangHonNhan;
    private boolean TrangThaiLamViec;
    private String sdt1;
    private String Anh;
    private String GhiChu;

    @Override
    public String toString() {
        return "NhanVien{" + "MaNV=" + MaNV + ", TenNV=" + TenNV + ", DiaChi=" + DiaChi + ", sdt=" + sdt + ", NgaySinh=" + NgaySinh + ", NoiSinh=" + NoiSinh + ", CMND=" + CMND + ", GioiTinh=" + GioiTinh + ", email=" + email + ", TinhTrangHonNhan=" + TinhTrangHonNhan + ", TrangThaiLamViec=" + TrangThaiLamViec + ", sdt1=" + sdt1 + ", Anh=" + Anh + ", GhiChu=" + GhiChu + '}';
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getNoiSinh() {
        return NoiSinh;
    }

    public void setNoiSinh(String NoiSinh) {
        this.NoiSinh = NoiSinh;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isTinhTrangHonNhan() {
        return TinhTrangHonNhan;
    }

    public void setTinhTrangHonNhan(boolean TinhTrangHonNhan) {
        this.TinhTrangHonNhan = TinhTrangHonNhan;
    }

    public boolean isTrangThaiLamViec() {
        return TrangThaiLamViec;
    }

    public void setTrangThaiLamViec(boolean TrangThaiLamViec) {
        this.TrangThaiLamViec = TrangThaiLamViec;
    }

    public String getSdt1() {
        return sdt1;
    }

    public void setSdt1(String sdt1) {
        this.sdt1 = sdt1;
    }

    public String getAnh() {
        return Anh;
    }

    public void setAnh(String Anh) {
        this.Anh = Anh;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
}
