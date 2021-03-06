package tabuleiro;

public class Tabuleiro {

	private int linhas;
	private int colunas;
	private Peca[][] pecas;

	public Tabuleiro(int linhas, int colunas) {
		if( linhas < 1 || colunas < 1) {
			throw new TabuleiroExcecao("Erro na constru��o do tabuleiro: � preciso pelo menos 1 linha e 1 coluna");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas];
	}

	public int getLinhas() {
		return linhas;
	}

	
	public int getColunas() {
		return colunas;
	}

	
	public Peca peca(int linha, int coluna) {
		if(!existePosicao(linha,coluna)) {
			throw new TabuleiroExcecao("Posicao nao existe no tabuleiro");
		}
		return pecas[linha][coluna];
	}

	public Peca peca(Posicao posicao) {
		if(!existePosicao(posicao)) {
			throw new TabuleiroExcecao("Posicao nao existe no tabuleiro");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void colocarPeca(Peca peca, Posicao posicao) {
		if(haUmaPeca (posicao)) {
			throw new TabuleiroExcecao("Ja h� uma pe�a nessa posi��o "+ posicao);
		}
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}
	
	private boolean existePosicao(int linha, int coluna) {
		return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
	}
	
	private boolean existePosicao(Posicao posicao) {
		return existePosicao(posicao.getLinha(), posicao.getColuna());
	}
	
	public boolean haUmaPeca(Posicao posicao) {
		if(!existePosicao(posicao)) {
			throw new TabuleiroExcecao("Posicao nao existe no tabuleiro");
		}
	return	peca(posicao) != null ;
				
	}
}
