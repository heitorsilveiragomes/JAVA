import java.util.Scanner;

public class C11EX05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int alunosIngles = 0;
        int totalAlunos = 0;
        double totalMensalidades = 0;
        double mensalidadeMedia = 0;
        double[] totalMensalidadesPorOpcao = new double[3];

        String nome = "";

        while (!nome.equalsIgnoreCase("FIM")) {
            System.out.println("Nome do aluno (ou 'FIM' para sair):");
            nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("FIM")) {
                break;
            }

            System.out.println("C�digo da op��o de l�ngua (1-Ingl�s, 2-Franc�s, 3-Espanhol):");
            int codigoOpcao = scanner.nextInt();
            scanner.nextLine();

            double mensalidade = 0;
            switch (codigoOpcao) {
                case 1:
                    mensalidade = 100.00;
                    alunosIngles++;
                    break;
                case 2:
                    mensalidade = 150.00;
                    break;
                case 3:
                    mensalidade = 120.00;
                    break;
            }

            totalAlunos++;
            totalMensalidades += mensalidade;
            totalMensalidadesPorOpcao[codigoOpcao - 1] += mensalidade;

            System.out.println("Nome: " + nome + ", Mensalidade: R$ " + mensalidade);
        }

        if (totalAlunos > 0) {
            mensalidadeMedia = totalMensalidades / totalAlunos;
        }

        System.out.println("Alunos matriculados em Ingl�s: " + alunosIngles);
        System.out.println("Mensalidade m�dia da escola: R$ " + mensalidadeMedia);
        System.out.println("Valor total das mensalidades por op��o:");
        System.out.println("Ingl�s: R$ " + totalMensalidadesPorOpcao[0]);
        System.out.println("Franc�s: R$ " + totalMensalidadesPorOpcao[1]);
        System.out.println("Espanhol: R$ " + totalMensalidadesPorOpcao[2]);

        scanner.close();
    }
}
