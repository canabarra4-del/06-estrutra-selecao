import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valor1, valor2, valor3;

        System.out.println("Digite o primeiro valor: ");
        valor1 = sc.nextDouble();
        System.out.println("Digite o segundo valor: ");
        valor2 = sc.nextDouble();
        System.out.println("Digite o terceiro valor: ");
        valor3 = sc.nextDouble();

        if (valor1 + valor2 > valor3 &&
                valor1 + valor3 > valor2 &&
                valor3 + valor2 > valor1) {
            System.out.println("é um triângulo");

        } else {
            System.out.println("não é um triângulo");
        }
    }
}
