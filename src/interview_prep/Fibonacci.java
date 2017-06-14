package interview_prep;

public class Fibonacci {
	
	public static void main(String args[]){
    
		// for the integer where i = 1; IF i is less than or equal to x THEN iterate by 1 
		for(int i = 1; i <= 100; i++) {
		//if i 
        if(i % (3*5) == 0) System.out.println("FizzBuzz");
        else if(i % 5 == 0) System.out.println("Buzz");
        else if(i % 3 == 0) System.out.println("Fizz");
        else System.out.println(i);
    } 
} 

}



