/* File name: Fibonacci.java
 * -------------------------
 * In mathematics, there is a famous sequence of numbers called the Fibonacci
 * sequence after the thirteenth-century Italian mathematician Leonardo
 * Fibonacci. The first two terms in this sequence are 0 and 1, and every
 * subsequent term is the sum of the preceding two. This the first several 
 * numbers in the Fibonacci sequence are as follows:
 * 
 * F0 = 0
 * F1 = 1
 * F2 = 1 (0 + 1)
 * F3 = 2 (1 + 1)
 * F4 = 3 (2 + 1)
 * F5 = 5 (3 + 2)
 * F6 = 8 (5 + 3)
 * 
 * This program displays the values in this sequence from F0 through F15
 * 
 * Coder: Peter Lock
 * Date: 2015/12/01
 * 
 */

package com.chapter4;

import acm.program.*;

/* Class name: Fibonacci
 * ---------------------
 * This class displays the Fibonaccis sequance from F0 through F15 to the screen.
 * 
 */
public class Fibonacci2 extends ConsoleProgram{

	public void run(){
		
		showMessage();
		doTheMath();
		
	}

	/* Method name: doTheMath()
	 * ------------------------
	 * This method performs the calculations needed to display the 
	 * Fibonacci numbers from F0 through F15.
	 * precondition: none
	 * postcondition: The Fibonacci sequence from F0 through F15 is displayed
	 * to the screen.
	 * 
	 */
	private void doTheMath() {
		int f0 = 0;
		int f1 = 1;
		int fNext = 0;
		
		//initalize x to 2 as f0 and f1 are already initialized
		int x = 2;
		
		println("F0 = " + f0 );
		println("F1 = " + f1 );
		fNext = f1 + f0;
		while(fNext < 10000){	
			println("F" + x + " = " + fNext);	
			f0 = f1;
			f1 = fNext;
			x +=1;
			fNext = f1 + f0;
		}
	}

	/* Method name: showMessage()
	 * --------------------------
	 * This method displays a simple explanation of the programs function to 
	 * the screen.
	 * precondition: none
	 * postcondition: none
	 */
	private void showMessage() {
		println("This program prints the Fibonacci numbers that are less then 10000");
		println("The numbers are: ");
		println("");
	}
	
}