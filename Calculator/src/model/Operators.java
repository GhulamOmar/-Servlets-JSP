package model;


public class Operators { // Class Operators
	// Fields of the class.

		 private int userinput1;
		 private int userinput2;
		 private String operator;
		 private double result2;
		 private int result1;
		 // Constructor and parameters.
		 public Operators(int userinput1, int userinput2, String operator) {
		  this.userinput1 = userinput1;
		  this.userinput2 = userinput2;
		  this.operator = operator;
		 }
		 // Calculation method.
		 public void calculation() {
			 // Switch and case.
		   switch(operator) {
		   case "+":
		       result1=userinput1+userinput2;
		       break;
		    case "-":
		       result1=userinput1-userinput2;
		       break;
		    case "*":
		       result1=userinput1*userinput2;
		       break;
		     case "/":
		       result2=(double)userinput1/(double)userinput2;
		       break;
		      }
		 }
		 // the method for userinput1.
		 public int getResult1() {
			  return result1;
			  
			 }
		// the method for userinput2.
			 public double getResult2() {
			  return result2;
			 }
			}





