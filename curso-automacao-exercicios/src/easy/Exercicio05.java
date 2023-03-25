package easy;
import javax.swing.JOptionPane;

public class Exercicio05 {
        /**
     * @param args
     */
    public static void main(String[] args, int i) {
        int valor01 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
        int valor02 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
        int valor03 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor"));

        int soma = valor01 + valor02 + valor03;
        int subtração = valor01 - valor02 - valor03;
        int multiplicacao = 2 * valor01 + valor02 + valor03;
        int nota = soma / 3;

    
        System.out.println("\nA soma dos três valores é: " + soma + "\nA subtração dos três valores é: " + subtração + "\nA multiplicação dos três valores é: " + multiplicacao + "\nA media dos três valores é: " + nota);
    }
}
