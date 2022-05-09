package modelo;

import gestores.GestorUsuario;

import java.util.Arrays;
import java.util.Date;

public class CuentaNetflix {
    private Usuario titular;
    private int numCuenta;
    private Date fechaCreacion;
    private final String[] perfiles = new String[5];

    private static final int precioEstandar = 12;

    public CuentaNetflix(Usuario titular) {
        setTitular(titular);
        setNumCuenta();
        setFechaCreacion();
        setPerfiles();
    }

    public void setTitular(Usuario titular) {
        if(titular == null){
            throw new IllegalArgumentException("El titular no puede ser nulo");
        }
        this.titular = titular;
    }

    public void setNumCuenta() {
        do{
            this.numCuenta = (int)(Math.random()*999999);
        }while(GestorUsuario.compruebaNumCuentaNetflixExiste(this.numCuenta));
    }

    public void setFechaCreacion() {
        this.fechaCreacion = new Date();
    }

    public void setPerfiles() {
        Arrays.fill(perfiles, "Vacio");
    }

    public Usuario getTitular() {
        return titular;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public String getFechaCreacion() {
        return fechaCreacion.toString();
    }

    public String[] getPerfiles() {
        return perfiles.clone();
    }

    public static int getPrecioEstandar() {
        return precioEstandar;
    }

    public void bajaCuenta() {
        //que hago aqui
    }

    public String cobrar() {
        CuentaBanco[] cuentasBanco = titular.getCuentasBanco();

        for(CuentaBanco cb: cuentasBanco){
            try{
                cb.retiraSaldo(precioEstandar);
                return "Se ha cobrado con exito en la cuenta: " + cb.getIBAN();
            }catch (IllegalArgumentException ignored){
            }
        }

        bajaCuenta();
        return "No se ha podido cobrar en ninguna cuenta";
    }

    public String crearPerfil(String nombrePerfil) {
        if(nombrePerfil==null || nombrePerfil.length() <= 3){
            throw new IllegalArgumentException("El nombre del perfil no es valido");
        }
        for (int i = 0; i < perfiles.length; i++) {
            if(perfiles[i].equalsIgnoreCase("Vacio")){
                perfiles[i] = nombrePerfil;
                return "Perfil creado con exito";
            }
        }
        return "Espacio insuficiente";
    }

    public String borraPerfil(String nombrePerfil) {
        if(nombrePerfil==null || nombrePerfil.length() <= 3){
            throw new IllegalArgumentException("El nombre del perfil no es valido");
        }
        for (int i = 0; i < perfiles.length; i++) {
            if(perfiles[i].equalsIgnoreCase(nombrePerfil)){
                perfiles[i] = "Vacio";
                return "Perfil borrado con exito";
            }
        }
        return "El perfil no existe";
    }

    @Override
    public String toString() {
        return "titular=" + titular + ", numCuenta=" + numCuenta;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.numCuenta;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CuentaNetflix other = (CuentaNetflix) obj;
        return this.numCuenta == other.numCuenta;
    }
    
    
}
