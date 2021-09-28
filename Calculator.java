package pgdacsectionA;

public class Calculator {

	public static void main(String[] args) {
	
		int a=100;
		int b=20;
		//System.out.println(++a);
		//System.out.println(a);
 	   //ternary 
		
        int d=50;
        
        int c= a < b? a>d?++a:d++ : ++b;
       
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
  	}
}
