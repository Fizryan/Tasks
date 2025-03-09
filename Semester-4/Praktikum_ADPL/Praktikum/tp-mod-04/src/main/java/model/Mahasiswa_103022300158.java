package model;

public class Mahasiswa_103022300158 {
	private String nim;
	private String nama;
	private String prodi;
	private String angkatan;
	
	public Mahasiswa_103022300158(String nim, String nama, String prodi, String angkatan) {
		this.nim = nim;
		this.nama = nama;
		this.prodi = prodi;
		this.angkatan = angkatan;
	}
	
	public String getNim() { return nim; }
	public String getNama() { return nama; }
	public String getProdi() { return prodi; }
	public String getAngkatan() { return angkatan; }
	
	@Override
	public String toString() {
		return nim + " | " + nama + " | " + prodi + " | " + angkatan;
	}
}
