
public class Departamento {
    private String Nombre;
    private int NumEmpleados;
    private Empleado[] empleados = new Empleado[2];
    void anadir(Empleado v){
        empleados[0]=v;
    }
}