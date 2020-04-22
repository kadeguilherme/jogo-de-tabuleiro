package xadrez;

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
	
	private void colocarNovaPeca(char coluna, int linha, PecaDeXadrez peca) {
		tabuleiro.colocarPeca(peca, new PosicaoXadrez(coluna, linha).toPositon());
	
	}
	
	private void initialSetup() {
		colocarNovaPeca('b',6,new Torre(tabuleiro, Color.WHITE));
		colocarNovaPeca('e',8 ,new Rei(tabuleiro, Color.BLACK));
		colocarNovaPeca('e',1,new Rei(tabuleiro,Color.WHITE));
	}
}
