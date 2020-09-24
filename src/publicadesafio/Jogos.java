package publicadesafio;

import java.util.ArrayList;

public class Jogos {

    public static int getCont() {
        return cont;
    }

    public static void setCont(int aCont) {
        cont = aCont;
    }

    private int numero;
    private int placar;
    private int minimoTemporada;
    private int maximoTemporada;
    private int quebraMinimo;
    private int quebraMaximo;
    private static int cont = 0;

    private static ArrayList<Jogos> jogos = new ArrayList();

    public static void adicionaJogos(Jogos jogo) {
        cont++;
        jogo.setNumero(cont);

        jogos.add(jogo);
        atribuiMinimoDaTemporada(jogo);
        atribuiMaximoDaTemporada(jogo);
        atribuiQuebraMin(jogo);
        atribuiQuebraMax(jogo);
    }

    public static void atribuiMinimoDaTemporada(Jogos jogo) {
        int minimo = Integer.MAX_VALUE;
        for (Jogos j : getJogos()) {
            if (minimo > j.getPlacar()) {
                minimo = j.getPlacar();

            }
        }
        if (minimo == Integer.MAX_VALUE) {
            minimo = jogo.getPlacar();
        }

        jogo.setMinimoTemporada(minimo);

    }

    public static void atribuiMaximoDaTemporada(Jogos jogo) {
        int maximo = Integer.MIN_VALUE;
        for (Jogos j : getJogos()) {
            if (maximo < j.getPlacar()) {
                maximo = j.getPlacar();
            }
        }
        if (maximo == Integer.MIN_VALUE) {
            maximo = jogo.getPlacar();
        }
        jogo.setMaximoTemporada(maximo);

    }

    public static void atribuiQuebraMin(Jogos jogo) {

        int contq = 0;
        for (Jogos j : getJogos()) {
            if (j.getMinimoTemporada() == j.getPlacar()) {
                contq++;
            }
            jogo.setQuebraMinimo(contq);
        }
    }
    
    public static void atribuiQuebraMax(Jogos jogo) {

        int contq = 0;
        for (Jogos j : getJogos()) {
            if (j.getMaximoTemporada() == j.getPlacar()) {
                contq++;
            }
            jogo.setQuebraMaximo(contq);
        }
    }

    public static ArrayList<Jogos> getJogos() {
        return jogos;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPlacar() {
        return placar;
    }

    public void setPlacar(int placar) {
        this.placar = placar;
    }

    public int getMinimoTemporada() {
        return minimoTemporada;
    }

    public void setMinimoTemporada(int minimoTemporada) {
        this.minimoTemporada = minimoTemporada;
    }

    public int getMaximoTemporada() {
        return maximoTemporada;
    }

    public void setMaximoTemporada(int maximoTemporada) {
        this.maximoTemporada = maximoTemporada;
    }

    public int getQuebraMinimo() {
        return quebraMinimo;
    }

    public void setQuebraMinimo(int quebraMinimo) {
        this.quebraMinimo = quebraMinimo;
    }

    public int getQuebraMaximo() {
        return quebraMaximo;
    }

    public void setQuebraMaximo(int quebraMaximo) {
        this.quebraMaximo = quebraMaximo;
    }
}
