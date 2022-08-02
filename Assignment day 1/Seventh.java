/*
 *  Write a program to print the color name, based on color code. If color code in not valid
 *  then print "Invalid Code". R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White.
 */

import java.util.*;
public class Seventh {

	public static void main(String[] args) {
		char ch;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter color code alphabet");
		ch =sc.next().charAt(0);
  switch(ch) {
  case 'R':
	  System.out.println("Red");
	  break;
  case 'B':
	  System.out.println("Blue");
	  break;
  case 'G':
	  System.out.println("Green");
	  break;
  case 'O':
	  System.out.println("Orange");
	  break;
  case 'Y':
	  System.out.println("Yellow");
	  break;
  case 'W':
	  System.out.println("White");
	  break;
  default:
	  System.out.println("Invalid Code");
  }
	}

}
