package checkbox;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import javax.swing.JCheckBox;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.UIManager;
import java.awt.Cursor;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class CheckBox_103022300158 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckBox_103022300158 frame = new CheckBox_103022300158();
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
	public CheckBox_103022300158() {
		setPreferredSize(new Dimension(720, 480));
		setMinimumSize(new Dimension(720, 480));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JCheckBox NasiGoreng = new JCheckBox("Nasi Goreng");
		NasiGoreng.setMinimumSize(new Dimension(83, 40));
		NasiGoreng.setPreferredSize(new Dimension(83, 40));
		NasiGoreng.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		NasiGoreng.setFocusable(false);
		NasiGoreng.setForeground(UIManager.getColor("Button.background"));
		NasiGoreng.setBackground(UIManager.getColor("Button.darkShadow"));
		GridBagConstraints gbc_NasiGoreng = new GridBagConstraints();
		gbc_NasiGoreng.fill = GridBagConstraints.BOTH;
		gbc_NasiGoreng.insets = new Insets(0, 0, 5, 0);
		gbc_NasiGoreng.gridx = 0;
		gbc_NasiGoreng.gridy = 0;
		contentPane.add(NasiGoreng, gbc_NasiGoreng);
		
		JCheckBox SateAyam = new JCheckBox("Sate Ayam");
		SateAyam.setMinimumSize(new Dimension(83, 40));
		SateAyam.setFocusable(false);
		SateAyam.setForeground(UIManager.getColor("Button.background"));
		SateAyam.setBackground(UIManager.getColor("Button.darkShadow"));
		SateAyam.setPreferredSize(new Dimension(83, 40));
		SateAyam.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		GridBagConstraints gbc_SateAyam = new GridBagConstraints();
		gbc_SateAyam.fill = GridBagConstraints.BOTH;
		gbc_SateAyam.insets = new Insets(0, 0, 5, 0);
		gbc_SateAyam.gridx = 0;
		gbc_SateAyam.gridy = 1;
		contentPane.add(SateAyam, gbc_SateAyam);
		
		JCheckBox Bakso = new JCheckBox("Bakso");
		Bakso.setMinimumSize(new Dimension(83, 40));
		Bakso.setForeground(UIManager.getColor("Button.background"));
		Bakso.setBackground(UIManager.getColor("Button.darkShadow"));
		Bakso.setFocusable(false);
		Bakso.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Bakso.setPreferredSize(new Dimension(83, 40));
		GridBagConstraints gbc_Bakso = new GridBagConstraints();
		gbc_Bakso.fill = GridBagConstraints.BOTH;
		gbc_Bakso.insets = new Insets(0, 0, 5, 0);
		gbc_Bakso.gridx = 0;
		gbc_Bakso.gridy = 2;
		contentPane.add(Bakso, gbc_Bakso);
		
		JCheckBox MieAyam = new JCheckBox("Mie Ayam");
		MieAyam.setMinimumSize(new Dimension(83, 23));
		MieAyam.setBackground(UIManager.getColor("Button.darkShadow"));
		MieAyam.setForeground(UIManager.getColor("Button.background"));
		MieAyam.setFocusable(false);
		MieAyam.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		MieAyam.setPreferredSize(new Dimension(83, 40));
		GridBagConstraints gbc_MieAyam = new GridBagConstraints();
		gbc_MieAyam.fill = GridBagConstraints.BOTH;
		gbc_MieAyam.insets = new Insets(0, 0, 5, 0);
		gbc_MieAyam.gridx = 0;
		gbc_MieAyam.gridy = 3;
		contentPane.add(MieAyam, gbc_MieAyam);
		
		JButton TampilkanBtn = new JButton("Tampilkan\r\n");
		TampilkanBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ArrayList<String> selected = new ArrayList<>();
				if (NasiGoreng.isSelected()) {
					selected.add("Nasi Goreng");
				} 
				if (SateAyam.isSelected()) {
					selected.add("Sate Ayam");
				}
				if (Bakso.isSelected()) {
					selected.add("Bakso");
				}
				if (MieAyam.isSelected()) {
					selected.add("Mie Ayam");
				}
				if (e.getButton() == 1 && !selected.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Kamu memilih " + String.join(", ", selected), "Makanan Favorit Mu", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "Kamu Belum memilih makanan favorit mu", "Makanan Favorit Mu", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		TampilkanBtn.setBackground(SystemColor.activeCaption);
		TampilkanBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		TampilkanBtn.setFocusable(false);
		GridBagConstraints gbc_TampilkanBtn = new GridBagConstraints();
		gbc_TampilkanBtn.fill = GridBagConstraints.BOTH;
		gbc_TampilkanBtn.gridx = 0;
		gbc_TampilkanBtn.gridy = 4;
		contentPane.add(TampilkanBtn, gbc_TampilkanBtn);
	}

}
