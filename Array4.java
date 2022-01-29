import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        String name[] = new String[size];
        System.out.println("===============================");
        System.out.println("Enter the names: ");
        for(int i = 0; i < size; i++){
            System.out.print("name["+i+"]: "); 
            name[i] = sc.next();
        }
        System.out.println("===============================");
        for(int i = 0; i < size; i++){
            System.out.println("Name of name["+i+"] : " +name[i]);
        }

    }
}