import java.util.Scanner;

public class Zadatak4 {

    public static void main (String[] args) {
        Scanner ulaz = new Scanner(System.in);
        int a = ulaz.nextInt();
        int b = ulaz.nextInt();
        String operacija = ulaz.next();
        boolean petlja = false;
        while (!petlja) {
            switch (operacija) {
                case "s":
                    System.out.println(sabiranje(a, b));
                    operacija = ulaz.next();
                    continue;
                case "o":
                    System.out.println(oduzimanje(a, b));
                    operacija = ulaz.next();
                    continue;
                case "m":
                    System.out.println(mnozenje(a, b));
                    operacija = ulaz.next();
                    continue;
                case "d":
                    System.out.println(deljenje(a, b));
                    operacija = ulaz.next();
                    continue;
            }
            petlja = true;
        }
    }

    public static int sabiranje(int a, int b){
        return a + b;
    }

    public static int oduzimanje(int a, int b){
        return a - b;
    }

    public static int mnozenje(int a, int b){
        return a * b;
    }

    public static int deljenje (int a, int b){
        return a / b;
    }
}