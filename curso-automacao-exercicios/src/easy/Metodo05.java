package easy;

public class Metodo05 {
    public static void main(String[] args) {
        int val1 = 50;
        int val2 = 49;
        System.out.println(valor(val1, val2));
        
    }

    public static boolean valor(int val1, int val2){
        int rasultado = val1+val2;
        if(rasultado>100){
            return true;
        }
        else {
            return false;
        }

    }
}
