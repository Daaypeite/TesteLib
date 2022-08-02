package com.exemplo.hellojar;

import java.awt.Dimension;
import javax.swing.JFrame;

public class HelloFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		// praticando a instancia da JFrame
		JFrame frame = new JFrame("Hello JAR");
		// configuracao
		frame.setSize(new Dimension(400, 200));
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE); // encerra a aplicacao frame
		frame.setLocationRelativeTo(null); // centralizar o frame
		frame.setVisible(true);
	}

}
