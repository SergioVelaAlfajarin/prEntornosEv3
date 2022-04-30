package TestModelo;

import gestores.GestorUsuario;
import modelo.CuentaBanco;
import modelo.CuentaNetflix;
import modelo.Usuario;
import static junit.framework.Assert.*;
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
	public void addadirCuentaBancoYBorrarCuentaBanco(){

		Usuario u = new Usuario("Paco", "Paquito");
		CuentaBanco cb = new CuentaBanco(u);
		u.addCuentaBanco(cb);
		CuentaBanco[] cuenta = u.getCuentasBanco();

		assertNotNull(cuenta[0]);

		assertEquals(u.getCuentasBanco().length,0);
	}





}