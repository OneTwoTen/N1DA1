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
public class PhongBan {
    private String MaPB;
    private String TenPB; 

    @Override
    public String toString() {
        return "PhongBan{" + "MaPB=" + MaPB + ", TenPB=" + TenPB + '}';
    }

    public String getMaPB() {
        return MaPB;
    }

    public void setMaPB(String MaPB) {
        this.MaPB = MaPB;
    }

    public String getTenPB() {
        return TenPB;
    }

    public void setTenPB(String TenPB) {
        this.TenPB = TenPB;
    }
}
