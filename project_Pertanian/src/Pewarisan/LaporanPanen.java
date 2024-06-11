/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pewarisan;

/**
 *
 * @author ASUS
 */
public class LaporanPanen {
    private int id;
    private String nama;
    private String jumlah;
    private String satuan;
    private String harga;

    public LaporanPanen(int id, String nama, String jumlah, String satuan, String harga) {
        this.id = id;
        this.nama = nama;
        this.jumlah = jumlah;
        this.satuan = satuan;
        this.harga = harga;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "LaporanPanen{" +
                "id=" + id +
                ", nama='" + nama + '\'' +
                ", jumlah='" + jumlah + '\'' +
                ", satuan='" + satuan + '\'' +
                ", harga='" + harga + '\'' +
                '}';
    }
}
