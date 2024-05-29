import java.util.Scanner;

public class C11EX09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] setores = {"", "Ger�ncia", "Administra��o", "Pesquisa", "Obras"};
        int[] funcionariosPorSetor = new int[5];
        int funcionarios2010Administracao = 0;
        String primeiroFuncionario = "";
        String ultimoFuncionario = "";
        int primeiroAno = Integer.MAX_VALUE;
        int ultimoAno = Integer.MIN_VALUE;

        String nome = "";

        while (!nome.equalsIgnoreCase("FIM")) {
            System.out.println("Nome do funcion�rio (ou 'FIM' para sair):");
            nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("FIM")) {
                break;
            }

            System.out.println("Registro funcional do funcion�rio:");
            String registro = scanner.nextLine();

            if (registro.length() != 6) {
                System.out.println("REGISTRO INV�LIDO");
                continue;
            }

            int ano = Integer.parseInt(registro.substring(0, 2)) + 2000;
            int setor = Integer.parseInt(registro.substring(2, 3));

            if (ano < 2010 || ano > 2014 || setor < 1 || setor > 4) {
                System.out.println("REGISTRO INV�LIDO");
                continue;
            }

            funcionariosPorSetor[setor]++;

            if (ano == 2010 && setor == 2) {
                funcionarios2010Administracao++;
            }

            if (ano < primeiroAno) {
                primeiroAno = ano;
                primeiroFuncionario = nome;
            }

            if (ano > ultimoAno) {
                ultimoAno = ano;
                ultimoFuncionario = nome;
            }
        }

        int setorMaisFuncionarios = 1;
        for (int aux = 2; aux <= 4; aux++) {
            if (funcionariosPorSetor[aux] > funcionariosPorSetor[setorMaisFuncionarios]) {
                setorMaisFuncionarios = aux;
            }
        }

        System.out.println("Quantidade de funcion�rios por setor:");
        for (int aux = 1; aux <= 4; aux++) {
            System.out.println(setores[aux] + ": " + funcionariosPorSetor[aux]);
        }

        System.out.println("Quantidade de funcion�rios que foram admitidos em 2010 e trabalham na Administra��o: " + funcionarios2010Administracao);
        System.out.println("Setor com mais funcion�rios: " + setores[setorMaisFuncionarios]);
        System.out.println("Primeiro funcion�rio admitido: " + primeiroFuncionario);
        System.out.println("�ltimo funcion�rio admitido: " + ultimoFuncionario);

        scanner.close();
    }
}