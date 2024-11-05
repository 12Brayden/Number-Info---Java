import java.util.Scanner;
public class Numberinfo
{
	public static void main (String[] args) {
		Scanner scnr  = new Scanner(System.in);
	
	int userNum;
	int numRem;
	
   
System.out.print("What is your favorite integer? ");
	userNum = scnr.nextInt();
System.out.println("You entered " + userNum + " as your number.");
    if ( userNum == 42 ) {
        System.out.println("I like the number " + userNum + " also!");
    }
    numRem = userNum % 2;
    
    
    switch (numRem) {
      case 0:
         System.out.println("Your number is even.");
         break;
      case 1:
         System.out.println("Your number is odd.");
         break;
      case -1:
         System.out.println("Your number is odd.");
         break;
         }
    switch (Integer.signum(userNum)) {
      case 1:
         System.out.println("Your number is positive.");
         break;
      case -1:
         System.out.println("Your number is negative.");
         break;
      case 0: 
         System.out.println("Your number is zero.");
         break;
         }
    }
    }
    
    