/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.TestCase;
import moedareais.CentavoReais;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gabriel
 */
public class TesteReais extends TestCase {

    /**
     * Test of counterReais method, of class ContaMoedas.
     *
     * @param numero_moedas
     */
    public void testCounterReais() {

        int numero_moedas = 0;
        double expResult = 0;
        double result = CentavoReais.counterReais(numero_moedas);
        assertEquals(expResult, result);

    }

    private void assertTrue(String message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
