package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class GUI_103022300158 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField namaDosenField;
	private JLabel mataKuliahTXT;
	private JTextField mataKuliahAjarField;
	private JButton tambahBtn;
	private JButton hapusBtn;
	private JButton clearBtn;
	private JPanel fillPane;
	private JTable table;
	private JScrollPane scrollPane;

	/**
	 * Create the frame.
	 */
	public GUI_103022300158() {
		setMinimumSize(new Dimension(720, 480));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.windowBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{140, 0, 0};
		gbl_contentPane.rowHeights = new int[]{40, 40, 40, 40, 40, 40, 40, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel namaDosenTXT = new JLabel("Nama Dosen\r\n");
		namaDosenTXT.setFocusable(false);
		namaDosenTXT.setFont(new Font("Tahoma", Font.BOLD, 14));
		namaDosenTXT.setForeground(SystemColor.text);
		namaDosenTXT.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_namaDosenTXT = new GridBagConstraints();
		gbc_namaDosenTXT.fill = GridBagConstraints.BOTH;
		gbc_namaDosenTXT.insets = new Insets(0, 0, 5, 5);
		gbc_namaDosenTXT.gridx = 0;
		gbc_namaDosenTXT.gridy = 0;
		contentPane.add(namaDosenTXT, gbc_namaDosenTXT);
		
		scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridheight = 8;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 0;
		contentPane.add(scrollPane, gbc_scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nama Dosen", "Mata Kuliah Ajar"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(120);
		table.getColumnModel().getColumn(0).setMinWidth(40);
		table.getColumnModel().getColumn(1).setPreferredWidth(120);
		table.getColumnModel().getColumn(1).setMinWidth(40);
		scrollPane.setViewportView(table);
		
		namaDosenField = new JTextField();
		namaDosenField.setBackground(SystemColor.window);
		namaDosenField.setMinimumSize(new Dimension(220, 40));
		namaDosenField.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_namaDosenField = new GridBagConstraints();
		gbc_namaDosenField.insets = new Insets(0, 0, 5, 5);
		gbc_namaDosenField.fill = GridBagConstraints.BOTH;
		gbc_namaDosenField.gridx = 0;
		gbc_namaDosenField.gridy = 1;
		contentPane.add(namaDosenField, gbc_namaDosenField);
		namaDosenField.setColumns(10);
		
		mataKuliahTXT = new JLabel("Mata Kuliah Ajar");
		mataKuliahTXT.setHorizontalAlignment(SwingConstants.CENTER);
		mataKuliahTXT.setFocusable(false);
		mataKuliahTXT.setFont(new Font("Tahoma", Font.BOLD, 14));
		mataKuliahTXT.setForeground(SystemColor.text);
		GridBagConstraints gbc_mataKuliahTXT = new GridBagConstraints();
		gbc_mataKuliahTXT.fill = GridBagConstraints.BOTH;
		gbc_mataKuliahTXT.insets = new Insets(0, 0, 5, 5);
		gbc_mataKuliahTXT.gridx = 0;
		gbc_mataKuliahTXT.gridy = 2;
		contentPane.add(mataKuliahTXT, gbc_mataKuliahTXT);
		
		mataKuliahAjarField = new JTextField();
		mataKuliahAjarField.setHorizontalAlignment(SwingConstants.CENTER);
		mataKuliahAjarField.setBackground(SystemColor.window);
		GridBagConstraints gbc_mataKuliahAjarField = new GridBagConstraints();
		gbc_mataKuliahAjarField.insets = new Insets(0, 0, 5, 5);
		gbc_mataKuliahAjarField.fill = GridBagConstraints.BOTH;
		gbc_mataKuliahAjarField.gridx = 0;
		gbc_mataKuliahAjarField.gridy = 3;
		contentPane.add(mataKuliahAjarField, gbc_mataKuliahAjarField);
		mataKuliahAjarField.setColumns(10);
		
		tambahBtn = new JButton("Tambah");
		tambahBtn.setFont(new Font("Tahoma", Font.BOLD, 12));
		tambahBtn.setBackground(Color.GREEN);
		tambahBtn.setFocusable(false);
		tambahBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		GridBagConstraints gbc_tambahBtn = new GridBagConstraints();
		gbc_tambahBtn.fill = GridBagConstraints.BOTH;
		gbc_tambahBtn.insets = new Insets(0, 0, 5, 5);
		gbc_tambahBtn.gridx = 0;
		gbc_tambahBtn.gridy = 4;
		contentPane.add(tambahBtn, gbc_tambahBtn);
		
		hapusBtn = new JButton("Hapus");
		hapusBtn.setFocusable(false);
		hapusBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		hapusBtn.setBackground(Color.YELLOW);
		hapusBtn.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_hapusBtn = new GridBagConstraints();
		gbc_hapusBtn.fill = GridBagConstraints.BOTH;
		gbc_hapusBtn.insets = new Insets(0, 0, 5, 5);
		gbc_hapusBtn.gridx = 0;
		gbc_hapusBtn.gridy = 5;
		contentPane.add(hapusBtn, gbc_hapusBtn);
		
		clearBtn = new JButton("Clear");
		clearBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		clearBtn.setFont(new Font("Tahoma", Font.BOLD, 12));
		clearBtn.setFocusable(false);
		clearBtn.setBackground(Color.RED);
		GridBagConstraints gbc_clearBtn = new GridBagConstraints();
		gbc_clearBtn.fill = GridBagConstraints.BOTH;
		gbc_clearBtn.insets = new Insets(0, 0, 5, 5);
		gbc_clearBtn.gridx = 0;
		gbc_clearBtn.gridy = 6;
		contentPane.add(clearBtn, gbc_clearBtn);
		
		fillPane = new JPanel();
		fillPane.setBorder(null);
		fillPane.setBackground(SystemColor.windowBorder);
		GridBagConstraints gbc_fillPane = new GridBagConstraints();
		gbc_fillPane.insets = new Insets(0, 0, 0, 5);
		gbc_fillPane.fill = GridBagConstraints.BOTH;
		gbc_fillPane.gridx = 0;
		gbc_fillPane.gridy = 7;
		contentPane.add(fillPane, gbc_fillPane);
	}
	
	public JTextField getNamaDosenField() {
		return namaDosenField;
	}
	
	public JTextField getMataKuliahField() {
		return mataKuliahAjarField;
	}
	
	public JButton getTambahBtn() {
		return tambahBtn;
	}
	
	public JButton getHapusBtn() {
		return hapusBtn;
	}
	
	public JButton getClearBtn() {
		return clearBtn;
	}
	
	public JTable getTable() {
		return table;
	}
}
