import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class MortgageCalculator {

    private int principal;
    private float interestMonthly;
    private short periodsMonthly;

    public MortgageCalculator() {
        final float percentage = 100;
        final byte mesesEnUnAnio = 12;
        this.principal = (int) Console.readInputs("Input Principal amount: ",100000,1000000);
        float interest = (float) Console.readInputs("Input Annual interest rates ",1,30);
        byte periods = (byte) Console.readInputs("Input the Period(Years): ",1,30);
        this.interestMonthly = interest / (mesesEnUnAnio * percentage);
        this.periodsMonthly = (short) (periods * mesesEnUnAnio);
        mortgagePlan();

    }

    public float[] mortgagePlan(){

        float monthlyPayments[] = new float[periodsMonthly +1];
        for (int i = 0; i<= periodsMonthly; i++){
            //B = L[(1 + c)n - (1 + c)p]/[(1 + c)n - 1]
            monthlyPayments[i] = (float) (principal * (Math.pow((1+ interestMonthly), periodsMonthly)-Math.pow((1+ interestMonthly),i))/(Math.pow((1+ interestMonthly), periodsMonthly)-1));
        }
        return monthlyPayments;
    }

    public  float mortgageCalculator(){
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
        simbolos.setDecimalSeparator('.');
        DecimalFormat df = new DecimalFormat("###0.0#########",simbolos);



        interestMonthly = Float.parseFloat(df.format(interestMonthly));

        float numerador = principal *  (interestMonthly * (float) Math.pow((interestMonthly + 1), periodsMonthly ));
        float denominador =  (float) Math.pow((interestMonthly + 1), periodsMonthly) -1;

        return numerador / denominador;
    }
}
