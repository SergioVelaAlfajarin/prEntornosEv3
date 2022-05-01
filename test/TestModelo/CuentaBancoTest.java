/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestModelo;

import modelo.CuentaBanco;
import modelo.Usuario;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author alumno
 */
public class CuentaBancoTest {

    @Test
    public void compruebaCreacionCuentasBancoCorrecta() {
        Usuario user = new Usuario("Sergio", "vela");
        CuentaBanco cb = new CuentaBanco(user);
        Usuario[] listtitulares = cb.getListaTitulares();
        assertEquals(user, listtitulares[0]);
        assertEquals(0, cb.getSaldo(), 0);

        try {
            CuentaBanco cb2 = new CuentaBanco(null);
            fail();
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void compruebaRetiraDineroFuncionaCorrectamente() {
        Usuario user = new Usuario("Sergio", "vela");
        CuentaBanco cb = new CuentaBanco(user);

        cb.ingresaSaldo(1000);
        assertEquals(1000, cb.getSaldo(), 0);

        cb.retiraSaldo(500);
        assertEquals(500, cb.getSaldo(), 0);

        try {
            cb.retiraSaldo(-1000);
            fail();
        } catch (IllegalArgumentException e) {
        }
        try {
            cb.retiraSaldo(1000);
            fail();
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void compruebaAddTitularesYGetTitulares() {
        Usuario user1 = new Usuario("Sergio1", "vela1");
        Usuario user2 = new Usuario("Sergio2", "vela2");
        Usuario user3 = new Usuario("Sergio3", "vela3");
        Usuario user4 = new Usuario("Sergio4", "vela4");
        Usuario user5 = new Usuario("Sergio5", "vela5");
        
        CuentaBanco cb = new CuentaBanco(user1);
        cb.addTitular(user2);
        cb.addTitular(user3);
        cb.addTitular(user4);
        cb.addTitular(user5);
        
        Usuario[] listaUsers1 = new Usuario[]{
            user1,user2,user3,user4,user5
        };
        
        Usuario[] listaUsers2 =  cb.getListaTitulares();
        
        for (int i = 0; i < listaUsers1.length; i++) {
            assertEquals(listaUsers1[i],listaUsers2[i]);
            System.out.println(listaUsers1[i]);
        }
    }
}
