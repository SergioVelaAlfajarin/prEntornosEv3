package TestGestor;

import gestores.GestorUsuario;
import modelo.CuentaBanco;
import modelo.CuentaNetflix;
import modelo.Usuario;
import org.junit.Test;

import static org.junit.Assert.*;

public class GestorUsuarioTest {

    @Test
    public void compruebaQuePuedeBorrarUnUsuario() {

        Usuario a = new Usuario("Paco", "Paquito");
        GestorUsuario.addUsuario(a);
        int id = a.getID();

        int longitudantes = GestorUsuario.sacaLongitudArray();
        GestorUsuario.borraUsuario(id);
        int longitudespues = GestorUsuario.sacaLongitudArray();

        assertEquals(longitudantes - 1, longitudespues);
    }

    @Test
    public void compruebaQuePuedeMeterUnUsuario() {

        Usuario a = new Usuario("Paco", "Paquito");
        GestorUsuario.addUsuario(a);

        int longitudantes = GestorUsuario.sacaLongitudArray();
        GestorUsuario.addUsuario(a);
        int longitudespues = GestorUsuario.sacaLongitudArray();

        assertEquals(longitudantes + 1, longitudespues);
    }

    @Test
    public void compruebaQuePuedeBuscarUnUsuario() {

        Usuario a = new Usuario("Paco", "Paquito");
        GestorUsuario.addUsuario(a);

        Usuario usuarioBuscado = GestorUsuario.buscaUsuario("Paco Paquito");

        assertEquals(a, usuarioBuscado);

    }

    @Test
    public void compruebaNumCuentaNetflixExiste() {

        Usuario a = new Usuario("Paco", "Paquito");
        GestorUsuario.addUsuario(a);

        CuentaNetflix cn = new CuentaNetflix(a);

        assertNotEquals(cn.getNumCuenta(), 0);

    }

    @Test
    public void compruebaQueElIBANExiste() {
        Usuario u = new Usuario("Paco", "Paquito");
        CuentaBanco cb = new CuentaBanco(u);
        assertNotEquals(cb.getIBAN().length(), 0);

    }

    @Test
    public void compruebaIDUsuarioExiste() {
        try {
            Usuario u = new Usuario("Paco", "Paquito");
            u.getID();
        } catch (Exception e) {
            fail();
        }
    }

}
