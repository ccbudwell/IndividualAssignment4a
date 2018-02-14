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
    
    double area = getArea(length, width);
    double perimeter = getPerimeter(length, width);

    
    System.out.println("The area of your rectangle is " + area);
    System.out.println("The perimeter of your rectangle is " + perimeter);
    
  }
  
  public static double getArea(double len, double wid) {
    return len * wid;
  }
  
  public static double getPerimeter(double len, double wid) {
    return 2 * (len + wid);
  }

}
