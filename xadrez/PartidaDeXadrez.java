package xadrez;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaDeXadrez {
	private Tabuleiro tabuleiro;
	
	public PartidaDeXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
		initialSetup();
	}
	
	public PecaDeXadrez[][] getPecas(){
		PecaDeXadrez[][] mat = new PecaDeXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for(int i = 0; i < tabuleiro.getLinhas();i++) {
			for(int j = 0; j <tabuleiro.getColunas(); j++) {
				mat[i][j] = (PecaDeXadrez) tabuleiro.peca(i,j);
				
			}
		
		}
		return mat;
	}
	
	private void initialSetup() {
		tabuleiro.colocarPeca(new Torre(tabuleiro, Color.WHITE), new Posicao(2,1));
		tabuleiro.colocarPeca(new Rei(tabuleiro, Color.BLACK), new Posicao(0, 4));
	}
}
