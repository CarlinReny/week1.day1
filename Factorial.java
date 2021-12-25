package week1.day1;



public class Factorial {

	public static void main(String[] args) {

		int i=5;
		int fact=1;
		for(i=1;i<=5;i++){		
			fact=i*fact;	
		}
		System.out.println(fact);	
	}
}