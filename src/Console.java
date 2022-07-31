import java.util.Scanner;

public class Console {
    private static Scanner scanner = new Scanner(System.in);


    public static double readInputs(String prompt){

        System.out.println(prompt);
        return scanner.nextDouble();
    }
    public static double readInputs(String prompt, double min, double max){
        double resultado;
        while (true){
            System.out.print(prompt);
            resultado = scanner.nextDouble();
            if(resultado<= max && resultado>=min)
                break;
            System.out.println("The input must be between "+min+" and "+max);
        }
        return resultado;
    }
}
