import java.text.DecimalFormat;
import java.util.Scanner;

public class MortgagePlan {
    private int principal;
    private float interestMonthly;
    private short periodsMonthly;
    public MortgagePlan(){
        final float percentage = 100;
        final byte mesesEnUnAnio = 12;
        this.principal = (int) readInputs("Input Principal amount: ",100000,1000000);
        float interest = (float) readInputs("Input Annual interest rates ",1,30);
        byte periods = (byte) readInputs("Input the Period(Years): ",1,30);
        this.interestMonthly = interest / (mesesEnUnAnio * percentage);
        this.periodsMonthly = (short) (periods * mesesEnUnAnio);
        this.mortgagePlan();
    }


    private float[] mortgagePlan(){

        float monthlyPayments[] = new float[periodsMonthly+1];
        for (int i=0; i<=periodsMonthly;i++){
            //B = L[(1 + c)n - (1 + c)p]/[(1 + c)n - 1]
            monthlyPayments[i] = (float) (principal * (Math.pow((1+interestMonthly),periodsMonthly)-Math.pow((1+interestMonthly),i))/(Math.pow((1+interestMonthly),periodsMonthly)-1));
        }
        return monthlyPayments;
    }
    public void printMonthPayment(){
        float monthlyPay =  mortgageCalculator(principal,interestMonthly,periodsMonthly);
        System.out.println("You will pay "+monthlyPay+" for "+periodsMonthly+ " monthly periods");
    }
    public void printMonthlyPayments ( ){
        float[] monthlyPayments = mortgagePlan();
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

    private double readInputs(String prompt,double min, double max){
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
    private float mortgageCalculator(int principal,float interestMonthly,short periodsMonthly){
        float numerador = principal *  (interestMonthly * (float) Math.pow((interestMonthly + 1), periodsMonthly ));
        float denominador =  (float) Math.pow((interestMonthly + 1), periodsMonthly) -1;
        float monthlyPayments = numerador / denominador;
        return monthlyPayments;
    }
}
