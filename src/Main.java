import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        greetUser("Martin");

        System.out.println("Calculadora de Pagos mensuales de hipoteca !");

        int principal = (int) readInputs("Input Principal amount: ",100000,1000000);
        float interest = (float) readInputs("Input Annual interest rates ",1,30);
        byte periods = (byte) readInputs("Input the Period(Years): ",1,30);

        System.out.println(mortgageCalculator(principal,interest,periods));
    }
    static public void mortagePlan(int principal,float interest,byte periods){
        NumberFormat currency2 = NumberFormat.getCurrencyInstance();
        final byte mesesEnUnAnio = 12;
        final float porcentaje = 100;

        float interestMonthly = interest / (mesesEnUnAnio * porcentaje);
        byte periodsMonthly = (byte) (periods * mesesEnUnAnio);

        float mounthlyPayments = mortgageCalculator(principal,interestMonthly,periodsMonthly);


    }
    static public void greetUser(String name){
        System.out.println("Hi "+name+" good to see you");
    }

    static public double readInputs(String prompt,double min, double max){
        double resultado;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print(prompt);
            resultado = scanner.nextDouble();
            if(resultado<= max && resultado>=min)
                break;
            System.out.println("The input must be between "+min+" and "+max);
        }


        return resultado;
    }
    static public float mortgageCalculator(int principal,float interestMonthly,byte periodsMonthly){

        float numerador = principal *  (interestMonthly * (float) Math.pow((interestMonthly + 1), periodsMonthly ));
        float denominador =  (float) Math.pow((interestMonthly + 1), periodsMonthly) -1;

        float monthlyPayments = numerador / denominador;


        return monthlyPayments;
    }
}

