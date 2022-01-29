package clz;

public class ArrayHandling {
	public static void main(String[] args) {
		int [] a = new int[5];
		try{
			System.out.println("sixth element is " + a[6]);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
