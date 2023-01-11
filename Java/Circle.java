import java.util.Scanner;
public class circle{
public static void main(String[] args){
System.out.println("\n\t\"Calculate the area of Circle\"");

 

Scanner input = new Scanner(System.in);
double radius,result;

 

System.out.print("\nEnter radius :");
radius = input.nextDouble();

 


result = 3.1416*radius*radius;
System.out.println("\n\nThe area of Circle is : "+result);

 

}
}