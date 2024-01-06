import java.util.Scanner;
class Employee
{
private int id;
private String name;
private String dept;

public void setId(int id)
{
this.id=id;
}
public void setName(String name)
{
this.name=name;
}
public void setDept(String dept)
{
this.dept=dept;
}

public int getId()
{
return this.id;
}
public String getName()
{
return this.name;
}
public String getDept()
{
return this.dept;
}
}
class EmployeeArray
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Employee[] e=new Employee[5];
for(int i=0;i<5;i++)
{
e[i]=new Employee ();
e[i].setId(sc.nextInt());
e[i].setName(sc.next());
e[i].setDept(sc.next());

}
System.out.println("Details are:\n");
for(int j=0;j<5;j++)
{
System.out.println("ID :"+e[j].getId());
System.out.println("Name :"+e[j].getName());
System.out.println("Dept :"+e[j].getDept());

}
}
}

