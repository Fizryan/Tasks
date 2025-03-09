package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Database_103022300158 {
	private static final String URL = "jdbc:mysql://localhost:3306/sistem_mahasiswa";
	private static final String USER = "root";
	private static final String PASSWORD = "";
	
	public static Connection connect() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException ex) {
			throw new SQLException("Driver JDBC tidak ditemukan!", ex.getMessage());
		}
		
	}

	public static void addMahasiswa(String nim, String nama, String prodi, String angkatan) {
		String query = "INSERT INTO mahasiswa (nim, nama, prodi, angkatan) VALUES (?, ?, ?, ?)";
		try (Connection conn = connect(); PreparedStatement stmt = conn.prepareStatement(query)) {
			stmt.setString(1, nim);
			stmt.setString(2, nama);
			stmt.setString(3, prodi);
			stmt.setString(4, angkatan);
			stmt.executeUpdate();
			System.out.println("Mahasiswa berhasil ditambahkan.");
		} catch (SQLException ex) {
			System.out.println("(Database) Gagal menambahkan mahasiswa: " + ex.getMessage());
		}
	}
	
	public static void updateMahasiswa(String nim, String nama, String prodi, String angkatan) {
		String query = "UPDATE mahasiswa SET nama=?, prodi=?, angkatan=? WHERE nim=?";
		try (Connection conn = connect(); PreparedStatement stmt = conn.prepareStatement(query)) {
			stmt.setString(1, nama);
			stmt.setString(2, prodi);
			stmt.setString(3, angkatan);
			stmt.setString(4, nim);
			int rowsUpdated = stmt.executeUpdate();
			if (rowsUpdated > 0) {
				System.out.printf("Mahasiswa dengan NIM %s berhasil diperbarui.", nim);
			} else {
				System.out.printf("Mahasiswa dengan NIM %s tersebut tidak ditemukan.", nim);
			}
		} catch (SQLException ex) {
			System.out.println("(Database) Gagal mengupdate mahasiswa: " + ex.getMessage());
		}
	}
	
	public static void deleteMahasiswa(String nim) {
		String query = "DELETE FROM mahasiswa WHERE nim=?";
		try (Connection conn = connect(); PreparedStatement stmt = conn.prepareStatement(query)) {
			stmt.setString(1, nim);
			int rowsDeleted = stmt.executeUpdate();
			if (rowsDeleted > 0) {
				System.out.printf("Mahasiswa dengan NIM %s berhasil dihapus.", nim);
			} else {
				System.out.printf("Mahasiswa dengan NIM %s tersebut tidak ditemukan.", nim);
			}
		} catch (SQLException ex) {
			System.out.println("(Database) Gagal menghapus mahasiswa: " + ex.getMessage());
		}
	}
	
	public static List<Mahasiswa_103022300158> showAllMahasiswa() {
		List<Mahasiswa_103022300158> mahasiswaList = new ArrayList<>();
		String query = "SELECT * FROM mahasiswa";
		try (Connection conn = connect(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)){
			while (rs.next()) {
				mahasiswaList.add(new Mahasiswa_103022300158(rs.getString("nim"), rs.getString("nama"), rs.getString("prodi"), rs.getString("angkatan")));
			}
		} catch (SQLException ex) {
			System.out.println("(Database) Gagal mengambil data mahasiswa: " + ex.getMessage());
		}
		return mahasiswaList;
	}
	
	public static void getAllMahasiswa() {
		try {
			List<Mahasiswa_103022300158> mahasiswaList = showAllMahasiswa();
			String[] columnNames = {"NIM", "Nama", "Program Studi", "Tahun Angkatan"};
			DefaultTableModel model = new DefaultTableModel(columnNames, 0);
			for (Mahasiswa_103022300158 mhs : mahasiswaList) {
				Object[] row = {mhs.getNim(), mhs.getNama(), mhs.getProdi(), mhs.getAngkatan()};
				model.addRow(row);
			}
			
			JTable table = new JTable(model);
			JScrollPane scrollPane = new JScrollPane(table);
			JFrame frame = new JFrame("Data Mahasiswa");
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			frame.add(scrollPane);
			frame.setSize(720, 480);
			frame.setResizable(false);
			frame.setVisible(true);
		} catch (Exception ex) {
			System.out.println("(Database) Gagal menampilkan Table: " + ex.getMessage());
		}
	}
}
