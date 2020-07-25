import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        System.out.println("Unesite dva broja: ");
        try {
            Scanner citac = new Scanner(System.in);
            int a = citac.nextInt();
            int b = citac.nextInt();
            if (a > b) {
                int m = a;
                a = b;
                b = m;
            }
            int i = a + 1;
            while (i < b) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
                i++;
            }
        } catch (Exception InputMismatchException) {
            System.out.println("Neispravan unos!");
        }


    }
}
