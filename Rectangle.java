/*********** 
****Program to calculate the area and perimeter of a rectangle
*/
import java.util.Scanner;

class Rectangle{
  
  public static void main (String args[]) {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Enter the length of your rectangle");
    double length = in.nextDouble();
    
    System.out.print("Enter the width of your rectangle");
    double width = in.nextDouble();
    
    double area = length * width;
    double perimeter = 2 * (length + width);
    
    System.out.println("The area of your rectangle is " + area);
    System.out.println("The perimeter of your rectangle is " + perimeter);
    
  }
}