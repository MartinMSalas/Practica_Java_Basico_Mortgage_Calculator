import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Ejercicio Calculadora de Hipoteca
        //System.out.println("Calculadora de Pagos mensuales de hipoteca !");

        //var mortgageCalculator = new MortgageCalculator();

        //var mortageReport = new MortgageReport(mortgageCalculator);

        //mortageReport.printMonthlyPayments();
        //mortageReport.printMonthPayment();

        // Ejercicio Scanner
        /*
        Scanner scanner = new Scanner(System.in);
        String iniciales="";
        System.out.print("Ingrese su nombre: ");
        iniciales += scanner.nextLine().charAt(0);
        System.out.print("Ingrese su apellido: ");
        iniciales += scanner.nextLine().charAt(0);
        System.out.println("Sus iniciales son: "+iniciales);

         */

        // Ejercicio funciones

        //System.out.println(esDivisible(4,2));

        //Ejercicio Comida animal
        Scanner scanner=new Scanner(System.in);
        System.out.print("Tell me the name of your dog: ");
        String name = scanner.nextLine();
        System.out.print("Tell me how much food she eat: ");
        int kgOfFood = scanner.nextInt();
        var freya = new Animal(name,kgOfFood);

        System.out.println(freya.getName()+" necesito "+cantidadPaquetes(freya)+" paquetes para estar satisfecha");


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

    private static int cantidadPaquetes(Animal freya) {
        float accumulator = 0;
        int packageQuantity =0 ;
        Scanner scanner = new Scanner(System.in);
        while(accumulator< freya.getKgOfFood()) {
            System.out.print("Insert the size of the new package: ");
            accumulator += scanner.nextFloat();
            packageQuantity++;
        }
        return packageQuantity;
    }




    /*
    static public boolean esDivisible(int numerador,int denominador){
        return (numerador%denominador==0);
    }
    */
    /*
    static public void greetUser(String name){
        System.out.println("Hi "+name+" good to see you");
    }
    */
}

