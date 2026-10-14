import java.util.Scanner;
import exceptions.TelefoneInvalidoException;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o telefone (9 digitos): ");
        String telefone = sc.nextLine().trim();

        try {
            validarTelefone(telefone);
            System.out.println("Telefone valido: " + telefone);
        } catch (TelefoneInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }

    public static void validarTelefone(String telefone) throws TelefoneInvalidoException {
        if (telefone.length() != 9) {
            throw new TelefoneInvalidoException("O telefone deve ter exatamente 9 digitos");
        }

        for (int i = 0; i < telefone.length(); i++) {
            if (!Character.isDigit(telefone.charAt(i))) {
                throw new TelefoneInvalidoException("O telefone so pode conter digitos");
            }
        }
    }
}
