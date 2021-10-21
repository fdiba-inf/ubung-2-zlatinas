package exercise2;

import java.util.Scanner;
import java.lang.Math;


public class QuadraticEquation {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 

    System.out.println("a=");
    double a = input.nextInt();

    System.out.println("b=");
    double b = input.nextInt();

    System.out.println("c=");
    double c = input.nextInt();

    double D = (b*b)-(4.0*a*c);
    double x1;
    double x2;
    double x;



    if (a!=0) {
      if (D>=0) {
        x1 = (-b + Math.sqrt(D)) / (2*a);
        x2 = (-b + Math.sqrt(D)) / (2*a);
        System.out.println("x1="+ x1);
        System.out.println("x2="+ x2);

      } else {
        System.out.println("Imaginary values");
      }

    } else {
      if (b!=0){
        x = (0-c)/b;
        System.out.println("x=" + x);

      }else {
        if(c != 0){
          System.out.println("No Values");

        }else {
         System.out.println("Many Values");
        }
      }
    }
  
  }

}
    

   

     
