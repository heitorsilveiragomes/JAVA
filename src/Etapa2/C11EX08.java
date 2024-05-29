import java.util.Scanner;

public class C11EX08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da hora trabalhada do projeto:");
        double valorHora = scanner.nextDouble();
        scanner.nextLine();

        double totalHoras = 0;
        double totalPagamento = 0;
        int totalPessoas = 0;
        int[] pessoasPorFaixa = new int[3];
        String nomeMaiorSalario = "";
        String funcaoMaiorSalario = "";
        double maiorSalario = 0;

        String nome = "";

        while (!nome.equalsIgnoreCase("FIM")) {
            System.out.println("Nome do trabalhador (ou 'FIM' para sair):");
            nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("FIM")) {
                break;
            }

            System.out.println("Função do trabalhador:");
            String funcao = scanner.nextLine();

            System.out.println("Quantidade de horas trabalhadas:");
            int horas = scanner.nextInt();
            scanner.nextLine();

            double premio;
            if (horas <= 100) {
                premio = 1000;
                pessoasPorFaixa[0]++;
            } else if (horas <= 500) {
                premio = horas * 10;
                pessoasPorFaixa[1]++;
            } else {
                premio = (horas / 10) * 100;
                pessoasPorFaixa[2]++;
            }

            double salario = horas * valorHora + premio;
            if (salario > maiorSalario) {
                maiorSalario = salario;
                nomeMaiorSalario = nome;
                funcaoMaiorSalario = funcao;
            }

            totalHoras += horas;
            totalPagamento += salario;
            totalPessoas++;

            System.out.println("Valor a receber por " + nome + ": R$ " + salario);
        }

        double mediaHoras = totalHoras / totalPessoas;

        System.out.println("Média de horas trabalhadas por pessoa no projeto: " + mediaHoras);
        System.out.println("Pessoa com maior salário: " + nomeMaiorSalario + " (" + funcaoMaiorSalario + ")");
        System.out.println("Quantidade de pessoas por faixa de prêmio de produtividade:");
        System.out.println("Até 100 horas: " + pessoasPorFaixa[0]);
        System.out.println("Acima de 100 até 500 horas: " + pessoasPorFaixa[1]);
        System.out.println("Acima de 500 horas: " + pessoasPorFaixa[2]);
        System.out.println("Valor total da folha de pagamento: R$ " + totalPagamento);

        scanner.close();
    }
}