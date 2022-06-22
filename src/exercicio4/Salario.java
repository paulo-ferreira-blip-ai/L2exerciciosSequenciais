import java.util.Scanner;

public class Salario {
    public static void main (String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("Quanto você ganha por hora trablahada?: ");
        double ganha = input.nextDouble();

        System.out.print("Quantas horas você trabalhou neste mês?: ");
        double horas = input.nextDouble();

            input.close();

        double salario = ganha * horas;
        System.out.printf("O total do seu salário neste mês é: R$ %.0f", salario);

    }
}
