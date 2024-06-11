/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pewarisan;

/**
 *
 * @author ASUS
 */

public class Lahan {
    private int id;
    private String nama;
    private int bibit;
    private String luas;
    private String daerah;

    public Lahan(int id, String nama, int bibit, String luas, String daerah) {
        this.id = id;
        this.nama = nama;
        this.bibit = bibit;
        this.luas = luas;
        this.daerah= daerah;
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

    public int getBibit() {
        return bibit;
    }

    public void setBibit(int bibit) {
        this.bibit = bibit;
    }
    
    public String getLuas() {
        return luas;
    }

    public void setLuas(String luas) {
        this.luas= luas;
    }
    
    public String getDaerah() {
        return daerah;
    }

    public void setDaerah(String daerah) {
        this.daerah = daerah;
    }

    @Override
    public String toString() {
        return "Lahan{" +
                "id=" + id +
                "nama='" + nama + '\'' +
                "bibit=" + bibit +
                "luas='" + luas + '\'' +
                "daerah='" + daerah + '\'' +
                '}';
    }   
}

