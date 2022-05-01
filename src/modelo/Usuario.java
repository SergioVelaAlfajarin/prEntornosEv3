package modelo;

import gestores.GestorUsuario;

import java.util.ArrayList;
import java.util.ListIterator;

public class Usuario {
    private String nombre, primerApellido;
    private int ID;
    private Trabajo profesion;
    private final ArrayList<CuentaBanco> listaCuentasBanco = new ArrayList<>();
    private final ArrayList<CuentaNetflix> listaCuentasNetflix = new ArrayList<>();


    public Usuario(String nombre, String primerApellido) {
        setNombre(nombre);
        setPrimerApellido(primerApellido);
        setProfesion(null);
        setID();
    }

    public Usuario(String nombre, String primerApellido,Trabajo profesion){
        setNombre(nombre);
        setPrimerApellido(primerApellido);
        setProfesion(profesion);
        setID();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre == null || nombre.length() <= 1){
            throw new IllegalArgumentException("El Nombre no es valido");
        }
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID() {
        do{
            this.ID = (int)(Math.random()*999999);
        }while(GestorUsuario.compruebaIDUsuarioExiste(this.ID));
    }

    public Trabajo getProfesion() {
        return profesion;
    }

    public void setProfesion(Trabajo profesion) {
        this.profesion = profesion;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        if(primerApellido == null || primerApellido.length() <= 1){
            throw new IllegalArgumentException("El Nombre no es valido");
        }
        this.primerApellido = primerApellido;
    }

    public void darCurro(){
        profesion.trabajar(listaCuentasBanco.get(0));
    }

    public void addCuentaBanco(CuentaBanco cb) {
        listaCuentasBanco.add(cb);
    }

    public void addCuentaNetflix(CuentaNetflix cn) {
        listaCuentasNetflix.add(cn);
    }

    public boolean bajaCuentaNetflix(int numCuenta) {
        ListIterator<CuentaNetflix> it = listaCuentasNetflix.listIterator();
        while(it.hasNext()) {
            CuentaNetflix siguiente = it.next();
            if(siguiente.getNumCuenta() == numCuenta){
                it.remove();
                return true;
            }
        }
        return false;
    }

    public boolean bajaCuentaBanco(String IBAN) {
        ListIterator<CuentaBanco> it = listaCuentasBanco.listIterator();
        while(it.hasNext()) {
            CuentaBanco siguiente = it.next();
            if(siguiente.getIBAN().equalsIgnoreCase(IBAN)){
                it.remove();
                return true;
            }
        }
        return false;
    }

    public CuentaBanco[] getCuentasBanco(){
        CuentaBanco[] list = new CuentaBanco[listaCuentasBanco.size()];
        for (int i = 0; i < list.length; i++){
            list[i] = listaCuentasBanco.get(i);
        }
        return list;
    }

    public CuentaNetflix[] getCuentasNetflix(){
        CuentaNetflix[] list = new CuentaNetflix[listaCuentasNetflix.size()];
        for (int i = 0; i < list.length; i++){
            list[i] = listaCuentasNetflix.get(i);
        }
        return list;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + this.ID;
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
        final Usuario other = (Usuario) obj;
        return this.ID == other.ID;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", primerApellido=" + primerApellido + ", ID=" + ID + ", profesion=" + profesion + '}';
    }
    
    
    
    
}
