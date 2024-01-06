class A1
{
static int data=30;
static class B
{
static void msg()
{
System.out.println("data is :"+data);
}
}
public static void main(String args[])
{
A1.B.msg();
}
}