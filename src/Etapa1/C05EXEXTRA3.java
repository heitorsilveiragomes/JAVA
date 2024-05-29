package Etapa1;
import java.util.Scanner;

public class C05EXEXTRA3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int producaoTotal,perda,mudasAproveitadas, caixasPapelao, caixasMadeira;
        double precoCaixaPapelao, precoCaixaMadeira, ValorFrete, custoEmbalagem, custoTransporte,custoTotal;


        // Leitura dos dados
        System.out.print("Produção total de mudas da fazenda: ");
         producaoTotal = scanner.nextInt();

        System.out.print("Perdas durante a colheita e embalagem: ");
         perda = scanner.nextInt();

        System.out.print("Preço unitário da caixa de papelão (R$): ");
         precoCaixaPapelao = scanner.nextDouble();

        System.out.print("Preço unitário da caixa de madeira (R$): ");
         precoCaixaMadeira = scanner.nextDouble();

        System.out.print("Valor do frete (R$): ");
         ValorFrete = scanner.nextDouble();

        // Cálculo do número de caixas de papelão e madeira necessárias
         mudasAproveitadas = producaoTotal - perda;
         caixasPapelao = mudasAproveitadas / 7;
         caixasMadeira = (caixasPapelao + 14) / 15; // Arredonda para cima

        // Cálculo do custo total
         custoEmbalagem = caixasPapelao * precoCaixaPapelao + caixasMadeira * precoCaixaMadeira;

         custoTransporte = Math.ceil(caixasMadeira / 50.0) * ValorFrete; // Arredonda para cima

         custoTotal = custoEmbalagem + custoTransporte;

        // Impressão do custo total

        System.out.printf("Custo total: R$%.2f\n", custoTotal);
    }
}
