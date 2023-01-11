import java.util.Scanner;
public class triangle{
public static void main(String[] args){
System.out.println("\n\t\"Calculate the area of Triangle\"");

 

Scanner input = new Scanner(System.in);
double base,height,result;

 

System.out.print("\nEnter base :");
base = input.nextDouble();
System.out.print("\nEnter height :");
height = input.nextDouble();

 

result = 0.5*base*height;
System.out.println("\n\nThe area of Triangle is : "+result);

 

}
}