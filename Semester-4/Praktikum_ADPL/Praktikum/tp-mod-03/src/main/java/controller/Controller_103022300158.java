package controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;

import model.DosenModel_103022300158;
import view.GUI_103022300158;

public class Controller_103022300158 {
	public Controller_103022300158(GUI_103022300158 gui, DosenModel_103022300158 model) {
		try {
			gui.getTable().setModel(model.getTableModel());
			
			gui.getTambahBtn().addMouseListener(new MouseAdapter(){
				@Override
				public void mouseClicked(MouseEvent e) {
					if (e.getButton() == 1) {
						String nama = gui.getNamaDosenField().getText().trim();
						String mataKuliah = gui.getMataKuliahField().getText().trim();
						
						if (!nama.isEmpty() && !mataKuliah.isEmpty()) {
							model.addDosen(nama, mataKuliah);
							gui.getNamaDosenField().setText("");
							gui.getMataKuliahField().setText("");
						} else {
							JOptionPane.showMessageDialog(gui, "LENGKAPI DATA TERLEBIH DAHULU", "WARNING!", JOptionPane.WARNING_MESSAGE);
						}
					}
				}
			});
			
			gui.getHapusBtn().addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (e.getButton() == 1) {
						int row = gui.getTable().getRowCount();
						if (row != 0) {
							int selectedRow = gui.getTable().getSelectedRow();
							if (selectedRow != -1) {
								int option = JOptionPane.showConfirmDialog(gui, "Apakah Kamu Ingin Menghapus Data Ini?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
								if (option == JOptionPane.YES_OPTION) model.removeDosen(selectedRow);
							} else {
								JOptionPane.showMessageDialog(gui, "Pilih Baris Yang Ingin Dihapus!", "Warning!", JOptionPane.WARNING_MESSAGE);
							}
						} else {
							JOptionPane.showMessageDialog(gui, "Tabel Data Sudah Kosong", "Information", JOptionPane.INFORMATION_MESSAGE);
						}
					}
				}
			});
			
			gui.getClearBtn().addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (e.getButton() == 1) {
						int row = gui.getTable().getRowCount();
						if (row != 0) {
							int option = JOptionPane.showConfirmDialog(gui, "Apakah Kamu Ingin Menghapus Semua Data Ini?\nData Yang Dihapus Tidak Bisa Dikembalikan!", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
							if (option == JOptionPane.YES_OPTION) model.clearDosen();
						} else {
							JOptionPane.showMessageDialog(gui, "Tabel Data Sudah Kosong", "Information", JOptionPane.INFORMATION_MESSAGE);
						}
					}
				}
			});
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(gui, "Terjadi Kesalahan Pada Controller\nRestart Aplikasi Di Butuhkan", "ERROR", JOptionPane.ERROR_MESSAGE);
		}	
	}
}
