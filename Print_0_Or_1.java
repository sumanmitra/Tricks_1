import java.util.Scanner;
public class Print_0_Or_1 {
public static void main(String args[]){
      System.out.println("Enter '1' or '0'. This program prints exactly opposite what you input.\n"
			      		+ "But it does not use any java flow control statements like\n "
			      		+ "(if, else, else if, switch, loops, break and continue) as well as any\n"
			      		+ "logical(&, |, ^, !, &&, and ||),relational and conditional(ternary) operators. ");

      System.out.print("\n\nEnter '1'  or   '0'    :");
      System.out.println("Program's output is : "+ (1-(new Scanner(System.in).nextInt())));
   }
}


