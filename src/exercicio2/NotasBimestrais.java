import java.util.Scanner;

public class NotasBimestrais {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double nota1 = input.nextInt();

        System.out.print("Digite a segunda nota: ");
        double nota2 = input.nextInt();

        System.out.print("Digite a terceira nota: ");
        double nota3 = input.nextInt();

        System.out.print("Digite a quarta nota: ");
        double nota4 = input.nextInt();

            input.close();

        double notasBimestrais = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média das notas é: " + notasBimestrais);




    }
}
