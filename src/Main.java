import manage.studentDao;
import manage.student_Manage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Welcome to student management app!");


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Press 1 to add student : ");
            System.out.println("Press 2 to  delete student : ");
            System.out.println("Press 3 to display student : ");
            System.out.println("Press 4 to exit : ");
            int c = Integer.parseInt(br.readLine());

            String student_name = null;
            if (c == 1) {
                //add student
                System.out.println("Please enter student name : ");
                student_name = br.readLine();
                System.out.println("Please enter student class : ");
                int student_class = Integer.parseInt(br.readLine());
                System.out.println("Please enter student age : ");
                int student_age = Integer.parseInt((br.readLine()));

                //create student object to store student
                student_Manage st = new student_Manage(student_name, student_class, student_age);
                boolean ans = studentDao.insertStudentTODB(st);
                if (ans) {
                    System.out.println("student is  added successfully..");
                } else {
                    System.out.println("something went wrong. Please try again..");
                }
                System.out.println(st);

            } else if (c == 2) {
                //add student
                System.out.println("Please enter student name : ");
                student_name = br.readLine();


                //create student object to store student
                student_Manage st = new student_Manage(student_name);
                boolean ans = studentDao.deleteStudentTODB(st);
                if (ans) {
                    System.out.println("student is  deleted successfully..");
                } else {
                    System.out.println("something went wrong. Please try again..");
                }
                System.out.println(st);

            } else if (c == 3) {
                //display student
                System.out.println("Showing data present in our database... ");

                //create student object to store student

                boolean ans = studentDao.dispalyStudentTODB();
                if (ans) {
                    System.out.println("Complete student datbase is displayed sucessfully....");
                } else {
                    System.out.println("something went wrong. Please try again..");
                }




            } else if (c == 4) {
                //exit
                break;
            } else {

            }


        }
        System.out.println("thanks for working on student management app!");
        System.out.println("Have a good day! Will soon you soon.. bye!");

    }
}