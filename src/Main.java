import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Course mat = new Course("Mathematic", "MAT101", "MAT");
        Course phy = new Course("Physic", "PHY101", "PHY");
        Course che = new Course("Chemistry", "CHE101", "CHE");

        Teacher t1 = new Teacher("Albert Einstein", "0000","PHY");
        Teacher t2 = new Teacher("Walter White","1111","CHE");
        Teacher t3 = new Teacher("Alan Turing", "3333", "MAT");

        phy.addTeacher(t1);
        che.addTeacher(t2);
        mat.addTeacher(t3);

        Student s1 = new Student("heisenberg", "2024000", 4, mat, phy, che);
        s1.addBulkExamNote(50, 25, 15);
        //s1.addBulkPerformanceNote(100, 100, 100);
        s1.isPass();

        /*Student s2 = new Student("Güdük Necmi", "2024001", 4, mat, phy, che);
        s2.addBulkExamNote(100,50,40);
        s2.isPass();*/

        /*Student s3 = new Student("Hayta İsmail", "2024002", 4, mat, phy, che);
        s3.addBulkExamNote(50,20,40);
        s3.isPass();*/



    }
}