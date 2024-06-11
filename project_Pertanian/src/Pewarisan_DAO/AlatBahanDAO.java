/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pewarisan_DAO;
import CRUD.Database;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Pewarisan.AlatBahan;

/**
 *
 * @author ASUS
 */
public class AlatBahanDAO {



    public void create(AlatBahan alatBahan) throws SQLException {
        String sql = "INSERT INTO alatbahan (id, kategori, nama, jenis, satuan, stok, harga) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection connection = Database.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, alatBahan.getId());
            stmt.setString(2, alatBahan.getKategori());
            stmt.setString(3, alatBahan.getNama());
            stmt.setString(4, alatBahan.getJenis());
            stmt.setString(5, alatBahan.getSatuan());
            stmt.setInt(6, alatBahan.getStok());
            stmt.setInt(7, alatBahan.getHarga());
            stmt.executeUpdate();
        }
    }

    public AlatBahan read(int id) throws SQLException {
        String sql = "SELECT * FROM alatbahan WHERE id = ?";
        try (Connection connection = Database.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new AlatBahan(
                        rs.getInt("id"),
                        rs.getString("kategori"),
                        rs.getString("nama"),
                        rs.getString("jenis"),
                        rs.getString("satuan"),
                        rs.getInt("stok"),
                        rs.getInt("harga")
                );
            }
        }
        return null;
    }

    public List<AlatBahan> readAll() throws SQLException {
        List<AlatBahan> alatBahans = new ArrayList<>();
        String sql = "SELECT * FROM alatbahan";
        try (Connection connection = Database.getConnection();
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                alatBahans.add(new AlatBahan(
                        rs.getInt("id"),
                        rs.getString("kategori"),
                        rs.getString("nama"),
                        rs.getString("jenis"),
                        rs.getString("satuan"),
                        rs.getInt("stok"),
                        rs.getInt("harga")
                ));
            }
        }
        return alatBahans;
    }

    public void update(AlatBahan alatBahan) throws SQLException {
        String sql = "UPDATE alatbahan SET kategori = ?, nama = ?, jenis = ?, satuan = ?, stok = ?, harga = ? WHERE id = ?";
        try (Connection connection = Database.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, alatBahan.getKategori());
            stmt.setString(2, alatBahan.getNama());
            stmt.setString(3, alatBahan.getJenis());
            stmt.setString(4, alatBahan.getSatuan());
            stmt.setInt(5, alatBahan.getStok());
            stmt.setInt(6, alatBahan.getHarga());
            stmt.setInt(7, alatBahan.getId());
            stmt.executeUpdate();
        }
    }

    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM alatbahan WHERE id = ?";
        try (Connection connection = Database.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}

