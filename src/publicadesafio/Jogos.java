
package publicadesafio;


public class Jogos {
    private int njogo;
    private int placar;
    private int minimo;
    private int maximo;
    boolean qminimo;
    boolean qmaximo;
    protected static int cont = 0;
    
        //construtor pedindo os parametros
        public Jogos(int njogo, int placar){
            cont++;
    }   
        //contador
        protected void finalize() throws Throwable {
        cont--;
    } 
         public static int getInstanceCount() {
        return cont;
    }

    public int getNjogo() {
        return njogo;
    }

    public void setNjogo(int njogo) {
        this.njogo = njogo;
    }

    public int getPlacar() {
        return placar;
    }

    public void setPlacar(int placar) {
        this.placar = placar;
    }

    public int getMinimo() {
        return minimo;
    }

    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }

    public int getMaximo() {
        return maximo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }
}
