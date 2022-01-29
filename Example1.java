import java.io.*;
import java.util.Scanner;
class Resultdemo {
    public static void main(String[] args) throws FileNotFoundException {
        double maxMarks = 0;
        String maxName="";
        java.util.Scanner sc = new Scanner(new File("record.txt"));
        PrintWriter out = new PrintWriter(new File("result.txt"));
        out.println("Name\tMarks");
        while(sc.hasNext()){
            String Line = sc.nextLine();
            String name = Line.substring(0,10);
            double marks = Double.parseDouble(Line.substring(3,7));
            out.printf("%s\t\t%.2f\n",name,marks);
            if(maxMarks<marks){
                maxMarks = marks;
                maxName  = name;
            }

        }
        out.printf("==============================================\n");
        out.printf("%s has got highest:%.2f\n",maxName,maxMarks);
        sc.close();
        out.close();
    }

}