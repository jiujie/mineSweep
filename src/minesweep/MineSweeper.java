package minesweep;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MineSweeper {

	private JFrame frmMinesweeper;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MineSweeper window = new MineSweeper();
					window.frmMinesweeper.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
					
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MineSweeper() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMinesweeper = new JFrame();
		frmMinesweeper.setIconImage(Toolkit.getDefaultToolkit().getImage(MineSweeper.class.getResource("/minesweep/res/9B891H4G.png")));
		frmMinesweeper.setBounds(100, 100, 450, 300);
		frmMinesweeper.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMinesweeper.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 255));
		frmMinesweeper.getContentPane().add(panel, "name_34202351322192");
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("New label");
		panel_3.add(lblNewLabel);
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel_5 = new JPanel();
		panel_4.add(panel_5);
		panel_5.setLayout(new GridLayout(0, 1, 10, 10));
		
		JPanel panel_6 = new JPanel();
		panel_5.add(panel_6);
		
		JPanel panel_7 = new JPanel();
		panel_5.add(panel_7);
		
		JButton btnNewButton = new JButton("New button");
		panel_5.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("New button");
		panel_5.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("New button");
		panel_5.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		frmMinesweeper.getContentPane().add(panel_1, "name_34207841866785");
		
		JPanel panel_2 = new JPanel();
		frmMinesweeper.getContentPane().add(panel_2, "name_34210986740188");
	}
}
