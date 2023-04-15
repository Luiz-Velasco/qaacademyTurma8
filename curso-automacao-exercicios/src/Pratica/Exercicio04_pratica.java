package Pratica;

import javax.swing.JOptionPane;

public class Exercicio04_pratica {
    public static void main(String[] args) {
        int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));

        int resultado = valor1 * 2;

        System.out.println("O dobro do valor digitado é: " + resultado);
    }
}
