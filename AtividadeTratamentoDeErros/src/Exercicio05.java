import exceptions.ValorNuloException;

public class Exercicio05 {
    public static void main(String[] args) {
        String[] nomes = {"Ana", null, "Carlos", "Beatriz", null, "Daniel"};

        for (int i = 0; i < nomes.length; i++) {
            try {
                if (nomes[i] == null) {
                    throw new ValorNuloException("Elemento na posicao " + i + " e null");
                }
                System.out.println("Posicao " + i + ": " + nomes[i].toUpperCase());
            } catch (ValorNuloException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}
