package modelo;

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
}
