package Pratica;

import javax.swing.JOptionPane;

public class Exercicio05_pratica {
    public static void main(String[] args) {
        int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o priemrio valor"));
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
        int valor3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor"));

        int soma = valor1 + valor2 + valor3;
        int subtracao = valor1 - valor2 - valor3;
        int multiplicacao = valor1 * valor2 * valor3;
        int media = (valor1 + valor2 + valor3)/3;

        System.out.println("A soma dos valor é: " + soma);
        System.out.println("A subtração dos valores é: " + subtracao);
        System.out.println("A multiplicação dos valore é: " + multiplicacao);
        System.out.println("A media dos valores é: " + media);
    }
}
