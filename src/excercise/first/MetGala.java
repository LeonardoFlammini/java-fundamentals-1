package excercise.first;

import java.util.Scanner;

public class MetGala {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] invitati = {"Jennifer Lopez", "Zendaya", "Chris Hemsworth", "Bad Bunny",
                "Cara Delevingne", "Kendall Jenner", "Uma Thurman", "Damiano David",
                "Luca Guadagnino"};
        System.out.print("Inserire Nome: ");
        String name_to_find = scanner.nextLine();
        boolean found = false;
        for ( int i = 0; i < invitati.length && !found ; i++ ){
            if (invitati[i].equals(name_to_find)) {
                found = true;
            }
        }
        if (found) {
            System.out.println("Hai accesso al gala");
        }else{
            System.out.println("Non hai accesso al gala");
        }


        scanner.close();
        }
    }

