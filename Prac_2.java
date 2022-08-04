import java.util.Scanner;
class Prac_2
{
public static void main(String[] args)
{
Scanner cn = new Scanner(System.in);
System.out.println("Input number : ");
int day = cn.nextInt();

System.out.println(getDayName(day));
}
public static String getDayName(int day)
{
	String dayName = " ";
	switch (day)
	{
		case 1: dayName = "Monday";
		break;
		case 2: dayName = "Tuesday";
		break;
		case 3: dayName = "Wednesday";
		break;
		case 4: dayName = "Thrusday";
		break;
		case 5: dayName = "Friday";
		break;
		case 6: dayName = "Saturday";
		break;
		case 7: dayName = "Sunday";
		break;
		default: dayName = "Invalid Day";
	}
	return dayName;
}
}
