package day5;

public class Harmonicnum {
		     
	// Function to find Nth Harmonic Number
	static double nthHarmonic(int N)
	{
	    // H1 = 1
	    float harmonic = 1;
	 
	    // Hn = H1 + H2 + H3 ... + Hn-1 + Hn-1 + 1/n
	    for (int i = 2; i <= N; i++) {
	        harmonic += (float)1 / i;
	    }
	 
	    return harmonic;
	}
	
	    public static void main (String[] args) {
	            int N = 4;
	     
	    System.out.print(nthHarmonic(N));
	     
	    }
	}

