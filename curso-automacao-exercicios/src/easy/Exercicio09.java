package easy;
import javax.swing.JOptionPane;

public class Exercicio09 {
    

        public static void main(String[] args) {
        int primeiroNumero;
        int i = 1;

        primeiroNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));

        while(i <= 10){

        int resultado = primeiroNumero * i;

        System.out.println(resultado);

        i = i+1;

    }  

    }
}
