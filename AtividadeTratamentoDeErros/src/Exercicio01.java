import java.util.Scanner;
import exceptions.DivisaoPorZeroException;
import exceptions.NumeroInvalidoException;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro numero: ");
            int num1 = Integer.parseInt(sc.nextLine());

            System.out.print("Digite o segundo numero: ");
            int num2 = Integer.parseInt(sc.nextLine());

            if (num2 == 0) {
                throw new DivisaoPorZeroException("Nao e permitido dividir por zero");
            }

            int resultado = num1 / num2;
            System.out.println("Resultado: " + resultado);

        } catch (NumberFormatException e) {
            System.out.println("Erro: digite apenas numeros inteiros");
        } catch (DivisaoPorZeroException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado");
        }

        sc.close();
    }
}
