class Student
{
int rollno;
String name;
static String college="MTIE";
static void change()
{
college="AM.REDDY";
}
Student(int r,String n)
{
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno+" "+name+" "+college);
}
}
class Student1
{
public static void main(String args[])
{
Student s1 = new Student(2001,"Karan");
Student s2 = new Student(2111,"Aryan");
Student s3 = new Student(3333,"jessy");
Student.change();
s1.display();
s2.display();
s3.display();
}
}