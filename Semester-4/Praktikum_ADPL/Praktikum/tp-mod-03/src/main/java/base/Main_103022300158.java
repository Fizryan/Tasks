package base;

import java.awt.EventQueue;

import javax.swing.JOptionPane;

import controller.Controller_103022300158;
import model.DosenModel_103022300158;
import view.GUI_103022300158;

public class Main_103022300158 {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_103022300158 frame = new GUI_103022300158();
					DosenModel_103022300158 model = new DosenModel_103022300158();
	                new Controller_103022300158(frame, model);
					frame.setVisible(true);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Pada Program", "ERROR", JOptionPane.ERROR_MESSAGE);
					e.printStackTrace();
					System.exit(1);
				}
			}
		});
	}
}
