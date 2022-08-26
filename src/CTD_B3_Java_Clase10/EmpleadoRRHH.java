package CTD_B3_Java_Clase10;

public class EmpleadoRRHH extends Empleado {
    private int altasLogradas;

    public EmpleadoRRHH(String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
    }

    @Override
    public void trabajar() {
        super.trabajar();
        System.out.println("Soy un empleado de RRHH trabajando mi nombre es "+getNombre());
    }
}
