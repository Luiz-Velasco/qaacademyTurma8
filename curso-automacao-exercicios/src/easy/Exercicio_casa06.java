package easy;
import javax.swing.JOptionPane;

public class Exercicio_casa06 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String palavra;
        palavra = JOptionPane.showInputDialog("Digite uma palavra");

        String resultado = "Alteração";
        palavra = resultado;

        System.out.println("Você digitou: " + palavra);
    }
}
