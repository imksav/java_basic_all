import java.util.Scanner;
public class Divisible_By_5_6{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   System.out.println("Enter a number to be divisible by 5 or 6:-");
   int divisible = input.nextInt();
   if (divisible % 5 == 0 && divisible % 6 == 0){
       System.out.println("Divisible by 5 and 6.");
    }else if(divisible % 5 == 0){
    System.out.println("Divisible by 5 only.");
    }else if(divisible % 6 == 0){
    System.out.println("Divisible by 6 only.");
    }    
    else{
        System.out.println("Not Divisible by 5 and 6.");
    }
    
    
    }
}
