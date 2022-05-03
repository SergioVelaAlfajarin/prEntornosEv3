/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestModelo;

import modelo.CuentaBanco;
import modelo.Trabajo;
import modelo.Usuario;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class TrabajoTest {

    Trabajo trabajo1;
    CuentaBanco cuenta;
    Usuario usuario1;

    public TrabajoTest() {

    }

    @Before
    public void setUp() {
        usuario1 = new Usuario("Paco", "Ramirez");
        cuenta = new CuentaBanco(usuario1);
        trabajo1 = new Trabajo("Maderero", 1230);
    }

    @Test
    public void TestCreacion() {
        //Estos tests comprueban que el constructor lanze una excepcion en las condiciones adecuadas.
        try {
            trabajo1 = new Trabajo(new String(), 900);
            fail();
        } catch (IllegalArgumentException e) {
        }

        try {
            trabajo1 = new Trabajo("ej", 900);
            fail();
        } catch (IllegalArgumentException e) {
        }
        try {
            trabajo1 = new Trabajo("Maderero", 120);
            fail();
        } catch (IllegalArgumentException e) {
        }
        try {
            trabajo1 = new Trabajo(new String(), Double.MAX_VALUE + 1);
            fail();
        } catch (IllegalArgumentException e) {
        }
        //Por ultimo lo incializamos bien
        trabajo1 = new Trabajo("Maderero", 1230);
    }

    @Test
    public void TestTrabajar() {

        //Comprobamos que lanze una excepcion si le pasamos un objeto nulo
        try {
            CuentaBanco cuentaMala = null;
            trabajo1.trabajar(cuentaMala);
            fail();
        } catch (IllegalArgumentException | NullPointerException e) {
        }

        //Comprobamos el comportamiento del metodo
        double saldoBefore = cuenta.getSaldo();
        trabajo1.trabajar(cuenta);
        double saldoExpected = saldoBefore + trabajo1.getBonusAntiguedad() + trabajo1.getSueldo();
        assertEquals(saldoExpected, cuenta.getSaldo(), 1);
    }

    @Test
    public void TestAddAntiguedad() {
        usuario1 = new Usuario("Paco", "Ramirez");
        cuenta = new CuentaBanco(usuario1);
        double salariopre = trabajo1.getBonusAntiguedad();
        trabajo1.addMesAntiguedad();
        assertEquals(salariopre + 100, trabajo1.getBonusAntiguedad(), 1);
    }
}
