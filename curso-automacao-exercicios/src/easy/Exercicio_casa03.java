package easy;
import javax.swing.JOptionPane;

public class Exercicio_casa03 {

    public static void main(String[] args) {
        int valor1;
        int valor2;
        int valor3;

        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segunto valor"));
        valor3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor"));
 
        System.out.println("A soma dos três valores é: " + (valor1 + valor2 + valor3));
    }
}
