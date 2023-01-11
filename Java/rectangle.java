import java.util.Scanner;
public class rectangle{
public static void main(String[] args){
System.out.println("\n\t\"Calculate the area of Rectangle\"");
 
Scanner input = new Scanner(System.in);
double length,width,result;
 
System.out.print("\nEnter length :");
length = input.nextDouble();
 
System.out.print("\nEnter width :");
width = input.nextDouble();
 

result = length*width;
System.out.println("\n\nThe area of Rectangle is : "+result);
 
}
}

