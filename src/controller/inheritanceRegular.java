/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.kelas;

class inheritanceRegular extends kelas {

    private String metodepengajaran;
    // Konstruktor KelasRegular

    public inheritanceRegular(String idKelas, String namaKelas, int jumlahmurid, int kapasitas, String metodePengajaran) {
        this.idKelas = idKelas;
        this.namaKelas = namaKelas;
        this.jumlahMurid = jumlahMurid;
        this.kapasitas = kapasitas;
        this.metodePengajaran = metodePengajaran;
    }
}
