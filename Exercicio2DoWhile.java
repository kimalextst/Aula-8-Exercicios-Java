import java.util.Scanner;

public class Exercicio2DoWhile {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numeroDesejado = leitor.nextInt();

        int i = 0;
        do {
            int resultado = numeroDesejado * i;
            System.out.println(numeroDesejado+"x"+i+" = "+resultado);
            i++; 
        } while (i <= 10);
    }
    
}
