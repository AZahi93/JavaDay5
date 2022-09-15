package day5;
import java.util.*; 
public class SwaptwoNum {
 
	 
	    public static void main(String[] args) {  
	       int x, y, z; 
	       Scanner AZ = new Scanner(System.in);  
	       System.out.println("Enter the value of X and Y");  
	       x = AZ.nextInt();  
	       y = AZ.nextInt();  
	       System.out.println("before swapping numbers: "+x +"  "+ y);  
	        
	       z = x;  
	       x = y;  
	       y = z;  
	       System.out.println("After swapping: "+x +"   " + y);  
	       System.out.println( );  
	    }    
	}  

