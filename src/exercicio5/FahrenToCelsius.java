import java.util.Scanner;

public class FahrenToCelsius {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a temperatura em Fahrenheit: ");
        int info1 = input.nextInt();

            input.close();

        int convert = (info1 - 32) * 5/9;
        System.out.println("A temperatura em Celsius é: ºC " + convert);

    }
}
