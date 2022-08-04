import java.util.Scanner;
class Prac_1
{
public static void main(String[] args)
{
int a,b,c,greatest,temp;
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1st number : ");
a = sc.nextInt();
System.out.println("Enter 2nd number : ");
b = sc.nextInt();
System.out.println("Enter 3rd number : ");
c = sc.nextInt();
temp = a>b?a:b;
greatest = c>temp?c:temp;
System.out.println("The Greatest number is : " +greatest);
}
}
