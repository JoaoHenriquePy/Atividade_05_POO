import java.util.Scanner;
import exceptions.IndiceInvalidoException;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        try {
            System.out.print("Digite a linha: ");
            int linha = Integer.parseInt(sc.nextLine());

            System.out.print("Digite a coluna: ");
            int coluna = Integer.parseInt(sc.nextLine());

            if (linha < 0 || linha >= matriz.length || coluna < 0 || coluna >= matriz[0].length) {
                throw new IndiceInvalidoException("Indice invalido. Linhas e colunas vao de 0 a 2");
            }

            System.out.println("Valor: " + matriz[linha][coluna]);

        } catch (NumberFormatException e) {
            System.out.println("Erro: digite apenas numeros");
        } catch (IndiceInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }
}
