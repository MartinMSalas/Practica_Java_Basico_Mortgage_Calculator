package CTD_B3_Java_Clase10;

public class EmpleadoProduccion extends Empleado{
    private int tiempoExperiencia;

    public EmpleadoProduccion(String nombre, String apellido, String dni, int tiempoExperiencia) {
        super(nombre, apellido, dni);
        this.tiempoExperiencia=tiempoExperiencia;
    }

    public int getTiempoExperiencia() {
        return tiempoExperiencia;
    }

    public void setTiempoExperiencia(int tiempoExperiencia) {
        this.tiempoExperiencia = tiempoExperiencia;
    }

    @Override
    public void trabajar() {
        System.out.println("Empleado de produccion nombre: "+getNombre()+ " trabajando");
    }
}
