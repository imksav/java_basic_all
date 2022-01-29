import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        String name;
        int age;
        double weight;
        System.out.println("===========================================");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = sc.next();
        System.out.println("Enter your age: ");
        age = sc.nextInt();
        System.out.println("Enter your weight(KG): ");
        weight = sc.nextDouble();
        System.out.println("===========================================");
        System.out.println("Your Name: " +name);
        System.out.println("Your Age: " +age);
        System.out.println("Your Weight: " +weight+ " KG");      
    }
}