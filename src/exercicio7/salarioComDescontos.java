package exercicio7;

import java.util.Scanner;

public class salarioComDescontos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Quanto você ganha por hora trablahada?: ");
        double valorPorHora = input.nextDouble();

        System.out.print("Quantas horas você trabalhou neste mês?: ");
        double qtdHorasTrab = input.nextDouble();

        input.close();

        double salarioB = valorPorHora * qtdHorasTrab;
        double salarioIR = salarioB * 11/100;
        double salarioBeIR = salarioB - salarioIR;
        double inss = salarioBeIR * 8/100;
        double sindicato = (salarioBeIR-inss) * 5/100;
        double liquido = salarioBeIR - inss - sindicato;


        System.out.printf("O seu salário com desconto de IR é: R$ %.2f\n ", salarioBeIR);
        System.out.printf("Você pagou ao INSS: %.2f\n ", inss);
        System.out.printf("Você pagou ao sindicato: R$ %.2f\n ", sindicato);
        System.out.printf("Seu salário liquido é: R$ %.2f\n ", liquido);

        }

    }


