public class StartDoctor
{
    public static void main(String[] args)
    {
     Doctor doctor1 = new Doctor();

 

     doctor1.name = "Fahim Rahman";
     doctor1.gender = "Male";
     doctor1.id = 21453032;
     doctor1.phone =1234445;
     doctor1.displayInformation();

 


     Doctor doctor2 = new Doctor();
     doctor2.name = "Sabrina Momotaz Neha";
     doctor2.gender = "Female";
     doctor2.id = 2140787;
     doctor2.phone = 23443534;
     doctor2.displayInformation();
    }
}