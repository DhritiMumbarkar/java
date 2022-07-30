public class Employee3
{
int empId;
String empName;
Employee3(int id, String name)
{
this.empId=id;
this.empName= name;
}
void info()
{
System.out.println("Id :" + empId+" Name:"+empName);
}
public static void main(String args[])
{
Employee3 obj1 = new Employee3(200,"Jacklin");
Employee3 obj2 = new Employee3(234,"Joe");
obj1.info();
obj2.info();
}
}
