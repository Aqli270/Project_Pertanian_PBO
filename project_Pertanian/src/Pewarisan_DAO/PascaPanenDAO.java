/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pewarisan_DAO;

import CRUD.Database;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Pewarisan.PascaPanen;
/**
 *
 * @author ASUS
 */
public class PascaPanenDAO {
    public void create(PascaPanen pascaPanen) throws SQLException {
        String sql = "INSERT INTO pascapanen (id, tanam, panen) VALUES (?, ?, ?)";
        try (Connection connection = Database.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, pascaPanen.getId());
            stmt.setDate(2, new java.sql.Date(pascaPanen.getTanam().getTime()));
            stmt.setDate(3, new java.sql.Date(pascaPanen.getPanen().getTime()));
            stmt.executeUpdate();
        }
    }

    public PascaPanen read(int id) throws SQLException {
        String sql = "SELECT * FROM pascapanen WHERE id = ?";
        try (Connection connection = Database.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new PascaPanen(
                        rs.getInt("id"),
                        rs.getDate("tanam"),
                        rs.getDate("panen")
                );
            }
        }
        return null;
    }

    public List<PascaPanen> readAll() throws SQLException {
        List<PascaPanen> pascaPanens = new ArrayList<>();
        String sql = "SELECT * FROM pascapanen";
        try (Connection connection = Database.getConnection();
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                pascaPanens.add(new PascaPanen(
                        rs.getInt("id"),
                        rs.getDate("tanam"),
                        rs.getDate("panen")
                ));
            }
        }
        return pascaPanens;
    }

    public void update(PascaPanen pascaPanen) throws SQLException {
        String sql = "UPDATE pascapanen SET tanam = ?, panen = ? WHERE id = ?";
        try (Connection connection = Database.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setDate(1, new java.sql.Date(pascaPanen.getTanam().getTime()));
            stmt.setDate(2, new java.sql.Date(pascaPanen.getPanen().getTime()));
            stmt.setInt(3, pascaPanen.getId());
            stmt.executeUpdate();
        }
    }

    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM pascapanen WHERE id = ?";
        try (Connection connection = Database.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}
