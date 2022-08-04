import java.util.Scanner;
class Prac_3
{
public static void main(String[] args)
{
Scanner s =new Scanner(System.in);
System.out.println("Enter Quantity : ");
int quantity = s.nextInt();

if (quantity*100 > 1000)
{
	System.out.println("You get a discount of " +(0.1*quantity*100)+" and your total cost is" +(quantity*100-(0.1*quantity*100)));
}
else 
{
	System.out.println(" No discount");
	
}
}
}