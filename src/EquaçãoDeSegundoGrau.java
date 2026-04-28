import java.util.Scanner;

public class EquaçãoDeSegundoGrau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
         double valorA, valorB, valorC, valorDelta, X1, X2;

        System.out.println("Digite o valor de A,B e C");
        System.out.println( "a --> ");
        valorA = sc.nextDouble();
        if (valorA==0) {
            System.out.println("não é uma equação de segundo grau");
        }
        else {
            System.out.println("b -->");
           valorB = sc.nextDouble();
            System.out.println("c -->");
            valorC = sc.nextDouble();
            valorDelta = valorB * valorB - 4 * valorA * valorC;
            if (valorDelta < 0) {
                System.out.println(("a equação não tem raiz"));
            }else {
                X1 = (-valorB + Math.sqrt((valorDelta)))/(2*valorA);
                X2 = (-valorB - Math.sqrt((valorDelta)))/(2*valorA);
                System.out.printf("x1 = %.2f" , X1);
                System.out.printf("x1 = %.2f" , X2);
            }
        }

    }
}
