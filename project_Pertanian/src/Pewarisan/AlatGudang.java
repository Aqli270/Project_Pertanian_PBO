/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Pewarisan;

/**
 *
 * @author ASUS
 */

// Interface untuk Alat Pertanian
public interface AlatGudang {
    String getNama();
    void setNama(String nama);
    double getBerat();
    void setBerat(double berat);

    public int getId();

    public Object getAlatPertanian();

    public Object getGudang();

    public int getJumlah();
}