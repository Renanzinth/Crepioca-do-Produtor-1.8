package br.com.crepioca.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.xml.sax.helpers.ParserFactory;

import br.com.crepioca.banco.Database;
import br.com.crepioca.model.Produto;
import br.com.crepioca.model.dao.ProdutoDAO;
import br.com.crepioca.validator.ApenasNumeros;
import br.com.crepioca.validator.LetraNumeroETraco;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JTextField;

public class CadastrarProduto extends JFrame {

	private JPanel contentPane;
	private JTextField campoDescricao;
	private JTextField campoSaldoEstoque;
	private JLabel lblCadastroDeProdutos;
	private JLabel labelPrecoDeVenda;
	private JTextField campoPrecoDeVenda;
	private JLabel lblPrecoDeCompra;
	private JTextField campoPrecoDeCompra;

	Database database = new Database();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarProduto frame = new CadastrarProduto();
					frame.setVisible(true);
					// frame.setLocationRelativeTo(null); CENTRALIZAR TELA
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastrarProduto() {
		database.getConnection();
		setTitle("Cadastro de Produtos");
		setAlwaysOnTop(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 300);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblCadastroDeProdutos = new JLabel("CADASTRO DE PRODUTOS");
		lblCadastroDeProdutos.setFont(new Font("Arial Black", Font.PLAIN, 18));
		lblCadastroDeProdutos.setBounds(154, 11, 287, 18);
		contentPane.add(lblCadastroDeProdutos);

		JLabel labelDescricao = new JLabel("Descri\u00E7\u00E3o:");
		labelDescricao.setFont(new Font("Arial", Font.PLAIN, 17));
		labelDescricao.setBounds(10, 71, 80, 18);
		contentPane.add(labelDescricao);

		campoDescricao = new JTextField();
		campoDescricao.setBounds(94, 68, 216, 26);
		campoDescricao.setDocument(new LetraNumeroETraco());
		contentPane.add(campoDescricao);
		campoDescricao.setColumns(10);

		JLabel labelQtd = new JLabel("Quantidade:");
		labelQtd.setFont(new Font("Arial", Font.PLAIN, 17));
		labelQtd.setBounds(370, 71, 96, 18);
		contentPane.add(labelQtd);

		campoSaldoEstoque = new JTextField();
		campoSaldoEstoque.setColumns(10);
		campoSaldoEstoque.setBounds(464, 68, 41, 26);
		campoSaldoEstoque.setDocument(new ApenasNumeros());
		contentPane.add(campoSaldoEstoque);

		lblPrecoDeCompra = new JLabel("Pre\u00E7o de Compra:");
		lblPrecoDeCompra.setFont(new Font("Arial", Font.PLAIN, 17));
		lblPrecoDeCompra.setBounds(10, 121, 135, 18);
		contentPane.add(lblPrecoDeCompra);

		campoPrecoDeCompra = new JTextField();
		campoPrecoDeCompra.setColumns(10);
		campoPrecoDeCompra.setBounds(153, 118, 56, 26);
		contentPane.add(campoPrecoDeCompra);

		labelPrecoDeVenda = new JLabel("Pre\u00E7o de Venda:");
		labelPrecoDeVenda.setFont(new Font("Arial", Font.PLAIN, 17));
		labelPrecoDeVenda.setBounds(231, 124, 135, 18);
		contentPane.add(labelPrecoDeVenda);

		campoPrecoDeVenda = new JTextField();
		campoPrecoDeVenda.setColumns(10);
		campoPrecoDeVenda.setBounds(359, 121, 56, 26);
		contentPane.add(campoPrecoDeVenda);

		JButton btnCadastrarProduto = new JButton("Cadastrar");
		btnCadastrarProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Produto prod = new Produto();
				prod.setDescricao(campoDescricao.getText());
				prod.setSaldoEstoque(Integer.parseInt(campoSaldoEstoque.getText()));

				if (!prod.isProdutoValido()) {
					JOptionPane.showMessageDialog(null, "Produto com nome inválido");

					if (!prod.isProdutoValido(Integer.parseInt(campoSaldoEstoque.getText())))
						JOptionPane.showMessageDialog(null, "Quantidade do produto com valor inválido");
				}

				else {
					prod.setPrecoCompra(Float.parseFloat(campoPrecoDeCompra.getText()));
					prod.setPrecoVenda(Float.parseFloat(campoPrecoDeVenda.getText()));

					ProdutoDAO prodao = new ProdutoDAO(Database.getConnection());
					prodao.registra(prod);

					campoDescricao.setText("");
					campoSaldoEstoque.setText("");
					campoPrecoDeCompra.setText("");
					campoPrecoDeVenda.setText("");

					// TODO FAZER AÇÃO DO BOTÃO CADASTRAR
				}
			}
		});
		btnCadastrarProduto.setBounds(231, 200, 135, 25);
		contentPane.add(btnCadastrarProduto);
	}
}
