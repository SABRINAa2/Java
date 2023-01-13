public class StringBuilder
{
public static void main(String[]args)
{

StringBuilder str = new StringBuilder("Sabrina");
System.out.println("My name is :  "+str);

//Append method for add something
str.append("Neha");
str.append(21);
str.append(15.5);
System.out.print("Full name is : "+str);

str.append(21);
str.append(15.5);
System.out.print("\n\n\n"+str);

//reverse
str.reverse();
System.out.print("Reverse Order : "+str);

//Delete method
str.delete(2.5);
System.out.println("After deleting the reverse order letters from index 2 to 5:"+str);


}

}















































