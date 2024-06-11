/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pewarisan_DAO;

import CRUD.Database;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Pewarisan.LaporanPanen;

/**
 *
 * @author ASUS
 */
public class LaporanPanenDAO {
    public void create(LaporanPanen laporanPanen) throws SQLException {
        String sql = "INSERT INTO laporanpanen (id, nama, jumlah, satuan, harga) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = Database.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, laporanPanen.getId());
            stmt.setString(2, laporanPanen.getNama());
            stmt.setString(3, laporanPanen.getJumlah());
            stmt.setString(4, laporanPanen.getSatuan());
            stmt.setString(5, laporanPanen.getHarga());
            stmt.executeUpdate();
        }
    }

    public LaporanPanen read(int id) throws SQLException {
        String sql = "SELECT * FROM laporanpanen WHERE id = ?";
        try (Connection connection = Database.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new LaporanPanen(
                        rs.getInt("id"),
                        rs.getString("nama"),
                        rs.getString("jumlah"),
                        rs.getString("satuan"),
                        rs.getString("harga")
                );
            }
        }
        return null;
    }

    public List<LaporanPanen> readAll() throws SQLException {
        List<LaporanPanen> laporanPanens = new ArrayList<>();
        String sql = "SELECT * FROM laporanpanen";
        try (Connection connection = Database.getConnection();
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                laporanPanens.add(new LaporanPanen(
                        rs.getInt("id"),
                        rs.getString("nama"),
                        rs.getString("jumlah"),
                        rs.getString("satuan"),
                        rs.getString("harga")
                ));
            }
        }
        return laporanPanens;
    }

    public void update(LaporanPanen laporanPanen) throws SQLException {
        String sql = "UPDATE laporanpanen SET nama = ?, jumlah = ?, satuan = ?, harga = ? WHERE id = ?";
        try (Connection connection = Database.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, laporanPanen.getNama());
            stmt.setString(2, laporanPanen.getJumlah());
            stmt.setString(3, laporanPanen.getSatuan());
            stmt.setString(4, laporanPanen.getHarga());
            stmt.setInt(5, laporanPanen.getId());
            stmt.executeUpdate();
        }
    }

    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM laporanpanen WHERE id = ?";
        try (Connection connection = Database.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}

