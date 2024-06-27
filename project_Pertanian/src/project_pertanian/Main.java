/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project_pertanian;

import Pewarisan.*;
import Pewarisan_DAO.AlatBahanDAO;
import Pewarisan_DAO.LahanDAO;
import Pewarisan_DAO.PascaPanenDAO;
import Pewarisan_DAO.LaporanPanenDAO;
import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;
import gui.frameUtama;

public class Main {
    public static void main(String[] args) {
        
        new frameUtama().setVisible(true);
        
        try (Scanner scanner = new Scanner(System.in)) {
            AlatBahanDAO alatBahanDAO = new AlatBahanDAO();
            LaporanPanenDAO laporanPanenDAO = new LaporanPanenDAO();
            LahanDAO lahanDAO = new LahanDAO();
            PascaPanenDAO pascaPanenDAO = new PascaPanenDAO();

            while (true) {
                System.out.println("Pilih tabel: 1-AlatBahan, 2-LaporanPanen, 3-Lahan, 4-PascaPanen, 5-Exit");
                int tableChoice = scanner.nextInt();
                scanner.nextLine();  // Clear the buffer

                if (tableChoice == 5) {
                    break;
                }

                System.out.println("Pilihan CRUD: 1-Create, 2-Read, 3-Update, 4-Delete");
                int crudChoice = scanner.nextInt();
                scanner.nextLine();  // Clear the buffer

                switch (tableChoice) {
                    case 1 -> handleAlatBahanCRUD(scanner, alatBahanDAO, crudChoice);
                    case 2 -> handleLaporanPanenCRUD(scanner, laporanPanenDAO, crudChoice);
                    case 3 -> handleLahanCRUD(scanner, lahanDAO, crudChoice);
                    case 4 -> handlePascaPanenCRUD(scanner, pascaPanenDAO, crudChoice);
                    default -> System.out.println("Tabel tidak valid.");
                }
            }
        } catch (SQLException e) {
        }
    }
    private static void handleAlatBahanCRUD(Scanner scanner, AlatBahanDAO AlatBahanDAO, int crudChoice) throws SQLException {
        switch (crudChoice) {
            case 1 -> {
                // Create LahanAlat
                System.out.println("Masukkan ID:");
                int id = scanner.nextInt();
                scanner.nextLine();  // Clear the buffer

                System.out.println("Masukkan kategori :");
                String kategori = scanner.nextLine();

                System.out.println("Masukkan nama");
                String nama = scanner.nextLine();

                System.out.println("Masukkan jenis:");
                String jenis = scanner.nextLine();
                
                System.out.println("Masukkan satuan:");
                String satuan = scanner.nextLine();
             
                System.out.println("Masukkan stok:");
                int stok = scanner.nextInt();

                System.out.println("Masukkan harga:");
                int harga = scanner.nextInt();

                AlatBahan alatBahan = new AlatBahan(id, kategori, nama, jenis, satuan, stok, harga);
                AlatBahanDAO.create(alatBahan);
                System.out.println("AlatBahan created.");
            }

            case 2 -> {
                // Read LahanAlat
                System.out.println("Masukkan ID AlatBahan yang ingin dibaca:");
                int readId = scanner.nextInt();
                scanner.nextLine();  // Clear the buffer

                AlatBahan readAlatBahan = AlatBahanDAO.read(readId);
                System.out.println(readAlatBahan);
            }

            case 3 -> {
                // Update LahanAlat
                System.out.println("Masukkan ID:");
                int updateid = scanner.nextInt();
                scanner.nextLine();  // Clear the buffer

                System.out.println("Masukkan kategori :");
                String newKategori = scanner.nextLine();

                System.out.println("Masukkan nama");
                String newNama = scanner.nextLine();

                System.out.println("Masukkan jenis:");
                String newJenis = scanner.nextLine();
                
                System.out.println("Masukkan satuan:");
                String newSatuan = scanner.nextLine();
             
                System.out.println("Masukkan stok:");
                int newStok = scanner.nextInt();

                System.out.println("Masukkan harga:");
                int newHarga = scanner.nextInt();

                AlatBahan updateAlatBahan = new AlatBahan(updateid, newKategori, newNama, newJenis, newSatuan, newStok, newHarga);
                AlatBahanDAO.update(updateAlatBahan);
                System.out.println("AlatBahan updated.");
            }

            case 4 -> {
                // Delete LahanAlat
                System.out.println("Masukkan ID AlatBahan yang ingin dihapus:");
                int deleteId = scanner.nextInt();
                scanner.nextLine();  // Clear the buffer

                AlatBahanDAO.delete(deleteId);
                System.out.println("AlatBahan deleted.");
            }

            default -> System.out.println("Pilihan tidak valid.");
        }
    }

