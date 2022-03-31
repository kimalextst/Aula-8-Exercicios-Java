import java.util.Scanner;

public class Exercicio2While {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numeroDesejado = leitor.nextInt();

        int i = 0;
        while (i <= 10) {
            int resultado = numeroDesejado * i;
            System.out.println(numeroDesejado+"x"+i+" = "+resultado);
            i++;
        }
    }
    
}
