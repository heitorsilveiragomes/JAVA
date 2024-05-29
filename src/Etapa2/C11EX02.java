import java.util.Scanner;

public class C11EX02 {
    public static void main(String[] args) {
        final int TOTAL_CLIENTES = 538;
        Scanner scanner = new Scanner(System.in);

        // Inicialização das variáveis
        int bronzeCount = 0, prataCount = 0, ouroCount = 0;
        double somaBronze = 0, menorAplicacao = Double.MAX_VALUE, volumeTotal = 0;
        String clienteMenorAplicacao = "";

        // Loop para cada cliente
        for (int aux = 0; aux < TOTAL_CLIENTES; aux++) {

            System.out.print("Nome do cliente " + (aux + 1) + ": ");
            String nomeCliente = scanner.nextLine();
            System.out.print("Valor aplicado pelo cliente " + (aux + 1) + ": ");
            double valorAplicado = scanner.nextDouble();
            scanner.nextLine(); // Consumir a quebra de linha


            String classificacao;
            if (valorAplicado <= 1000) {
                classificacao = "Bronze";
                bronzeCount++;
                somaBronze += valorAplicado;
            } else if (valorAplicado <= 5000) {
                classificacao = "Prata";
                prataCount++;
            } else {
                classificacao = "Ouro";
                ouroCount++;
            }


            if (valorAplicado < menorAplicacao) {
                menorAplicacao = valorAplicado;
                clienteMenorAplicacao = nomeCliente;
            }


            volumeTotal += valorAplicado;


            System.out.println("Classificação do cliente " + nomeCliente + ": " + classificacao);
        }


        double mediaBronze = somaBronze / bronzeCount;


        System.out.println("\nQuantidade de clientes Bronze: " + bronzeCount);
        System.out.println("Quantidade de clientes Prata: " + prataCount);
        System.out.println("Quantidade de clientes Ouro: " + ouroCount);
        System.out.println("Média dos valores aplicados pelos clientes Bronze: " + mediaBronze);
        System.out.println("Volume total de aplicações: " + volumeTotal);
        System.out.println("Cliente com menor aplicação: " + clienteMenorAplicacao);

        scanner.close();
    }
}