    private static void handleLahanCRUD(Scanner scanner, LahanDAO lahanDAO, int crudChoice) throws SQLException {
        switch (crudChoice) {
            case 1 -> {
                // Create Lahan
                System.out.println("Masukkan ID:");
                int id = scanner.nextInt();
                scanner.nextLine();  // Clear the buffer

                System.out.println("Masukkan nama:");
                String namaLahan = scanner.nextLine();

                System.out.println("Masukkan bibit:");
                int bibitLahan = scanner.nextInt();
                scanner.nextLine();  // Clear the buffer

                System.out.println("Masukkan luas:");
                String luasLahan = scanner.nextLine();

                System.out.println("Masukkan daerah:");
                String daerahLahan = scanner.nextLine();

                Lahan lahan = new Lahan(id, namaLahan, bibitLahan, luasLahan, daerahLahan);
                lahanDAO.create(lahan);
                System.out.println("Lahan created.");
            }

            case 2 -> {
                // Read Lahan
                System.out.println("Masukkan ID Lahan yang ingin dibaca:");
                int readId = scanner.nextInt();
                scanner.nextLine();  // Clear the buffer

                Lahan readLahan = lahanDAO.read(readId);
                System.out.println(readLahan);
            }

            case 3 -> {
                // Update Lahan
                System.out.println("Masukkan ID Lahan yang ingin diperbarui:");
                int updateId = scanner.nextInt();
                scanner.nextLine();  // Clear the buffer

                System.out.println("Masukkan nama baru:");
                String newnamaLahan = scanner.nextLine();

                System.out.println("Masukkan bibit baru:");
                int newbibitLahan = scanner.nextInt();
                scanner.nextLine();  // Clear the buffer

                System.out.println("Masukkan luas baru:");
                String newluasLahan = scanner.nextLine();

                System.out.println("Masukkan daerah baru:");
                String newdaerahLahan = scanner.nextLine();

                Lahan updateLahan = new Lahan(updateId, newnamaLahan, newbibitLahan, newluasLahan, newdaerahLahan);
                lahanDAO.update(updateLahan);
                System.out.println("Lahan updated.");
            }

            case 4 -> {
                // Delete Lahan
                System.out.println("Masukkan ID Lahan yang ingin dihapus:");
                int deleteId = scanner.nextInt();
                scanner.nextLine();  // Clear the buffer

                lahanDAO.delete(deleteId);
                System.out.println("Lahan deleted.");
            }

            default -> System.out.println("Pilihan tidak valid.");
        }
    }


