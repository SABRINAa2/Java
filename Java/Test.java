public class Test
{
    public static void main(String[] args)
    {
      Teacher teacher1 = new Teacher();
      Teacher teacher2 = new Teacher();

 

      teacher1.name = "Fahim";
      teacher1.gender = "Male";
      teacher1.phone = 123456;

 

      teacher2.name = "Sabrina";
      teacher2.gender = "Female";
      teacher2.phone = 354677;

 

      System.out.println("Name : "+teacher1.name);
      System.out.println("Gender : "+teacher1.gender);
      System.out.println("Phone : "+teacher1.phone);

 

      System.out.println("/n/n");

      System.out.println("Name : "+teacher2.name);
      System.out.println("Gender : "+teacher2.gender);
      System.out.println("Phone : "+teacher2.phone);

 

 

    }
}