///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
////package Pewarisan_DAO;
// 
////import CRUD.Database;
////import java.sql.*;
////import java.util.ArrayList;
////import java.util.List;
////import Pewarisan.LahanAlat;
/////**
//// *
//// * @author ASUS
//// */
////public class LahanAlatDAO {
////
////    public static void delete(int deleteId) {
////        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
////    }
////
////    public void create(LahanAlat lahanAlat) throws SQLException {
////        String sql = "INSERT INTO lahanalat (lahan_id, lahan_nama, lahan_bibit, lahan_luas, lahan_daerah, "
////                   + "alatbahan_id, alatbahan_kategori, alatbahan_nama, alatbahan_jenis, alatbahan_satuan, "
////                   + "alatbahan_stok, alatbahan_harga) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
////        try (Connection connection = Database.getConnection();
////             PreparedStatement stmt = connection.prepareStatement(sql)) {
////            stmt.setInt(1, lahanAlat.getLahanId());
////            stmt.setString(2, lahanAlat.getLahanNama());
////            stmt.setInt(3, lahanAlat.getLahanBibit());
////            stmt.setString(4, lahanAlat.getLahanLuas());
////            stmt.setString(5, lahanAlat.getLahanDaerah());
////            stmt.setInt(6, lahanAlat.getAlatBahanId());
////            stmt.setString(7, lahanAlat.getAlatBahanKategori());
////            stmt.setString(8, lahanAlat.getAlatBahanNama());
////            stmt.setString(9, lahanAlat.getAlatBahanJenis());
////            stmt.setString(10, lahanAlat.getAlatBahanSatuan());
////            stmt.setInt(11, lahanAlat.getAlatBahanStok());
////            stmt.setInt(12, lahanAlat.getAlatBahanHarga());
////            stmt.executeUpdate();
////        }
////    }
////
////    public LahanAlat read(int lahanId, int alatBahanId) throws SQLException {
////        String sql = "SELECT * FROM lahanalat WHERE lahan_id = ? AND alatbahan_id = ?";
////        try (Connection connection = Database.getConnection();
////             PreparedStatement stmt = connection.prepareStatement(sql)) {
////            stmt.setInt(1, lahanId);
////            stmt.setInt(2, alatBahanId);
////            ResultSet rs = stmt.executeQuery();
////            if (rs.next()) {
////                return new LahanAlat(
////                        rs.getInt("lahan_id"), rs.getString("lahan_nama"), rs.getInt("lahan_bibit"),
////                        rs.getString("lahan_luas"), rs.getString("lahan_daerah"), rs.getInt("alatbahan_id"),
////                        rs.getString("alatbahan_kategori"), rs.getString("alatbahan_nama"),
////                        rs.getString("alatbahan_jenis"), rs.getString("alatbahan_satuan"),
////                        rs.getInt("alatbahan_stok"), rs.getInt("alatbahan_harga")
////                );
////            }
////        }
////        return null;
////    }
////
////    public List<LahanAlat> readAll() throws SQLException {
////        List<LahanAlat> lahanAlats = new ArrayList<>();
////        String sql = "SELECT * FROM lahanalat";
////        try (Connection connection = Database.getConnection();
////             Statement stmt = connection.createStatement();
////             ResultSet rs = stmt.executeQuery(sql)) {
////            while (rs.next()) {
////                lahanAlats.add(new LahanAlat(
////                        rs.getInt("lahan_id"), rs.getString("lahan_nama"), rs.getInt("lahan_bibit"),
////                        rs.getString("lahan_luas"), rs.getString("lahan_daerah"), rs.getInt("alatbahan_id"),
////                        rs.getString("alatbahan_kategori"), rs.getString("alatbahan_nama"),
////                        rs.getString("alatbahan_jenis"), rs.getString("alatbahan_satuan"),
////                        rs.getInt("alatbahan_stok"), rs.getInt("alatbahan_harga")
////                ));
////            }
////        }
////        return lahanAlats;
////    }
////
////    public void update(LahanAlat lahanAlat) throws SQLException {
////        String sql = "UPDATE lahanalat SET lahan_nama = ?, lahan_bibit = ?, lahan_luas = ?, lahan_daerah = ?, "
////                   + "alatbahan_kategori = ?, alatbahan_nama = ?, alatbahan_jenis = ?, alatbahan_satuan = ?, "
////                   + "alatbahan_stok = ?, alatbahan_harga = ? WHERE lahan_id = ? AND alatbahan_id = ?";
////        try (Connection connection = Database.getConnection();
////             PreparedStatement stmt = connection.prepareStatement(sql)) {
////            stmt.setString(1, lahanAlat.getLahanNama());
////            stmt.setInt(2, lahanAlat.getLahanBibit());
////            stmt.setString(3, lahanAlat.getLahanLuas());
////            stmt.setString(4, lahanAlat.getLahanDaerah());
////            stmt.setString(5, lahanAlat.getAlatBahanKategori());
////            stmt.setString(6, lahanAlat.getAlatBahanNama());
////            stmt.setString(7, lahanAlat.getAlatBahanJenis());
////            stmt.setString(8, lahanAlat.getAlatBahanSatuan());
////            stmt.setInt(9, lahanAlat.getAlatBahanStok());
////            stmt.setInt(10, lahanAlat.getAlatBahanHarga());
////            stmt.setInt(11, lahanAlat.getLahanId());
////            stmt.setInt(12, lahanAlat.getAlatBahanId());
////            stmt.executeUpdate();
////        }
////    }
////
////    public void delete(int lahanId, int alatBahanId) throws SQLException {
////        String sql = "DELETE FROM lahanalat WHERE lahan_id = ? AND alatbahan_id = ?";
////        try (Connection connection = Database.getConnection();
////             PreparedStatement stmt = connection.prepareStatement(sql)) {
////            stmt.setInt(1, lahanId);
////            stmt.setInt(2, alatBahanId);
////            stmt.executeUpdate();
////        }
////    }
////    
////    public LahanAlat read(int readId) throws SQLException {
////        String sql = "SELECT * FROM lahanalat WHERE lahan_id = ?";
////        try (Connection connection = Database.getConnection();
////             PreparedStatement stmt = connection.prepareStatement(sql)) {
////            stmt.setInt(1, readId);
////            ResultSet rs = stmt.executeQuery();
////            if (rs.next()) {
////                return new LahanAlat(
////                        rs.getInt("lahan_id"), rs.getString("lahan_nama"), rs.getInt("lahan_bibit"),
////                        rs.getString("lahan_luas"), rs.getString("lahan_daerah"), rs.getInt("alatbahan_id"),
////                        rs.getString("alatbahan_kategori"), rs.getString("alatbahan_nama"),
////                        rs.getString("alatbahan_jenis"), rs.getString("alatbahan_satuan"),
////                        rs.getInt("alatbahan_stok"), rs.getInt("alatbahan_harga")
////                );
////            }
////        }
////        return null; // Mengembalikan null jika data tidak ditemukan
////    }
////}
