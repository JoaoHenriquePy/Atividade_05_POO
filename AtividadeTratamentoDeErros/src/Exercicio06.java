import java.util.Scanner;
import exceptions.DivisaoPorZeroException;
import exceptions.OperacaoInvalidaException;
import exceptions.NumeroInvalidoException;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro numero: ");
            double num1 = Double.parseDouble(sc.nextLine());

            System.out.print("Digite o segundo numero: ");
            double num2 = Double.parseDouble(sc.nextLine());

            System.out.print("Digite a operacao (+, -, *, /): ");
            String op = sc.nextLine();

            double resultado;

            switch (op) {
                case "+":
                    resultado = num1 + num2;
                    break;
                case "-":
                    resultado = num1 - num2;
                    break;
                case "*":
                    resultado = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        throw new DivisaoPorZeroException("Nao e permitido dividir por zero");
                    }
                    resultado = num1 / num2;
                    break;
                default:
                    throw new OperacaoInvalidaException("Operacao invalida. Use +, -, * ou /");
            }

            System.out.println("Resultado: " + resultado);

        } catch (NumberFormatException e) {
            System.out.println("Erro: digite apenas numeros");
        } catch (DivisaoPorZeroException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (OperacaoInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }
}
