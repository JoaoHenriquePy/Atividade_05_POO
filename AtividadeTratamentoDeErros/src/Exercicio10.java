import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import exceptions.FormatoInvalidoException;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);

        System.out.print("Digite uma data (dd/MM/yyyy): ");
        String dataStr = sc.nextLine();

        try {
            Date data = sdf.parse(dataStr);
            System.out.println("Data convertida: " + sdf.format(data));
        } catch (ParseException e) {
            try {
                throw new FormatoInvalidoException("Formato de data invalido. Use dd/MM/yyyy");
            } catch (FormatoInvalidoException ex) {
                System.out.println("Erro: " + ex.getMessage());
            }
        }

        sc.close();
    }
}
