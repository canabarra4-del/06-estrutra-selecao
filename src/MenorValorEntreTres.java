import java.util.Scanner;

public class MenorValorEntreTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Valor1, valor2, valor3;

        System.out.println("digite o primeiro o valor");
        Valor1 = sc.nextInt();
        System.out.println("digite o segundo o valor");
        valor2 = sc.nextInt();
        System.out.println("digite o terceiro o valor");
        valor3 = sc.nextInt();

        if (Valor1 != valor2 && Valor1 != valor3 && valor2 != valor3) {
            if (Valor1 < valor2 && Valor1 < valor3) {
                System.out.println("menor = " + Valor1);
            } else if (valor2 < valor3) {
                System.out.println("menor = " + valor2);
            } else {
                System.out.println("menor = " + valor3);
            }
        } else {
            System.out.println("os valores devem ser diferentes");
        }
    }
}