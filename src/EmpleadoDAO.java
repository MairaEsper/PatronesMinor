import java.util.ArrayList;
import java.util.Scanner;

public class EmpleadoDAO implements IEmpleadoDAO{
    ArrayList<Empleado> empleados = new ArrayList<>();

    @Override
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    @Override
    public Empleado obtenerEmpleado(String nombre) {
        for(Empleado nombreEmpleado : empleados){
            if(nombreEmpleado.getNombre().equals(nombre)){
                return nombreEmpleado;
            }
        }
        return null;
    }

    @Override
    public void eliminarEmpleado(String nombre) {
        empleados.removeIf(empleado -> empleado.getNombre().equals(nombre));
    }

    @Override
    public void actualizarEmpleado(Empleado empleado) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Ingrese el campo a actualizar (1. Puesto / 2. Salario):");
        int campo = Integer.parseInt(scan.nextLine());
        switch(campo){
            case 1:
                System.out.println("Ingrese el nuevo puesto del empleado:");
                String nuevoPuesto = scan.nextLine();
                empleado.setPuesto(nuevoPuesto);
                break;
            case 2:
                System.out.println("Ingrese el nuevo salario del empleado:");
                double nuevoSalario = Double.parseDouble(scan.nextLine());
                empleado.setSalario(nuevoSalario);
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
}
