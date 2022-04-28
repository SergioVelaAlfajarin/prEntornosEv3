package modelo;

import gestores.GestorUsuario;
import static junit.framework.Assert.*;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

class UsuarioTest {


	@Test
	void addadirCuentaNeflixYBorrarCuentaNetflix(){

		Usuario u = new Usuario("Paco", "Paquito");
		CuentaNetflix c = new CuentaNetflix(u);
		u.addCuentaNetflix(c);

		CuentaNetflix[] cuenta = u.getCuentasNetflix();

		assertNotNull(cuenta[0]);

		u.bajaCuentaNetflix(cuenta[0].getNumCuenta());

		assertEquals(u.getCuentasNetflix().length,0);

	}

	@Test
	void compruebaQueBuscaCorrectamenteUnUsuario(){
		Usuario u = new Usuario("Paco", "Paquito");
		GestorUsuario.addUsuario(u);

		assertNotNull(GestorUsuario.buscaUsuario ("Paco Paquito"));

	}

	@Test
	void compruebaQueElIBANExista(){
		Usuario u = new Usuario("Paco", "Paquito");
		CuentaBanco cb = new CuentaBanco(u);
		assertNotEquals(cb.getIBAN().length(),0);

	}



}