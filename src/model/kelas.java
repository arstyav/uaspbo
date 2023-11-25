/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import database.database;

public class kelas  {
    public String idKelas;
    public String namaKelas;
    public int jumlahMurid;
    public int kapasitas;
    public String materiKhusus;
    public String metodePengajaran;
    public String IdOffline;
    public String lokasi;
    public String IdOnline;
    public String platform;

    database db = new database();

    // Getter dan Setter untuk atribut
    public String getIdKelas() {
        return idKelas;
    }

    public String getMateriKhusus() {
        return materiKhusus;
    }

    public String getMetodePengajaran() {
        return metodePengajaran;
    }

    public void setMateriKhusus(String materiKhusus) {
        this.materiKhusus = materiKhusus;
    }

    public void setMetodePengajaran(String metodePengajaran) {
        this.metodePengajaran = metodePengajaran;
    }

    public void setIdKelas(String idKelas) {
        this.idKelas = idKelas;
    }

    public String getNamaKelas() {
        return namaKelas;
    }

    public void setNamaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }

    public int getJumlahMurid() {
        return jumlahMurid;
    }

    public void setJumlahMurid(int jumlahMurid) {
        this.jumlahMurid = jumlahMurid;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }
    
}