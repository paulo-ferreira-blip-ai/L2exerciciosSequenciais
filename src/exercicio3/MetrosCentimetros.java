import java.util.Scanner;

public class MetrosCentimetros {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor em metros: ");
        double metros = input.nextDouble();

            input.close();

        double centimetros = metros * 100;
        System.out.printf("O valor em centímentros é: cm %.0f", centimetros);


    }

    }

