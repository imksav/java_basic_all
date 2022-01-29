import java.io.FileWriter;
import java.util.Scanner;
public class AssignmentFirst {

    public static void main(String[] args) {
        System.out.println("Enter the number of students to enter records: ");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        String name[] = new String[len];
        double test1[] = new double[len];
        
        double test2[] = new double[len];
        double test3[] = new double[len];
        FileWriter out = null;
        try{
            out = new FileWriter("record.txt");
            out.write("Name\t\t Test1 \t Test2 \t Test3 \n");
            for(int i = 0; i < 3; i++){
                System.out.println("Enter record for Student:\n"+(i+1));
                System.out.print("Name: ");
                name[i] = sc.next();
                System.out.print("Test1: ");
                test1[i] = sc.nextDouble();
                System.out.print("Test2: ");
                test2[i] = sc.nextDouble();
                System.out.print("Test3: ");
                test3[i] = sc.nextDouble();
            }
            for(int i = 0; i < 3; i++){
                out.write(" " +name[i]+ "\t\t" +test1[i]+ "\t" +test2[i]+ "\t" +test3[i]+ "\n");
            }
            out.close();
            sc.close();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}