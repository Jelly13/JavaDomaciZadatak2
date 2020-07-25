import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner citac = new Scanner(System.in);
        Student [] arrayOfStudents = new Student[citac.nextInt()];
        Student najbolji = null;

        for (int i = 0; i < arrayOfStudents.length; i++){
            Student student = new Student();
            student.ime = citac.next();
            student.brojPoena = citac.nextInt();
            arrayOfStudents[i] = student;
            if (najbolji == null || student.brojPoena > najbolji.brojPoena) {
                najbolji = student;
            }
        }
        //System.out.println(max);
        System.out.println(najbolji.ime);

    }
}
