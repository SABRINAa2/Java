import java.util.Scanner;
public class temperature{
public static void main(String[] args){
System.out.println("\n\t\"Calculate the Temperature\"");
System.out.println("\nCalculate the temperature Celsius scale to Fahrenheit scale");

 

Scanner input = new Scanner(System.in);
double cels,result;

 

System.out.print("\nEnter Celsius temperature :");
cels = input.nextDouble();

 

 


result = 1.8*cels+32;
System.out.println("\n\nThe temperature on Fahrenheit is : "+result);

 

}
}