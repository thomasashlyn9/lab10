/**
 * @author apt138
 *
 *@since 11/2/17
 *
 *@version 1.0
 */

package lab10;
public class Palindrome {
	
	public static boolean isaPalindrome(String expr) {
		
	    //if string has 1 or 0 characters then it is automatically a palindrome
	    if(expr.length() < 2)
	    	return true;
	    	
			
	    //if the first char is not the same as the last it is not a palindrome
	    if(expr.charAt(0) != expr.charAt(expr.length()-1))
	    	return false;
	    	
	    	
	    //base case
	    //returns string containing from the next char to the length of the string -1 
		return isaPalindrome((expr.substring(1, expr.length() - 1)));
	}

	public static void main(String[] args) {
		
		int d = 0;
		int k = 0;
		
		 int max = 10000001;

		    for ( int i = 9999 ; i >= 1000 ; i--) {
		        if ( max >= i*9999 ) { 
		        	d =i+1;
		            break;
		        }
		        for (int j = 9999 ; j >= i ; j-- ) {             
		            int p = i * j;
		            if ( max < p && isaPalindrome(Integer.toString(p)) ) {
		                max = p;
		                k= j;
		            }
		        }
		    }       
		    
		    System.out.println("integer 1: " +d );
		    System.out.println( "integer 2: " + k);
		    System.out.println(max + " is the palindrome");
		}
		

}


