import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class May4 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("Lab11a.txt"));
        Scanner sc2 = new Scanner(new File("Lab11b.txt"));
        Scanner sc3 = new Scanner(new File("Lab11c.txt"));

        System.out.println("******************************************");
        System.out.println("Keshav Bhandari\t\tReading File Lab11a.txt");
        System.out.println("***************Summary Statistics********************");
        int count1 = 0;
        double sum1 = 0;
        while (sc1.hasNext()) {
            sum1 = sum1 + sc1.nextInt();
            count1++;
        }
        double avg1 = sum1 / count1;
        System.out.println("Total number of elements: " + count1);
        System.out.println("Average data value is: " + avg1);
        System.out.println("============================================================================");
        System.out.println();
        System.out.println();
        System.out.println();
        // ====================================================================

        System.out.println("******************************************");
        System.out.println("Keshav Bhandari\t\tReading File Lab11b.txt");
        System.out.println("***************Summary Statistics********************");
        int count2 = 0;
        double sum2 = 0;
        while (sc2.hasNext()) {
            sum2 = sum2 + sc2.nextInt();
            count2++;
        }
        double avg2 = sum2 / count2;
        System.out.println("Total number of elements: " + count2);
        System.out.println("Average data value is: " + avg2);
        System.out.println("============================================================================");
        System.out.println();
        System.out.println();
        System.out.println();
        // ====================================================================

        System.out.println("******************************************");
        System.out.println("Keshav Bhandari\t\tReading File Lab11c.txt");
        System.out.println("***************Summary Statistics********************");

        double sum3 = 0;
        int count3 = 0;
        while (sc3.hasNext()) {
            int line = sc3.nextInt();
            count3++;
        }
        System.out.println("Total number of elements: " + count3);
        // ====================================================================
        int arr3[] = new int[count3];

        for (int i = 1; i <= count3; i++) {
            arr3[i] = sc3.nextInt();
        }
        for (int i = 1; i <= count3; i++) {
            System.out.println(arr3[i]);

        }

        // int arr3[] = new int[count3];
        // int num3[];
        // for (int i = 0; i < count3; i++) {
        // arr3[i] = num3;
        // }
        // for (int i = 0; i < count3; i++) {
        // System.out.print(" " + arr3[i]);
        // }

        // for (int i = 0; i < count3; i++) {
        // for (int j = 0; j < count3; j++) {
        // if (arr3[i] > arr3[j]) {
        // int temp = arr3[i];
        // arr3[i] = arr3[j];
        // arr3[j] = temp;
        // }
        // }

        // }

        System.out.println("============================================================================");
        System.out.println();
        System.out.println();
        System.out.println();

    }
}