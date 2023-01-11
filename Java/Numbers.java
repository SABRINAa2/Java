import java.util.Scanner;
public class number{
public static void main(String[] args){
System.out.println("\t\n\"Determine even or odd number\"");
Scanner input = new Scanner(System.in);
int num;
System.out.println("Enter positive Number : ");
num = input.nextInt();

 

if (num%2==0){
System.out.println("This number is Even number");
}

 

else {System.out.println("This number is Odd number");}

 


}
}