import java.util.Scanner;
import exceptions.ValorNuloException;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma string (deixe em branco para null): ");
        String texto = sc.nextLine();

        if (texto.isEmpty()) {
            texto = null;
        }

        try {
            if (texto == null) {
                throw new ValorNuloException("A string e null");
            }
            System.out.println("Comprimento: " + texto.length());
        } catch (ValorNuloException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }
}
