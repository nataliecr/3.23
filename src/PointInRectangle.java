import java.util.Scanner;

public class PointInRectangle {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a point with two coordinates: ");
    double x = input.nextDouble();
    double y = input.nextDouble();
    
    if (Math.abs(x) > (10/2) || Math.abs(y) > (5.0/2)){
      System.out.println("Point (" + x + ", " + y + 
              ") is not in the rectangle");
    } // if
    else{
      System.out.println("Point (" + x + ", " + y + 
              ") is in the rectangle");
    } // else
  } // main  
} // PointInRectangle
