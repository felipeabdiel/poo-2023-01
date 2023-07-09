package main.java.com.github.felipeabdiel.t13;

public class Partida {
    public static void main(String[] args) {
        Jogador jogadorBrancas = new Jogador("Adolf Anderssen");
        Jogador jogadorNegras = new Jogador("Lionel Kieseritsky");

        Peca Peao = new Peca("Peão");
        Peca Cavalo = new Peca("Cavalo");
        Peca Bispo = new Peca("Bispo");
        Peca Torre = new Peca("Torre");
        Peca Dama = new Peca("Dama");
        Peca Rei = new Peca("Rei");

        Posicao lance1b = new Posicao('E', 4);
        Posicao lance1n = new Posicao('E', 5);

    }

}
