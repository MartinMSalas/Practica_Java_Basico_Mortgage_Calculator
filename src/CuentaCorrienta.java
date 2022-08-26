
class CuentaCorriente extends  Cuenta{
    private double descubierto;


    public CuentaCorriente(String numero, double saldo){
        super(numero,saldo);

        descubierto=1000;
    }

    public void extraer(double importe){
        if(importe<=(saldo+descubierto)){
            if(saldo>=importe){
                saldo-=importe;
            }else{
                importe-=saldo;
                saldo=0;
                descubierto-=importe;
            }

        }else{

        }
    }

    public void depositar(double importe){
        saldo += importe;
    }

    public void extraer(){
        if(1000<=(saldo+descubierto)){
            if(saldo>=1000){
                saldo-=1000;
            }else{
                double auxiliar=1000;
                auxiliar-=saldo                ;
                saldo=0;
                descubierto-=1000;
            }

        }else{

        }
    }
}