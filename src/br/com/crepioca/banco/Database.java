package br.com.crepioca.banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import br.com.crepioca.view.TelaInicial;

public class Database {

	private static final String URL = "jdbc:postgresql://localhost/crepioca";
	private static final String USER = "postgres";
	private static final String PASS = "renan2108";

	public static Connection getConnection() {
		
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL, USER, PASS);
			
		} catch (SQLException ex) {

			JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco:\n " + ex.getMessage(), "Erro", 0, new ImageIcon(TelaInicial.class.getResource("/javax/swing/plaf/metal/icons/ocean/error.png")));
			ex.printStackTrace();
			System.exit(0);
		}
		return conn;
	}
}
