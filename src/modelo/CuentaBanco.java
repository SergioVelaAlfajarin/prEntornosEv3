package modelo;

import gestores.GestorUsuario;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class CuentaBanco {
    private final ArrayList<Usuario> listaTitulares = new ArrayList<>();
    private String IBAN;
    private double saldo;
    private Date fechaCreacion;

    public CuentaBanco(Usuario titularInicial) {
        addTitular(titularInicial);
        genIBAN();
        this.saldo = 0;
        setFechaCreacion();
    }

    private void setFechaCreacion() {
        fechaCreacion = new Date();
    }
 
    private void genIBAN() {
        do{
            int ibanAleatorio = (int)(Math.random()*1000000);
            this.IBAN = "ES" + String.format("%08d",ibanAleatorio);
        }while(GestorUsuario.compruebaIBANExistente(IBAN));
    }

    public void addTitular(Usuario titularInicial) {
        if(titularInicial == null){
            throw new IllegalArgumentException("Usuario no puede ser nulo");
        }
        listaTitulares.add(titularInicial);
    }

    public Usuario[] getListaTitulares() {
        Usuario[] list = new Usuario[listaTitulares.size()];
        for (int i = 0; i < list.length; i++){
            list[i] = listaTitulares.get(i);
        }
        return list;
    }

    public String getIBAN() {
        return IBAN;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getFechaCreacion() {
        return fechaCreacion.toString();
    }

    public void ingresaSaldo(double nSaldo) {
        if(nSaldo <= 0){
            throw new IllegalArgumentException("No puedes ingresar 0 o menos.");
        }
        saldo += nSaldo;
    }

    public void retiraSaldo(double nSaldo) {
        if(nSaldo <= 0){
            throw new IllegalArgumentException("No puedes retirar 0 o menos.");
        }
        if(saldo <= 0){
            throw new IllegalArgumentException("No puedes retirar mas saldo");
        }
        double temp = saldo - nSaldo;
        if(temp < 0){
            throw new IllegalArgumentException("No puedes retirar mas saldo del que dispones");
        }
        saldo -= nSaldo;
    }

    @Override
    public String toString() {
        return "listaTitulares=" + listaTitulares + ", IBAN=" + IBAN + ", saldo=" + saldo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.IBAN);
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
        final CuentaBanco other = (CuentaBanco) obj;
        return Objects.equals(this.IBAN, other.IBAN);
    }

    
    
}
