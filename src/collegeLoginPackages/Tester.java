package collegeLoginPackages;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		System.out.println("Welcome To S.V.M School");
		
		System.out.println("1. Student \n 2.Admin");
		int logins = i.nextInt();
		
		switch (logins) {
		case 1 :	 {
			System.out.println("Plese Login");
		System.out.println("Enter username");
      String user = i.nextLine();
      System.out.println("Enter Password ");
      int pass = i.nextInt();
      String A = "Student" ;
      int B = 4321;
      
      if (  user.equalsIgnoreCase(A) && pass == B )
      {
    	
    	  Page obj = new Page ();
    	  obj.login();
    	  
    	  
      }
      else
      {
    	  System.out.println(" invalid credential");
      }
	}
		case 2 :
		{
			System.out.println("Plese Login");
			System.out.println("Enter username");
	      String user = i.nextLine();
	      System.out.println("Enter Password ");
	      int pass = i.nextInt();
	     String A = "Admin" ;
	     int B = 12345 ;
	     if(user.equalsIgnoreCase(A) && pass == B)
	     { System.out.println("1.Bus login \n2.Book_Issue");
	      int  value = i.nextInt ();
	      
	     }
	     
	
		}
}

	}

}
