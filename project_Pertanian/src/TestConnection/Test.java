/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//package TestConnection;
//
//import CRUD.Database;
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class Test {
//    public static void main(String[] args) {
//        try {
//            Connection connection = Database.getConnection();
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery("SELECT * FROM produk");
//
//            while (resultSet.next()) {
//                int id = resultSet.getInt("id");
//                String nama = resultSet.getString("nama");
//                int harga = resultSet.getInt("harga");
//
//                System.out.println("ID: " + id + ", Nama: " + nama + ", Harga: " + harga);
//            }
//
//            resultSet.close();
//            statement.close();
//            connection.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}
