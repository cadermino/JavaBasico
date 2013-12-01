/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class MultiplicacionTest {
    
    public MultiplicacionTest() {
    }
    
    @Test
    public void testMultiplicacion() {
        assertEquals("Multiplicacion", 6, 3*2);
    }
    
}