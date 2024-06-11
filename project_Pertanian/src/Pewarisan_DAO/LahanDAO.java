/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pewarisan_DAO;

import CRUD.Database;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Pewarisan.Lahan;

/**
 *
 * @author ASUS
 */
public class LahanDAO {

    public void create(Lahan lahan) throws SQLException {
        String sql = "INSERT INTO lahan (id, nama, bibit, luas, daerah) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = Database.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, lahan.getId());
            stmt.setString(2, lahan.getNama());
            stmt.setInt(3, lahan.getBibit());
            stmt.setString(4, lahan.getLuas());
            stmt.setString(5, lahan.getDaerah());
            stmt.executeUpdate();
        }
    }

    public Lahan read(int id) throws SQLException {
        String sql = "SELECT * FROM lahan WHERE id = ?";
        try (Connection connection = Database.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Lahan(
                        rs.getInt("id"),
                        rs.getString("nama"),
                        rs.getInt("bibit"),
                        rs.getString("luas"),
                        rs.getString("daerah")
                );
            }
        }
        return null;
    }

    public List<Lahan> readAll() throws SQLException {
        List<Lahan> lahans = new ArrayList<>();
        String sql = "SELECT * FROM lahan";
        try (Connection connection = Database.getConnection();
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                lahans.add(new Lahan(
                        rs.getInt("id"),
                        rs.getString("nama"),
                        rs.getInt("bibit"),
                        rs.getString("luas"),
                        rs.getString("daerah")
                ));
            }
        }
        return lahans;
    }

    public void update(Lahan lahan) throws SQLException {
        String sql = "UPDATE lahan SET nama = ?, bibit = ?, luas = ?, daerah = ? WHERE id = ?";
        try (Connection connection = Database.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, lahan.getNama());
            stmt.setInt(2, lahan.getBibit());
            stmt.setString(3, lahan.getLuas());
            stmt.setString(4, lahan.getDaerah());
            stmt.setInt(5, lahan.getId());
            stmt.executeUpdate();
        }
    }

    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM lahan WHERE id = ?";
        try (Connection connection = Database.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}