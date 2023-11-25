/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import database.database;
public class murid extends database {
    public static String idMurid;
    public String nama;
    public String tanggalLahir;
    public String alamat;
    public String namaOrangTua;
    public String nomorOrangTua;
    public String fkUsername;
    public String fkIdKelas;

    // Getter dan Setter untuk atribut
    public void IdMurid(String IdMurid) {
        murid.idMurid = IdMurid;
    }

    public static void setIdMurid(String idMurid) {
        murid.idMurid = idMurid;
    }

    public void setFkUsername(String fkUsername) {
        this.fkUsername = fkUsername;
    }

    public static String getIdMurid() {
        return idMurid;
    }

    public String getFkUsername() {
        return fkUsername;
    }

    public String getFkIdKelas() {
        return fkIdKelas;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNamaOrangTua() {
        return namaOrangTua;
    }

    public void setNamaOrangTua(String namaOrangTua) {
        this.namaOrangTua = namaOrangTua;
    }

    public String getNomorOrangTua() {
        return nomorOrangTua;
    }

    public void setNomorOrangTua(String nomorOrangTua) {
        this.nomorOrangTua = nomorOrangTua;
    }
}

