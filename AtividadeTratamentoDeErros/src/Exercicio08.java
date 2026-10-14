import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import exceptions.NumeroInvalidoException;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.println("Digite numeros inteiros (ou 'sair' para encerrar):");

        while (true) {
            System.out.print("> ");
            String entrada = sc.nextLine().trim();

            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }

            try {
                int numero = Integer.parseInt(entrada);
                numeros.add(numero);
                System.out.println("Numero adicionado: " + numero);
            } catch (NumberFormatException e) {
                try {
                    throw new NumeroInvalidoException("\"" + entrada + "\" nao e um numero inteiro");
                } catch (NumeroInvalidoException ex) {
                    System.out.println("Erro: " + ex.getMessage());
                }
            }
        }

        System.out.println("Numeros lidos: " + numeros);
        sc.close();
    }
}
