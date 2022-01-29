class AllOperators{
	public static void main(String[] args) {

		// initalizing what are our data will be i.e. we are usinng all as data type "int"

		int a = 12, b = 5, sum, difference, product, division, modulus;
		sum = a + b;
		difference = a - b;
		product = a * b;
		division = a / b;
		modulus = a % b;
		
		// to display in the format of what you are going to do as it's value to be displayed
		System.out.println("The sum of " +a+ " and " +b+ " is " +sum+ ".");
		System.out.println("The difference of " +a+ " and " +b+ " is " +difference+ ".");
		System.out.println("The product of " +a+ " and " +b+ " is " +product+ ".");
		System.out.println("The division of " +a+ " and " +b+ " is " +division+ ".");
		System.out.println("The modulus of " +a+ " and " +b+ " is " +modulus+ ".");
	}
}