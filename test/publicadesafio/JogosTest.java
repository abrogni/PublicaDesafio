package publicadesafio;

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
     * Test of adicionaJogos method, of class Jogos.
     */
    @Test
    public void testAdicionaJogos() {
        System.out.println("adicionaJogos");
        Jogos jogo = new Jogos();
        Jogos.adicionaJogos(jogo);
        assertNotNull(jogo);
    }

    /**
     * Test of atribuiMinimoDaTemporada method, of class Jogos.
     */
    @Test
    public void testAtribuiMinimoDaTemporada() {
        System.out.println("atribuiMinimoDaTemporada");
        Jogos jogo = new Jogos();
        Jogos.atribuiMinimoDaTemporada(jogo);
        assertNotNull(jogo.getMinimoTemporada());
    }

    /**
     * Test of atribuiMaximoDaTemporada method, of class Jogos.
     */
    @Test
    public void testAtribuiMaximoDaTemporada() {
        System.out.println("atribuiMaximoDaTemporada");
        Jogos jogo = new Jogos();
        Jogos.atribuiMaximoDaTemporada(jogo);
        assertNotNull(jogo.getMaximoTemporada());
    }

    /**
     * Test of atribuiQuebraMin method, of class Jogos.
     */
    @Test
    public void testAtribuiQuebraMin() {
        System.out.println("atribuiQuebraMin");
        Jogos jogo = new Jogos();
        Jogos.atribuiQuebraMin(jogo);
        assertNotNull(jogo.getQuebraMinimo());
    }

    /**
     * Test of atribuiQuebraMax method, of class Jogos.
     */
    @Test
    public void testAtribuiQuebraMax() {
        System.out.println("atribuiQuebraMax");
        Jogos jogo = new Jogos();
        Jogos.atribuiQuebraMax(jogo);
        assertNotNull(jogo.getQuebraMaximo());
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
}
