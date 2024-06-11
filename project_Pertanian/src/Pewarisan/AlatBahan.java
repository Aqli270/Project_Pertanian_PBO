/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pewarisan;



/**
 *
 * @author ASUS
 */
public class AlatBahan {
    private int id;
    private String kategori;
    private String nama;
    private String jenis;
    private String satuan;
    private int stok;
    private int harga;

    public AlatBahan(int id, String kategori, String nama, String jenis, String satuan, int stok, int harga) {
        this.id = id;
        this.kategori = kategori;
        this.nama = nama;
        this.jenis = jenis;
        this.satuan = satuan;
        this.stok = stok;
        this.harga = harga;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getJenis() {
        return kategori;
    }

    public void setJenis(String jenis) {
        this.jenis= jenis;
    }
    
    public String getSatuan() {
        return kategori;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }
    
    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
 
    @Override
    public String toString() {
      return "AlatBahan{" +
              "id=" + id +
              ", kategori='" + kategori + '\'' +
              ",nama='" + nama + '\'' +
              ",jenis='" + jenis + '\'' +
              ",satuan='" + satuan + '\'' +
              ",stok=" + stok +
              ",harga=" + harga +
              '}';
    }
}