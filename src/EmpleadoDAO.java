import java.util.ArrayList;

public class EmpleadoDAO implements IEmpleadoDAO{
    ArrayList<Empleado> empleados = new ArrayList<>();

    @Override
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    @Override
    public Empleado obtenerEmpleado(String nombre) {
        for(Empleado empleado : empleados){
            if(empleado.getNombre().equals(nombre)){
                return empleado;
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
        int posicion = recorrerLista(empleado);
        if(posicion != -1){
            empleados.set(posicion, empleado);
        }
    }
    private int recorrerLista(Empleado empleado) {
        for(int i = 0; i<empleados.size(); i++){
            Empleado empleadoBuscado = empleados.get(i);
            if(empleadoBuscado.getNombre().equals(empleado.getNombre())){
                return i;
            }
        }
        return -1;
    }
}
