import java.util.Scanner;
public class area{
public static void main(String[] args){
System.out.println("\t\"Calculation area of a Square\" ");

 

Scanner input = new Scanner (System.in);
double s, res;

 

System.out.print("\nEnter the value :");
s = input.nextDouble();

 

res = s*s;
System.out.println("The area of Square is : "+res);

 

}
}