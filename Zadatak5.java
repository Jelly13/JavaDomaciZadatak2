import java.util.Arrays;
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        int duzinaNiza = ulaz.nextInt();
        int[] niz = new int[duzinaNiza];
        int clan;
        for (int i=0; i < niz.length; i++) {
            clan = ulaz.nextInt();
            niz[i] = clan;

        } ;
        Arrays.sort(niz);
        int x = ulaz.nextInt();
//        Without using Arrays for finding element
//        for (int value : niz) {
//            if (value == x) {
//                System.out.println("It exists!");
//            }
//            ;
//        };
        System.out.println(x +" is" + Arrays.binarySearch(niz, x));
        if (duzinaNiza <= 5){
            for (int i =0; i < niz.length; i++){
                System.out.println(niz[i]);
            }
        } else {
            for (int i = 0; i < 5; i++) {
                System.out.println(niz[i]);
            }
        }
    }
}