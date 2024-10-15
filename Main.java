public class Main {

   public static void main(String []args) {
      int age = 15;
      int year = 14;

      //two == sign is checking for EQUALITY
      boolean match = (age == year); 
      System.out.println("Deos age match year?" + match);
      
      year = 15; // RE-ASSINGING
      System.out.print(age == year);

      //!= means "is NOT equal to"
      System.out.println(age != year);

      // REALTION OPERATORS 
      // used in boolean expressions 
      double pi = 3.14159;
      System.out.println(pi > 0);
      System.out.println(pi < 0);
      System.out.println(pi >= 3.14);
      System.out.println(pi <= 10);





   }
}
