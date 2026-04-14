import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temperatura;

        System.out.println("digite a temperatura em celcius");
        temperatura= sc.nextDouble();

        if (temperatura < 20){
            System.out.println("frio");

        } else
            System.out.println("quente");

    }
}
