import java.util.Scanner;


public class oddEvenNumber {


	public static void main(String[] args) {
	
		Scanner s = new Scanner (System.in);
		
		System.out.println("Enter any number : "); 
		
		int a = s.nextInt();
		
		if (a%2==0){
			
			System.out.println( a + " is EVEN number");
		} else {
			System.out.println( a + " is ODD number");
		}

	}

}
