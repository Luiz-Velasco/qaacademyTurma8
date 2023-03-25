package easy;

import javax.swing.JOptionPane;

public class Exercicio11 {
    
    public static void main(String[] args) {
        
        int numero01;
        int i = 1;

        numero01 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));

        while(i <= 100){
            
            numero01 = numero01 + 2;

            System.out.println(numero01);

            i = i + 1;


        }
    }
}
