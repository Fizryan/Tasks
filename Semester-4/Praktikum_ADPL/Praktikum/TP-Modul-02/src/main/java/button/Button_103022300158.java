package button;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.FlowLayout;
import java.awt.Cursor;
import java.awt.Point;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.Component;

public class Button_103022300158 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Button_103022300158 frame = new Button_103022300158();
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
	public Button_103022300158() {
		setResizable(false);
		setSize(new Dimension(720, 480));
		setMinimumSize(new Dimension(720, 480));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 655, 479);
		contentPane = new JPanel();
		contentPane.setPreferredSize(new Dimension(720, 480));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{236, 236, 236, 0};
		gbl_contentPane.rowHeights = new int[]{100, 100, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JTextPane warnaText = new JTextPane();
		warnaText.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		warnaText.setFocusable(false);
		warnaText.setFont(new Font("Tahoma", Font.BOLD, 20));
		warnaText.setForeground(UIManager.getColor("Button.background"));
		warnaText.setBackground(UIManager.getColor("Button.darkShadow"));
		GridBagConstraints gbc_warnaText = new GridBagConstraints();
		gbc_warnaText.gridwidth = 3;
		gbc_warnaText.fill = GridBagConstraints.BOTH;
		gbc_warnaText.insets = new Insets(0, 0, 5, 0);
		gbc_warnaText.gridx = 0;
		gbc_warnaText.gridy = 0;
		contentPane.add(warnaText, gbc_warnaText);
		
		java.awt.Button hijauBtn = new java.awt.Button("HIJAU\r\n");
		hijauBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getButton() == 1) {
					warnaText.setText("Hijau");
					warnaText.setForeground(Color.BLACK);
					warnaText.setBackground(new Color(0, 255, 0));
					warnaText.setAlignmentX(CENTER_ALIGNMENT);
				}
			}
		});
		hijauBtn.setPreferredSize(new Dimension(100, 40));
		hijauBtn.setForeground(Color.BLACK);
		hijauBtn.setBackground(new Color(0, 255, 0));
		hijauBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		GridBagConstraints gbc_hijauBtn = new GridBagConstraints();
		gbc_hijauBtn.fill = GridBagConstraints.BOTH;
		gbc_hijauBtn.insets = new Insets(0, 0, 0, 5);
		gbc_hijauBtn.gridx = 0;
		gbc_hijauBtn.gridy = 1;
		contentPane.add(hijauBtn, gbc_hijauBtn);
		
		java.awt.Button kuningBtn = new java.awt.Button("KUNING");
		kuningBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getButton() == 1) {
					warnaText.setText("Kuning");
					warnaText.setForeground(Color.BLACK);
					warnaText.setBackground(new Color(255, 255, 0));
					warnaText.setAlignmentX(CENTER_ALIGNMENT);
				}
			}
		});
		kuningBtn.setPreferredSize(new Dimension(100, 40));
		kuningBtn.setForeground(Color.BLACK);
		kuningBtn.setBackground(new Color(255, 255, 0));
		GridBagConstraints gbc_kuningBtn = new GridBagConstraints();
		gbc_kuningBtn.fill = GridBagConstraints.BOTH;
		gbc_kuningBtn.insets = new Insets(0, 0, 0, 5);
		gbc_kuningBtn.gridx = 1;
		gbc_kuningBtn.gridy = 1;
		contentPane.add(kuningBtn, gbc_kuningBtn);
		
		java.awt.Button unguBtn = new java.awt.Button("UNGU");
		unguBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getButton() == 1) {
					warnaText.setText("Ungu");
					warnaText.setForeground(Color.WHITE);
					warnaText.setBackground(new Color(75, 0, 130));
					warnaText.setAlignmentX(CENTER_ALIGNMENT);
				}
			}
		});
		unguBtn.setPreferredSize(new Dimension(100, 40));
		unguBtn.setForeground(Color.WHITE);
		unguBtn.setBackground(new Color(75, 0, 130));
		unguBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		GridBagConstraints gbc_unguBtn = new GridBagConstraints();
		gbc_unguBtn.fill = GridBagConstraints.BOTH;
		gbc_unguBtn.gridx = 2;
		gbc_unguBtn.gridy = 1;
		contentPane.add(unguBtn, gbc_unguBtn);
	}
}
