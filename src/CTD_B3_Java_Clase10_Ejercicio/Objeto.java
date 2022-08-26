package CTD_B3_Java_Clase10_Ejercicio;

public class Objeto {
    private int posX;
    private int posY;
    private char direccion;

    public Objeto(int posX, int posY, char direccion) {
        this.posX = posX;
        this.posY = posY;
        this.direccion = direccion;
    }
    public void irA(int x,int y, char direccion){
        posX=x;
        posY=y;
        this.direccion=direccion;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public char getDireccion() {
        return direccion;
    }

    public void setDireccion(char direccion) {
        this.direccion = direccion;
    }
}
