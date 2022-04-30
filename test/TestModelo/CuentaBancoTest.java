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
    public void compruebaCreacionCuentasBancoCorrecta(){
        
        Usuario user = new Usuario("Sergio", "vela");
        
        CuentaBanco cb = new CuentaBanco(user);
        
        Usuario[] listtitulares = cb.getListaTitulares();
        
        assertEquals(user, listtitulares[0]);
        assertEquals(0, cb.getSaldo(), 0);
    }
}
