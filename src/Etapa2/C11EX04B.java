import java.util.Scanner;

public class C11EX04B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalIdade = 0;
        int totalCondutores = 0;
        double valorTotalMultas = 0;
        int homensMultados = 0;
        int mulheres7Pontos = 0;
        String pessoaMaisVelhaNome = "";
        int pessoaMaisVelhaIdade = 0;

        String nome = "";

        while (!nome.equalsIgnoreCase("X")) {
            System.out.println("Nome do condutor (ou 'X' para sair):");
            nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("X")) {
                break;
            }

            System.out.println("Idade:");
            int idade = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Sexo (M/F):");
            char sexo = Character.toUpperCase(scanner.nextLine().charAt(0));

            System.out.println("Pontos perdidos:");
            int pontosPerdidos = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Valor da multa:");
            double valorMulta = scanner.nextDouble();
            scanner.nextLine();

            totalIdade += idade;
            totalCondutores++;
            valorTotalMultas += valorMulta;

            if (idade > pessoaMaisVelhaIdade) {
                pessoaMaisVelhaIdade = idade;
                pessoaMaisVelhaNome = nome;
            }

            if (sexo == 'M') {
                homensMultados++;
            }

            if (sexo == 'F' && pontosPerdidos == 7) {
                mulheres7Pontos++;
            }
        }

        double idadeMedia = totalCondutores > 0 ? (double) totalIdade / totalCondutores : 0;
        double percentualHomensMultados = totalCondutores > 0 ? (double) homensMultados / totalCondutores * 100 : 0;

        System.out.println("Idade média dos condutores: " + idadeMedia);
        System.out.println("Valor total das multas aplicadas: " + valorTotalMultas);
        System.out.println("Percentual de homens multados: " + percentualHomensMultados + "%");
        System.out.println("Quantidade de mulheres que perderam 7 pontos na carteira: " + mulheres7Pontos);
        System.out.println("Pessoa mais velha: " + pessoaMaisVelhaNome + ", " + pessoaMaisVelhaIdade + " anos");

        scanner.close();
    }
}
