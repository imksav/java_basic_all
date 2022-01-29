public class BreakContinue1 {
	public static void main(String[] args) {
//		Break.....Continue.......
		
		
//		break conditions.................
		for(int i = 0; i < 10; i++) {
			if(i == 5) {
				break;
			}
			System.out.print(i +"\t");
		}
		System.out.println();
		
//		continue conditions.................
		for(int j = 0; j < 10; j++) {
			if(j == 5) {
				continue;
			}
			System.out.print(j +"\t");
		}
		
		
	}

}
