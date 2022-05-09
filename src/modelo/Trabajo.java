package modelo;

import java.util.Objects;

public class Trabajo {
    private String nombreTrabajo;
    private double sueldo;
    private double bonusAntiguedad;
    private int mesesAntiguedad;

    public Trabajo(String nombreTrabajo, double sueldo) {
        setNombreTrabajo(nombreTrabajo);
        setSueldo(sueldo);
    }

    public void setNombreTrabajo(String nombreTrabajo) {
        if(nombreTrabajo == null ||nombreTrabajo.length() <= 3){
            throw new IllegalArgumentException("El nombre Del trabajo no es valido");
        }
        this.nombreTrabajo = nombreTrabajo;
    }

    public void setSueldo(double sueldo) {
        if(sueldo < 950){
            throw new IllegalArgumentException("El sueldo no puede ser menor a 950");
        }
        this.sueldo = sueldo;
    }

    public void setBonusAntiguedad(double bonusAntiguedad) {
        this.bonusAntiguedad = bonusAntiguedad;
    }

    public void addMesAntiguedad() {
        this.mesesAntiguedad++;
        actualizaBonus();
    }

    public String getNombreTrabajo() {
        return nombreTrabajo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public double getBonusAntiguedad() {
        return bonusAntiguedad;
    }

    public int getMesesAntiguedad() {
        return mesesAntiguedad;
    }

    public void ingresaSalario(CuentaBanco cb) {
        cb.ingresaSaldo(sueldo + bonusAntiguedad);
    }

    public void actualizaBonus() {
        bonusAntiguedad = mesesAntiguedad * 100;
    }

    public void trabajar(CuentaBanco cuentaBanco) {
        if(cuentaBanco == null){
            throw new IllegalArgumentException("Necesitas una cuenta del banco para poder trabajar");
        }
        ingresaSalario(cuentaBanco);
    }

    @Override
    public String toString() {
        return nombreTrabajo + ", sueldo=" + sueldo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.nombreTrabajo);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.sueldo) ^ (Double.doubleToLongBits(this.sueldo) >>> 32));
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
        final Trabajo other = (Trabajo) obj;
        if (Double.doubleToLongBits(this.sueldo) != Double.doubleToLongBits(other.sueldo)) {
            return false;
        }
        return Objects.equals(this.nombreTrabajo, other.nombreTrabajo);
    }
    
    
}
