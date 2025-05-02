import java.util.*;
public class SwitchCalc {
   public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);// Scanner object for input

    // Asking user to enter two numbers
    System.out.println("please enter two numbers"); 
      int a = scn.nextInt();
      int b = scn.nextInt();
      
      // Asking user which operation they want to perform
   System.out.println("please enter the operator");
         char operator = scn.next().charAt(0); // Taking character input for operation


         // Using switch case to perform the chosen operation
         switch (operator) {
               case '+' :
               System.out.println(a + b);
               break ;
               case '-' :
               System.out.println(a - b);
               break ;
               case '*' :
               System.out.println(a * b);
               break ;
               case '/' : 
               System.out.println(a / b);
               break;
               case '%' :
                  System.out.println(a % b);
                  break;
                  
                  default : // If user enters any other character
                  System.out.println("you entered wrong number , please write between 1 to 5");


         }
      }
   }

