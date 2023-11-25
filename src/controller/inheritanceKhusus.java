/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.kelas;

    class InheritanceKhusus extends kelas {
    private String materiKhusus;

    // Konstruktor KelasKhusus
    public InheritanceKhusus(String idKelas, String namaKelas, int jumlahMurid, int kapasitas, String materiKhusus) {
        this.idKelas = idKelas;
        this.namaKelas = namaKelas;
        this.jumlahMurid = jumlahMurid;
        this.kapasitas = kapasitas;
        this.materiKhusus = materiKhusus;
    }

    // Getter dan Setter untuk atribut materiKhusus
    public String getMateriKhusus() {
        return materiKhusus;
    }

    public void setMateriKhusus(String materiKhusus) {
        this.materiKhusus = materiKhusus;
    }
}