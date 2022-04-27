package com.example.helloworld.thirdChapter;

public class quadratic_equation
{
  public static void main (String[]args)
  {
    int a = 2, b = 5, c = -3;
    double determinate = b * b - 4.0 * a * c;	// determinate = b2b4ac 
    if (determinate > 0.0)
      {
	double root1 = (-b + Math.sqrt (determinate)) / (2.0 * a);
	double root2 = (-b - Math.sqrt (determinate)) / (2.0 * a);
	  System.out.println ("The root are " + root1 + "and" + root2);
      }
    else if (determinate == 0.0)
      {
	double root = -b / (2.0 * a);
	System.out.println ("The root is " + root);
      }
    else
      {
	System.out.println ("the equation has no real roots");
      }

  }
}
