package CTD_B3_Java_Clase10_Ejercicio;

public class Nave extends Objeto{
    private double velocidad;
    private int vida=100;

    public Nave(int posX, int posY, char direccion, double velocidad) {
        super(posX, posY, direccion);
        this.velocidad = velocidad;
    }
    @Override
    public void irA(int x, int y, char direccion) {
        if (x != getPosX()){
            System.out.println("Tengo q buscar mi posicion en x ! estoy en x: "+getPosX()+" y necesito ir a x: "+x);
            if (x > getPosX())
                girar('E');
            else
                girar('O');
            System.out.println("Mi direccion es: "+getDireccion()+" ahora comienza la aproximacion");
            moverse(x,getDireccion());
            System.out.println("Llegue a mi posicion en x !! pos: "+getPosX()+" destino: "+x);
        }
        if (y != getPosY()){
            System.out.println("Tengo q buscar mi posicion en y ! estoy en y: "+getPosY()+" y necesito ir a y: "+y);
            if (y > getPosY())
                girar('N');
            else
                girar('S');
            System.out.println("Mi direccion es: "+getDireccion()+" ahora comienza la aproximacion");
            moverse(y,getDireccion());
            System.out.println("Llegue a mi posicion en y !! pos: "+getPosY()+" destino: "+x);
        }
        System.out.println("Llegue a destino !! x: "+getPosX()+" y: "+getPosY());
        girar(direccion);
    }
    private void moverse(int destino, char direccion){
        int origen=0;

        origen = (direccion=='E'||direccion=='O') ? getPosX() : getPosY();
        while (origen!=destino){
            unMovimiento(origen,destino,direccion);
            System.out.println("Mi nueva pos en x: "+getPosX()+" y en y: "+getPosY());
            origen = (direccion=='E'||direccion=='O') ? getPosX() : getPosY();
        }
    }
    private void unMovimiento(int origen, int destino, char direccion ){
        int velocidadInstantanea = (Math.abs(destino - origen) < velocidad)? 1 : (int) velocidad;
        switch (direccion){
            case 'E':
                setPosX(getPosX() + velocidadInstantanea);
                break;
            case 'O':
                setPosX(getPosX() -  velocidadInstantanea);
                break;
            case 'N':
                setPosY(getPosY()+velocidadInstantanea);
                break;
            case 'S':
                setPosY(getPosY()-velocidadInstantanea);
                break;
        }
    }
    public void girar(char direccion){
        setDireccion(direccion);
    }
    public void restaVida(int valor){
        vida -= valor;
    }
}
