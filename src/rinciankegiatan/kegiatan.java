/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rinciankegiatan;

/**
 *
 * @author WIN10
 */
public class kegiatan extends mubaligh{
    String namaKegiatan, tanggal, namaMateri, deskripsi;
    
    public kegiatan(){}
    
    public void setNamaKegiatan(String namaKegiatan) {
        this.namaKegiatan = namaKegiatan;
    }
    
    public String getNamaKegiatan() {
        return this.namaKegiatan;
    }
    
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    
    public String getTanggal() {
        return this.tanggal;
    }
    
    public void setNamaMateri(String namaMateri) {
        this.namaMateri = namaMateri;
    }
    
    public String getNamaMateri() {
        return this.namaMateri;
    }
    
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
    
    public String getDeskripsi() {
        return this.deskripsi;
    }
}
