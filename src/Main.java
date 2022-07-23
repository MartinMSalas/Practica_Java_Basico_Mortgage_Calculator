import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        greetUser("Martin");

        System.out.println("Calculadora de Pagos mensuales de hipoteca !");
        /*
        int principal = (int) readInputs("Input Principal amount: ",100000,1000000);
        float interest = (float) readInputs("Input Annual interest rates ",1,30);
        byte periods = (byte) readInputs("Input the Period(Years): ",1,30);
        */
        int principal = 180000;
        float interest = 4f;
        byte periods = 10 ;
        mortgagePlan(principal,interest,periods);
        System.out.println();
    }
    static public void mortgagePlan(int principal,float interest,byte periods){

        final byte mesesEnUnAnio = 12;
        final float porcentaje = 100;

        float interestMonthly = interest / (mesesEnUnAnio * porcentaje);
        short periodsMonthly = (short) (periods * mesesEnUnAnio);

        float monthlyPay =  mortgageCalculator(principal,interestMonthly,periodsMonthly);

        float monthlyPayments[] = new float[periodsMonthly+1];

        for (int i = 0; i<= periodsMonthly;i++){

            monthlyPayments[periodsMonthly-i] = monthlyPay*i;
        }
        float monthlyPayments2[] = new float[periodsMonthly+1];
        for (int i=0; i<=periodsMonthly;i++){
            //B = L[(1 + c)n - (1 + c)p]/[(1 + c)n - 1]
            monthlyPayments2[i] = (float) (principal * (Math.pow((1+interestMonthly),periodsMonthly)-Math.pow((1+interestMonthly),i))/(Math.pow((1+interestMonthly),periodsMonthly)-1));

        }
        printMonthlyPayments(monthlyPayments2);

    }

    static public void printMonthlyPayments ( float[] monthlyPayments){
        DecimalFormat formateador = new DecimalFormat("#0.00");

        System.out.println("Mortgage Calculator");
        System.out.println();
        System.out.println("----------------------------------------------------------------------");
        System.out.println();

        for (int i =0;i<monthlyPayments.length;i++){
            System.out.println("Pay Number: "+i+" Remaining balance: $ "+formateador.format(monthlyPayments[i]));
        }
        System.out.println();
        System.out.println("You pay monthly: $ "+formateador.format(monthlyPayments[monthlyPayments.length-2])+ " for "+(monthlyPayments.length-1)+" monthly periods");


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
    static public float mortgageCalculator(int principal,float interestMonthly,short periodsMonthly){

        float numerador = principal *  (interestMonthly * (float) Math.pow((interestMonthly + 1), periodsMonthly ));
        float denominador =  (float) Math.pow((interestMonthly + 1), periodsMonthly) -1;

        float monthlyPayments = numerador / denominador;


        return monthlyPayments;
    }
}

