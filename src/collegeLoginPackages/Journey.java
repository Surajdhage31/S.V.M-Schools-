package collegeLoginPackages;
import java.util.Scanner;
public class Journey {
	public int city () {
		System.out.println("The all ticket are monthly");
		System.out.println(" 1.Talegaon Station");
		  System.out.println("2.Warangwadi");
		  System.out.println("3.Katvi");
		  System.out.println("4.Ambi");
		  System.out.println("5.Umbare");
		  System.out.println("6.Dehu Road");
		  Scanner a = new Scanner(System.in);
		  int bus =  a.nextInt();
			  switch (bus)
			  {
			  case 1 :
			  {
				  System.out.println("please Paid fee Rs:2500");
				  int money= a.nextInt();
				  System.out.println("paid :" +money);
                 break ;
				  }
			  case 2 :
			  {
				  System.out.println("please Paid fee Rs:2000");
				  int money= a.nextInt();
				  System.out.println("paid :" +money);
				  break ;
			  }
			  case 3:
			  {
				  System.out.println("please Paid fee Rs:3000");
				  int money= a.nextInt();
				  System.out.println("paid :" +money);
				  break ;
			  }
			  case 4:
			  {
				  System.out.println("please Paid fee Rs:3500");
				  int money= a.nextInt();
				  System.out.println("paid :" +money);
				  break ;
			  }
			  case 5:
			  {
				  System.out.println("please Paid fee Rs:2500");
				  int money= a.nextInt();
				  System.out.println("paid :" +money);
				  break ;
			  }
			  case 6:
			  {
				  System.out.println("please Paid fee Rs:2500");
				  int money = a.nextInt();
				  System.out.println("paid :"+money);
				  break ;
			  }
			  }
				 
			System.out.println(" bus book ");
			
			return 0;
		}
		
		}
	
