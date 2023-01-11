import java.util.Scanner;
public class temperature1{
public static void main(String[] args){
System.out.println("\n\t\"Calculate the Temperature\"");
System.out.println("\nCalculate the temperature Fahrenheit scale to Celsius scale");

 

Scanner input = new Scanner(System.in);
double farh,result;

 

System.out.print("\nEnter Fahrenheit temperature :");
farh = input.nextDouble();

 

 


result = 0.56*(farh-32);
System.out.println("\n\nThe temperature on Celsius is : "+result);

 

}
}