    private static void handlePascaPanenCRUD(Scanner scanner, PascaPanenDAO pascaPanenDAO, int crudChoice) throws SQLException {
        switch (crudChoice) {
            case 1 -> {
                // Create PascaPanen
                System.out.println("Masukkan ID:");
                int id = scanner.nextInt();
                scanner.nextLine();  // Clear the buffer

                System.out.println("Masukkan tanggal tanam (format: yyyy-mm-dd):");
                String tanamInput = scanner.nextLine();
                Date tanam = java.sql.Date.valueOf(tanamInput);

                System.out.println("Masukkan tanggal panen (format: yyyy-mm-dd):");
                String panenInput = scanner.nextLine();
                Date panen = java.sql.Date.valueOf(panenInput);

                PascaPanen pascaPanen = new PascaPanen(id, tanam, panen);
                pascaPanenDAO.create(pascaPanen);
                System.out.println("PascaPanen created.");
            }
            case 2 -> {
                // Read PascaPanen
                System.out.println("Masukkan id PascaPanen yang ingin dibaca:");
                int readId = scanner.nextInt();
                scanner.nextLine();  // Clear the buffer

                PascaPanen readPascaPanen = pascaPanenDAO.read(readId);
                System.out.println(readPascaPanen);
            }
            case 3 -> {
                // Update PascaPanen
                System.out.println("Masukkan ID:");
                int updateId = scanner.nextInt();
                scanner.nextLine();  // Clear the buffer

                System.out.println("Masukkan tanggal tanam baru (format: yyyy-mm-dd):");
                String updateTanamInput = scanner.nextLine();
                Date newTanam = java.sql.Date.valueOf(updateTanamInput);

                System.out.println("Masukkan tanggal panen baru (format: yyyy-mm-dd):");
                String updatePanenInput = scanner.nextLine();
                Date newPanen = java.sql.Date.valueOf(updatePanenInput);

                PascaPanen updatePascaPanen = new PascaPanen(updateId, newTanam, newPanen);
                pascaPanenDAO.update(updatePascaPanen);
                System.out.println("PascaPanen updated.");
            }
            case 4 -> {
                // Delete PascaPanen
                System.out.println("Masukkan ID PascaPanen yang ingin dihapus:");
                int deleteId = scanner.nextInt();
                scanner.nextLine();  // Clear the buffer

                pascaPanenDAO.delete(deleteId);
                System.out.println("PascaPanen deleted.");
            }
            default -> System.out.println("Pilihan tidak valid.");
        }
    }


    private static void handleLaporanPanenCRUD(Scanner scanner, LaporanPanenDAO laporanPanenDAO, int crudChoice) throws SQLException {
        switch (crudChoice) {
            case 1 -> {
                // Create LaporanPanen
                System.out.println("Masukkan ID LaporanPanen:");
                int id = scanner.nextInt();
                scanner.nextLine();  // Clear the buffer

                System.out.println("Masukkan nama:");
                String nama = scanner.nextLine();

                System.out.println("Masukkan jumlah:");
                String jumlah = scanner.nextLine();

                System.out.println("Masukkan satuan:");
                String satuan = scanner.nextLine();

                System.out.println("Masukkan harga:");
                String harga = scanner.nextLine();

                LaporanPanen laporanPanen = new LaporanPanen(id, nama, jumlah, satuan, harga);
                laporanPanenDAO.create(laporanPanen);
                System.out.println("LaporanPanen created.");
            }

            case 2 -> {
                // Read LaporanPanen
                System.out.println("Masukkan ID LaporanPanen yang ingin dibaca:");
                int readId = scanner.nextInt();
                scanner.nextLine();  // Clear the buffer

                LaporanPanen readLaporanPanen = laporanPanenDAO.read(readId);
                System.out.println(readLaporanPanen);
            }

            case 3 -> {
                // Update LaporanPanen
                System.out.println("Masukkan ID LaporanPanen yang ingin diperbarui:");
                int updateId = scanner.nextInt();
                scanner.nextLine();  // Clear the buffer

                System.out.println("Masukkan nama baru:");
                String newNama = scanner.nextLine();

                System.out.println("Masukkan jumlah baru:");
                String newJumlah = scanner.nextLine();

                System.out.println("Masukkan satuan baru:");
                String newSatuan = scanner.nextLine();

                System.out.println("Masukkan harga baru:");
                String newHarga = scanner.nextLine();

                LaporanPanen updateLaporanPanen = new LaporanPanen(updateId, newNama, newJumlah, newSatuan, newHarga);
                laporanPanenDAO.update(updateLaporanPanen);
                System.out.println("LaporanPanen updated.");
            }

            case 4 -> {
                // Delete LaporanPanen
                System.out.println("Masukkan ID LaporanPanen yang ingin dihapus:");
                int deleteId = scanner.nextInt();
                scanner.nextLine();  // Clear the buffer

                laporanPanenDAO.delete(deleteId);
                System.out.println("LaporanPanen deleted.");
            }

            default -> System.out.println("Pilihan tidak valid.");
        }
    }
}

