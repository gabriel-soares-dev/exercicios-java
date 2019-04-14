
import junit.framework.TestCase;
import moedareais.CentavoReais;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gabriel
 */
public class TesteCentavo extends TestCase {

    /**
     * Test of counterCentavos method, of class ContaMoedas.
     */
    public void testCounterCentavos() {

        try {
            double numero_reais = 1.5;
            double expResult = 150;
            double result = CentavoReais.counterCentavos(numero_reais);
            assertEquals(expResult, result);
        } catch (Exception e) {
            assertTrue(e.getMessage());
        }

    }

    private void assertTrue(String message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
