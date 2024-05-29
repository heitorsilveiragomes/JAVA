import java.util.Scanner;

public class C11EX04A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeMultas = 230;
        int totalIdade = 0;
        double valorTotalMultas = 0;
        int homensMultados = 0;
        int mulheres7Pontos = 0;
        String pessoaMaisVelhaNome = "";
        int pessoaMaisVelhaIdade = 0;

        for (int aux = 1; aux <= quantidadeMultas; aux++) {
            System.out.println("Nome:");
            String nome = scanner.nextLine();
            System.out.println("Idade:");
            int idade = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Sexo (M/F):");
            char sexo = Character.toUpperCase(scanner.nextLine().charAt(0));
            System.out.println("Pontos perdidos:");
            int pontos = scanner.nextInt();
            System.out.println("Valor da multa:");
            double valor = scanner.nextDouble();
            scanner.nextLine();

            totalIdade += idade;
            valorTotalMultas += valor;

            if (idade > pessoaMaisVelhaIdade) {
                pessoaMaisVelhaIdade = idade;
                pessoaMaisVelhaNome = nome;
            }

            if (sexo == 'M') {
                homensMultados++;
            }

            if (sexo == 'F' && pontos == 7) {
                mulheres7Pontos++;
            }
        }

        double idadeMedia = (double) totalIdade / quantidadeMultas;
        double percentualHomensMultados = (double) homensMultados / quantidadeMultas * 100;

        System.out.println("Idade média dos condutores: " + idadeMedia);
        System.out.println("Valor total das multas aplicadas: " + valorTotalMultas);
        System.out.println("Percentual de homens multados: " + percentualHomensMultados + "%");
        System.out.println("Quantidade de mulheres que perderam 7 pontos na carteira: " + mulheres7Pontos);
        System.out.println("Pessoa mais velha: " + pessoaMaisVelhaNome + ", " + pessoaMaisVelhaIdade + " anos");

        scanner.close();
    }
}
