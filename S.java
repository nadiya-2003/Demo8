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
class S
{
public static void main(String args[])
{
Student s=new Student();
s.setId(111);
s.setName("Kavya");
System.out.println("ID is"+s.getId());
System.out.println("Name is"+s.getName());
}
}