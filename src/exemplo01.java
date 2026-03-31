import java.util.Scanner;

public class exemplo01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        double media, n1, n2;

        System.out.println("Digite a primeira nota");
        n1=sc.nextDouble();

        System.out.println("Digite a segunda nota");
        n2=sc.nextDouble();

        media= (n1 + n2)/2;
        System.out.println("sua nota é: " + media);

        if (media >= 6){
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");
        }
    }
}
