package Pratica.Medium;

public class Exercicio07_medium {
    public static void main(String[] args) {

        // Exercicio 07
        String[] vetorMeses;
        vetorMeses = new String[12];

        vetorMeses[0] = "Janeiro";
        vetorMeses[1] = "Fevereiro";
        vetorMeses[2] = "Março";
        vetorMeses[3] = "Abril";
        vetorMeses[4] = "Maio";
        vetorMeses[5] = "Junho";
        vetorMeses[6] = "Julho";
        vetorMeses[7] = "Agosto";
        vetorMeses[8] = "Setembro";
        vetorMeses[9] = "Outubro";
        vetorMeses[10] = "Novembro";
        vetorMeses[11] = "Dezembro";

        //Exercicio08
        int i = 0;
        while (i <= 11) {
            System.out.println("O mês: "
             + (i + 1) + "- " + vetorMeses[i]);
            i++;
        } // fim while
    }
}

