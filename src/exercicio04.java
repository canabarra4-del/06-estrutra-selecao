import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Y, X;

        System.out.println("Informe o número de X: ");
        X= sc.nextDouble();

        if (X >= -5 && X <= 5) {
            System.out.println("A expressão NÃO pode ser calculada");
        }
        else {

            Y = 8 / Math.sqrt(X*X-25);
            System.out.printf("O valor do Y é: " + Y);
        }
    }
}
