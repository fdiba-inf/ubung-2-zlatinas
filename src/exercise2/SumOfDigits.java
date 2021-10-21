package exercise2;

import java.util.Scanner;

public class SumOfDigits {
  public static void main(String[] args) {

   Scanner input = new Scanner(System.in);

   System.out.println("number:");
   int number=input.nextInt();
   int num1 = number % 10;
   int num2 = ((number/10)%10);
   int num3 = ((number/10)/10);
   int sum = num1 + num2 +num3;
   System.out.println("Sum of digits:"+ sum);


  }
}

  