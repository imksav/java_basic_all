// constructor chaining
public class Constructor2 {
     public String empName;
     public double empSalary;
     public String address;

     public Constructor2(){
          this("Keshav");
     }

     public Constructor2(String name){
          this(name, 25784);
     }

     public Constructor2(String name, double salary){
          this(name, salary, "Baneshwor");
     }

     public Constructor2(String name, double salary, String add){
          this.empName = name;
          this.empSalary = salary;
          this.address = add;
     }

     void Details(String name, double salary, String add){
          System.out.println("EmpName: " +this.empName);
          System.out.println("EmpSalary: " +this.empSalary);
          System.out.println("Address: " +this.address);
     }

  
     public static void main(String[] args) {
          Constructor2 obj1 = new Constructor2();
          obj1.Details("Ksav", 9238345, "Shankhamul"); // will not prefered as priority
     }

}