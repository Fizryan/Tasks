package radiobutton;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.JRadioButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Cursor;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.ButtonGroup;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RadioButton_103022300158 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioButton_103022300158 frame = new RadioButton_103022300158();
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
	public RadioButton_103022300158() {
		setResizable(false);
		setMinimumSize(new Dimension(720, 480));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{324, 0};
		gbl_contentPane.rowHeights = new int[]{23, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JRadioButton Admin = new JRadioButton("Admin");
		buttonGroup.add(Admin);
		Admin.setPreferredSize(new Dimension(55, 40));
		Admin.setMinimumSize(new Dimension(55, 40));
		Admin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Admin.setFocusable(false);
		Admin.setForeground(UIManager.getColor("Button.background"));
		Admin.setBackground(new Color(0, 0, 0));
		GridBagConstraints gbc_Admin = new GridBagConstraints();
		gbc_Admin.insets = new Insets(0, 0, 5, 0);
		gbc_Admin.fill = GridBagConstraints.HORIZONTAL;
		gbc_Admin.gridx = 0;
		gbc_Admin.gridy = 0;
		contentPane.add(Admin, gbc_Admin);
		
		JRadioButton User = new JRadioButton("User");
		buttonGroup.add(User);
		User.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		User.setPreferredSize(new Dimension(47, 40));
		User.setMinimumSize(new Dimension(47, 40));
		User.setForeground(UIManager.getColor("Button.background"));
		User.setFocusable(false);
		User.setBackground(Color.BLACK);
		GridBagConstraints gbc_User = new GridBagConstraints();
		gbc_User.fill = GridBagConstraints.HORIZONTAL;
		gbc_User.insets = new Insets(0, 0, 5, 0);
		gbc_User.gridx = 0;
		gbc_User.gridy = 1;
		contentPane.add(User, gbc_User);
		
		JRadioButton Guest = new JRadioButton("Guest");
		buttonGroup.add(Guest);
		Guest.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Guest.setPreferredSize(new Dimension(53, 40));
		Guest.setMinimumSize(new Dimension(53, 40));
		Guest.setForeground(UIManager.getColor("Button.background"));
		Guest.setFocusable(false);
		Guest.setBackground(Color.BLACK);
		GridBagConstraints gbc_Guest = new GridBagConstraints();
		gbc_Guest.insets = new Insets(0, 0, 5, 0);
		gbc_Guest.fill = GridBagConstraints.HORIZONTAL;
		gbc_Guest.gridx = 0;
		gbc_Guest.gridy = 2;
		contentPane.add(Guest, gbc_Guest);
		
		JButton Konfirmasi = new JButton("Konfirmasi\r\n");
		Konfirmasi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String selected = "";
				if (Admin.isSelected()) {
					selected = "Admin";
				} else if(User.isSelected()) {
					selected = "User";
				} else if(Guest.isSelected()) {
					selected = "Guest";
				}
				if (e.getButton() == 1 && (!selected.isEmpty() || !selected.isBlank())) {
					int confirm = JOptionPane.showConfirmDialog(null, "Memilih " + selected + "?", "Confirmation", JOptionPane.YES_NO_OPTION);
					if (confirm == JOptionPane.YES_OPTION) {
						JOptionPane.showMessageDialog(null, "Yeay Kamu berhasil memilih jenis akun " + selected, "Information", JOptionPane.INFORMATION_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Kamu belum memilih jenis akun", "Warning", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		Konfirmasi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Konfirmasi.setForeground(new Color(0, 0, 0));
		Konfirmasi.setFocusable(false);
		Konfirmasi.setFont(new Font("Tahoma", Font.BOLD, 14));
		Konfirmasi.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_Konfirmasi = new GridBagConstraints();
		gbc_Konfirmasi.fill = GridBagConstraints.BOTH;
		gbc_Konfirmasi.gridx = 0;
		gbc_Konfirmasi.gridy = 3;
		contentPane.add(Konfirmasi, gbc_Konfirmasi);
	}

}
