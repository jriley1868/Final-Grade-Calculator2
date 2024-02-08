// import scanner
import java.util.Scanner;

// class header
public class TripleThreats_Project
{
   // main method header
   public static void main (String args [])
   {
   
      Scanner keyboard = new Scanner(System.in);
      
      // ask the user for their name
      System.out.println("What is your full name? ");
      // define name variable
      String name = keyboard.nextLine();
      //uppercases the name
      String upper = name.toUpperCase();
      int nameLength = name.length();
      
      // ask the user to enter the name of the class their failing
      System.out.println("\nWhat class are you failing? "); 
      // define class name varibale
      String className = keyboard.nextLine();
      //first letter in class your failing
      String firstThree = className.substring(0,3);

    
      // ask the user for their grade level
      System.out.println("\nWhat is your current grade level? (Example: 9, 10, 11) ");
      // define grade level variable
      int gradeLevel = keyboard.nextInt();
      
      System.out.println("\nName: " + upper + " (" + nameLength + " characters)" );
      System.out.println("Class being failed: " + className + "(" + firstThree + ")");
      System.out.println("Grade Level: " + gradeLevel);

      
      // ask the user for theur current grade
      System.out.println("\nWhat is your current grade? (Number Grade) ");
      // define current grade variable
      double currentGrade = keyboard.nextDouble();
      if (currentGrade < 70)
         System.out.println("You are currently failing.");
      // ask the user for what grade percentage they need to pass
      System.out.println("\nWhat grade do you need to pass the semester? (Number Grade) ");
      // define grade needed variable
      double gradeNeeded = keyboard.nextDouble();
      // ask the user the worth of ht exam
      System.out.println("How much of your semester grade is the Mid-Term exam worth? (decimal) ");
      // define worth variable
      double worth = keyboard.nextDouble();
      
      // calulcate the grade needed
     double examGrade = (gradeNeeded - ((1 - worth) * currentGrade)) / (worth);
      
      // tell the user the exam grade needed
     if (examGrade <= 69)
         System.out.println("You only need a " + examGrade + " to pass " + className + " for the semester.");
     else
         System.out.println("You need a " + examGrade + " on your exam to pass " + className + " for the semseter.");
     
     int hours = (int)examGrade / 10;
     
     // validation loop
     System.out.println("\nHow many hours are you currently studying a week?");
     int hourNum = keyboard.nextInt();
     while(hourNum <= 6)
     {
         System.out.println("\nSince you are failing you should be studying more.");
         System.out.println("\nBased off your current grade, to ensure you pass the semester you should be studying " + hours + " hours a week.");
         hourNum = keyboard.nextInt();
     }
     System.out.println("You're studying enough. Keep it up!");
       
      
   } // end of main mehtod
} // end of class
