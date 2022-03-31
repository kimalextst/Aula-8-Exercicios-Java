import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = leitor.nextInt();
        
        for(int i = 1; i <= numero; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
    
}
