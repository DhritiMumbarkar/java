import java.util.*;
class String_Handling{
  public static void main(String []args)
  {
	  String x,y,z;
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter a string value : ");
	  x = s.nextLine();
	  System.out.println("Enter a string value : ");
	  y = s.nextLine();
	  System.out.println(x.toUpperCase());
	  char ch=x.charAt(4);
	  System.out.println(ch);
	  System.out.println("string length is: "+x.length());
	  System.out.println(x.substring(2,4));
	  System.out.println(x.substring(2));
	  
  }
}