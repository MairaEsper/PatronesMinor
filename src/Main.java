import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmpleadoDAO empleadoDAO = new EmpleadoDAO();
        Empleado empleado1 = new Empleado("Juan", "Reponedor", 2000);
        Empleado empleado2 = new Empleado("Javiera", "Gerente", 4000);

        ingresarDatos(empleado1);

        //System.out.println(empleado1.getSalario());

        empleadoDAO.actualizarEmpleado(empleado1);
    }
    private static void ingresarDatos(Empleado empleado) {
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
