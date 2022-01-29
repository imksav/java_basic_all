import java.util.Scanner;
import java.io.*;

public class April27th {
    public static void main(String args[]) {
        int[] value;
        int size;

        Scanner sc = new Scanner(new File("Bank.txt"));
        double balance = Integer.parseInt(sc.nextLine());
        while (sc.hasNext) {
            size++;
        }
        value = new int[size];

        System.out.println("Starting balance" + balance + "\n transaction  +\t amount \t balance \n =============");
        for (int i = 0; i < size; i++) {
            String Line = sc.nextLine();
            value[i] = Integer.parseInt(Line);
            balance += value[i];
            System.out.println((i + 1) + "\t" + value[i] + (balance));

        }
        System.out.println("=======================\n the ending balance" + balance);

    }
}