package CTD_B3_Java_Clase10;

public class EmpleadoMarketing extends  Empleado{
    public String area;

    public EmpleadoMarketing(String nombre, String apellido, String dni, String area) {
        super(nombre, apellido, dni);
        this.area = area;

    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public void trabajar() {
        System.out.println("Empleado de Marketing trabajando "+getNombre()+" en area "+area);
    }

    public void trabajar(int horasExtras){
        System.out.println("Empleado de Marketing trabajando "+getNombre()+" en area "+area+" y facturando "+horasExtras+" horas extras" );
    }
}
