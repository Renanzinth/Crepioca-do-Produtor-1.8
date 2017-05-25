package br.com.crepioca.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.crepioca.model.Produto;

public class ProdutoDAO {

	Connection conn;

	public ProdutoDAO(Connection conn) {
		this.conn = conn;
	}

	public void registra(Produto novoProduto) {

		String sql = "INSERT INTO Produto (descricao, preco_compra, preco_venda, saldo_estoque) VALUES (?,?,?,?)";

		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, novoProduto.getDescricao());
			stmt.setFloat(2, novoProduto.getPrecoCompra());
			stmt.setFloat(3, novoProduto.getPrecoVenda());
			stmt.setInt(4, novoProduto.getSaldoEstoque());
			
			stmt.executeUpdate();
			
			try (ResultSet rs = stmt.getGeneratedKeys()) {
				if (rs.next())
					novoProduto.setCodigo(rs.getInt("codigo"));
			}
			
			JOptionPane.showMessageDialog(null, "Produto registrado com sucesso!");
			
		} catch (SQLException e) {
			// TODO TRATAR O ERRO DA INSERÇÃO DE PRODUTO
			e.printStackTrace();
		}
	}
}