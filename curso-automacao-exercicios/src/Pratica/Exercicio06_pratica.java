package Pratica;

import javax.swing.JOptionPane;

public class Exercicio06_pratica {
    public static void main(String[] args) {
        
        int nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota"));
        int nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda nota"));
        int media = (nota1 + nota2)/2;

        if(media>=6){
            System.out.println("Parabens você foi aprovado!");

        }

        if(media<=4){
            System.out.println("Você esta reprovado!");
        }

        if(media == 5){

            System.out.println("Você esta de exame!");
        }


    }
}
