package main.java.com.github.felipeabdiel.t13;

public class Lance {
    Posicao destino;
    Peca peca;
    Jogador jogador;

    public Lance(Peca peca, Posicao destino, Jogador jogador) {
        this.destino = destino;
        this.peca = peca;
        this.jogador = jogador;
    }
}
