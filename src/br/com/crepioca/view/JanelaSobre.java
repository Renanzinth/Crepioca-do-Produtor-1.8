package br.com.crepioca.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class JanelaSobre extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaSobre frame = new JanelaSobre();
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
	public JanelaSobre() {
		setTitle("Sobre");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRztSolutions = new JLabel("RZT Solutions");
		lblRztSolutions.setFont(new Font("NewsGoth Lt BT", Font.BOLD, 25));
		lblRztSolutions.setBounds(138, 22, 169, 25);
		contentPane.add(lblRztSolutions);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(108, 58, 237, 24);
		contentPane.add(separator);
		
		JLabel lblDesde = new JLabel("Copyright \u00A9 - Desde 2017");
		lblDesde.setBounds(148, 58, 172, 33);
		contentPane.add(lblDesde);
		
		JLabel lblDesenvolvidoPorRenan = new JLabel("Desenvolvido por Renan Narciso");
		lblDesenvolvidoPorRenan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDesenvolvidoPorRenan.setBounds(108, 128, 237, 14);
		contentPane.add(lblDesenvolvidoPorRenan);
		
		JLabel label = new JLabel("Email:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setBounds(108, 165, 38, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("renan.narciso21@gmail.com");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_1.setBounds(153, 165, 201, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Github:");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_2.setBounds(108, 200, 47, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("github.com/Renanzinth");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_3.setBounds(162, 200, 169, 14);
		contentPane.add(label_3);
		
		JLabel lblV = new JLabel("v1.7 - 2017", SwingConstants.CENTER);
		lblV.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblV.setBounds(176, 236, 81, 14);
		contentPane.add(lblV);
	}
}
