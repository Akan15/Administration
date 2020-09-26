package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        //Спроси,сколько новых пользователей мы хотим добавить
        System.out.println("Enter number if new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];
        //Создайте количество новых студентов
        for (int n = 0; n < numOfStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
        }
        for (int n = 0; n < numOfStudents; n++) {
            System.out.println(students[n].toString());
        }
    }
}
