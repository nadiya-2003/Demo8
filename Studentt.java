class Student
{
int rollno;
String name;
static String college="MTIE";
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
class Studentt
{
public static void main(String args[])
{
Student s1 = new Student(2001,"Karan");
Student s2 = new Student(2111,"Aryan");
Student.college="VIT";
s1.display();
s2.display();
}
}