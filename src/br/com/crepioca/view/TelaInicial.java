package br.com.crepioca.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.AbstractButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.JSeparator;

public class TelaInicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
					frame.setVisible(true);
					//frame.setLocationRelativeTo(null);            Centraliza o JFrame
					//frame.setExtendedState(frame.MAXIMIZED_BOTH);  //Tela maximizada
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaInicial() {
		setTitle("Crepioca do Produtor - RZT Solutions");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(-7, 0, 1380, 735); // 
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Botão NOVA VENDA
		JButton btnNovaVenda = new JButton("");
		btnNovaVenda.setIcon(new ImageIcon(TelaInicial.class.getResource("/br/com/crepioca/view/image/cart flat icon.png")));
		btnNovaVenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO FAZER AÇÃO DO BOTÃO Nova Venda
			}
		});
		btnNovaVenda.setBounds(293, 35, 173, 147);
		contentPane.add(btnNovaVenda);
		
		//Label NOVA VENDA
		JLabel lblNovaVenda = new JLabel("Nova Venda");
		lblNovaVenda.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNovaVenda.setBounds(330, 193, 103, 14);
		contentPane.add(lblNovaVenda);
		
		//Botão CADASTRAR PRODUTO
		JButton btnCadastrarProduto = new JButton("");
		btnCadastrarProduto.setIcon(new ImageIcon(TelaInicial.class.getResource("/br/com/crepioca/view/image/new product flat icon.png")));
		btnCadastrarProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastrarProduto cp = new CadastrarProduto();
				cp.setVisible(true);
				cp.setLocationRelativeTo(null); //CENTRALIZAR TELA
			}
		});
		btnCadastrarProduto.setBounds(487, 35, 173, 147);
		contentPane.add(btnCadastrarProduto);
		
		//Label CADASTRAR PRODUTO
		JLabel lblCadastrarProduto = new JLabel("Cadastrar Produto");
		lblCadastrarProduto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCadastrarProduto.setBounds(497, 193, 163, 14);
		contentPane.add(lblCadastrarProduto);
		
		//Botão CONSULTAR PRODUTO
		JButton btnConsultarProduto = new JButton("");
		btnConsultarProduto.setIcon(new ImageIcon(TelaInicial.class.getResource("/br/com/crepioca/view/image/search product flat icon.png")));
		btnConsultarProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO FAZER AÇÃO DO BOTÃO Consultar Venda
			}
		});
		btnConsultarProduto.setBounds(682, 35, 173, 147);
		contentPane.add(btnConsultarProduto);
		
		//Label CONSULTAR PRODUTO
		JLabel lblConsultarProduto = new JLabel("Consultar Produto");
		lblConsultarProduto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblConsultarProduto.setBounds(692, 193, 152, 14);
		contentPane.add(lblConsultarProduto);
		
		//Botão RELATÓRIO
		JButton btnRelatorio = new JButton("");
		btnRelatorio.setIcon(new ImageIcon(TelaInicial.class.getResource("/br/com/crepioca/view/image/report flat icon.png")));
		btnRelatorio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRelatorio.setBounds(876, 35, 173, 147);
		contentPane.add(btnRelatorio);
		
		//Label RELATÓRIO
		JLabel lblRelatrio = new JLabel("Relat\u00F3rio");
		lblRelatrio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblRelatrio.setBounds(931, 193, 81, 14);
		contentPane.add(lblRelatrio);
		
		//Botão SOBRE
		JButton btnSobre = new JButton("");
		btnSobre.setIcon(new ImageIcon(TelaInicial.class.getResource("/br/com/crepioca/view/image/about flat icon.png")));
		btnSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JanelaSobre js = new JanelaSobre();
				js.setVisible(true);
				js.setLocationRelativeTo(null);
			}
		});
		btnSobre.setBounds(1280, 11, 72, 68);
		contentPane.add(btnSobre);
		
		//Logo CREPIOCA
		JLabel logoCrepioca = new JLabel();
		logoCrepioca.setIcon(new ImageIcon(TelaInicial.class.getResource("/br/com/crepioca/view/image/logo crepioca do produtor.png")));
		logoCrepioca.setBounds(540, 298, 283, 211);
		contentPane.add(logoCrepioca);
		
		//Label RZT Solutions
		JLabel label = new JLabel("RZT Solutions");
		label.setFont(new Font("NewsGoth Lt BT", Font.BOLD, 25));
		label.setBounds(597, 604, 169, 25);
		contentPane.add(label);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(562, 640, 237, 24);
		contentPane.add(separator);
		
		//Label Copyright
		JLabel label_1 = new JLabel("Copyright \u00A9 - Desde 2017");
		label_1.setBounds(609, 652, 163, 33);
		contentPane.add(label_1);
	}
}
