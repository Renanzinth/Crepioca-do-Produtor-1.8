package br.com.crepioca.controller;

import javax.swing.UIManager;

import br.com.crepioca.view.TelaInicial;

public class Principal {

	public static void main(String[] args) {
		
		// Muda o Look and Feel da Aplicação
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				} catch (Exception e) {
					e.printStackTrace();
				}
				
		TelaInicial ti = new TelaInicial();
		
		ti.setVisible(true);
		ti.setExtendedState(ti.MAXIMIZED_BOTH);
	}

}
