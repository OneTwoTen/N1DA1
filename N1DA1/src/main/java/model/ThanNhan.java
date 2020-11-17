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
public class ThanNhan {
    private String MaTN;
    private String Bo;
    private String Me;
    private String Brother;
    private String VoChong;
    private String Con;
    private String MaNV;

    @Override
    public String toString() {
        return "ThanNhan{" + "MaTN=" + MaTN + ", Bo=" + Bo + ", Me=" + Me + ", Brother=" + Brother + ", VoChong=" + VoChong + ", Con=" + Con + ", MaNV=" + MaNV + '}';
    }

    public String getMaTN() {
        return MaTN;
    }

    public void setMaTN(String MaTN) {
        this.MaTN = MaTN;
    }

    public String getBo() {
        return Bo;
    }

    public void setBo(String Bo) {
        this.Bo = Bo;
    }

    public String getMe() {
        return Me;
    }

    public void setMe(String Me) {
        this.Me = Me;
    }

    public String getBrother() {
        return Brother;
    }

    public void setBrother(String Brother) {
        this.Brother = Brother;
    }

    public String getVoChong() {
        return VoChong;
    }

    public void setVoChong(String VoChong) {
        this.VoChong = VoChong;
    }

    public String getCon() {
        return Con;
    }

    public void setCon(String Con) {
        this.Con = Con;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }
    
}
