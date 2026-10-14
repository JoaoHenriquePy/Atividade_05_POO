import java.util.Scanner;
import exceptions.CpfInvalidoException;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o CPF: ");
        String cpf = sc.nextLine().trim();

        try {
            validarCPF(cpf);
            System.out.println("CPF valido");
        } catch (CpfInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }
    public static void validarCPF(String cpf) throws CpfInvalidoException {
        String limpo = cpf.replace(".", "").replace("-", "");

        if (!limpo.matches("\\d+")) {
            throw new CpfInvalidoException("CPF contem caracteres nao numericos");
        }

        if (limpo.length() != 11) {
            throw new CpfInvalidoException("CPF deve ter 11 digitos");
        }

        if (limpo.matches("(\\d)\\1{10}")) {
            throw new CpfInvalidoException("CPF invalido (todos os digitos iguais)");
        }
    }
}
