import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class April14th {
    public static void main(String[] args) throws FileNotFoundException {
        double maxMarks = 0;
        String maxNames = "";
        Scanner sc = new Scanner(new File("record.txt"));
        PrintWriter out = new PrintWriter(new File("Result.txt"));
        out.println("Names\t\tMarks");
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String names = line.substring(0, line.length());
            out.printf("%s\n", names);
            if (maxMarks < marks) {
                maxMarks = marks;
                maxNames = names;
            }
            out.printf("==============================================\n");
            out.printf("%s has got highest:%.2f\n", maxNames, maxMarks);
        }
        sc.close();
        out.close();

        // double maxMarks = 0;
        // String maxName = "";
        // java.util.Scanner sc = new Scanner(new File("record.txt"));
        // PrintWriter out = new PrintWriter(new File("Result.txt"));
        // out.println("Name\tMarks");
        // while (sc.hasNext()) {
        // String Line = sc.nextLine();
        // String name = Line.substring(0, 1);
        // double marks = Double.parseDouble(Line.substring(3, 7));
        // out.printf("%s\t\t%.2f\n", name, marks);
        // if (maxMarks < marks) {
        // maxMarks = marks;
        // maxName = name;
        // }

        // }
        // out.printf("==============================================\n");
        // out.printf("%s has got highest:%.2f\n", maxName, maxMarks);
        // sc.close();
        // out.close();
    }

}
