/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informasikegiatankeagamaan;

import rinciankegiatan.*;
import crud.*;
import java.util.Scanner;
import gui.frameUtama;

/**
 *
 * @author WIN10
 */
public class InformasiKegiatanKeagamaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        TUGAS 2
        
//        kegiatan inputKegiatan = new kegiatan();
//        Scanner inputUser = new Scanner(System.in);
//        
//        System.out.print("Masukkan Nama Kegiatan        : " );
//        inputKegiatan.setNamaKegiatan(inputUser.nextLine());
//        System.out.print("Masukkan Materi Kegiatan      : " );
//        inputKegiatan.setNamaMateri(inputUser.nextLine());
//        System.out.print("Masukkan Tanggal Kegiatan     : " );
//        inputKegiatan.setTanggal(inputUser.nextLine());
//        System.out.print("Masukkan Deskripsi Kegiatan   : " );
//        inputKegiatan.setDeskripsi(inputUser.nextLine());
//        System.out.print("Masukkan Nama Mubaligh        : " );
//        inputKegiatan.setNamaMubaligh(inputUser.nextLine());
//        System.out.print("Masukkan No HP Mubaligh       : " );
//        inputKegiatan.setNoHp(inputUser.nextLine());
//        System.out.print("Masukkan Alamat Mubaligh      : " );
//        inputKegiatan.setAlamat(inputUser.nextLine());
//        System.out.print("Masukkan Umur Mubaligh        : " );
//        inputKegiatan.setUmur(inputUser.nextInt());
//        
//        System.out.println("===================================================");
//        System.out.println("Nama Kegiatan               : " + inputKegiatan.getNamaKegiatan());
//        System.out.println("Materi Kegiatan             : " + inputKegiatan.getNamaMateri());
//        System.out.println("Tanggal Kegiatan            : " + inputKegiatan.getTanggal());
//        System.out.println("Deskripsi Kegiatan          : " + inputKegiatan.getDeskripsi());
//        System.out.println("Nama Mubaligh               : " + inputKegiatan.getNamaMubaligh());
//        System.out.println("No HP Mubaligh              : " + inputKegiatan.getNoHp());
//        System.out.println("Alamat Mubaligh             : " + inputKegiatan.getAlamat());
//        System.out.println("Umur Mubaligh               : " + inputKegiatan.getUmur());

//        Database dbConnect = new Database();
//        dbConnect.simpanUji("2310010691", "Dwi Suryono", "081211110000", "Jl. Pramuka");
//        dbConnect.ubahUji("2310010690", "Budianto", "085699990000", "dsadjalsj");
//        dbConnect.cariUji("2310010690");
//        dbConnect.dataUji();

//        Tabel Kegiatan 
//        dbConnect.simpanKegiatan(1, "Kajian Mingguan", "20-10-2024", "Rukun Iman", "-");
//        dbConnect.simpanKegiatan(2, "Kajian Mingguan", "20-10-2024", "Hari Kiamat", "-");
//        dbConnect.ubahKegiatan(1, "Kajian Subuh", "06-06-2024", "Rukun Islam", "Membahas pokok - pokok rukun Islam");
//        dbConnect.hapusKegiatan(20);
//        dbConnect.cariKegiatan(1);
//        dbConnect.dataKegiatan();

//        Tabel Mubaligh
//        dbConnect.simpanMubaligh(2, "Ustadz Hasfianoor", 39, "081200008888", "Jln. Sungai Andai");
//        dbConnect.ubahMubaligh(1, "Ustadz Hasanuddin", 44, "085611112222", "Jln. Sulthan Adam");
//        dbConnect.hapusMubaligh(2);
//        dbConnect.cariMubaligh(1);
//        dbConnect.dataMubaligh();

//        Tabel Masjid
//        dbConnect.simpanMasjid(2, "Masjid Jami");
//        dbConnect.ubahMasjid(1, "Masjid Baiturrahman");
//        dbConnect.hapusMasjid(2);
//        dbConnect.cariMasjid(1);
//        dbConnect.dataMasjid();

//        Tabel Kota
//        dbConnect.simpanKota(2, "Banjarmasin");
//        dbConnect.ubahKota(1, "Banjar Baru");
//        dbConnect.hapusKota(2);
//        dbConnect.cariKota(1);
//        dbConnect.dataKota();

        new frameUtama().setVisible(true);
                
    }
    
}
