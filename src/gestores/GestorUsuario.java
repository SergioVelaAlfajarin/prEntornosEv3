package gestores;

import java.util.ArrayList;
import java.util.ListIterator;

import modelo.CuentaBanco;
import modelo.CuentaNetflix;
import modelo.Usuario;

public abstract class GestorUsuario {
    private static final ArrayList<Usuario> listaUsuario = new ArrayList<>();

    public static void addUsuario(Usuario u) {
        listaUsuario.add(u);
    }

    public static boolean borraUsuario(int idUsuario) {
        ListIterator<Usuario> it = listaUsuario.listIterator();
        while(it.hasNext()) {
            Usuario siguiente = it.next();
            if(siguiente.getID() == idUsuario){
                it.remove();
                return true;
            }
        }
        return false;
    }

    public static Usuario buscaUsuario(String nombreCompleto) {
        for(Usuario u : listaUsuario){
            String nUser = u.getNombre() + " " + u.getPrimerApellido();
            if(nUser.equalsIgnoreCase(nombreCompleto)){
                return u;
            }
        }
        return null;
    }


    public static boolean compruebaIBANExistente(String IBAN) {
        for(Usuario u: listaUsuario){
            for(CuentaBanco cb: u.getCuentasBanco()){
                if(cb.getIBAN().equalsIgnoreCase(IBAN)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean compruebaNumCuentaNetflixExiste(int numCuenta) {
        for(Usuario u: listaUsuario){
            for(CuentaNetflix cn: u.getCuentasNetflix()){
                if(cn.getNumCuenta() == numCuenta){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean compruebaIDUsuarioExiste(int id) {
        for(Usuario c: listaUsuario){
            if(c.getID() == id){
                return true;
            }
        }
        return false;
    }

    public static int sacaLongitudArray() {
        return listaUsuario.size();
    }

}
