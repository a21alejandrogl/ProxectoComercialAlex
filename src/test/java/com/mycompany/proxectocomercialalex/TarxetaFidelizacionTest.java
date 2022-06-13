/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.proxectocomercialalex;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author dammdcd-a
 */
public class TarxetaFidelizacionTest {
    
    /**
     *
     */
    public TarxetaFidelizacionTest() {
    }
    
    /**
     *
     */
    @BeforeAll
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterAll
    public static void tearDownClass() {
    }
    
    /**
     *
     */
    @BeforeEach
    public void setUp() {
    }
    
    /**
     *
     */
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of obterPuntos method, of class TarxetaFidelizacion.
     */
    @Test
    public void testObterPuntos() {
        System.out.println("Obter puntos con valor compra 2");
        int valorCompra = 2;
        TarxetaFidelizacion instance = new TarxetaFidelizacion();
        boolean expResult = false;
        boolean result = instance.obterPuntos(valorCompra);
        assertEquals(expResult, result);
        System.out.println("non suma");
        // TODO review the generated test code and remove the default call to fail.
    }
    
    /**
     *
     */
    @Test
    public void testObterPuntos2() {
        System.out.println("Obter puntos con valor compra 20");
        int valorCompra = 20;
        TarxetaFidelizacion instance = new TarxetaFidelizacion();
        boolean expResult = true;
        boolean result = instance.obterPuntos(valorCompra);
        assertEquals(expResult, result);
        System.out.println("suma un punto");
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     *
     */
    @Test 
    public void testAbonarGaraxe() {
        System.out.println("Validar se ten puntos");
        int puntos = 0;
        TarxetaFidelizacion instance = new TarxetaFidelizacion();
        boolean expResult = false;
        boolean result = instance.obterPuntos(puntos);
        assertEquals(expResult, result);
        System.out.println("non ten puntos para abonar o Garaxe");
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     *
     */
    @Test
    public void testAbonarGaraxe2() {
        System.out.println("Validar se ten puntos");
        int puntos = 1;
        TarxetaFidelizacion instance = new TarxetaFidelizacion();
        boolean expResult = true;
        boolean result = instance.obterPuntos(puntos);
        assertEquals(expResult, result);
        System.out.println("ten puntos, abonamos garaxe");
        // TODO review the generated test code and remove the default call to fail.
    }
    
    /**
     *
     */
    @Test 
    public void testObterRegalo() {
        System.out.println("Validar se ten puntos para obter un regalo");
        int puntos = 1;
        TarxetaFidelizacion instance = new TarxetaFidelizacion();
        boolean expResult = false;
        boolean result = instance.obterPuntos(puntos);
        assertEquals(expResult, result);
        System.out.println("non ten puntos para obter un regalo");
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     *
     */
    @Test
    public void testObterRegalo2() {
        System.out.println("Validar se ten puntos para obter un regalo");
        int puntos = -1;
        TarxetaFidelizacion instance = new TarxetaFidelizacion();
        boolean expResult = true;
        boolean result = instance.obterPuntos(puntos);
        assertEquals(expResult, result);
        System.out.println("ten puntos para obter un regalo");
        // TODO review the generated test code and remove the default call to fail.
    }

}
