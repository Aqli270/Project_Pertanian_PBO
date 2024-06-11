///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package Pewarisan;
//
///**
// *
// * @author ASUS
// */
//
////public class LahanAlat {
////    private final Lahan lahan;
////    private final AlatBahan alatBahan;
////
////    public LahanAlat(int lahanId, String lahanNama, int lahanBibit, String lahanLuas, String lahanDaerah,
////                     int alatBahanId, String alatBahanKategori, String alatBahanNama, String alatBahanJenis,
////                     String alatBahanSatuan, int alatBahanStok, int alatBahanHarga) {
////        this.lahan = new Lahan(lahanId, lahanNama, lahanBibit, lahanLuas, lahanDaerah);
////        this.alatBahan = new AlatBahan(alatBahanId, alatBahanKategori, alatBahanNama, alatBahanJenis, 
////                                       alatBahanSatuan, alatBahanStok, alatBahanHarga);
////    }
////
////    // Getter and Setter for Lahan
////    public int getLahanId() {
////        return lahan.getId();
////    }
////
////    public void setLahanId(int lahanId) {
////        lahan.setId(lahanId);
////    }
////
////    public String getLahanNama() {
////        return lahan.getNama();
////    }
////
////    public void setLahanNama(String lahanNama) {
////        lahan.setNama(lahanNama);
////    }
////
////    public int getLahanBibit() {
////        return lahan.getBibit();
////    }
////
////    public void setLahanBibit(int lahanBibit) {
////        lahan.setBibit(lahanBibit);
////    }
////
////    public String getLahanLuas() {
////        return lahan.getLuas();
////    }
////
////    public void setLahanLuas(String lahanLuas) {
////        lahan.setLuas(lahanLuas);
////    }
////
////    public String getLahanDaerah() {
////        return lahan.getDaerah();
////    }
////
////    public void setLahanDaerah(String lahanDaerah) {
////        lahan.setDaerah(lahanDaerah);
////    }
////
////    // Getter and Setter for AlatBahan
////    public int getAlatBahanId() {
////        return alatBahan.getId();
////    }
////
////    public void setAlatBahanId(int alatBahanId) {
////        alatBahan.setId(alatBahanId);
////    }
////
////    public String getAlatBahanKategori() {
////        return alatBahan.getKategori();
////    }
////
////    public void setAlatBahanKategori(String alatBahanKategori) {
////        alatBahan.setKategori(alatBahanKategori);
////    }
////
////    public String getAlatBahanNama() {
////        return alatBahan.getNama();
////    }
////
////    public void setAlatBahanNama(String alatBahanNama) {
////        alatBahan.setNama(alatBahanNama);
////    }
////
////    public String getAlatBahanJenis() {
////        return alatBahan.getJenis();
////    }
////
////    public void setAlatBahanJenis(String alatBahanJenis) {
////        alatBahan.setJenis(alatBahanJenis);
////    }
////
////    public String getAlatBahanSatuan() {
////        return alatBahan.getSatuan();
////    }
////
////    public void setAlatBahanSatuan(String alatBahanSatuan) {
////        alatBahan.setSatuan(alatBahanSatuan);
////    }
////
////    public int getAlatBahanStok() {
////        return alatBahan.getStok();
////    }
////
////    public void setAlatBahanStok(int alatBahanStok) {
////        alatBahan.setStok(alatBahanStok);
////    }
////
////    public int getAlatBahanHarga() {
////        return alatBahan.getHarga();
////    }
////
////    public void setAlatBahanHarga(int alatBahanHarga) {
////        alatBahan.setHarga(alatBahanHarga);
////    }
////
////    @Override
////    public String toString() {
////        return "LahanAlat{" +
////                "lahan=" + lahan.toString() +
////                ", alatBahan=" + alatBahan.toString() +
////                '}';
////    }
////}
