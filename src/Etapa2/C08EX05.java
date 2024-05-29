package Etapa2;
import java.util.Scanner;

public class C08EX05 {

    public static void main(String[] args) {
        // Inicializando variáveis para contar os votos de cada candidato
        int eleitor,votosFulano = 0,votosCiclano = 0,votosBeltrano = 0;


        Scanner teclado = new Scanner(System.in);

        // Lendo os votos de cada eleitor
        for (eleitor = 1; eleitor <= 100; eleitor++) {  // Limite 100 eleitores (Todos votaram)
            System.out.print("Eleitor " + eleitor + ", vote (1 - Fulano, 2 - Ciclano, 3 - Beltrano): ");
            int voto = teclado.nextInt();

            // Contabilizando os votos para cada candidato
            switch (voto) {
                case 1:
                    votosFulano++;
                    break;
                case 2:
                    votosCiclano++;
                    break;
                case 3:
                    votosBeltrano++;
                    break;
                default:
                    System.out.println("Voto inválido. Vote novamente.");
                    eleitor--;  // Serve para votar novamente
                    break;
            }
        }

        teclado.close();

        // Verificando o candidato vencedor
        String vencedor;
        if (votosFulano > votosCiclano && votosFulano > votosBeltrano) {
            vencedor = "Fulano";
        } else if (votosCiclano > votosFulano && votosCiclano > votosBeltrano) {
            vencedor = "Ciclano";
        } else {
            vencedor = "Beltrano";
        }

        // Imprimindo os resultados
        System.out.println("Votos para Fulano: " + votosFulano);
        System.out.println("Votos para Ciclano: " + votosCiclano);
        System.out.println("Votos para Beltrano: " + votosBeltrano);
        System.out.println("O candidato vencedor é: " + vencedor);

        teclado.close();
    }
}
