package interview_prep;


public class Sum_All{
	
	   public static void main(String args[]){
	      int[] array = {13, 20, 35, 44, 20, 80};
	      int sop = 0;
	      //Advanced for loop
	      for( int numr : array) {
	          sop = (sop+numr);
	      }
	      System.out.println("Sum of array elements is:"+sop);
	   }
	}
