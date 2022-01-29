
//performing write operation to a file
import java.io.*;
class Writertest{
  public static void main(String[] args) {
      FileWriter out = null;
      try{
          out = new FileWriter("sample.txt");
          out.write("Hello world\n");
          out.write("Welcome to java class\n");
          out.write("1\t2\t3\t4");
          out.close();
      }catch(Exception e){
          System.out.println(e.getMessage());
      }
  }
}
