import java.util.Scanner;
class Trainer
{
private int tid;
public void set(int tid)
{
this.tid=tid;
}

public int get()
{
return this.tid;
}
public Trainer(int tid)
{
this.tid=tid;
}
public Trainer()
{
this.tid=0;
}
}
class Test
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter Teacher ID:");
int tidin=sc.nextInt();
Trainer t=new Trainer(tidin);
System.out.println("tid:"+t.get());;
}
}