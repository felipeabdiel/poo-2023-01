package main.java.com.github.felipeabdiel.t18;

public class Lance {
    Posicao destino;
    Peca peca;
    Jogador jogador;

    public Lance(Peca peca, Posicao destino) {
        this.destino = destino;
        this.peca = peca;
    }
}
