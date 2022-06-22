package exercicio7;

import java.util.Scanner;

public class salarioComDescontos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Quanto você ganha por hora trablahada?: ");
        double ganha = input.nextDouble();

        System.out.print("Quantas horas você trabalhou neste mês?: ");
        double horas = input.nextDouble();

        input.close();

        double salarioB = ganha * horas;
        double salarioIR = salarioB * 11/100;
        double salarioBeIR = salarioB - salarioIR;
        double inss = salarioBeIR * 8/100;
        double sindicato = (salarioBeIR-inss) * 5/100;
        double liquido = salarioBeIR - inss - sindicato;


        System.out.printf("O seu salário com desconto de IR é: R$ %.2f ", salarioBeIR);
        System.out.println();
        System.out.printf("Você pagou ao INSS: %.2f ", inss);
        System.out.println();
        System.out.printf("Você pagou ao sindicato: R$ %.2f", sindicato);
        System.out.println();
        System.out.printf("Seu salário liquido é: R$ %.2f", liquido);

        }

    }


