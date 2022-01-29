import java.util.Scanner;

class ShopMart {
     // member variables
     String cname;
     String pname[];
     double pprice[];

     // constructor
     ShopMart(String cname, int len) {
          this.cname = cname;
          this.pname = new String[len];
          this.pprice = new double[len];
     }

     void setProduct(Scanner sc) {
          for (int i = 0; i < pname.length; i++) {
               System.out.println("Enter name and total cost of product: " + (i + 1));
               pname[i] = sc.next();
               pprice[i] = sc.nextDouble();
          }
     }

     double getTotal() {
          double sum = 0;
          for (int i = 0; i < pname.length; i++) {
               sum = sum + pprice[i];
          }
          return sum;
     }

     double getDiscount(double total) {
          double dis = 0;
          if (total < 1000) {
               dis = 0.02 * total;
          } else if (total < 5000) {
               dis = 0.05 * total;
          } else {
               dis = 0.08 * total;
          }
          return dis;
     }

     void genBill() {
          System.out.println("Customer Name: " + this.cname);
          System.out.println("Particulars \t  Prices");
          for (int i = 0; i < this.pprice.length; i++) {
               System.out.println(this.pname[i] + " \t \t " + this.pprice[i]);
          }
          double t = this.getTotal();
          double d = this.getDiscount(t);
          System.out.println("=============================");
          System.out.println("Total \t \t " + (t));
          System.out.println("Discount \t  " + (d));
          System.out.println("Grand Total \t  " + (t - d));

     }
}

public class MartDemo {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter customer name and number of product to buy:");
          String name = sc.next();
          int len = sc.nextInt();
          ShopMart c1 = new ShopMart(name, len);
          c1.setProduct(sc);
          // System.out.println("Total price " +c1.getTotal());
          // System.out.println("Discount " +(c1.getDiscount(c1.getTotal())));
          c1.genBill();

     }
}