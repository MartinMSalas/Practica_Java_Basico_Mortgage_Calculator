package CTD_B3_Java_Clase10_Ejercicio;

public class Asteroide extends Objeto{
    private int lesion;

    public Asteroide(int posX, int posY, char direccion, int lesion) {
        super(posX, posY, direccion);
        this.lesion = lesion;
    }

    @Override
    public void irA(int x, int y, char direccion) {
        super.irA(x, y, direccion);
    }

    public int getLesion() {
        return lesion;
    }

    public void setLesion(int lesion) {
        this.lesion = lesion;
    }
}
