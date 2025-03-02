package table;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import javax.swing.JTable;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;

public class Table_103022300158 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Table_103022300158 frame = new Table_103022300158();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Table_103022300158() {
		setResizable(false);
		setMinimumSize(new Dimension(720, 480));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridwidth = 2;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 0;
		contentPane.add(scrollPane, gbc_scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setForeground(new Color(255, 255, 255));
		table.setBackground(new Color(105, 105, 105));
		table.setFocusable(false);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nama Kota", "Jumlah Penduduk", "Luas Wilayah (km^2)"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(120);
		table.getColumnModel().getColumn(0).setMinWidth(120);
		table.getColumnModel().getColumn(1).setPreferredWidth(120);
		table.getColumnModel().getColumn(1).setMinWidth(120);
		table.getColumnModel().getColumn(2).setPreferredWidth(120);
		table.getColumnModel().getColumn(2).setMinWidth(120);
		
		JButton DeleteBtn = new JButton("Hapus");
		DeleteBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getButton() == 1) {
					int selectedRow = table.getSelectedRow();
					if (selectedRow != -1) {
						int confirm = JOptionPane.showConfirmDialog(null, "Apakah kamu ingin menghapus data ini? data yang di hapus tidak bisa dikembalikan", "Warning", JOptionPane.WARNING_MESSAGE);
						if (confirm == JOptionPane.YES_OPTION) {
							DefaultTableModel model = (DefaultTableModel) table.getModel();
							model.removeRow(selectedRow);
						}
					} else {
						JOptionPane.showMessageDialog(null, "Kamu Belum memilih data yang ingin dihapus", "Warning", JOptionPane.WARNING_MESSAGE);
					}
				}
			}
		});
		DeleteBtn.setPreferredSize(new Dimension(63, 30));
		DeleteBtn.setMinimumSize(new Dimension(63, 30));
		DeleteBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		DeleteBtn.setFocusable(false);
		DeleteBtn.setForeground(new Color(0, 0, 0));
		DeleteBtn.setBackground(new Color(105, 105, 105));
		GridBagConstraints gbc_DeleteBtn = new GridBagConstraints();
		gbc_DeleteBtn.fill = GridBagConstraints.BOTH;
		gbc_DeleteBtn.insets = new Insets(0, 0, 0, 5);
		gbc_DeleteBtn.gridx = 0;
		gbc_DeleteBtn.gridy = 1;
		contentPane.add(DeleteBtn, gbc_DeleteBtn);
		
		JButton TambahBtn = new JButton("Tambah");
		TambahBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getButton() == 1) {
					String namaKota = JOptionPane.showInputDialog(null, "Nama Kota");
					if (namaKota == null) return;
					String jumlahPendudukStr = JOptionPane.showInputDialog(null, "Jumlah Penduduk");
					if (jumlahPendudukStr == null) return;
					String luasWilayahStr = JOptionPane.showInputDialog(null, "Luas Wilayah (km^2)");
					if (luasWilayahStr == null) return;
					try {
						int jumlahPendudukInt = Integer.parseInt(jumlahPendudukStr);
						double luasWilayahInt = Double.parseDouble(luasWilayahStr);
						DefaultTableModel model = (DefaultTableModel) table.getModel();
						model.addRow(new Object[]{namaKota, jumlahPendudukInt, luasWilayahInt});
					} catch (NumberFormatException ex) {
						JOptionPane.showMessageDialog(null, "Jumlah Penduduk dan Luas Wilayah harus angka!", "Warning", JOptionPane.WARNING_MESSAGE);
					}
				}
			}
		});
		TambahBtn.setPreferredSize(new Dimension(71, 30));
		TambahBtn.setMinimumSize(new Dimension(71, 30));
		TambahBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		TambahBtn.setForeground(new Color(0, 0, 0));
		TambahBtn.setBackground(SystemColor.activeCaption);
		TambahBtn.setFocusable(false);
		GridBagConstraints gbc_TambahBtn = new GridBagConstraints();
		gbc_TambahBtn.fill = GridBagConstraints.BOTH;
		gbc_TambahBtn.gridx = 1;
		gbc_TambahBtn.gridy = 1;
		contentPane.add(TambahBtn, gbc_TambahBtn);
	}

}
