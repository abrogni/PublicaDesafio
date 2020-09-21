
package publicadesafio;


public class Jogos {
    private int njogo;
    private int placar;
    private int minimo;
    private int maximo;
    boolean qminimo;
    boolean qmaximo;
    
        public Jogos(int njogo, int placar){
        this.njogo = njogo;
        this.placar = placar;
//       
//        //minimo
//        if (this.placar < placar){
//            minimo = this.placar;
//        }else{
//            minimo = placar;
//        }
//         
//        //maximo
//        if (this.placar > placar){
//            maximo = this.placar;
//        } else {
//            maximo = placar;
//        }
//        
       
       
        
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
