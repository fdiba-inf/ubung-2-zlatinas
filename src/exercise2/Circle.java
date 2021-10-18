package exercise2;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

       System.out.println("R=");
        double R=input.nextDouble();
        double C=2*Math.PI*R;
        double A=Math.PI*R*R;
        System.out.println("Circumference:"+C);
        System.out.println("Area: "+A);
    }

}
