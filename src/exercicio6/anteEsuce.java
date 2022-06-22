import java.util.Scanner;

public class anteEsuce {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int nume = input.nextInt();

            input.close();

        int ante = nume - 1;
        System.out.println("O número anterior é: " + ante );

        int suce = nume + 1;
        System.out.println("O número posterior é: " + suce);

    }
}
