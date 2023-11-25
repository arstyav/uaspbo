/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import database.database;
public class staff extends database {
    public static String idStaff;
    public String nama;
    public String alamat;
    public String nomorTelepon;
    public String bidangPekerjaan;


    // Getter dan Setter untuk atribut
    public void IdStaff(String IdStaff) {
        staff.idStaff = IdStaff;
    }
    
    public String getNama() {
        return nama;
    }

    public static String getIdStaff() {
        return idStaff;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public String getBidangPekerjaan() {
        return bidangPekerjaan;
    }

    public void setBidangPekerjaan(String bidangPekerjaan) {
        this.bidangPekerjaan = bidangPekerjaan;
    }
}
