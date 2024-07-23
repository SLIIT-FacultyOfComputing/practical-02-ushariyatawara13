package name;

import java.util.Scanner;

public class practical2 {
      public static void main(String args[]) {
         String firstname;
         String middlename;
         String lastname;
         
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Enter first name: ");
         firstname = sc.nextLine();
         
         System.out.println("Enter middle name: ");
         middlename = sc.nextLine();
         
         System.out.println("Enter last name: ");
         lastname = sc.nextLine();
         
         StringBuilder sb = new StringBuilder();
         sb.append(firstname);
         sb.append(middlename);
         sb.append(lastname);
         String result = sb.toString();
         
         
      }
}
      
