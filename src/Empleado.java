public class Empleado {
    private String nombre;
    private int edad;
    private double sueldo;

    public Empleado(String nombre, int edad, double sueldo){
        this.nombre=nombre;
        this.edad=edad;
        this.sueldo=sueldo;
    }
    public void incrementarSueldo(int porcentajeIncremento ){
        this.sueldo+=sueldo*(1+porcentajeIncremento/100.0);
    }
}