package campominado;

import campominado.modelo.Tabuleiro;
import campominado.visao.TabuleiroConsole;

public class Aplicacao {

    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
        new TabuleiroConsole(tabuleiro);
    }
}
