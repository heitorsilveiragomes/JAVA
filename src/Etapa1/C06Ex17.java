// Yan Carlos Duarte Velasco

package org.example.etapa1;

import java.util.Scanner;

public class C06Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Você tem curso técnico de programação? (V/F): ");
        boolean temCursoTecnico = scanner.nextLine().equalsIgnoreCase("V");

        System.out.print("Você tem curso superior de programação? (V/F): ");
        boolean temCursoSuperior = scanner.nextLine().equalsIgnoreCase("V");

        System.out.print("Você tem menos de 3 anos de experiência em programação? (V/F): ");
        boolean temMenosDe3AnosExperiencia = scanner.nextLine().equalsIgnoreCase("V");

        System.out.print("Você se considera uma pessoa criativa? (V/F): ");
        boolean eCriativo = scanner.nextLine().equalsIgnoreCase("V");

        System.out.print("Você prefere liderar a ser liderado? (V/F): ");
        boolean prefereLiderar = scanner.nextLine().equalsIgnoreCase("V");

        System.out.print("Você prefere trabalhar sozinho a trabalhar em equipe? (V/F): ");
        boolean prefereTrabalharSozinho = scanner.nextLine().equalsIgnoreCase("V");

        System.out.print("Você é autodidata (aprende sozinho)? (V/F): ");
        boolean eAutodidata = scanner.nextLine().equalsIgnoreCase("V");

        System.out.print("Você aceitaria uma remuneração inicial de R$1500? (V/F): ");
        boolean aceitaRemuneracaoInicial1500 = scanner.nextLine().equalsIgnoreCase("V");

        System.out.print("Você só aceitaria trabalhar em escritórios da empresa dentro da grande BH? (V/F): ");
        boolean soAceitaTrabalharEmBH = scanner.nextLine().equalsIgnoreCase("V");

        boolean estaApto = (temCursoTecnico || temCursoSuperior) &&
                (!temMenosDe3AnosExperiencia || temCursoTecnico) &&
                eCriativo &&
                (!prefereTrabalharSozinho) &&
                eAutodidata &&
                (!soAceitaTrabalharEmBH) &&
                (!prefereLiderar || !aceitaRemuneracaoInicial1500);

        System.out.println("Resultado = " + (estaApto ? "Apto" : "Não apto"));
    }
}
