package excercise.first;

import java.util.Scanner;

public class CalcolaBiglietto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age, km, discount = 0;
        float price_km = 0.21F, final_price , price ;

        System.out.print("Numero km:");
        km = Integer.parseInt(scanner.nextLine());
        System.out.print("Età passeggero:");
        age = Integer.parseInt(scanner.nextLine());

        if(age < 0 ){
            System.out.println("Età non valida");
        }else if (age > 0 && age < 18) {
            discount = 20;
        }else if (age > 65){
            discount = 40;
        }
        price = km * price_km;
        final_price = price - ((price * discount) / 100);
        System.out.println("Prezzo del biglietto: " + final_price + " euro");

    scanner.close();
    }
}
