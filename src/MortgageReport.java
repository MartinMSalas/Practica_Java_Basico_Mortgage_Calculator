import java.text.DecimalFormat;

public class MortgageReport {

    final private MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
    }

    public void printMonthPayment(){
        float monthPayment = calculator.mortgageCalculator();
        System.out.println("I am the monthly pay: "+monthPayment);
    }


    public void printMonthlyPayments(){
        float[] monthlyPayments = calculator.mortgagePlan();
        DecimalFormat formateador = new DecimalFormat("#0.00");
        System.out.println("Mortgage Calculator");
        System.out.println();
        System.out.println("----------------------------------------------------------------------");
        System.out.println();
        for (int i =0;i<monthlyPayments.length;i++){
            System.out.println("Pay Number: "+i+" Remaining balance: $ "+formateador.format(monthlyPayments[i]));
        }
        System.out.println();

    }
}
