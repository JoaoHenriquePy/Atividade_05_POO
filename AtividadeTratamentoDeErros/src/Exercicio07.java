import exceptions.NumeroInvalidoException;

public class Exercicio07 {
    public static void main(String[] args) {
        String[] valores = {"10.5", "abc", "3.14", "xyz", "100", "7.7"};

        for (int i = 0; i < valores.length; i++) {
            try {
                double numero = Double.parseDouble(valores[i]);
                System.out.println("Posicao " + i + ": " + numero);
            } catch (NumberFormatException e) {
                try {
                    throw new NumeroInvalidoException("Valor \"" + valores[i] + "\" nao e um numero valido");
                } catch (NumeroInvalidoException ex) {
                    System.out.println("Erro: " + ex.getMessage());
                }
            }
        }
    }
}
