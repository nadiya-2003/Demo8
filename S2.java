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
class S2
{
public static void main(String args[])
{
Student[] s=new Student[3];
s[0]=new Student();
s[0].setId(1111);
s[0].setName("Test");
System.out.println("ID is"+s[0].getId());
System.out.println("Name is"+s[0].getName());
s[1]=new Student();
s[1].setId(2031);
s[1].setName("Test1");
System.out.println("ID is"+s[1].getId());
System.out.println("Name is"+s[1].getName());
s[2]=new Student();
s[2].setId(6511);
s[2].setName("Test2");
System.out.println("ID is"+s[2].getId());
System.out.println("Name is"+s[2].getName());
}
}