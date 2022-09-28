package palindromo;

import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a = leer.nextInt();
        for (int i = 0; i < a; i++) {
            String palindromo = leer.nextLine();
            String aux = "";            
            String palindromoaux = palindromo.replaceAll(" ", "");
            for (int j = palindromoaux.length() - 1; j >= 0; j--) {

                aux = aux + palindromoaux.charAt(j);

            }
            if (aux.equalsIgnoreCase(palindromoaux)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }

}
