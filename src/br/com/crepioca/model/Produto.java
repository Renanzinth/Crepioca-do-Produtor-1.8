package br.com.crepioca.model;

import java.text.NumberFormat;

public class Produto implements ValidaProduto {

	private int codigo;
	private String descricao;
	private float precoCompra, precoVenda;
	private int saldoEstoque;

	public Produto() {
		super();
	}

	public Produto(String descricao, float precoCompra, float precoVenda, int saldoEstoque) {
		super();
		this.descricao = descricao;
		this.precoCompra = precoCompra;
		this.precoVenda = precoVenda;
		this.saldoEstoque = saldoEstoque;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getPrecoCompra() {
		return precoCompra;
	}

	public void setPrecoCompra(float precoCompra) {
		this.precoCompra = precoCompra;
	}

	public float getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(float precoVenda) {
		this.precoVenda = precoVenda;
	}

	public int getSaldoEstoque() {
		return saldoEstoque;
	}

	public void setSaldoEstoque(int saldoEstoque) {
		this.saldoEstoque = saldoEstoque;
	}

	@Override
	public boolean isProdutoValido() {
		String desc = this.descricao;

		for (int i = 0; i < desc.length(); i++) {
			if (!Character.isAlphabetic(desc.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean isProdutoValido(Integer SaldoEstoque) {
		Integer qtd = this.saldoEstoque;

		if (!qtd.toString().matches("[0-9]+"/* \\d+" */))
			return false;
		return true;
		// TODO FAZER A IMPLEMENTAÇÃO DO MÉTODO validaProdutoPorQuantidade
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (codigo != other.codigo)
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		return true;
	}

}
