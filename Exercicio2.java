import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número desejado: ");
        int numeroDesejado = leitor.nextInt();
        for(int i = 0; i <= 10; i++){
            int resultado = numeroDesejado * i;
            System.out.println(numeroDesejado+"x"+i+"="+resultado);
        }
    }
    
}
