public class EmpleadoService implements IEmpleadoService{
    private IEmpleadoDAO empleadoDAO;

    public EmpleadoService(IEmpleadoDAO empleadoDAO) {
        this.empleadoDAO = empleadoDAO ;
    }

    @Override
    public void agregarEmpleado(Empleado empleado) {
        empleadoDAO.agregarEmpleado(empleado) ;
    }

    @Override
    public Empleado obtenerEmpleado(String nombre) {
        return empleadoDAO.obtenerEmpleado(nombre) ;
    }

    @Override
    public void eliminarEmpleado(String nombre) {
        empleadoDAO.eliminarEmpleado(nombre) ;
    }

    @Override
    public void actualizarEmpleado(Empleado empleado) {
        empleadoDAO.actualizarEmpleado(empleado) ;
    }
}
