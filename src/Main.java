public class Main {
    public static void main(String[] args) {


        //System.out.println("Calculadora de Pagos mensuales de hipoteca !");

        var mortgageCalculator = new MortgageCalculator();

        var mortageReport = new MortgageReport(mortgageCalculator);

        mortageReport.printMonthlyPayments();
        mortageReport.printMonthPayment();

        /*
        var textBox1 = new TextBox();


        textBox1.setText("Box 1");

        System.out.println(textBox1.text.toUpperCase() );
        var textBox2 = new TextBox();
        textBox2.setText("Box 2");
        System.out.println(textBox2.text.toUpperCase());
        */
        /*
        new Employee(10);
        var employee1 = new Employee(500000,20);

        int wage = employee1.calculateWage(20);
        System.out.println(wage);
        System.out.println(Employee.numberOfEmployees);
        */
    }






    static public void greetUser(String name){
        System.out.println("Hi "+name+" good to see you");
    }

}

