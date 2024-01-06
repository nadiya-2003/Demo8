import java.util.Scanner;
class Student
{
private int id;
private String name;
public void setId(int id)
{
this.id=id;
}
public void setName(String name)
{
this.name=name;
}
public int getId()
{
return this.id;
}
public String getName()
{
return this.name;
}
}
class StudentArray
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Student[] s=new Student[3];
for(int i=0;i<3;i++)
{
s[i]=new Student();
s[i].setId(sc.nextInt());
s[i].setName(sc.next());
}
System.out.println("Details are:\n");
for(int j=0;j<3;j++)
{
System.out.println("ID :"+s[j].getId());
System.out.println("Name :"+s[j].getName());
}
}
}

