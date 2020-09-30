
package publicadesafio;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class JogosTest {
    
    public JogosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCont method, of class Jogos.
     */
    @Test
    public void testGetCont() {
        System.out.println("getCont");        
        assertEquals(1, Jogos.getCont());        
    }

    /**
     * Test of setCont method, of class Jogos.
     */
//    @Test
//    public void testSetCont() {
//        System.out.println("setCont");
//        int aCont = 0;
//        Jogos.setCont(aCont);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of adicionaJogos method, of class Jogos.
     */
    @Test
    public void testAdicionaJogos() {
        System.out.println("adicionaJogos");
        Jogos jogo = new Jogos();
        Jogos.adicionaJogos(jogo);
        
    }

    /**
     * Test of atribuiMinimoDaTemporada method, of class Jogos.
     */
    @Test
    public void testAtribuiMinimoDaTemporada() {
        System.out.println("atribuiMinimoDaTemporada");
        Jogos jogo = new Jogos();
        Jogos.atribuiMinimoDaTemporada(jogo);
        
    }

    /**
     * Test of atribuiMaximoDaTemporada method, of class Jogos.
     */
    @Test
    public void testAtribuiMaximoDaTemporada() {
        System.out.println("atribuiMaximoDaTemporada");
        Jogos jogo = new Jogos();
        Jogos.atribuiMaximoDaTemporada(jogo);        
    }

    /**
     * Test of atribuiQuebraMin method, of class Jogos.
     */
    @Test
    public void testAtribuiQuebraMin() {
        System.out.println("atribuiQuebraMin");
        Jogos jogo = new Jogos();
        Jogos.atribuiQuebraMin(jogo);
    }

    /**
     * Test of atribuiQuebraMax method, of class Jogos.
     */
    @Test
    public void testAtribuiQuebraMax() {
        System.out.println("atribuiQuebraMax");
        Jogos jogo = new Jogos();
        Jogos.atribuiQuebraMax(jogo);        
    }

    /**
     * Test of deletaJogo method, of class Jogos.
     */
    @Test
    public void testDeletaJogo() {
        System.out.println("deletaJogo");
        Jogos jogo = new Jogos();
        Jogos.deletaJogo(jogo);
    }

    /**
     * Test of getJogos method, of class Jogos.
     */
    @Test
    public void testGetJogos() {
        System.out.println("getJogos");
        ArrayList<Jogos> expResult = new ArrayList();
        ArrayList<Jogos> result = Jogos.getJogos();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNumero method, of class Jogos.
     */
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        Jogos instance = new Jogos();
        int expResult = 0;
        int result = instance.getNumero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumero method, of class Jogos.
     */
    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        int numero = 0;
        Jogos instance = new Jogos();
        instance.setNumero(numero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlacar method, of class Jogos.
     */
    @Test
    public void testGetPlacar() {
        System.out.println("getPlacar");
        Jogos instance = new Jogos();
        int expResult = 0;
        int result = instance.getPlacar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlacar method, of class Jogos.
     */
    @Test
    public void testSetPlacar() {
        System.out.println("setPlacar");
        int placar = 0;
        Jogos instance = new Jogos();
        instance.setPlacar(placar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMinimoTemporada method, of class Jogos.
     */
    @Test
    public void testGetMinimoTemporada() {
        System.out.println("getMinimoTemporada");
        Jogos instance = new Jogos();
        int expResult = 0;
        int result = instance.getMinimoTemporada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMinimoTemporada method, of class Jogos.
     */
    @Test
    public void testSetMinimoTemporada() {
        System.out.println("setMinimoTemporada");
        int minimoTemporada = 0;
        Jogos instance = new Jogos();
        instance.setMinimoTemporada(minimoTemporada);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaximoTemporada method, of class Jogos.
     */
    @Test
    public void testGetMaximoTemporada() {
        System.out.println("getMaximoTemporada");
        Jogos instance = new Jogos();
        int expResult = 0;
        int result = instance.getMaximoTemporada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaximoTemporada method, of class Jogos.
     */
    @Test
    public void testSetMaximoTemporada() {
        System.out.println("setMaximoTemporada");
        int maximoTemporada = 0;
        Jogos instance = new Jogos();
        instance.setMaximoTemporada(maximoTemporada);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuebraMinimo method, of class Jogos.
     */
    @Test
    public void testGetQuebraMinimo() {
        System.out.println("getQuebraMinimo");
        Jogos instance = new Jogos();
        int expResult = 0;
        int result = instance.getQuebraMinimo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuebraMinimo method, of class Jogos.
     */
    @Test
    public void testSetQuebraMinimo() {
        System.out.println("setQuebraMinimo");
        int quebraMinimo = 0;
        Jogos instance = new Jogos();
        instance.setQuebraMinimo(quebraMinimo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuebraMaximo method, of class Jogos.
     */
    @Test
    public void testGetQuebraMaximo() {
        System.out.println("getQuebraMaximo");
        Jogos instance = new Jogos();
        int expResult = 0;
        int result = instance.getQuebraMaximo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuebraMaximo method, of class Jogos.
     */
    @Test
    public void testSetQuebraMaximo() {
        System.out.println("setQuebraMaximo");
        int quebraMaximo = 0;
        Jogos instance = new Jogos();
        instance.setQuebraMaximo(quebraMaximo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIndexDeleta method, of class Jogos.
     */
    @Test
    public void testGetIndexDeleta() {
        System.out.println("getIndexDeleta");
        Jogos instance = new Jogos();
        int expResult = 0;
        int result = instance.getIndexDeleta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIndexDeleta method, of class Jogos.
     */
    @Test
    public void testSetIndexDeleta() {
        System.out.println("setIndexDeleta");
        int indexDeleta = 0;
        Jogos instance = new Jogos();
        instance.setIndexDeleta(indexDeleta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
