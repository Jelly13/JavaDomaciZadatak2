import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Zadatak3 {

    public static void main (String[] args) {
        Random rand = new Random();
        int random_broj = rand.nextInt(50);
        Scanner guess = new Scanner(System.in);
        int broj = guess.nextInt();
        boolean pogodak = false;
        while (!pogodak) {
            int m = odrediBroj(random_broj, broj);
            switch (m){
                case 0:
                    System.out.println("Neverovatno! Pogodili ste tačan broj!" + random_broj);
                    break;
                case 1:
                    System.out.println("Dobar pokušaj, bili ste jako blizu!" + random_broj);
                    break;
                case 2:
                    System.out.println("Više sreće sledeći put..." + random_broj);
                    broj = guess.nextInt();
                    continue;
            }
            pogodak = true;
        }
    }

    private static int odrediBroj(int random_broj, int broj) {
        int razlika = abs (random_broj - broj);
        if (random_broj == broj) {
            return (0);
        }
        else if (razlika <= 5) {
            return (1);
        } else {
            return (2);
        }
    }


}