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
class S1
{
public static void main(String args[])
{
Student s1=new Student();
Student s2=new Student();
Student s3=new Student();
Student s4=new Student();
Student s5=new Student();
s1.setId(1111);
s1.setName("Kavya");
System.out.println("ID is"+s1.getId());
System.out.println("Name is"+s1.getName());

s2.setId(1211);
s2.setName("Praneeth");
System.out.println("ID is"+s2.getId());
System.out.println("Name is"+s2.getName());

s3.setId(2167);
s3.setName("Jishnu");
System.out.println("ID is"+s3.getId());
System.out.println("Name is"+s3.getName());

s4.setId(2349);
s4.setName("Darshana");
System.out.println("ID is"+s4.getId());
System.out.println("Name is"+s4.getName());

s5.setId(2627);
s5.setName("Ram");
System.out.println("ID is"+s5.getId());
System.out.println("Name is"+s5.getName());

}
}