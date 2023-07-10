package main.java.com.github.felipeabdiel.t18;

public class Partida {
    public static void main(String[] args) {
        Jogador jogadorBrancas = new Jogador("Adolf Anderssen");
        Jogador jogadorNegras = new Jogador("Lionel Kieseritsky");

        Lance lance[] = new Lance[45];

        Peca peao = new Peca("Peão");
        Peca cavalo = new Peca("Cavalo");
        Peca bispo = new Peca("Bispo");
        Peca torre = new Peca("Torre");
        Peca dama = new Peca("Dama");
        Peca rei = new Peca("Rei");

        Posicao lance1b = new Posicao('E', 4);
        Posicao lance1n = new Posicao('E', 5);
        Posicao lance2b = new Posicao('F', 4);
        Posicao lance2n = new Posicao('F', 4);
        Posicao lance3b = new Posicao('C', 4);
        Posicao lance3n = new Posicao('H', 4);
        Posicao lance4b = new Posicao('F', 1);
        Posicao lance4n = new Posicao('B', 5);
        Posicao lance5b = new Posicao('B', 5);
        Posicao lance5n = new Posicao('F', 6);
        Posicao lance6b = new Posicao('F', 3);
        Posicao lance6n = new Posicao('H', 6);
        Posicao lance7b = new Posicao('D', 3);
        Posicao lance7n = new Posicao('H', 5);
        Posicao lance8b = new Posicao('H', 4);
        Posicao lance8n = new Posicao('G', 5);
        Posicao lance9b = new Posicao('F', 5);
        Posicao lance9n = new Posicao('C', 6);
        Posicao lance10b = new Posicao('G', 4);
        Posicao lance10n = new Posicao('F', 6);
        Posicao lance11b = new Posicao('G', 1);
        Posicao lance11n = new Posicao('B', 5);
        Posicao lance12b = new Posicao('H', 4);
        Posicao lance12n = new Posicao('G', 6);
        Posicao lance13b = new Posicao('H', 5);
        Posicao lance13n = new Posicao('G', 5);
        Posicao lance14b = new Posicao('F', 3);
        Posicao lance14n = new Posicao('G', 8);
        Posicao lance15b = new Posicao('F', 4);
        Posicao lance15n = new Posicao('F', 6);
        Posicao lance16b = new Posicao('C', 3);
        Posicao lance16n = new Posicao('C', 5);
        Posicao lance17b = new Posicao('D', 5);
        Posicao lance17n = new Posicao('B', 2);
        Posicao lance18b = new Posicao('D', 6);
        Posicao lance18n = new Posicao('G', 1);
        Posicao lance19b = new Posicao('E', 5);
        Posicao lance19n = new Posicao('A', 1);
        Posicao lance20b = new Posicao('E', 2);
        Posicao lance20n = new Posicao('A', 6);
        Posicao lance21b = new Posicao('G', 7);
        Posicao lance21n = new Posicao('D', 8);
        Posicao lance22b = new Posicao('F', 6);
        Posicao lance22n = new Posicao('F', 6);
        Posicao lance23b = new Posicao('E', 7);

        lance[0] = new Lance(peao, lance1b);
        lance[1] = new Lance(peao, lance1n);
        lance[2] = new Lance(peao, lance2b);
        lance[3] = new Lance(peao, lance2n);
        lance[4] = new Lance(bispo, lance3b);
        lance[5] = new Lance(dama, lance3n);
        lance[6] = new Lance(rei, lance4b);
        lance[7] = new Lance(peao, lance4n);
        lance[8] = new Lance(bispo, lance5b);
        lance[9] = new Lance(cavalo, lance5n);
        lance[10] = new Lance(cavalo, lance6b);
        lance[11] = new Lance(dama, lance6n);
        lance[12] = new Lance(peao, lance7b);
        lance[13] = new Lance(cavalo, lance7n);
        lance[14] = new Lance(cavalo, lance8b);
        lance[15] = new Lance(dama, lance8n);
        lance[16] = new Lance(cavalo, lance9b);
        lance[17] = new Lance(peao, lance9n);
        lance[18] = new Lance(peao, lance10b);
        lance[19] = new Lance(cavalo, lance10n);
        lance[20] = new Lance(torre, lance11b);
        lance[21] = new Lance(peao, lance11n);
        lance[22] = new Lance(peao, lance12b);
        lance[23] = new Lance(dama, lance12n);
        lance[24] = new Lance(peao, lance13b);
        lance[25] = new Lance(dama, lance13n);
        lance[26] = new Lance(dama, lance14b);
        lance[27] = new Lance(cavalo, lance14n);
        lance[28] = new Lance(bispo, lance15b);
        lance[29] = new Lance(dama, lance15n);
        lance[30] = new Lance(cavalo, lance16b);
        lance[31] = new Lance(bispo, lance16n);
        lance[32] = new Lance(cavalo, lance17b);
        lance[33] = new Lance(dama, lance17n);
        lance[34] = new Lance(bispo, lance18b);
        lance[35] = new Lance(bispo, lance18n);
        lance[36] = new Lance(peao, lance19b);
        lance[37] = new Lance(dama, lance19n);
        lance[38] = new Lance(rei, lance20b);
        lance[39] = new Lance(cavalo, lance20n);
        lance[40] = new Lance(cavalo, lance21b);
        lance[41] = new Lance(rei, lance21n);
        lance[42] = new Lance(dama, lance22b);
        lance[43] = new Lance(cavalo, lance22n);
        lance[44] = new Lance(bispo, lance23b);

        for (int i = 0; i < 45; i++) {
            if (i % 2 == 0) {
                System.out.println(lance[i].peca + " " + lance[i].destino + jogadorBrancas);
            } else {
                System.out.println(lance[i].peca + " " + lance[i].destino + jogadorNegras);
            }

        }

        System.out.println("O Vencedor é: " + jogadorBrancas);
        System.out.println("Fim do jogo");
    }

}
