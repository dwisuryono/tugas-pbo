/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.sql.Connection; // Mendapatkan koneksi
import java.sql.DriverManager; // Menghubungkan database
import java.sql.PreparedStatement; // Perintah sql (simpan, ubah, hapus)
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author WIN10
 */
public class Database {
    private String databaseName = "2310010690";
    private String username = "root";
    private String password = "";
    public static Connection koneksiDB;
    
    public Database () {
        try {
            String lokasi = "jdbc:mysql://localhost/" + databaseName;
            Class.forName("com.mysql.jdbc.Driver");
            koneksiDB = DriverManager.getConnection(lokasi, username, password);
            System.out.println("Database berhasil terkoneksi!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void simpanUji(String nik, String nama, String telp, String alamat) {
        try {
            String sql = "INSERT INTO uji (nik, nama, telp, alamat) VALUES(?, ?, ?, ?)";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1, nik);
            perintah.setString(2, nama);
            perintah.setString(3, telp);
            perintah.setString(4, alamat);
            perintah.executeUpdate();
            
            System.out.println("Data berhasil disimpan!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahUji(String nik, String nama, String telp, String alamat) {
        try {
            String sql = "UPDATE uji SET nama = ?, telp = ?, alamat = ? WHERE nik = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1, nama);
            perintah.setString(2, telp);
            perintah.setString(3, alamat);
            perintah.setString(4, nik);
            perintah.executeUpdate();
            
            System.out.println("Data berhasil diubah!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusUji(String nik, String nama, String telp, String alamat) {
        try {
            String sql = "DELETE FROM uji WHERE nik = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1, nik);
            perintah.executeUpdate();
            
            System.out.println("Data berhasil diubah!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void cariUji(String nik) {
        try {
            String sql = "SELECT * FROM uji WHERE nik = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1, nik);
            ResultSet data = perintah.executeQuery();
            
            while(data.next()) {
                System.out.println("NIK          : " + data.getString("nik"));
                System.out.println("NAMA         : " + data.getString("nama"));
                System.out.println("TELP         : " + data.getString("telp"));
                System.out.println("ALAMAT       : " + data.getString("alamat"));
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void dataUji() {
        try {
            
            String sql = "SELECT * FROM uji ORDER BY nik ASC";
            Statement st = koneksiDB.createStatement();
            ResultSet baris = st.executeQuery(sql);
            
            while(baris.next()) {
                
                System.out.println(baris.getString("nik") + " | " + 
                    baris.getString("nama") + " | " + 
                    baris.getString("telp") + " | " + 
                    baris.getString("alamat") + " | ");
                
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
//    Tabel Kegiatan
    public void simpanKegiatan(int kegiatanId, String title, String tanggal, String namaMateri, String deskripsi) {
        try {
            String sql = "INSERT INTO kegiatan (kegiatan_id, title, tanggal, materi_name, deskripsi) VALUES(?, ?, ?, ?, ?)";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setInt(1, kegiatanId);
            perintah.setString(2, title);
            perintah.setString(3, tanggal);
            perintah.setString(4, namaMateri);
            perintah.setString(5, deskripsi);
            perintah.executeUpdate();
            
            System.out.println("Data berhasil disimpan!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahKegiatan(int kegiatanId, String title, String tanggal, String namaMateri, String deskripsi) {
        try {
            String sql = "UPDATE kegiatan SET title = ?, tanggal = ?, materi_name = ?, deskripsi = ? WHERE kegiatan_id = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1, title);
            perintah.setString(2, tanggal);
            perintah.setString(3, namaMateri);
            perintah.setString(4, deskripsi);
            perintah.setInt(5, kegiatanId);
            perintah.executeUpdate();
            
            System.out.println("Data berhasil diubah!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusKegiatan(int kegiatanId) {
        try {
            String sql = "DELETE FROM kegiatan WHERE kegiatan_id = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setInt(1, kegiatanId);
            perintah.executeUpdate();
            
            System.out.println("Data berhasil dihapus!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void cariKegiatan(int kegiatanId) {
        try {
            String sql = "SELECT * FROM kegiatan WHERE kegiatan_id = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setInt(1, kegiatanId);
            ResultSet data = perintah.executeQuery();
            
            while(data.next()) {
                System.out.println("Kegiatan Id          : " + data.getString("kegiatan_id"));
                System.out.println("Judul Kegiatan       : " + data.getString("title"));
                System.out.println("Materi               : " + data.getString("materi_name"));
                System.out.println("Tanggal              : " + data.getString("tanggal"));
                System.out.println("Deskripsi            : " + data.getString("deskripsi"));
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void dataKegiatan() {
        try {
            
            String sql = "SELECT * FROM kegiatan ORDER BY kegiatan_id ASC";
            Statement st = koneksiDB.createStatement();
            ResultSet baris = st.executeQuery(sql);
            
            while(baris.next()) {
                
                System.out.println(baris.getInt("kegiatan_id") + " | " + 
                    baris.getString("title") + " | " + 
                    baris.getString("materi_name") + " | " +
                    baris.getString("tanggal") + " | " +
                    baris.getString("deskripsi") + " | ");
                
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
//    Tabel Mubaligh
    public void simpanMubaligh(int mubalighId, String namaMubaligh, int umur, String noHp, String alamat) {
        try {
            String sql = "INSERT INTO mubaligh (mubaligh_id, mubaligh_name, umur, no_hp, alamat) VALUES(?, ?, ?, ?, ?)";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setInt(1, mubalighId);
            perintah.setString(2, namaMubaligh);
            perintah.setInt(3, umur);
            perintah.setString(4, noHp);
            perintah.setString(5, alamat);
            perintah.executeUpdate();
            
            System.out.println("Data baru berhasil disimpan!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahMubaligh(int mubalighId, String namaMubaligh, int umur, String noHp, String alamat) {
        try {
            String sql = "UPDATE mubaligh SET mubaligh_name = ?, umur = ?, no_hp = ?, alamat = ? WHERE mubaligh_id = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1, namaMubaligh);
            perintah.setInt(2, umur);
            perintah.setString(3, noHp);
            perintah.setString(4, alamat);
            perintah.setInt(5, mubalighId);
            perintah.executeUpdate();
            
            System.out.println("Data berhasil diubah!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusMubaligh(int mubalighId) {
        try {
            String sql = "DELETE FROM mubaligh WHERE mubaligh_id = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setInt(1, mubalighId);
            perintah.executeUpdate();
            
            System.out.println("Data berhasil dihapus!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void cariMubaligh(int mubalighId) {
        try {
            String sql = "SELECT * FROM mubaligh WHERE mubaligh_id = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setInt(1, mubalighId);
            ResultSet data = perintah.executeQuery();
            
            while(data.next()) {
                System.out.println("Mubaligh Id          : " + data.getInt("mubaligh_id"));
                System.out.println("Nama Mubaligh        : " + data.getString("mubaligh_name"));
                System.out.println("Umur                 : " + data.getString("umur"));
                System.out.println("Nomor HP             : " + data.getString("no_hp"));
                System.out.println("Alamat               : " + data.getString("alamat"));
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void dataMubaligh() {
        try {
            
            String sql = "SELECT * FROM mubaligh ORDER BY mubaligh_id ASC";
            Statement st = koneksiDB.createStatement();
            ResultSet baris = st.executeQuery(sql);
            
            while(baris.next()) {
                
                System.out.println(baris.getInt("mubaligh_id") + " | " + 
                    baris.getString("mubaligh_name") + " | " + 
                    baris.getString("umur") + " | " +
                    baris.getString("no_hp") + " | " +
                    baris.getString("alamat") + " | ");
                
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
//    Tabel Masjid
    public void simpanMasjid(int masjidId, String namaMasjid) {
        try {
            String sql = "INSERT INTO masjid (masjid_id, nama_masjid) VALUES(?, ?)";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setInt(1, masjidId);
            perintah.setString(2, namaMasjid);
            perintah.executeUpdate();
            
            System.out.println("Data baru berhasil disimpan!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahMasjid(int masjidId, String namaMasjid) {
        try {
            String sql = "UPDATE masjid SET nama_masjid = ? WHERE masjid_id = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1, namaMasjid);
            perintah.setInt(2, masjidId);
            perintah.executeUpdate();
            
            System.out.println("Data berhasil diubah!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusMasjid(int masjidId) {
        try {
            String sql = "DELETE FROM masjid WHERE masjid_id = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setInt(1, masjidId);
            perintah.executeUpdate();
            
            System.out.println("Data berhasil dihapus!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void cariMasjid(int masjidId) {
        try {
            String sql = "SELECT * FROM masjid WHERE masjid_id = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setInt(1, masjidId);
            ResultSet data = perintah.executeQuery();
            
            while(data.next()) {
                System.out.println("Masjid Id          : " + data.getInt("masjid_id"));
                System.out.println("Nama Masjid        : " + data.getString("nama_masjid"));
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void dataMasjid() {
        try {
            
            String sql = "SELECT * FROM masjid ORDER BY masjid_id ASC";
            Statement st = koneksiDB.createStatement();
            ResultSet baris = st.executeQuery(sql);
            
            while(baris.next()) {
                
                System.out.println(baris.getInt("masjid_id") + " | " + 
                    baris.getString("nama_masjid") + " | ");
                
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
//    Tabel Kota
    public void simpanKota(int kotaId, String namaKota) {
        try {
            String sql = "INSERT INTO kota (kota_id, kota_nama) VALUES(?, ?)";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setInt(1, kotaId);
            perintah.setString(2, namaKota);
            perintah.executeUpdate();
            
            System.out.println("Data baru berhasil disimpan!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahKota(int kotaId, String namaKota) {
        try {
            String sql = "UPDATE kota SET kota_nama = ? WHERE kota_id = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1, namaKota);
            perintah.setInt(2, kotaId);
            perintah.executeUpdate();
            
            System.out.println("Data berhasil diubah!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusKota(int kotaId) {
        try {
            String sql = "DELETE FROM kota WHERE kota_id = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setInt(1, kotaId);
            perintah.executeUpdate();
            
            System.out.println("Data berhasil dihapus!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void cariKota(int kotaId) {
        try {
            String sql = "SELECT * FROM kota WHERE kota_id = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setInt(1, kotaId);
            ResultSet data = perintah.executeQuery();
            
            while(data.next()) {
                System.out.println("Kota Id          : " + data.getInt("kota_id"));
                System.out.println("Nama Kota        : " + data.getString("kota_nama"));
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void dataKota() {
        try {
            
            String sql = "SELECT * FROM kota ORDER BY kota_id ASC";
            Statement st = koneksiDB.createStatement();
            ResultSet baris = st.executeQuery(sql);
            
            while(baris.next()) {
                
                System.out.println(baris.getInt("kota_id") + " | " + 
                    baris.getString("kota_nama") + " | ");
                
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
