/*
3. Write a menu driven billing system for a Snacks center, items available are 
Tea(Rs. 10), Samosa (Rs. 20), Sandwitch(Rs. 50), Green Tea (Rs. 15) etc. as follows - 

****Welcome to Snack Center *********
1. Tea (Rs. 10)
2. Green Tea (Rs. 15)
3. Samosa (Rs. 20)
4. Sandwitch (Rs. 50)
5. Generate Bill & Exit
Enter your choice : 1
   Enter quantity : 2
   
1. Tea (Rs. 10)
2. Green Tea (Rs. 15)
3. Samosa (Rs. 20)
4. Sandwitch (Rs. 50)
5. Generate Bill & Exit
Enter your choice : 3
  Enter quantity : 3
  
1. Tea (Rs. 10)
2. Green Tea (Rs. 15)
3. Samosa (Rs. 20)
4. Sandwitch (Rs. 50)
5. Generate Bill & Exit
Enter your choice : 5

 *****BILL****
 Tea    2    20
 Samosa 3    60
 ------------
 Total = 80 */
import java.util.Scanner;
public class SnackCenter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int teaQty=0;
		int greenTeaQty=0;
		int samosaQty=0;
		int sandQty=0;
		int choice = 0;
		
		do {
			System.out.println("******Welcome to Snack Center *********");
			System.out.println("1. Tea (Rs. 10)");
			System.out.println("2. Green Tea (Rs. 15)");
			System.out.println("3. Samosa (Rs. 20)");
			System.out.println("4. Sandwitch (Rs. 50)");
			System.out.println("5. Generate Bill & Exit");
			System.out.println("Enter your choice :");
			choice=scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the quantity :");
				int tqty=scan.nextInt();
				teaQty=teaQty+tqty;
				break;
			case 2:
				System.out.println("Enter the quantity :");
				int gqty=scan.nextInt();
				greenTeaQty=greenTeaQty+gqty;
				break;
			case 3:
				System.out.println("Enter the quantity :");
				int sqty=scan.nextInt();
				samosaQty=samosaQty+sqty;
				break;
			case 4:
				System.out.println("Enter the quantity :");
				int sanqty=scan.nextInt();
				sandQty=sandQty+sanqty;
				break;
			case 5:
				System.out.println("..Thanks for visiting..");
				break;
			default:
				System.out.println("Invalid Choice! Please try again.");
				break;
			}
		} while (choice!=5);
		System.out.println("*******BILL********");
		if(teaQty!=0)
			System.out.println("Tea \t\t"+teaQty+"\t" + "10");
		if(greenTeaQty!=0)
			System.out.println("Green Tea \t"+greenTeaQty+"\t" + "15");
		if(samosaQty!=0)
			System.out.println("Samosa \t\t"+samosaQty+"\t" + "20");
		if(sandQty!=0)
			System.out.println("Sandwitch \t"+sandQty+"\t" + "50");
		int bill =teaQty*10+greenTeaQty*15+samosaQty*20+sandQty*50;
		System.out.println("-------------------------------");
		System.out.println("Total Bill = " +bill);
		System.out.println("-------------------------------");
	}

}
