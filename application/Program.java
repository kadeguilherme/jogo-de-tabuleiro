package application;

import xadrez.PartidaDeXadrez;

public class Program {

	public static void main(String[] args) {

		PartidaDeXadrez pecaDeXadrez = new PartidaDeXadrez();
		UI.printTabuleiro(pecaDeXadrez.getPecas());
		
	}

}
