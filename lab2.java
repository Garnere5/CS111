// lab2.java
// Earl Garner
// September 5, 2025
// calculates primes using Sieve of Eratosthenes
// demonstrates command line arguments and methods
//
//
// The maxium prime number that is allowed is 100,000,000 or it would crash.
// Printing the numbers allow different outputs while it would fall into the "Missing argument" input. 
// The main issue with getting larger numbers is the memory limit of the boolean array for my computer.

public class lab2 {

	public static void main(String[] args) 
	{
		int num = 1000;
		
		//add code to get num from command line argument
		if (args.length > 0)
        {
            int N = 0;
            N = Integer.parseInt( args[0] );
            System.out.println( "N = " + N);
        }
        else
        {
            System.out.println("Missing argument");
        }
        
		//call showPrimes
		showPrimes( num );
		
	}//main
	
	public static void showPrimes(int N) {
		//add code to display primes
        boolean[] isPrime = new boolean[N + 1];
        isPrime[0] = false; // 0 is not prime
        isPrime[1] = false; // 1 is not prime
        for (int i = 2; i <= Math.sqrt(N); i++) {
            isPrime[i] = true; // sets every value to true
        }
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (isPrime[i] = true) {
                for (int j = i^2; j <= N; j += i) {
                    isPrime[j] = false; // mark multiples of i as non-prime
                }
            }
        }
        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();        
	}//showPrimes
	
}//lab2