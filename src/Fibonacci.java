/*--------------------------------
 * Name: jiaxuan lu 
 * ID: 0500108
 * date: 2/1/2018
 *--------------------------------*/

import java.util.*; //import


public class Fibonacci {
	//declares the variables for main and fiboSeriesRec method 
	//(if I declares inside the method, the firstR and secondR variables will be set to 0 and 1 every time that i call the method again)
	public static int n1, firstR = 0, secondR = 1 , thirdR ;
	//main 
	/*
	 *purpose: ask user to print the how many fibonacci number and call both fiboSeriesRec() and fiboSeriesLte() passing input as parameter, also calculate the time that both method going to  use.
	 */
	public static void main (String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter how many fibonacci number you want?"); 
		int n = reader.nextInt(); //in
		n1 = n; //
		
         

        System.out.println("Recursion: ");
        
        
        //using the startTime and endTime in the class note
        
        //utilizing a variable to get the system time before we execute
        long startTimeR=  System.nanoTime();
		System.out.println("The first"+"     "+ n +"    " +"numbers in Fibonacci Series (using Recursion)");
		
		fiboSeriesRec(n); // call the recursion method
		
		 // utilizing a variable to get the system time after we execute 
        long endTimeR = System.nanoTime();
        //getting the time it took to run the method by subtracting startTime from endTime.
        long timeElapsedR= endTimeR-startTimeR;
        
        
        //outputting time elapsed
        System.out.println("\nElapsed time in nanoseconds Recursion is: " + timeElapsedR);
        //converting time elapsed from nanoseconds to milliseconds
        System.out.println("\nElapsed time in milliseconds Recursion is: " + timeElapsedR/1000000);

		
        
        //-----------------------------------------------------------------------------------------------------
        
             
		System.out.println("\n\nLteration: ");
		//utilizing a variable to get the system time before we execute 
		//
        long startTime=  System.nanoTime();
        System.out.println("\nThe first"+"   "+ n+"   " + "numbers in Fibonacci Series (using Lteration)");
		
        fiboSeriesLte(n); // call the lteration method 
		
		 // utilizing a variable to get the system time after we execute 
        long endTime = System.nanoTime();
        
        
        //getting the time it took to run the method by subtracting startTime from endTime.
        long timeElapsed= endTime-startTime;

    
        //outputting time elapsed
        System.out.println("\nElapsed time in nanoseconds for Lteration is: " + timeElapsed);
        //converting time elapsed from nanoseconds to milliseconds
        System.out.println("\nElapsed time in milliseconds Lteration is: " + timeElapsed/1000000);
    
        
    
       
		
		reader.close();
	}
	
	/*-----------------------------------------------------
	 * method fiboSeriesLte
	 * parameter : integer "n"
	 * purpose: using for loop to calculate the Fibonacci series of numbers and output one by one. 
	 * cite: https://gist.github.com/vividvilla/4641152
	 * ------------------------------------------------------*/
	public static void fiboSeriesLte(int n ) {
		int  i, first = 0, second = 1,third;
		for ( i=0; i<n; i++) { 		
			
			System.out.print(first+"\t   "); //since we want print the 0 too. 
			
			//fibonacci(N) = fibonacci(N - 1) + fibonacci(N - 2);
			//whereas, fibonacci(0) = 0 and fibonacci(1) = 1
			
			third = first +second;
			first = second; 
			second = third;	
		}
	}
	/*-----------------------------------------------------
	 * method fiboSeriesRec
	 * parameter: integer "n"
	 * purpose: to calculate the fibonacci series of numbers and output one by one using Recursion function.
	 * ------------------------------------------------------*/
	public static void fiboSeriesRec(int n ) {		
		
		if (n >0 ) {
			
			if (n == n1) {
				System.out.print(0 +"\t   ");
			}else if(n == n1 - 1) {
				System.out.print(1 +"\t   ");
				
			}else {
				
				
				//fibonacci(N) = fibonacci(N - 1) + fibonacci(N - 2);
				//whereas, fibonacci(0) = 0 and fibonacci(1) = 1
				
				thirdR = firstR + secondR; 
				firstR  = secondR;
				secondR=thirdR;
				
				
				System.out.print( thirdR +"\t   ");
			}
			fiboSeriesRec(n-1); // call the fiboseriesRec method 	again. when the n-1 = 0  the method stop  
			
		}	
	}	
}  