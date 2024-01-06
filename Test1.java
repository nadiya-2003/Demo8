import java.util.Scanner;
class Trainer
{
private int tid;
private String tname;
private String tcourse;

public void setTid(int tid)
{
this.tid=tid;
}

public int getTid()
{
return this.tid;
}
public void setName(String tname )
{
this.tname=tname;
}

public int getName()
{
return this.tname;
}
public void setCourse(String tcourse)
{
this.tcourse=tcourse;
}

public int getCourse()
{
return this.tcourse;
}

public void tTrainer(int tid,String tname,String tcourse)
{
this.tid=tid;
this.tname=tname;

this.tcourse=tcourse;

}

}
class Test1
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
Trainer[] t=new Trainer[5];
for(int i=0;i<5;i++)
{
t[i]=new Trainer();
t[i].tTrainer(s.nextInt());
t[i].tTrainer(s.next());

}
for(int j=0;j<5;j++)
{
System.out.println("TID is:"+t[j].getTid());
System.out.println("TNAME is:"+t[j].getName());

System.out.println("TCOURSE is:"+t[j].getCourse());

}
}
}