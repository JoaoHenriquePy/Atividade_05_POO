import java.util.ArrayList;
import java.util.List;
import exceptions.ListaVaziaException;
import exceptions.ValorNuloException;

public class Exercicio09 {
    public static void main(String[] args) {
        List<Double> lista1 = new ArrayList<>();
        lista1.add(10.0);
        lista1.add(20.0);
        lista1.add(30.0);

        List<Double> lista2 = new ArrayList<>();

        List<Double> lista3 = new ArrayList<>();
        lista3.add(10.0);
        lista3.add(null);
        lista3.add(30.0);

        System.out.println("Media lista1: " + calcularMedia(lista1));
        System.out.println("Media lista2: " + calcularMedia(lista2));
        System.out.println("Media lista3: " + calcularMedia(lista3));
    }

    public static double calcularMedia(List<Double> numeros) {
        try {
            if (numeros == null || numeros.isEmpty()) {
                throw new ListaVaziaException("A lista esta vazia");
            }

            double soma = 0;
            int contador = 0;

            for (Double num : numeros) {
                if (num == null) {
                    throw new ValorNuloException("Valor nulo encontrado na lista");
                }
                soma += num;
                contador++;
            }

            return soma / contador;

        } catch (ListaVaziaException e) {
            System.out.println("Erro: " + e.getMessage());
            return 0;
        } catch (ValorNuloException e) {
            System.out.println("Erro: " + e.getMessage());
            return 0;
        }
    }
}
