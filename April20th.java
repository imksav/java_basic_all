import java.io.File;
import java.util.Scanner;

public class April20th {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("student_record.txt"));
            System.out.println("StudentID \t Maths \t Science \t English \t AverageMarks");
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String stdId = line.substring(0,4);
                double maths = Double.parseDouble(line.substring(9,11));
                double science = Double.parseDouble(line.substring(9,11));

                System.out.printf("%s \t %d", stdId, maths, science);


            }
            sc.close();
            
            
        } catch (Exception e) {
            System.out.println("An error occured");
        }
    }
}