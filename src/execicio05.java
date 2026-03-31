import java.util.Scanner;

public class execicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double desconto ,valorTotal, valorfinal;

        System.out.println("escreva o valor da sua compra");
        valorTotal= sc.nextDouble();

        if (valorTotal>1000){
            desconto= valorTotal*15/100;
        }
        else {
            desconto = valorTotal * 8 / 100;
        }
          valorfinal= valorTotal-desconto;

        System.out.println("Seu valor final é igual a " + valorfinal);

        System.out.println("valor do desconto" + desconto);
    }
}
