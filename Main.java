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

      // IF STATEMENTS
      boolean isCold = false;
      if (isCold == true) {
         System.out.println("Bring a jacket!");
      }
      System.out.println("Enjoy your walk!");

      // Magic-8 ball mini program
      // 1. Generate random integer between 1-8
      int rand = (int) (Math.random() * 8 + 1);


      // 2. Use that number in 8 if statments to print a different response
      // Every "if block" is like starting a new line of questioning 
      if (rand == 1){
         System.out.println("I don't think so ...");
      }
      if (rand == 2){
         System.out.println("Yea totally ...");
      }
      if (rand == 3){
         System.out.println("Maybe not today ...");
      }
      if (rand == 4){
         System.out.println("Of Course!");
      }
      if (rand == 5){
         System.out.println("Looking good ...");
      }
      if (rand == 6){
         System.out.println("We shall see ...");
      }
      if (rand == 7){
         System.out.println("Definitly not ...");
      }
      if (rand == 8){
         System.out.println("Not looking so good ...");

      }

      // TWO-WAY SELECTION: IF block coupled with an ELSE block
      // is like "if this is true, do something", OTHERWISE, "do something else"
      int myAge = 16;
      // BOOLEAN EXPRESSION here is "myAge >= 17"
      if (myAge >= 17) {
         System.out.println("You can get your license in NY!");
      }
      // else is coupled with the if statment above so you do not need to specify a CONDITION/EXPRESSION
      else {
         System.out.println("You're too young to drive in NY");
      }
      


   }
}
