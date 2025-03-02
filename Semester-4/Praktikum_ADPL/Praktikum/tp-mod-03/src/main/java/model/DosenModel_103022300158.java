package model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class DosenModel_103022300158 {
	private List<Dosen_103022300158> daftarDosen;
	private DefaultTableModel tableModel;
	
	public DosenModel_103022300158() {
		daftarDosen = new ArrayList<>();
		tableModel = new DefaultTableModel(new Object[]{"Nama Dosen", "Mata Kuliah Ajar"}, 0);
	}
	
	public void addDosen(String nama, String mataKuliah) {
		Dosen_103022300158 dosen = new Dosen_103022300158(nama, mataKuliah);
		daftarDosen.add(dosen);
		tableModel.addRow(new Object[] {nama, mataKuliah});
	}
	
	public void removeDosen(int index) {
		if (index >= 0 && index < daftarDosen.size()) {
			daftarDosen.remove(index);
			tableModel.removeRow(index);
		}
	}
	
	public void clearDosen() {
		daftarDosen.clear();
		tableModel.setRowCount(0);
	}
	
	public DefaultTableModel getTableModel() {
		return tableModel;
	}
}
