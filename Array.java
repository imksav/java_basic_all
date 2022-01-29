import java.util.Scanner;

public class Array {
     int items[];

     Array(int len) {
          this.items = new int[len];
     }

     void setItems(Scanner sc) {
          System.out.println("Enter the elements: ");
          for (int i = 0; i < items.length; i++) {
               items[i] = sc.nextInt();
          }
     }

     public int getElementAtIndex(int index) {
          return this.items[index];
     }

     void display() {
          for (int i = 0; i < items.length; i++) {
               System.out.println("Items[" + i + "] = " + items[i]);
          }
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the size of array: ");
          int size = sc.nextInt();
          System.out.println("Enter the index number: ");
          int index = sc.nextInt();

          Array obj1 = new Array(size);
          obj1.setItems(sc);
          obj1.display();
          System.out.println("The element at index " + index + " is " + obj1.getElementAtIndex(index));

     }
}