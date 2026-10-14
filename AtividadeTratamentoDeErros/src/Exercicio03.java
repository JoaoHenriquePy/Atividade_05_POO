import java.util.Scanner;
import exceptions.IndiceInvalidoException;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] frutas = {"Maca", "Banana", "Laranja", "Uva", "Manga"};

        System.out.println("Array de frutas:");
        for (int i = 0; i < frutas.length; i++) {
            System.out.println(i + " - " + frutas[i]);
        }

        try {
            System.out.print("Digite o indice: ");
            int indice = Integer.parseInt(sc.nextLine());

            if (indice < 0 || indice >= frutas.length) {
                throw new IndiceInvalidoException("Indice invalido. Use de 0 a " + (frutas.length - 1));
            }

            System.out.println("Elemento: " + frutas[indice]);

        } catch (NumberFormatException e) {
            System.out.println("Erro: digite um numero inteiro");
        } catch (IndiceInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }
}
