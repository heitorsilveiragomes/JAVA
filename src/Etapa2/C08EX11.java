package Etapa2;

import javax.swing.JOptionPane;

public class C08EX11 {
    public static void main(String[] args) {
        int mulheresLoirasOlhosAzuis = 0;
        double maiorSalario = 0;
        double menorSalarioHomens = Double.MAX_VALUE;

        for (int i = 0; i < 2; i++) {
            String sexo = (String) JOptionPane.showInputDialog(null, "Sexo da pessoa:",
                    "Sexo", JOptionPane.QUESTION_MESSAGE, null,
                    new String[]{"Masculino", "Feminino"}, "Masculino");

            String corOlhos = (String) JOptionPane.showInputDialog(null, "Cor dos olhos:",
                    "Cor dos Olhos", JOptionPane.QUESTION_MESSAGE, null,
                    new String[]{"Azul", "Castanhos", "Preto", "Outros"}, "Azul");

            String corCabelos = (String) JOptionPane.showInputDialog(null, "Cor dos cabelos:",
                    "Cor dos Cabelos", JOptionPane.QUESTION_MESSAGE, null,
                    new String[]{"Loiro", "Preto", "Castanhos", "Ruivos"}, "Loiro");

            int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Idade da pessoa:"));

            String estadoCivil = (String) JOptionPane.showInputDialog(null, "Estado civil da pessoa:",
                    "Estado Civil", JOptionPane.QUESTION_MESSAGE, null,
                    new String[]{"Casado", "Solteiro", "Outros"}, "Solteiro");

            double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Salário da pessoa (R$):"));

            int escolaridade = JOptionPane.showOptionDialog(null, "Escolaridade da pessoa:",
                    "Escolaridade", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    new String[]{"Analfabeto", "Ensino Fundamental", "Ensino Médio", "Superior"}, "Analfabeto");

            if (sexo.equals("Feminino") && corCabelos.equals("Loiro") && corOlhos.equals("Azul")
                    && idade >= 18 && idade <= 25 && estadoCivil.equals("Solteiro") && salario > 10000 && escolaridade == 3) {
                mulheresLoirasOlhosAzuis++;
            }

            if (salario > maiorSalario) {
                maiorSalario = salario;
            }

            if (sexo.equals("Masculino") && salario < menorSalarioHomens) {
                menorSalarioHomens = salario;
            }
        }

        double diferencaSalariosHomens = maiorSalario - menorSalarioHomens;

        JOptionPane.showMessageDialog(null,
                "Mulheres loiras, de olhos azuis, com idade entre 18 e 25 anos, solteiras, salário > R$10.000,00 e curso superior completo: "
                        + mulheresLoirasOlhosAzuis + "\n"
                        + "Pessoa com maior salário: R$" + maiorSalario + "\n"
                        + "Diferença entre o maior e menor salário dos homens: R$" + diferencaSalariosHomens);
    }
}