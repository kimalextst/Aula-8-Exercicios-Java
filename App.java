import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite a quantidade de repetições: ");
        int qtdRepeticao = leitor.nextInt();
       
        for(int i = 1; i <= qtdRepeticao; i++){
            System.out.println(i);
        }
    }
}