package publicadesafio;

import java.util.ArrayList;
import views.Interface;

public class Jogos {
    //Atributos de todos os jogos.
    private int numero;
    private int placar;
    private int minimoTemporada;
    private int maximoTemporada;
    private int quebraMinimo;
    private int quebraMaximo;
    private static int cont = 0;
    private static int indexDeleta;

    private static ArrayList<Jogos> jogos = new ArrayList();
    //Declaração do ArrayList 
    public static void adicionaJogos(Jogos jogo) {
        //Método que adiciona os jogos no Array com os atributos declarados
        
        //Contador que define o número que identifica cada jogo
        cont++;
        jogo.setNumero(cont);

        jogos.add(jogo);
        atribuiMinimoDaTemporada(jogo);
        atribuiMaximoDaTemporada(jogo);
        atribuiQuebraMin(jogo);
        atribuiQuebraMax(jogo);
    }

    public static void atribuiMinimoDaTemporada(Jogos jogo) {
        //Percorre o ArrayList e define o menor placar digitado, sendo o mínimo da temporada.
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
        //Percorre o ArrayList e define o maior placar digitado, sendo o máximo da temporada.
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

        //Conta as vezes que o récorde mínimo é quebrado
        int contq = 0;
        for (Jogos j : getJogos()) {
            if (j.getMinimoTemporada() == j.getPlacar()) {
                contq++;
            }
            
            jogo.setQuebraMinimo(contq);
        }
    }
    
    public static void atribuiQuebraMax(Jogos jogo) {

        //Conta as vezes que o récorde máximo é quebrado
        int contq = 0;
        for (Jogos j : getJogos()) {
            if (j.getMaximoTemporada() == j.getPlacar()) {
                contq++;
            }
            jogo.setQuebraMaximo(contq);
        }
    }
    
    public static void deletaJogo (Jogos jogo) {
        //Remove o objeto Jogo do Array, pelo botão da interface
        
            jogos.remove(jogo.indexDeleta);
        
    }

    //Getters e setters
    public static ArrayList<Jogos> getJogos() {
        return jogos;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public static int getCont() {
        return cont;
    }

    public static void setCont(int aCont) {
        cont = aCont;
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

    public int getIndexDeleta() {
        return indexDeleta;
    }

    public void setIndexDeleta(int indexDeleta) {
        Jogos.indexDeleta = indexDeleta;
    }
}
