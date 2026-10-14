import java.util.Scanner;
import exceptions.NumeroInvalidoException;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        String entrada = sc.nextLine();

        try {
            int numero = Integer.parseInt(entrada);
            System.out.println("Numero convertido: " + numero);
        } catch (NumberFormatException e) {
            try {
                throw new NumeroInvalidoException("Nao foi possivel converter a string em numero inteiro");
            } catch (NumeroInvalidoException ex) {
                System.out.println("Erro: " + ex.getMessage());
            }
        }

        sc.close();
    }
}
