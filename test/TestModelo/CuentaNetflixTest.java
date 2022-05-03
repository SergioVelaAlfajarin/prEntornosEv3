/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestModelo;

import modelo.CuentaBanco;
import modelo.CuentaNetflix;
import modelo.Usuario;
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
public class CuentaNetflixTest {

    @Test
    public void comprobadorCrearCuentas() {
        Usuario user = new Usuario("Sergio", "Vela");
        CuentaNetflix cn = new CuentaNetflix(user);
        try {
            CuentaNetflix cn1 = new CuentaNetflix(null);
            fail();
        } catch (IllegalArgumentException e) {
        }
        assertEquals(cn.getTitular(), user);
    }

    @Test
    public void compruebaMetodoCobrar() {
        Usuario user = new Usuario("Sergio", "Vela");
        CuentaNetflix cn = new CuentaNetflix(user);
        user.addCuentaNetflix(cn);

        String resultadoTransferencia = cn.cobrar();

        assertEquals(resultadoTransferencia, "No se ha podido cobrar en ninguna cuenta");

        CuentaBanco cb = new CuentaBanco(user);
        user.addCuentaBanco(cb);

        cb.ingresaSaldo(1000);
        resultadoTransferencia = cn.cobrar();
        String devuelto = "Se ha cobrado con exito en la cuenta: " + cb.getIBAN();
        assertEquals(resultadoTransferencia, devuelto);
    }

    @Test
    public void compruebaCreacionPerfiles() {
        Usuario user = new Usuario("Sergio", "Vela");
        CuentaNetflix cn = new CuentaNetflix(user);
        user.addCuentaNetflix(cn);

        try {
            cn.crearPerfil(null);
            fail();
        } catch (IllegalArgumentException ex) {
        }
        try {
            cn.crearPerfil("las");
            fail();
        } catch (IllegalArgumentException ex) {
        }
        assertEquals(cn.crearPerfil("perfil1"), "Perfil creado con exito");
        assertEquals(cn.crearPerfil("perfil2"), "Perfil creado con exito");
        assertEquals(cn.crearPerfil("perfil3"), "Perfil creado con exito");
        assertEquals(cn.crearPerfil("perfil4"), "Perfil creado con exito");
        assertEquals(cn.crearPerfil("perfil5"), "Perfil creado con exito");

        assertEquals(cn.crearPerfil("perfil6"), "Espacio insuficiente");
    }

    @Test
    public void compruebaBorradoPerfiles() {
        Usuario user = new Usuario("Sergio", "Vela");
        CuentaNetflix cn = new CuentaNetflix(user);
        user.addCuentaNetflix(cn);

        cn.crearPerfil("perfil1");
        cn.crearPerfil("perfil2");

        try {
            cn.borraPerfil(null);
            fail();
        } catch (IllegalArgumentException ex) {
        }
        try {
            cn.borraPerfil("las");
            fail();
        } catch (IllegalArgumentException ex) {
        }

        String[] perfiles = cn.getPerfiles();
        String[] modelo = new String[]{"perfil1", "perfil2", "Vacio", "Vacio", "Vacio"};

        for (int i = 0; i < perfiles.length; i++) {
            assertEquals(perfiles[i], modelo[i]);
        }

        assertEquals(cn.borraPerfil("perfil1"), "Perfil borrado con exito");

        assertEquals(cn.borraPerfil("askgha"), "El perfil no existe");

        perfiles = cn.getPerfiles();
        modelo = new String[]{"Vacio", "perfil2", "Vacio", "Vacio", "Vacio"};

        for (int i = 0; i < perfiles.length; i++) {
            assertEquals(perfiles[i], modelo[i]);
        }
    }
}
