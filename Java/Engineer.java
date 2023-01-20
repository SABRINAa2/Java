public class engineer
{
    String name, gender, institutionName;
    int id,phone;

 


    void setInformation(String n,String g,String is,int i,int p)
    {
        name = n;
        gender = g;
        institutionName = is;
        id = i;
        phone = p;
    }

 

    void displayInformation()
    {
      System.out.println("\n\n");
      System.out.println("Name : "+name);
      System.out.println("Gender : "+gender);
      System.out.println("Institution Name : "+institutionName);
      System.out.println("Id : "+id);
      System.out.println("Phone : "+phone);
    }
}