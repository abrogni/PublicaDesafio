
package publicadesafio;

import java.util.ArrayList;
import views.*;

public class PublicaDesafio {
    
    public static void main(String[] args) {
        
    ArrayList <Jogos> Jogos = new ArrayList();
    
    Jogos jogo1 = new Jogos(1, 12);
    Jogos jogo2 = new Jogos(2, 24);
    Jogos jogo3 = new Jogos(3, 10);
    Jogos jogo4 = new Jogos(4, 24);
    
    Jogos.add(jogo1);
    Jogos.add(jogo2);
    Jogos.add(jogo3);   
    Jogos.add(jogo4);
    
    Interface interfaceInicial = new Interface();
        interfaceInicial.setVisible(true);
        
    
    
    for(Jogos j : Jogos)
        System.out.println(j.getMinimo());
    

    }
    
}
