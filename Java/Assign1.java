import java.util.Scanner;
public class assign {
public static void main(String[]args) {
Scanner input = new Scanner (System.in);
int x,y;
System.out.println("\nEnter the value of x");
x = input.nextInt();
System.out.println("  The value of \"x\" is : "+x);


System.out.println("\nEnter the value of \"y"\" : ");
y = input.nextInt();
System.out.println("The value of \"Y\" is : "+y);

x+=y;
System.out.println("\nAdd & Assign x:"+x);
x-=y;
System.out.println("\nSubtract & Assign x:"+x);
x*=y;
System.out.println("\nMultiplication & Assign x:"+x);
x/=y;
System.out.println("\ndivision &assign x:"+x);
x%=y;
System.out.println("\nRemainder & assign x:"+x);
	
	
	
}





}
