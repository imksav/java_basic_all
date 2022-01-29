
public class Constructor1 {
     String name;
     double salary;
     int age;

     Constructor1(){
          String cname = "imksav pvt. ltd.";

     }
     
     void setDetails(String name, double salary, int age){
          this.name = name;
          this.salary = salary;
          this.age = age;
     }

     void displayDetails(){
          System.out.println("Name: " +this.name);
          System.out.println("Salary: " +this.salary);
          System.out.println("Age: " +this.age);

     }
     public static void main(String[] args) {
          Constructor1 obj1 = new Constructor1();
          obj1.setDetails("keshav", 569832, 21);
          obj1.displayDetails();;
          Constructor1 obj2 = new Constructor1();
          obj2.displayDetails();
          Constructor1 obj3 = new Constructor1();
          obj3.setDetails("hari", 374685, 33);
          obj3.displayDetails();
     }

}