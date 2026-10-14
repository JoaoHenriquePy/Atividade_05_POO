import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import exceptions.IndiceInvalidoException;
import exceptions.OperacaoInvalidaException;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carla");

        System.out.println("Lista inicial: " + nomes);
        System.out.println("Comandos: add <nome> | add <pos> <nome> | remove <pos> | get <pos> | list | sair");

        while (true) {
            System.out.print("> ");
            String linha = sc.nextLine().trim();

            if (linha.equalsIgnoreCase("sair")) {
                break;
            }

            String[] partes = linha.split("\\s+");

            try {
                switch (partes[0].toLowerCase()) {
                    case "add":
                        if (partes.length == 2) {
                            nomes.add(partes[1]);
                            System.out.println("Adicionado: " + partes[1]);
                        } else if (partes.length == 3) {
                            int pos = Integer.parseInt(partes[1]);
                            if (pos < 0 || pos > nomes.size()) {
                                throw new IndiceInvalidoException("Indice invalido para adicionar");
                            }
                            nomes.add(pos, partes[2]);
                            System.out.println("Adicionado na posicao " + pos);
                        } else {
                            throw new OperacaoInvalidaException("Uso incorreto do comando add");
                        }
                        break;

                    case "remove":
                        if (partes.length == 2) {
                            int pos = Integer.parseInt(partes[1]);
                            if (pos < 0 || pos >= nomes.size()) {
                                throw new IndiceInvalidoException("Indice invalido para remover");
                            }
                            System.out.println("Removido: " + nomes.remove(pos));
                        } else {
                            throw new OperacaoInvalidaException("Uso incorreto do comando remove");
                        }
                        break;

                    case "get":
                        if (partes.length == 2) {
                            int pos = Integer.parseInt(partes[1]);
                            if (pos < 0 || pos >= nomes.size()) {
                                throw new IndiceInvalidoException("Indice invalido para acessar");
                            }
                            System.out.println("Elemento: " + nomes.get(pos));
                        } else {
                            throw new OperacaoInvalidaException("Uso incorreto do comando get");
                        }
                        break;

                    case "list":
                        System.out.println("Lista: " + nomes);
                        break;

                    default:
                        throw new OperacaoInvalidaException("Comando invalido");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: a posicao deve ser um numero");
            } catch (IndiceInvalidoException e) {
                System.out.println("Erro: " + e.getMessage());
            } catch (OperacaoInvalidaException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        System.out.println("Lista final: " + nomes);
        sc.close();
    }
}
