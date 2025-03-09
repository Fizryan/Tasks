package model;

import java.util.Scanner;

public class Main_103022300158 {
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		while (true) {
			System.out.println("\n===== MENU DATA MAHASISWA =====");
			System.out.println("1.	Tambah Mahasiswa");
			System.out.println("2.	Tampilkan Semua Mahasiswa");
			System.out.println("3.	Edit Mahasiswa");
			System.out.println("4.	Hapus Mahasiswa");
			System.out.println("5.	Keluar");
			System.out.print("Pilih Menu: ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice) {
			case 1:
				addMahasiswa();
				break;
			case 2:
				showAllMahasiswa();
				break;
			case 3:
				updateMahasiswa();
				break;
			case 4:
				deleteMahasiswa();
				break;
			case 5:
				System.out.println("Keluar dari Program.");
				return;
			default:
				System.out.println("Pilihan tidak valid.");
			}
		}
	}
	
	private static void addMahasiswa() {
		try {
			System.out.print("Masukkan NIM: ");
			String nim = scanner.nextLine();
			System.out.print("Masukkan Nama: ");
			String nama = scanner.nextLine();
			System.out.print("Masukkan Program Studi: ");
			String prodi = scanner.nextLine();
			System.out.print("Masukkan Angkatan: ");
			String angkatan = scanner.nextLine();
			
			Database_103022300158.addMahasiswa(nim, nama, prodi, angkatan);
		} catch (Exception ex){
			System.out.println("(MAIN) Gagal Menambahkan Mahasiswa: " + ex.getMessage());
		}
	}
	
	private static void showAllMahasiswa() {
		Database_103022300158.getAllMahasiswa();
	}
	
	private static void updateMahasiswa() {
		try {
			System.out.print("Massukan NIM yang ingin diubah: ");
			String nim = scanner.nextLine();
			System.out.print("Masukkan Nama yang baru: ");
			String nama = scanner.nextLine();
			System.out.print("Masukkan Prodi yang baru: ");
			String prodi = scanner.nextLine();
			System.out.print("Masukkan Angkatan yang baru: ");
			String angkatan = scanner.nextLine();
			
			Database_103022300158.updateMahasiswa(nim, nama, prodi, angkatan);
		} catch (Exception ex) {
			System.out.println("(MAIN) Gagal mengupdate data Mahasiswa: " + ex.getMessage());
		}
	}
	
	private static void deleteMahasiswa() {
		System.out.print("Masukkan NIM mahasiswa yang ingin dihapus: ");
		String nim = scanner.nextLine();
		Database_103022300158.deleteMahasiswa(nim);
	}
}
